package com.poly.dao;

import com.poly.entity.Reviews;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReviewsDAO {
    private Connection connection;

    public ReviewsDAO(Connection connection) {
        this.connection = connection;
    }

    public void addReview(Reviews review) throws SQLException {
        String sql = "INSERT INTO Reviews (book_id, user_id, rating, comment) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, review.getBookId());
            stmt.setInt(2, review.getUserId());
            stmt.setInt(3, review.getRating());
            stmt.setString(4, review.getComment());
            stmt.executeUpdate();
        }
    }

    public Reviews getReviewById(int id) throws SQLException {
        String sql = "SELECT * FROM Reviews WHERE review_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Reviews review = new Reviews();
                review.setId(rs.getInt("review_id"));
                review.setBookId(rs.getInt("book_id"));
                review.setUserId(rs.getInt("user_id"));
                review.setRating(rs.getInt("rating"));
                review.setComment(rs.getString("comment"));
                review.setCreatedAt(rs.getTimestamp("created_at"));
                return review;
            }
        }
        return null;
    }

    public List<Reviews> getAllReviews() throws SQLException {
        List<Reviews> reviewList = new ArrayList<>();
        String sql = "SELECT * FROM Reviews";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Reviews review = new Reviews();
                review.setId(rs.getInt("review_id"));
                review.setBookId(rs.getInt("book_id"));
                review.setUserId(rs.getInt("user_id"));
                review.setRating(rs.getInt("rating"));
                review.setComment(rs.getString("comment"));
                review.setCreatedAt(rs.getTimestamp("created_at"));
                reviewList.add(review);
            }
        }
        return reviewList;
    }

    public void updateReview(Reviews review) throws SQLException {
        String sql = "UPDATE Reviews SET book_id = ?, user_id = ?, rating = ?, comment = ? WHERE review_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, review.getBookId());
            stmt.setInt(2, review.getUserId());
            stmt.setInt(3, review.getRating());
            stmt.setString(4, review.getComment());
            stmt.setInt(5, review.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteReview(int id) throws SQLException {
        String sql = "DELETE FROM Reviews WHERE review_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
