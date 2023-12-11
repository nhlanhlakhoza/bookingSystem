
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import  java.sql.*;
import javax.servlet.RequestDispatcher;
import java.sql.Connection;
 import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.servlet.http.HttpSession;
public class register extends HttpServlet {

   
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          // String adminName = request.getParameter("adminName");
           
       PrintWriter out=response.getWriter();
        Connection con = null;
        PreparedStatement pstmt = null;
     
      String name=request.getParameter("name");
       String password=request.getParameter("password");
        String email=request.getParameter("email");
          String confirmPassword= request.getParameter("psw-repeat");
       //String adminName = request.getParameter("adminName"); // Replace with the actual parameter name
        
        // Store the admin's name in a session variable
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
     // Check if password and confirmPassword match
        if (!password.equals(confirmPassword)) {
            request.setAttribute("errorMessage", "Password and Confirm Password do not match.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Check if password meets the minimum length requirement (e.g., 8 characters)
        int minPasswordLength = 8; // You can adjust this value as needed
        if (password.length() < minPasswordLength) {
            request.setAttribute("errorMessage", "Password must be at least " + minPasswordLength + " characters long.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Validate email using a regular expression
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            request.setAttribute("errorMessage", "Invalid email address.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
            dispatcher.forward(request, response);
            return;
        }
       
        
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
// Check if the name is already taken
            String checkNameQuery = "SELECT COUNT(*) FROM users WHERE name = ?";
            pstmt = con.prepareStatement(checkNameQuery);
            pstmt.setString(1, name);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next() && resultSet.getInt(1) > 0) {
                // The name is already taken
                request.setAttribute("errorMessage", "The name is already taken. Please choose another name.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
                dispatcher.forward(request, response);
                return;
            }
            String insertQuery = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(insertQuery);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, password);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                
                request.setAttribute("successMessage", "You have successfully signed up!");
                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                  dispatcher.forward(request, response);
                response.getWriter().println("");
            } else {
                response.getWriter().println("Failed to insert user");
            }
           
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Sorry, an error occurred. Please try again later.");
        }
            
      
    }}

  
