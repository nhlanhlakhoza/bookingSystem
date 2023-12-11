package Controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateStatusServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

            // Redirect to admin_dashboard.jsp
            response.sendRedirect("admin_dashboard.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("An error occurred while updating the status");
        }
    }
}
