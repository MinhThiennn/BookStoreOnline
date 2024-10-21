package com.poly.dao;

import com.poly.entity.Orders;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrdersDAO {
    private Connection connection;

    public OrdersDAO(Connection connection) {
        this.connection = connection;
    }

    public void addOrder(Orders order) throws SQLException {
        String sql = "INSERT INTO Orders (user_id, total_amount, status) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, order.getUserId());
            stmt.setBigDecimal(2, order.getTotalAmount());
            stmt.setString(3, order.getStatus());
            stmt.executeUpdate();
        }
    }

    public Orders getOrderById(int id) throws SQLException {
        String sql = "SELECT * FROM Orders WHERE order_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Orders order = new Orders();
                order.setId(rs.getInt("order_id"));
                order.setUserId(rs.getInt("user_id"));
                order.setOrderDate(rs.getTimestamp("order_date"));
                order.setTotalAmount(rs.getBigDecimal("total_amount"));
                order.setStatus(rs.getString("status"));
                return order;
            }
        }
        return null;
    }

    public List<Orders> getAllOrders() throws SQLException {
        List<Orders> orderList = new ArrayList<>();
        String sql = "SELECT * FROM Orders";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Orders order = new Orders();
                order.setId(rs.getInt("order_id"));
                order.setUserId(rs.getInt("user_id"));
                order.setOrderDate(rs.getTimestamp("order_date"));
                order.setTotalAmount(rs.getBigDecimal("total_amount"));
                order.setStatus(rs.getString("status"));
                orderList.add(order);
            }
        }
        return orderList;
    }

    public void updateOrder(Orders order) throws SQLException {
        String sql = "UPDATE Orders SET user_id = ?, total_amount = ?, status = ? WHERE order_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, order.getUserId());
            stmt.setBigDecimal(2, order.getTotalAmount());
            stmt.setString(3, order.getStatus());
            stmt.setInt(4, order.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteOrder(int id) throws SQLException {
        String sql = "DELETE FROM Orders WHERE order_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
