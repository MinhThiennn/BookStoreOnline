package com.poly.controller;

import com.poly.dao.BooksDAO;
import com.poly.database.DatabaseConnection;
import com.poly.entity.Books;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


@WebServlet("/home/books") // Đường dẫn đến BooksController
public class BooksController extends HttpServlet {
    private BooksDAO booksDAO;

    @Override
    public void init() throws ServletException {
        try {
            Connection connection = DatabaseConnection.getConnection(); // Kết nối tới cơ sở dữ liệu
            booksDAO = new BooksDAO(connection); // Khởi tạo BooksDAO với kết nối
        } catch (SQLException e) {
            throw new ServletException("Database connection error", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Books> booksList = booksDAO.getAllBooks(); // Lấy danh sách sách từ cơ sở dữ liệu
            req.setAttribute("booksList", booksList); // Đưa danh sách sách vào request
            req.getRequestDispatcher("/WEB-INF/views/user/books.jsp").forward(req, resp); // Chuyển hướng đến JSP
        } catch (SQLException e) {
            e.printStackTrace(); // In ra lỗi để kiểm tra
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error: " + e.getMessage());
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        try {
            if ("add".equals(action)) {
                Books book = new Books();
                book.setTitle(req.getParameter("title"));
                book.setAuthor(req.getParameter("author"));
                book.setCategoryId(Integer.parseInt(req.getParameter("category_id")));
                book.setPrice(new BigDecimal(req.getParameter("price")));
                book.setStockQuantity(Integer.parseInt(req.getParameter("stock_quantity")));
                book.setDescription(req.getParameter("description"));
                book.setImagePath(req.getParameter("image_path"));
                booksDAO.addBook(book);
            } else if ("update".equals(action)) {
                Books book = new Books();
                book.setBookId(Integer.parseInt(req.getParameter("book_id")));
                book.setTitle(req.getParameter("title"));
                book.setAuthor(req.getParameter("author"));
                book.setCategoryId(Integer.parseInt(req.getParameter("category_id")));
                book.setPrice(new BigDecimal(req.getParameter("price")));
                book.setStockQuantity(Integer.parseInt(req.getParameter("stock_quantity")));
                book.setDescription(req.getParameter("description"));
                book.setImagePath(req.getParameter("image_path"));
                booksDAO.updateBook(book);
            } else if ("delete".equals(action)) {
                int bookId = Integer.parseInt(req.getParameter("book_id"));
                booksDAO.deleteBook(bookId);
            }
            resp.sendRedirect(req.getContextPath() + "/admin/products");
            req.getRequestDispatcher("/WEB-INF/views/user/books.jsp").forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}
