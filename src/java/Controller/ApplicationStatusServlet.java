package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ApplicationStatusServlet", urlPatterns = {"/ApplicationStatusServlet"})
public class ApplicationStatusServlet extends HttpServlet {
    Connection con = null;
    PreparedStatement ps = null;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession();
   
     String userName = (String) session.getAttribute("userName");
        if (userName == null || userName.isEmpty()) {
            response.setContentType("text/plain");
            response.getWriter().println("User not found");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");

                String action = request.getParameter("action");
                if (action != null && action.equals("delete")) {
                    // Handle delete action
                    String courseToDelete = request.getParameter("course");
                    if (courseToDelete != null) {
                        boolean deleted = deleteApplication(userName, courseToDelete);
                        if (deleted) {
                            // Set the success message
                            request.setAttribute("alertMessage", "Course deleted successfully");
                            log("Success: Deleted course " + courseToDelete + " for user " + userName);
                        } else {
                            // Set the failure message
                            request.setAttribute("alertMessage", "Failed to delete course");
                            log("Failure: Failed to delete course " + courseToDelete + " for user " + userName);
                        }
                    } else {
                        // Course parameter is missing, log an alert
                        log("Alert: Course parameter is missing in delete action.");
                    }
                } else {
                    // Action parameter is missing or not 'delete', log an alert
                    log("Alert: Invalid or missing action in the request.");
                }

                String sql = "SELECT courseName, status FROM application WHERE userName = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, userName);
                ResultSet rs = ps.executeQuery();

                StringBuilder tableHtml = new StringBuilder();
                tableHtml.append("<h2 class=\"status-title\">Application Status</h2>");
                tableHtml.append("<table class='application-status-table'>");
                tableHtml.append("<thead><tr><th>Course</th><th>Status</th><th>Action</th></tr></thead>");
                tableHtml.append("<tbody>");

                while (rs.next()) {
                    String course = rs.getString("courseName");
                    String status = rs.getString("status");
                    // Use the "times" icon (X) from FontAwesome as a delete icon
                    tableHtml.append("<tr><td>").append(course).append("</td><td>").append(status)
                            .append("</td><td><a href='ApplicationStatusServlet?action=delete&course=").append(course)
                            .append("' class='delete-link'><i class='fa fa-trash-o'></i></a></td></tr>");
                }

                tableHtml.append("</tbody></table>");

                request.setAttribute("applicationStatusMessage", tableHtml.toString());
            } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
                request.setAttribute("alertMessage", "Error: " + ex.getMessage());
            } finally {
                try {
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

            RequestDispatcher dispatcher = request.getRequestDispatcher("applicationStatus.jsp");
            dispatcher.forward(request, response);
        }
    }

    // Update the deleteApplication method to return a boolean
    private boolean deleteApplication(String userName, String courseName) {
        try {
            String deleteSql = "DELETE FROM application WHERE userName = ? AND courseName = ?";
            ps = con.prepareStatement(deleteSql);
            ps.setString(1, userName);
            ps.setString(2, courseName);

            int rowsDeleted = ps.executeUpdate();

            // Return true if at least one row was deleted
            return rowsDeleted > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Return false in case of an exception or if no rows were deleted
            return false;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
