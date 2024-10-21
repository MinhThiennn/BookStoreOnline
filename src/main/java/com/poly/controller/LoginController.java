package com.poly.controller;

import com.poly.dao.UsersDAO;
import com.poly.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	String url = "jdbc:sqlserver://localhost:1433;databaseName=BookOnl;encrypt=false;trustServerCertificate=true;";


    private static final String USERNAME = "sa"; 
    private static final String PASSWORD = "123"; 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Chuyển tiếp tới trang đăng nhập
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Connection connection = null;

        try {
            // Thiết lập kết nối đến cơ sở dữ liệu
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            UsersDAO usersDAO = new UsersDAO(connection); // Cung cấp connection cho UsersDAO

            Users user = usersDAO.checkLogin(username, password);

            if (user != null) {
                // Đăng nhập thành công
                HttpSession session = request.getSession();
                session.setAttribute("currentUser", user);
                response.sendRedirect(request.getContextPath() + "/home");
            } else {
                // Sai tài khoản hoặc mật khẩu
                request.setAttribute("errorMessage", "Sai tên đăng nhập hoặc mật khẩu.");
                request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Xử lý lỗi kết nối cơ sở dữ liệu
            request.setAttribute("errorMessage", "Đã xảy ra lỗi khi kết nối cơ sở dữ liệu.");
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        } finally {
            // Đóng kết nối
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
