package com.poly.controller;

import com.poly.dao.OrdersDAO;
import com.poly.dao.ProductDAO;
import com.poly.dao.UsersDAO; // Thêm import nếu cần
import com.poly.database.DatabaseConnection;
import com.poly.entity.Users; // Thêm import nếu cần
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/home/checkout")
public class CheckoutController extends HttpServlet {
    private UsersDAO usersDAO; // Nếu bạn cần truy cập thông tin người dùng

    @Override
    public void init() throws ServletException {
        try {
            Connection connection = DatabaseConnection.getConnection(); // Kết nối tới cơ sở dữ liệu
            usersDAO = new UsersDAO(connection); // Truyền đối tượng Connection vào constructor
        } catch (SQLException e) {
            throw new ServletException("Database connection error", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Chuyển hướng đến trang checkout.jsp
        request.getRequestDispatcher("/WEB-INF/views/user/checkout.jsp").forward(request, response);
    }

    // Nếu bạn có phương thức POST để xử lý thanh toán
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Xử lý dữ liệu từ biểu mẫu thanh toán ở đây
        // Ví dụ: lấy thông tin người dùng, cập nhật đơn hàng trong cơ sở dữ liệu, v.v.

        // Chuyển hướng đến trang xác nhận hoặc trang khác sau khi xử lý thành công
    }
}
