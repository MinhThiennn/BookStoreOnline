package com.poly.controller;

import com.poly.dao.OrdersDAO;
import com.poly.database.DatabaseConnection;
import com.poly.entity.Orders;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderController extends HttpServlet {
    private OrdersDAO orderDAO;

    @Override
    public void init() throws ServletException {
        try {
            Connection connection = DatabaseConnection.getConnection(); // Kết nối tới cơ sở dữ liệu
            orderDAO = new OrdersDAO(connection);
        } catch (SQLException e) {
            throw new ServletException("Database connection error", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            if ("add".equals(action)) {
                addOrder(request);
            } else if ("update".equals(action)) {
                updateOrder(request);
            } else if ("delete".equals(action)) {
                deleteOrder(request);
            }
            response.sendRedirect("orderList.jsp"); // chuyển hướng đến trang danh sách đơn hàng
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }

    private void addOrder(HttpServletRequest request) throws SQLException {
        int userId = Integer.parseInt(request.getParameter("user_id"));
        BigDecimal totalAmount = new BigDecimal(request.getParameter("total_amount"));
        String status = request.getParameter("status");

        Orders order = new Orders();
        order.setUserId(userId);
        order.setTotalAmount(totalAmount);
        order.setStatus(status);
        orderDAO.addOrder(order);
    }

    private void updateOrder(HttpServletRequest request) throws SQLException {
        int orderId = Integer.parseInt(request.getParameter("order_id"));
        int userId = Integer.parseInt(request.getParameter("user_id"));
        BigDecimal totalAmount = new BigDecimal(request.getParameter("total_amount"));
        String status = request.getParameter("status");

        Orders order = new Orders();
        order.setId(orderId);
        order.setUserId(userId);
        order.setTotalAmount(totalAmount);
        order.setStatus(status);
        orderDAO.updateOrder(order);
    }

    private void deleteOrder(HttpServletRequest request) throws SQLException {
        int orderId = Integer.parseInt(request.getParameter("order_id"));
        orderDAO.deleteOrder(orderId);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Orders> orders = orderDAO.getAllOrders();
            request.setAttribute("orders", orders);
            request.getRequestDispatcher("orderList.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}
