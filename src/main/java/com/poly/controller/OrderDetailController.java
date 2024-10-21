package com.poly.controller;

import com.poly.dao.OrderDetailsDAO;
import com.poly.database.DatabaseConnection;
import com.poly.entity.OrderDetails;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderDetailController extends HttpServlet {
    private OrderDetailsDAO orderDetailDAO;

    @Override
    public void init() throws ServletException {
        try {
            Connection connection = DatabaseConnection.getConnection(); // Kết nối tới cơ sở dữ liệu
            orderDetailDAO = new OrderDetailsDAO(connection);
        } catch (SQLException e) {
            throw new ServletException("Database connection error", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            if ("add".equals(action)) {
                addOrderDetail(request);
            } else if ("update".equals(action)) {
                updateOrderDetail(request);
            } else if ("delete".equals(action)) {
                deleteOrderDetail(request);
            }
            response.sendRedirect("orderDetailList.jsp"); // chuyển hướng đến trang danh sách chi tiết đơn hàng
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }

    private void addOrderDetail(HttpServletRequest request) throws SQLException {
        int orderId = Integer.parseInt(request.getParameter("order_id"));
        int bookId = Integer.parseInt(request.getParameter("book_id"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        BigDecimal price = new BigDecimal(request.getParameter("price"));

        OrderDetails orderDetail = new OrderDetails();
        orderDetail.setOrderId(orderId);
        orderDetail.setBookId(bookId);
        orderDetail.setQuantity(quantity);
        orderDetail.setPrice(price);
        orderDetailDAO.addOrderDetail(orderDetail);
    }

    private void updateOrderDetail(HttpServletRequest request) throws SQLException {
        int orderDetailId = Integer.parseInt(request.getParameter("order_detail_id"));
        int orderId = Integer.parseInt(request.getParameter("order_id"));
        int bookId = Integer.parseInt(request.getParameter("book_id"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        BigDecimal price = new BigDecimal(request.getParameter("price"));

        OrderDetails orderDetail = new OrderDetails();
        orderDetail.setId(orderDetailId);
        orderDetail.setOrderId(orderId);
        orderDetail.setBookId(bookId);
        orderDetail.setQuantity(quantity);
        orderDetail.setPrice(price);
        orderDetailDAO.updateOrderDetail(orderDetail);
    }

    private void deleteOrderDetail(HttpServletRequest request) throws SQLException {
        int orderDetailId = Integer.parseInt(request.getParameter("order_detail_id"));
        orderDetailDAO.deleteOrderDetail(orderDetailId);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<OrderDetails> orderDetails = orderDetailDAO.getAllOrderDetails();
            request.setAttribute("orderDetails", orderDetails);
            request.getRequestDispatcher("orderDetailList.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}
