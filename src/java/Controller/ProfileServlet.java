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
import javax.servlet.http.HttpSession;

@WebServlet(name = "ProfileServlet", urlPatterns = {"/ProfileServlet"})
public class ProfileServlet extends HttpServlet {

 

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Retrieve the user's username from the session (or your authentication mechanism)
        HttpSession session = request.getSession(false);
        if (session != null) {
            String userName = (String) session.getAttribute("userName");

            // Use the username to retrieve the email from the database
            String email = getEmailByUsername(userName);

            // Set the username and email as request attributes
            request.setAttribute("userName", userName);
            request.setAttribute("email", email);
        }

        // Forward to the profile JSP
        request.getRequestDispatcher("profile.jsp").forward(request, response);
    }

    // Helper method to retrieve email by username from the database
    private String getEmailByUsername(String userName) {
        String email = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Establish a database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");

            // Write a SQL query to retrieve the email by username
            String sql = "SELECT email FROM users WHERE name = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, userName);

            // Execute the query
            rs = ps.executeQuery();

            if (rs.next()) {
                // Retrieve the email from the result set
                email = rs.getString("email");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            // Handle database exceptions
        } finally {
            // Close database resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return email;
    }
}
