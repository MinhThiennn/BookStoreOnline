package com.poly.controller;

import com.poly.dao.CartDAO;
import com.poly.entity.CartItems;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@WebServlet("/home/cart")
public class CartController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy phiên làm việc
        HttpSession session = request.getSession();
        
        // Lấy danh sách mặt hàng trong giỏ hàng từ DAO
        List<CartItems> cartItemList = CartDAO.getCartItems(session);
        
        // Tính toán tổng tiền
        double subtotal = 0.0;
        for (CartItems item : cartItemList) {
            subtotal += item.getPrice() * item.getQuantity(); // Tính subtotal
        }
        
        // Lưu danh sách và subtotal vào request
        request.setAttribute("cartItemList", cartItemList);
        request.setAttribute("subtotal", subtotal);
        
        // Chuyển hướng đến trang cart.jsp
        request.getRequestDispatcher("/WEB-INF/views/user/cart.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Xử lý khi thêm sản phẩm vào giỏ hàng
        String productId = request.getParameter("productId");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        HttpSession session = request.getSession();
        
        // Gọi phương thức để thêm sản phẩm vào giỏ hàng
        CartDAO.addProductToCart(productId, quantity, session);
        
        // Chuyển hướng về trang giỏ hàng
        response.sendRedirect(request.getContextPath() + "/cart");
    }
}
