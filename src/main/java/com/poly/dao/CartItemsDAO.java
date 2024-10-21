package com.poly.dao;

import com.poly.entity.CartItems;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection; // Thêm dòng này

public class CartItemsDAO {
    private Connection connection;

    public CartItemsDAO(Connection connection) {
        this.connection = connection;
    }
    public List<CartItems> getCartItems(int cartId) {
        List<CartItems> cartItemsList = new ArrayList<>();
        String sql = "SELECT * FROM CartItems WHERE cart_id = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, cartId);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                CartItems cartItem = new CartItems();
                cartItem.setCartId(resultSet.getInt("cart_id"));
                cartItem.setProductId(resultSet.getInt("product_id"));
                cartItem.setProductName(resultSet.getString("product_name"));
                cartItem.setPrice(resultSet.getDouble("price"));
                cartItem.setQuantity(resultSet.getInt("quantity"));
                
                cartItemsList.add(cartItem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return cartItemsList;
    }

    // Thêm một mặt hàng vào giỏ hàng
    public void addCartItem(CartItems item) throws SQLException {
        String sql = "INSERT INTO CartItems (product_id, product_name, price, cart_id, book_id, quantity) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, item.getProductId());
            ps.setString(2, item.getProductName());
            ps.setDouble(3, item.getPrice());
            ps.setInt(4, item.getCartId());
            ps.setInt(5, item.getBookId());
            ps.setInt(6, item.getQuantity());
            ps.executeUpdate();
        }
    }

    // Cập nhật số lượng mặt hàng trong giỏ
    public void updateCartItem(CartItems item) throws SQLException {
        String sql = "UPDATE CartItems SET quantity = ? WHERE product_id = ? AND cart_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, item.getQuantity());
            ps.setInt(2, item.getProductId());
            ps.setInt(3, item.getCartId());
            ps.executeUpdate();
        }
    }

    // Xóa mặt hàng khỏi giỏ hàng
    public void removeCartItem(int productId, int cartId) throws SQLException {
        String sql = "DELETE FROM CartItems WHERE product_id = ? AND cart_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, productId);
            ps.setInt(2, cartId);
            ps.executeUpdate();
        }
    }
}
