package com.poly.dao;

import com.poly.database.DatabaseConnection;
import com.poly.entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private Connection connection;

    public ProductDAO(Connection connection) {
        this.connection = connection; // Gán kết nối vào biến instance
    }

    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        String query = "SELECT id, name, price, description, image_url FROM Products"; // Câu truy vấn

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setDescription(rs.getString("description"));
                product.setImageUrl(rs.getString("image_url")); // Lưu đường dẫn hình ảnh
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Xử lý ngoại lệ SQL
        }
        return productList;
    }

    public void addProduct(Product product) {
        String query = "INSERT INTO Products (name, price, description, image_url) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setString(3, product.getDescription());
            ps.setString(4, product.getImageUrl());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Xử lý ngoại lệ SQL
        }
    }

    public void updateProduct(Product product) {
        String query = "UPDATE Products SET name = ?, price = ?, description = ?, image_url = ? WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setString(3, product.getDescription());
            ps.setString(4, product.getImageUrl());
            ps.setInt(5, product.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Xử lý ngoại lệ SQL
        }
    }

    public void deleteProduct(int id) {
        String query = "DELETE FROM Products WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Xử lý ngoại lệ SQL
        }
    }

    public Product getProductById(int id) {
        Product product = null;
        String query = "SELECT id, name, price, description, image_url FROM Products WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setDescription(rs.getString("description"));
                product.setImageUrl(rs.getString("image_url"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Xử lý ngoại lệ SQL
        }
        return product;
    }
}
