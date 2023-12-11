<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.io.IOException, java.sql.Connection, java.sql.DriverManager, java.sql.PreparedStatement" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Status Update</title>
</head>
<body>
    <%
        String jdbcUrl = "jdbc:mysql://localhost/login"; // Replace with your database URL
        String dbUser = "root"; // Replace with your database username
        String dbPassword = ""; // Replace with your database password

        int id = Integer.parseInt(request.getParameter("id"));
        String status = request.getParameter("status");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

            // Update the status in your database table
            String updateSql = "UPDATE application SET status = ? WHERE id = ?";
            PreparedStatement updateStatement = conn.prepareStatement(updateSql);
            updateStatement.setString(1, status);
            updateStatement.setInt(2, id);
            updateStatement.executeUpdate();
            updateStatement.close();
            conn.close();

            response.getWriter().println("Status updated successfully");

    %>
    <script>
        setTimeout(function () {
            window.location.href = "admin_dashboard.jsp"; // Replace with the actual URL of your admin dashboard
        }, 3000); // Redirect after 3 seconds (adjust the time as needed)
    </script>
    <%
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("An error occurred while updating the status");
        }
    %>
</body>
</html>
