package com.poly.controller;

import com.poly.dao.OrdersDAO;
import com.poly.dao.ProductDAO;
import com.poly.dao.UsersDAO;
import com.poly.database.DatabaseConnection;
import com.poly.entity.Orders;
import com.poly.entity.Product;
import com.poly.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


@WebServlet("/admin/home")
public class AdminController extends HttpServlet {
    private UsersDAO usersDAO;
    private OrdersDAO orderDAO;
    private ProductDAO productDAO;

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Users> usersList = usersDAO.getAllUsers(); // Lấy danh sách người dùng
            List<Orders> ordersList = orderDAO.getAllOrders(); // Lấy danh sách đơn hàng
            List<Product> productsList = productDAO.getAllProducts(); // Lấy danh sách sản phẩm
            
            request.setAttribute("usersList", usersList);
            request.setAttribute("ordersList", ordersList);
            request.setAttribute("productsList", productsList); // Thêm danh sách sản phẩm
            
            // Forward đến trang home.jsp
            request.getRequestDispatcher("/WEB-INF/views/admin/home.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace(); // In lỗi ra console
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error: " + e.getMessage());
        }
    }

    @Override
    public void destroy() {
        // Đóng kết nối nếu cần thiết.
        // Ví dụ: nếu bạn giữ kết nối ở đây, hãy đóng nó.
        // if (connection != null) {
        //     try {
        //         connection.close();
        //     } catch (SQLException e) {
        //         e.printStackTrace();
        //     }
        // }
    }
}
