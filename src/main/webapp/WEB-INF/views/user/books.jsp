<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*, com.poly.database.DatabaseConnection" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.poly.entity.Books" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Danh sách sách</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/cart/css/style.css">
</head>
<body>
    <h1>Danh sách sách</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Tên sách</th>
                <th>Tác giả</th>
                <th>Giá</th>
                <th>Thể loại</th>
            </tr>
        </thead>
        <tbody>
            <%
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;

                try {
                    connection = DatabaseConnection.getConnection();
                    String sql = "SELECT * FROM Books"; // Thay đổi truy vấn nếu cần
                    preparedStatement = connection.prepareStatement(sql);
                    resultSet = preparedStatement.executeQuery();

                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        String author = resultSet.getString("author");
                        double price = resultSet.getDouble("price");
                        String category = resultSet.getString("category");

                        out.println("<tr>");
                        out.println("<td>" + id + "</td>");
                        out.println("<td>" + name + "</td>");
                        out.println("<td>" + author + "</td>");
                        out.println("<td>" + price + "</td>");
                        out.println("<td>" + category + "</td>");
                        out.println("</tr>");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    // Đóng kết nối
                    if (resultSet != null) try { resultSet.close(); } catch (SQLException e) {}
                    if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException e) {}
                    if (connection != null) try { connection.close(); } catch (SQLException e) {}
                }
            %>
        </tbody>
    </table>
</body>
</html>
