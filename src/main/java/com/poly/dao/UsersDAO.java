package com.poly.dao;

import com.poly.entity.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO {
    private Connection connection; // Kết nối cơ sở dữ liệu

    // Constructor nhận Connection
    public UsersDAO(Connection connection) {
        this.connection = connection;
    }

    // Kiểm tra thông tin đăng nhập
    public Users checkLogin(String username, String password) throws SQLException {
        String sql = "SELECT * FROM Users WHERE username = ? AND password = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                // Tạo đối tượng Users từ kết quả truy vấn
                Users user = new Users();
                user.setUserId(rs.getInt("user_id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                // Thêm các thuộc tính khác nếu cần
                return user;
            }
        }
        return null; // Không tìm thấy người dùng
    }

    // Lấy danh sách tất cả người dùng
    public List<Users> getAllUsers() throws SQLException {
        List<Users> userList = new ArrayList<>();
        String sql = "SELECT * FROM Users"; // Thay đổi tên bảng nếu cần

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Users user = new Users();
                user.setUserId(resultSet.getInt("user_id")); // Thay đổi nếu cần
                user.setUsername(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setRole(resultSet.getString("role")); // Thêm thuộc tính role
                userList.add(user);
            }
        }
        return userList; // Trả về danh sách người dùng
    }

    // Thêm người dùng
    public void addUser(Users user) throws SQLException {
        String sql = "INSERT INTO Users (username, password, email, role) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword()); // Nên mã hóa mật khẩu
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getRole());
            statement.executeUpdate(); // Thực hiện câu lệnh thêm
        }
    }

    // Cập nhật người dùng
    public void updateUser(Users user) throws SQLException {
        String sql = "UPDATE Users SET username = ?, password = ?, email = ?, role = ? WHERE user_id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword()); // Nên mã hóa mật khẩu
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getRole());
            statement.setInt(5, user.getUserId());
            statement.executeUpdate(); // Thực hiện câu lệnh cập nhật
        }
    }

    // Xóa người dùng
    public void deleteUser(int userId) throws SQLException {
        String sql = "DELETE FROM Users WHERE user_id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, userId);
            statement.executeUpdate(); // Thực hiện câu lệnh xóa
        }
    }
}
