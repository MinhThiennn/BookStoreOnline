package com.poly.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.poly.dao.BooksDAO;
import com.poly.dao.ProductDAO;
import com.poly.database.DatabaseConnection;
import com.poly.entity.Product;

@WebServlet("/admin/product")
public class ProductController extends HttpServlet {
    private ProductDAO productDAO;

    @Override
    public void init() throws ServletException {
        try {
            Connection connection = DatabaseConnection.getConnection(); // Kết nối tới cơ sở dữ liệu
            productDAO = new ProductDAO(connection); // Khởi tạo BooksDAO với kết nối
        } catch (SQLException e) {
            throw new ServletException("Database connection error", e);
        }
    }
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String description = request.getParameter("description");
        String imageUrl = request.getParameter("image_url");

        if (id == null || id.isEmpty()) {
            // Thêm sản phẩm mới
            Product newProduct = new Product();
            newProduct.setName(name);
            newProduct.setPrice(Double.parseDouble(price));
            newProduct.setDescription(description);
            newProduct.setImageUrl(imageUrl);
            productDAO.addProduct(newProduct);
        } else {
            // Cập nhật sản phẩm
            Product updatedProduct = new Product();
            updatedProduct.setId(Integer.parseInt(id));
            updatedProduct.setName(name);
            updatedProduct.setPrice(Double.parseDouble(price));
            updatedProduct.setDescription(description);
            updatedProduct.setImageUrl(imageUrl);
            productDAO.updateProduct(updatedProduct);
        }

        response.sendRedirect("productManagement");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productId = request.getPathInfo() != null ? request.getPathInfo().substring(1) : ""; // Lấy ID sản phẩm từ URL
        if (productId.isEmpty()) {
            // Trả về danh sách sản phẩm
            List<Product> products = productDAO.getAllProducts();
            request.setAttribute("productsList", products);
            request.getRequestDispatcher("/WEB-INF/views/user/product.jsp").forward(request, response);
        } else {
            // Trả về thông tin sản phẩm theo ID
            Product product = productDAO.getProductById(Integer.parseInt(productId));
            response.setContentType("application/json");
            response.getWriter().write(new Gson().toJson(product)); // Chuyển đổi sang JSON
        }
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productId = request.getPathInfo() != null ? request.getPathInfo().substring(1) : ""; // Lấy ID sản phẩm từ URL
        if (!productId.isEmpty()) {
            productDAO.deleteProduct(Integer.parseInt(productId));
            response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST); // Trả về lỗi nếu không có ID
        }
    }
}


