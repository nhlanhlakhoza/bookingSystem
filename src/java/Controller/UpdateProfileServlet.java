package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class UpdateProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con = null;
        PreparedStatement pstmt = null;

        String userName = request.getParameter("userName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (userName == null || email == null || password == null) {
            out.println("All fields are required.");
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");

            String updateQuery = "UPDATE users SET email = ?, password = ? WHERE name = ?";
            pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            pstmt.setString(3, userName);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                out.println("Successfully updated the user's profile.");
            } else {
                out.println("Failed to update the user's profile. Check your email for correctness.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println("Sorry, an error occurred. Please try again later.");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
