package com.poly.dao;

import com.poly.entity.CartItems;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpSession;

public class CartDAO {

    private static DataSource dataSource;

    static {
        try {
            InitialContext ctx = new InitialContext();
            dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/YourDataSource"); // Cập nhật với JNDI của bạn
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    // Lấy kết nối
    private Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    // Lấy danh sách mặt hàng trong giỏ hàng từ phiên làm việc
    public static List<CartItems> getCartItems(HttpSession session) {
        List<CartItems> cartItemList = new ArrayList<>();

        // Lấy giỏ hàng từ session
        List<CartItems> cart = (List<CartItems>) session.getAttribute("cart");
        if (cart != null) {
            cartItemList.addAll(cart);
        }
        
        return cartItemList;
    }

    // Thêm sản phẩm vào giỏ hàng
    public static void addProductToCart(String productId, int quantity, HttpSession session) {
        // Tạo một đối tượng CartItems mới
        CartItems cartItem = new CartItems();
        cartItem.setProductId(Integer.parseInt(productId));
        cartItem.setQuantity(quantity);

        // Lấy giỏ hàng từ phiên làm việc
        List<CartItems> cart = (List<CartItems>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }
        
        // Kiểm tra xem sản phẩm đã có trong giỏ hàng chưa
        boolean exists = false;
        for (CartItems item : cart) {
            if (item.getProductId() == cartItem.getProductId()) {
                item.setQuantity(item.getQuantity() + quantity); // Cập nhật số lượng nếu đã có
                exists = true;
                break;
            }
        }

        // Nếu sản phẩm chưa có, thêm mới
        if (!exists) {
            cart.add(cartItem);
        }
    }
}
