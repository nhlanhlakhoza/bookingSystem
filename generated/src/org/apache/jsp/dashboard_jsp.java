package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Coding by CodingNepal | www.codingnepalweb.com -->\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title> Responsiive Admin Dashboard | CodingLab </title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <!-- Boxicons CDN Link -->\n");
      out.write("    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link href=\"_include/css/main.css\" rel=\"stylesheet\">\n");
      out.write("  <link href='https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap' rel='stylesheet' type='text/css'>\n");
      out.write("   </head>\n");
      out.write("<body>\n");
      out.write("    ");
 String successMessage = (String) request.getAttribute("successMessage"); 
      out.write('\n');
 if (successMessage != null) { 
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert(\"");
      out.print( successMessage );
      out.write("\");\n");
      out.write("    </script>\n");
 } 
      out.write("\n");
      out.write("           ");
 String errorMessage = (String) request.getAttribute("errorMessage"); 
      out.write('\n');
 if (errorMessage != null) { 
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert(\"");
      out.print( errorMessage );
      out.write("\");\n");
      out.write("    </script>\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"sidebar\">\n");
      out.write("    <div class=\"logo-details\">\n");
      out.write("      <!--i class='bx bxl-c-plus-plus'></i-->\n");
      out.write("      <span class=\"logo_name\"></span>\n");
      out.write("    </div>\n");
      out.write("      <ul class=\"nav-links\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"dashboard.jsp\"> <!-- a class=\"active\"-->\n");
      out.write("            <i class='bx bx-grid-alt' ></i>\n");
      out.write("            <span class=\"links_name\">Application</span>\n");
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
      out.write("            <a href=\"ApplicationStatusServlet\">\n");
      out.write("            <i class='bx bx-pie-chart-alt-2' ></i>\n");
      out.write("            <span class=\"links_name\">Application status</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <!--li>\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class='bx bx-book-alt' ></i>\n");
      out.write("            <span class=\"links_name\">Total order</span>\n");
      out.write("          </a>\n");
      out.write("        </li-->\n");
      out.write("        <li>\n");
      out.write("          <a href=\"ProfileServlet\">\n");
      out.write("            <i class='bx bx-user' ></i>\n");
      out.write("            <span class=\"links_name\">Profile</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class='bx bx-message' ></i>\n");
      out.write("            <span class=\"links_name\">Messages</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class='bx bx-heart' ></i>\n");
      out.write("            <span class=\"links_name\">Favorites</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class='bx bx-cog' ></i>\n");
      out.write("            <span class=\"links_name\">Setting</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
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
      out.write("        <span class=\"dashboard\">Welcome to 4IRI</span>\n");
      out.write("      </div>\n");
      out.write("      <!--div class=\"search-box\">\n");
      out.write("        <input type=\"text\" placeholder=\"Search\">\n");
      out.write("        <i class='bx bx-search' ></i>\n");
      out.write("      </div-->\n");
      out.write("      <div class=\"profile-details\">\n");
      out.write("        <img src=\"_include/img/avatar15.jpg\" alt=\"\">\n");
      out.write("        <span class=\"admin_name\"> ");
 String userName = (String) session.getAttribute("userName"); 
      out.write("\n");
      out.write("            ");
      out.print( userName );
      out.write("</span>\n");
      out.write("        <!--i class='bx bx-chevron-down' ></i-->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"home-content\">\n");
      out.write("         <!--div class=\"intro\">Welcome to 4IRI Internship program Application system  </div-->\n");
      out.write("         \n");
      out.write("      <div class=\"overview-boxes\">\n");
      out.write("        <div class=\"box\" >\n");
      out.write("          <div class=\"right-side\">\n");
      out.write("            <div class=\"box-topic\">Software Engineer</div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"number\">Requirement and Qualification</div>\n");
      out.write("            <div class=\"indicator\">\n");
      out.write("              <!--i class='bx bx-up-arrow-alt'></i-->\n");
      out.write("              <span class=\"text\">Diploma/Degree in Computer Science or related field</span>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("             <button type=\"button\" class=\"btn\"   data-course=\"Software Engineering\">Apply</button>\n");
      out.write("          </div>\n");
      out.write("          <!--i class='bx bx-cart-alt cart'></i-->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("          <div class=\"right-side\">\n");
      out.write("            <div class=\"box-topic\">Technical Support</div>\n");
      out.write("                   <br>\n");
      out.write("            <div class=\"number\">Requirement and Qualification</div>\n");
      out.write("            <div class=\"indicator\">\n");
      out.write("              <!--i class='bx bx-up-arrow-alt'></i-->\n");
      out.write("              <span class=\"text\">Diploma/Degree in Networking or related field</span>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("             <button type=\"button\" class=\"btn\" data-course=\"Technical Support\">Apply</button>\n");
      out.write("          </div>\n");
      out.write("          <!--i class='bx bxs-cart-add cart two' ></i-->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("          <div class=\"right-side\">\n");
      out.write("            <div class=\"box-topic\">Accounting</div>\n");
      out.write("                   <br>\n");
      out.write("            <div class=\"number\">Requirement and Qualification</div>\n");
      out.write("            <div class=\"indicator\">\n");
      out.write("              <!--i class='bx bx-up-arrow-alt'></i-->\n");
      out.write("              <span class=\"text\">Diploma/Degree in Accounting or related field</span>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("          <button type=\"button\" class=\"btn\" data-course=\"Accounting\">Apply</button>\n");
      out.write("          </div>\n");
      out.write("          <!--i class='bx bx-cart cart three' ></i-->\n");
      out.write("        </div>\n");
      out.write("        <!--div class=\"box\">\n");
      out.write("          <div class=\"right-side\">\n");
      out.write("            <div class=\"box-topic\">Total Return</div>\n");
      out.write("            <div class=\"number\">11,086</div>\n");
      out.write("            <div class=\"indicator\">\n");
      out.write("              <i class='bx bx-down-arrow-alt down'></i>\n");
      out.write("              <span class=\"text\">Down From Today</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <i class='bx bxs-cart-download cart four' ></i>\n");
      out.write("        </div>\n");
      out.write("      </div-->\n");
      out.write("\n");
      out.write("      \n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  <script>\n");
      out.write("   let sidebar = document.querySelector(\".sidebar\");\n");
      out.write("let sidebarBtn = document.querySelector(\".sidebarBtn\");\n");
      out.write("sidebarBtn.onclick = function() {\n");
      out.write("  sidebar.classList.toggle(\"active\");\n");
      out.write("  if(sidebar.classList.contains(\"active\")){\n");
      out.write("  sidebarBtn.classList.replace(\"bx-menu\" ,\"bx-menu-alt-right\");\n");
      out.write("}else\n");
      out.write("  sidebarBtn.classList.replace(\"bx-menu-alt-right\", \"bx-menu\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(" // JavaScript function to handle the application\n");
      out.write("  function applyForCourse(course) {\n");
      out.write("    // Redirect to the registration form page with the selected course as a query parameter\n");
      out.write("    window.location.href = 'registerForm.jsp?course=' + encodeURIComponent(course);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  // Add click event listeners to the Apply buttons\n");
      out.write("  document.querySelector(\"[data-course='Software Engineering']\").addEventListener(\"click\", function() {\n");
      out.write("    applyForCourse(\"Software Engineering\");\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  document.querySelector(\"[data-course='Technical Support']\").addEventListener(\"click\", function() {\n");
      out.write("    applyForCourse(\"Technical Support\");\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  document.querySelector(\"[data-course='Accounting']\").addEventListener(\"click\", function() {\n");
      out.write("    applyForCourse(\"Accounting\");\n");
      out.write("  });\n");
      out.write("\n");
      out.write("\n");
      out.write(" </script>\n");
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
