package com.poly.controller;

import com.poly.dao.UsersDAO;
import com.poly.database.DatabaseConnection;
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

@WebServlet("/admin/users")
public class UsersController extends HttpServlet {
    private UsersDAO usersDAO;

    @Override
    public void init() throws ServletException {
        try {
            Connection connection = DatabaseConnection.getConnection(); // Kết nối tới cơ sở dữ liệu
            usersDAO = new UsersDAO(connection);
        } catch (SQLException e) {
            throw new ServletException("Database connection error", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Users> userList = usersDAO.getAllUsers();
            req.setAttribute("userList", userList);
            req.getRequestDispatcher("/WEB-INF/views/admin/users.jsp").forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        try {
            if ("add".equals(action)) {
                addUser(req);
            } else if ("update".equals(action)) {
                updateUser(req);
            } else if ("delete".equals(action)) {
                deleteUser(req);
            }
            resp.sendRedirect(req.getContextPath() + "/admin/users");
        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }

    private void addUser(HttpServletRequest req) throws SQLException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String role = req.getParameter("role");

        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setRole(role);

        usersDAO.addUser(user); // Phương thức này cũng cần được định nghĩa trong UsersDAO
    }

    private void updateUser(HttpServletRequest req) throws SQLException {
        int userId = Integer.parseInt(req.getParameter("userId"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String role = req.getParameter("role");

        Users user = new Users();
        user.setUserId(userId); // Đảm bảo phương thức setUserId() đã được định nghĩa trong Users
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setRole(role);

        usersDAO.updateUser(user); // Phương thức này cũng cần được định nghĩa trong UsersDAO
    }

    private void deleteUser(HttpServletRequest req) throws SQLException {
        int userId = Integer.parseInt(req.getParameter("userId"));
        usersDAO.deleteUser(userId); // Phương thức này cũng cần được định nghĩa trong UsersDAO
    }
}
