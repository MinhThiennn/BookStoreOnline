package com.poly.dao;

import com.poly.entity.OrderDetails;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailsDAO {
    private Connection connection;

    public OrderDetailsDAO(Connection connection) {
        this.connection = connection;
    }

    public void addOrderDetail(OrderDetails orderDetail) throws SQLException {
        String sql = "INSERT INTO OrderDetails (order_id, book_id, quantity, price) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, orderDetail.getOrderId());
            stmt.setInt(2, orderDetail.getBookId());
            stmt.setInt(3, orderDetail.getQuantity());
            stmt.setBigDecimal(4, orderDetail.getPrice());
            stmt.executeUpdate();
        }
    }

    public OrderDetails getOrderDetailById(int id) throws SQLException {
        String sql = "SELECT * FROM OrderDetails WHERE order_detail_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                OrderDetails orderDetail = new OrderDetails();
                orderDetail.setId(rs.getInt("order_detail_id"));
                orderDetail.setOrderId(rs.getInt("order_id"));
                orderDetail.setBookId(rs.getInt("book_id"));
                orderDetail.setQuantity(rs.getInt("quantity"));
                orderDetail.setPrice(rs.getBigDecimal("price"));
                return orderDetail;
            }
        }
        return null;
    }

    public List<OrderDetails> getAllOrderDetails() throws SQLException {
        List<OrderDetails> orderDetailList = new ArrayList<>();
        String sql = "SELECT * FROM OrderDetails";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                OrderDetails orderDetail = new OrderDetails();
                orderDetail.setId(rs.getInt("order_detail_id"));
                orderDetail.setOrderId(rs.getInt("order_id"));
                orderDetail.setBookId(rs.getInt("book_id"));
                orderDetail.setQuantity(rs.getInt("quantity"));
                orderDetail.setPrice(rs.getBigDecimal("price"));
                orderDetailList.add(orderDetail);
            }
        }
        return orderDetailList;
    }

    public void updateOrderDetail(OrderDetails orderDetail) throws SQLException {
        String sql = "UPDATE OrderDetails SET order_id = ?, book_id = ?, quantity = ?, price = ? WHERE order_detail_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, orderDetail.getOrderId());
            stmt.setInt(2, orderDetail.getBookId());
            stmt.setInt(3, orderDetail.getQuantity());
            stmt.setBigDecimal(4, orderDetail.getPrice());
            stmt.setInt(5, orderDetail.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteOrderDetail(int id) throws SQLException {
        String sql = "DELETE FROM OrderDetails WHERE order_detail_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
