/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StatusCount")
public class StatusCountServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int approvedCount = getCount("approved");
        int pendingCount = getCount("pending");
        int rejectedCount = getCount("rejected");

        if (approvedCount >= 0 && pendingCount >= 0 && rejectedCount >= 0) {
            request.setAttribute("approvedCount", approvedCount);
            request.setAttribute("pendingCount", pendingCount);
            request.setAttribute("rejectedCount", rejectedCount);

            request.getRequestDispatcher("admin_dashboard.jsp").forward(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Failed to retrieve counts from the database.");
        }
    }

    private int getCount(String status) {
        String jdbcUrl = "jdbc:mysql://localhost/login";
        String dbUser = "root";
        String dbPassword = "";
        
        int count = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
            String sql = "SELECT COUNT(*) AS count FROM application WHERE status = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, status);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                count = rs.getInt("count");
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return -1; // Return a negative value to indicate an error
        }

        return count;
    }
}
