package com.poly.controller;

import com.poly.dao.ReviewsDAO;
import com.poly.database.DatabaseConnection;
import com.poly.entity.Reviews;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ReviewController extends HttpServlet {
    private ReviewsDAO reviewDAO;

    @Override
    public void init() throws ServletException {
        try {
            Connection connection = DatabaseConnection.getConnection(); // Kết nối tới cơ sở dữ liệu
            reviewDAO = new ReviewsDAO(connection);
        } catch (SQLException e) {
            throw new ServletException("Database connection error", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            if ("add".equals(action)) {
                addReview(request);
            } else if ("update".equals(action)) {
                updateReview(request);
            } else if ("delete".equals(action)) {
                deleteReview(request);
            }
            response.sendRedirect("reviewList.jsp"); // chuyển hướng đến trang danh sách đánh giá
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }

    private void addReview(HttpServletRequest request) throws SQLException {
        int bookId = Integer.parseInt(request.getParameter("book_id"));
        int userId = Integer.parseInt(request.getParameter("user_id"));
        int rating = Integer.parseInt(request.getParameter("rating"));
        String comment = request.getParameter("comment");

        Reviews review = new Reviews();
        review.setBookId(bookId);
        review.setUserId(userId);
        review.setRating(rating);
        review.setComment(comment);
        reviewDAO.addReview(review);
    }

    private void updateReview(HttpServletRequest request) throws SQLException {
        int reviewId = Integer.parseInt(request.getParameter("review_id"));
        int bookId = Integer.parseInt(request.getParameter("book_id"));
        int userId = Integer.parseInt(request.getParameter("user_id"));
        int rating = Integer.parseInt(request.getParameter("rating"));
        String comment = request.getParameter("comment");

        Reviews review = new Reviews();
        review.setId(reviewId);
        review.setBookId(bookId);
        review.setUserId(userId);
        review.setRating(rating);
        review.setComment(comment);
        reviewDAO.updateReview(review);
    }

    private void deleteReview(HttpServletRequest request) throws SQLException {
        int reviewId = Integer.parseInt(request.getParameter("review_id"));
        reviewDAO.deleteReview(reviewId);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Reviews> reviews = reviewDAO.getAllReviews();
            request.setAttribute("reviews", reviews);
            request.getRequestDispatcher("reviewList.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}
