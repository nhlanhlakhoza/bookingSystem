
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
private static final long serialVersionUID =1L;
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  processRequest(request, response);
          PrintWriter out=response.getWriter();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
             String password=request.getParameter("password");
        String email=request.getParameter("email");
        
            PreparedStatement ps=con.prepareStatement("SELECT name FROM users WHERE email=? AND password=?");
                
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                
                String userName =  rs.getString("name");
                        HttpSession session = request.getSession();
                        session.setAttribute("userName", userName);
              
                RequestDispatcher rd =request.getRequestDispatcher("dashboard.jsp");
                rd.forward(request,response);
            }else{
                request.setAttribute("errorMessage", "Invalid username or password");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
             response.getWriter().println("");
            }
            
        } catch (Exception e) {
           
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
