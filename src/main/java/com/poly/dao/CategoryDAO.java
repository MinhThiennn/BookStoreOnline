package com.poly.dao;

import com.poly.entity.Categories;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
    private Connection connection;

    public CategoryDAO(Connection connection) {
        this.connection = connection;
    }

    public void addCategory(Categories category) throws SQLException {
        String sql = "INSERT INTO Categories (category_name) VALUES (?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, category.getCategoryName());
            stmt.executeUpdate();
        }
    }

    public Categories getCategoryById(int id) throws SQLException {
        String sql = "SELECT * FROM Categories WHERE category_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Categories category = new Categories();
                category.setId(rs.getInt("category_id"));
                category.setCategoryName(rs.getString("category_name"));
                return category;
            }
        }
        return null;
    }

    public List<Categories> getAllCategories() throws SQLException {
        List<Categories> categoryList = new ArrayList<>();
        String sql = "SELECT * FROM Categories";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Categories category = new Categories();
                category.setId(rs.getInt("category_id"));
                category.setCategoryName(rs.getString("category_name"));
                categoryList.add(category);
            }
        }
        return categoryList;
    }

    public void updateCategory(Categories category) throws SQLException {
        String sql = "UPDATE Categories SET category_name = ? WHERE category_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, category.getCategoryName());
            stmt.setInt(2, category.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteCategory(int id) throws SQLException {
        String sql = "DELETE FROM Categories WHERE category_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
