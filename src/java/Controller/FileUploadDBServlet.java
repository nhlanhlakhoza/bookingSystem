package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet(name = "UploadServlet", urlPatterns = {"/UploadServlet"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1000, // 10 MB
        maxFileSize = 1024 * 1024 * 1000, // 1 GB
        maxRequestSize = 1024 * 1024 * 1000)   	// 1 GB
public class FileUploadDBServlet extends HttpServlet {

    PrintWriter out = null;
    Connection con = null;
    PreparedStatement ps = null;
    HttpSession session = null;

    //@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out = response.getWriter();
            session = request.getSession(false);
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String courseName = request.getParameter("courseName");
             String userName = request.getParameter("userName");
            Timestamp added_date = new Timestamp(System.currentTimeMillis());

            try {
                Part idFilePart = request.getPart("idFile");
                Part cvFilePart = request.getPart("cvFile");
                Part matricFilePart = request.getPart("matricFile");
                Part qualificationFilePart = request.getPart("qualification");

                String idFileName = idFilePart.getSubmittedFileName();
                String cvFileName = cvFilePart.getSubmittedFileName();
                String matricFileName = matricFilePart.getSubmittedFileName();
                String qualificationFileName = qualificationFilePart.getSubmittedFileName();

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
                System.out.println("connection done");

               // Check if the user has already applied for this course with the same username
                String checkDuplicateSQL = "SELECT COUNT(*) FROM application WHERE userName=?";
                PreparedStatement checkDuplicatePS = con.prepareStatement(checkDuplicateSQL);
                checkDuplicatePS.setString(1, userName);
                ResultSet resultSet = checkDuplicatePS.executeQuery();

                if (resultSet.next() && resultSet.getInt(1) > 0) {
                    // The user has already applied for this course with the same username
                    request.setAttribute("errorMessage", "You have already applied for this course.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("dashboard.jsp");
            dispatcher.forward(request, response);
             response.getWriter().println("");
                } else {
                    // User has not applied for this course, insert the new application
                    String sql = "INSERT INTO application (userName,firstName, lastName, added_date, courseName, idFile, cvFile, matricFile, qualification) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?)";
                    ps = con.prepareStatement(sql);
                    ps.setString(1, userName);
                    ps.setString(2, firstName);
                    ps.setString(3, lastName);
                    ps.setTimestamp(4, added_date);
                    ps.setString(5, courseName);
                    ps.setBlob(6, idFilePart.getInputStream());
                    ps.setBlob(7, cvFilePart.getInputStream());
                    ps.setBlob(8, matricFilePart.getInputStream());
                    ps.setBlob(9, qualificationFilePart.getInputStream());
                    int status = ps.executeUpdate();

                    if (status > 0) {
                        request.setAttribute("successMessage", "You have successfully submitted your application!");
                        RequestDispatcher dispatcher = request.getRequestDispatcher("dashboard.jsp");
                        dispatcher.forward(request, response);
                    } else {
                        response.getWriter().println("Failed to insert");
                    }
                }

                resultSet.close();
                checkDuplicatePS.close();
            } catch (SQLException e) {
                out.println("Exception: " + e);
                System.out.println("Exception1: " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FileUploadDBServlet.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (ps != null) {
                        ps.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    out.println(e);
                }
            }

        } catch (IOException | ServletException e) {
            out.println("Exception: " + e);
            System.out.println("Exception2: " + e);
        }
    }

}
