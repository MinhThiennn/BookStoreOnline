package com.poly.dao;

import com.poly.entity.Books;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BooksDAO {
    private Connection connection;

    public BooksDAO(Connection connection) {
        this.connection = connection;
    }

    public void addBook(Books book) throws SQLException {
        String sql = "INSERT INTO Books (title, author, category_id, price, stock_quantity, description, image_path) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setInt(3, book.getCategoryId());
            stmt.setBigDecimal(4, book.getPrice());
            stmt.setInt(5, book.getStockQuantity());
            stmt.setString(6, book.getDescription());
            stmt.setString(7, book.getImagePath());
            stmt.executeUpdate();
        }
    }

    public Books getBookById(int id) throws SQLException {
        String sql = "SELECT * FROM Books WHERE book_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Books book = new Books();
                book.setBookId(rs.getInt("book_id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setCategoryId(rs.getInt("category_id"));
                book.setPrice(rs.getBigDecimal("price"));
                book.setStockQuantity(rs.getInt("stock_quantity"));
                book.setDescription(rs.getString("description"));
                book.setImagePath(rs.getString("image_path"));
                book.setCreatedAt(rs.getTimestamp("created_at"));
                book.setUpdatedAt(rs.getTimestamp("updated_at"));
                return book;
            }
        }
        return null;
    }

    public List<Books> getAllBooks() throws SQLException {
        List<Books> bookList = new ArrayList<>();
        String sql = "SELECT * FROM Books";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Books book = new Books();
                book.setBookId(rs.getInt("book_id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setCategoryId(rs.getInt("category_id"));
                book.setPrice(rs.getBigDecimal("price"));
                book.setStockQuantity(rs.getInt("stock_quantity"));
                book.setDescription(rs.getString("description"));
                book.setImagePath(rs.getString("image_path"));
                book.setCreatedAt(rs.getTimestamp("created_at"));
                book.setUpdatedAt(rs.getTimestamp("updated_at"));
                bookList.add(book);
            }
        }
        return bookList;
    }

    public void updateBook(Books book) throws SQLException {
        String sql = "UPDATE Books SET title = ?, author = ?, category_id = ?, price = ?, stock_quantity = ?, description = ?, image_path = ? WHERE book_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setInt(3, book.getCategoryId());
            stmt.setBigDecimal(4, book.getPrice());
            stmt.setInt(5, book.getStockQuantity());
            stmt.setString(6, book.getDescription());
            stmt.setString(7, book.getImagePath());
            stmt.setInt(8, book.getBookId());
            stmt.executeUpdate();
        }
    }

    public void deleteBook(int id) throws SQLException {
        String sql = "DELETE FROM Books WHERE book_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
