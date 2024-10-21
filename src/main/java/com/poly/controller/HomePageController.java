package com.poly.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException; // Import SQLException để xử lý lỗi
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poly.dao.BooksDAO;
import com.poly.database.DatabaseConnection;
import com.poly.entity.Books;

@WebServlet("/")
public class HomePageController extends HttpServlet {
    private BooksDAO bookDAO;

    @Override
    public void init() throws ServletException {
        try {
            Connection connection = DatabaseConnection.getConnection(); // Kết nối tới cơ sở dữ liệu
            bookDAO = new BooksDAO(connection); // Khởi tạo BooksDAO với kết nối
        } catch (SQLException e) {
            throw new ServletException("Database connection error", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Books> books = bookDAO.getAllBooks(); // Lấy danh sách sách từ cơ sở dữ liệu
            req.setAttribute("books", books); // Đưa danh sách sách vào request
            req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp); // Chuyển hướng đến JSP
        } catch (SQLException e) {
            e.printStackTrace(); // In ra lỗi để kiểm tra
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error: " + e.getMessage());
        }
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
    }
}
