package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class User_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <title>Your Title Here</title>\n");
      out.write("    <link href=\"dist/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css\">\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf8\" src=\"https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js\"></script>\n");
      out.write("     <link href=\"../_include/css/main.css\" rel=\"stylesheet\">\n");
      out.write("   \n");
      out.write("     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("     <div class=\"sidebar\">\n");
      out.write("    <div class=\"logo-details\">\n");
      out.write("      <!--i class='bx bxl-c-plus-plus'></i-->\n");
      out.write("      <span class=\"logo_name\"></span>\n");
      out.write("    </div>\n");
      out.write("      <ul class=\"nav-links\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"admin_dashboard.jsp\"> <!-- a class=\"active\"-->\n");
      out.write("            <i class='bx bx-grid-alt' ></i>\n");
      out.write("            <span class=\"links_name\">Dashboard</span>\n");
      out.write("             \n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <!--li>\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class='bx bx-box' ></i>\n");
      out.write("            <span class=\"links_name\">Application</span>\n");
      out.write("          </a>\n");
      out.write("        </li-->\n");
      out.write("        \n");
      out.write("        <li>\n");
      out.write("            <a href=\"#\">\n");
      out.write("            <i class='bx bx-pie-chart-alt-2' ></i>\n");
      out.write("            <span class=\"links_name\">Application status</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <li>\n");
      out.write("          <a href=\"ProfileServlet\">\n");
      out.write("            <i class='bx bx-cog' ></i>\n");
      out.write("            <span class=\"links_name\">Settings</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"User.jsp\">\n");
      out.write("            <i class='bx bx-user' ></i>\n");
      out.write("            <span class=\"links_name\">List of User</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <!--li>\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class='bx bx-heart' ></i>\n");
      out.write("            <span class=\"links_name\">Favorites</span>\n");
      out.write("          </a>\n");
      out.write("        </li-->\n");
      out.write("        <!--li>\n");
      out.write("          <a href=\"ProfileServlet\">\n");
      out.write("            <i class='bx bx-cog' ></i>\n");
      out.write("            <span class=\"links_name\">Setting</span>\n");
      out.write("          </a>\n");
      out.write("        </li-->\n");
      out.write("        <li class=\"log_out\">\n");
      out.write("          <a href=\"login.jsp\">\n");
      out.write("            <i class='bx bx-log-out'></i>\n");
      out.write("            <span class=\"links_name\">Log out</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("  <section class=\"home-section\">\n");
      out.write("    <nav>\n");
      out.write("      <div class=\"sidebar-button\">\n");
      out.write("        <i class='bx bx-menu sidebarBtn'></i>\n");
      out.write("        <span class=\"dashboard\">Welcome to 4IRI Admin</span>\n");
      out.write("      </div>\n");
      out.write("      <!--div class=\"search-box\">\n");
      out.write("        <input type=\"text\" placeholder=\"Search\">\n");
      out.write("        <i class='bx bx-search' ></i>\n");
      out.write("      </div-->\n");
      out.write("      <div class=\"profile-details\">\n");
      out.write("        <img src=\"../_include/img/avatar15.jpg\" alt=\"\">\n");
      out.write("        <span class=\"admin_name\">Administrator</span>\n");
      out.write("        <!--i class='bx bx-chevron-down' ></i-->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"home-content\">\n");
      out.write("        <div class=\"overview-boxess\">\n");
      out.write("   \n");
      out.write("<h2>Applications</h2>\n");
      out.write("<table class=\"table table-striped table-hover table-bordered\" id=\"data-table\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>Username</th>\n");
      out.write("            <th>Course</th>\n");
      out.write("            <th>Status</th>\n");
      out.write("            <th>View</th>\n");
      out.write("            <th>Action</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");

            String jdbcUrl = "jdbc:mysql://localhost/login";
            String dbUser = "root";
            String dbPassword = "";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
                String sql = "SELECT * FROM application";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String username = rs.getString("userName");
                    String course = rs.getString("courseName");
                    String status = rs.getString("status");
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( id );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( username );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( course );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print( status );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"view_docs.jsp?id=");
      out.print( id );
      out.write("&type=idFile\" target=\"_blank\">View ID</a>\n");
      out.write("                        <a href=\"view_docs.jsp?id=");
      out.print( id );
      out.write("&type=matricFile\" target=\"_blank\">View Matric</a>\n");
      out.write("                        <a href=\"view_docs.jsp?id=");
      out.print( id );
      out.write("&type=qualification\" target=\"_blank\">View Qualification</a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <select id=\"status");
      out.print( id );
      out.write("\" name=\"status\">\n");
      out.write("                            <option value=\"Accepted\" ");
      out.print( "Accepted".equals(status) ? "selected" : "" );
      out.write(">Accepted</option>\n");
      out.write("                            <option value=\"Rejected\" ");
      out.print( "Rejected".equals(status) ? "selected" : "" );
      out.write(">Rejected</option>\n");
      out.write("                        </select>\n");
      out.write("                        <button type=\"button\" onclick=\"updateStatus(");
      out.print( id );
      out.write(")\">Update</button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                }
                rs.close();
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("   \n");
      out.write("        </div >\n");
      out.write("        \n");
      out.write("\n");
      out.write("      \n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#data-table').DataTable({\n");
      out.write("                \"pageLength\": 10\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("   <script>\n");
      out.write("    function updateStatus(id) {\n");
      out.write("        var status = document.getElementById(\"status\" + id).value;\n");
      out.write("        // Send an AJAX request to update the status in the database\n");
      out.write("        // You will need to implement the update logic on the server side\n");
      out.write("        // You can use JavaScript, jQuery, or other technologies for the AJAX request\n");
      out.write("        // For example, here's a jQuery-based AJAX request:\n");
      out.write("        $.ajax({\n");
      out.write("            url: \"update_status.jsp\", // Replace with the actual URL to your server-side script\n");
      out.write("            type: \"POST\",\n");
      out.write("            data: { id: id, status: status },\n");
      out.write("            success: function(data) {\n");
      out.write("                // Handle success\n");
      out.write("                // You can update the UI or display a success message\n");
      out.write("                alert(\"Status updated successfully\");\n");
      out.write("                 window.location.href = \"User.jsp\";\n");
      out.write("            },\n");
      out.write("            error: function() {\n");
      out.write("                // Handle error\n");
      out.write("                // You can display an error message or perform error handling\n");
      out.write("                alert(\"An error occurred while updating the status\");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
