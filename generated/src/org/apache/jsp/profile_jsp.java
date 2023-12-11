package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- Meta Tags -->\n");
      out.write("\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("    <title> Responsiive Admin Dashboard | CodingLab </title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <!-- Boxicons CDN Link -->\n");
      out.write("    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link href=\"_include/css/main.css\" rel=\"stylesheet\">\n");
      out.write("  <link href='https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- Mobile Internet Explorer ClearType Technology -->\n");
      out.write("<!--[if IEMobile]>  <meta http-equiv=\"cleartype\" content=\"on\">  <![endif]-->\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Main Style -->\n");
      out.write("<link href=\"_include/css/main.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Supersized -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- FancyBox -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Font Icons -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Shortcodes -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Google Font -->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,400italic,600,600italic,700,700italic,900' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<!-- Fav Icon -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"#\">\n");
      out.write("\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"#\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"#\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"#\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"#\">\n");
      out.write("\n");
      out.write("<!-- Modernizr -->\n");
      out.write("<script src=\"_include/js/modernizr.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Analytics -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("  var _gaq = _gaq || [];\n");
      out.write("  _gaq.push(['_setAccount', 'Insert Your Code']);\n");
      out.write("  _gaq.push(['_trackPageview']);\n");
      out.write("\n");
      out.write("  (function() {\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("  })();\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("   </head>\n");
      out.write("<body>\n");
      out.write("    \n");
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
      out.write("      <section class=\"home-section\">\n");
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
      out.write("  \n");
      out.write("  <section class=\"home-section\">\n");
      out.write("    \n");
      out.write(" <div class=\"containerssssssss\">\n");
      out.write("        <h2>User Profile</h2>\n");
      out.write("        <form action=\"UpdateProfileServlet\" method=\"post\" enctype=\"multipart/form-data\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"userName\">User Name</label>\n");
      out.write("            <input type=\"text\" id=\"userName\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("\n");
      out.write("            <div id=\"emailField\">\n");
      out.write("                <label for=\"email\">Email</label>\n");
      out.write("                <input type=\"text\" id=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("            </div>\n");
      out.write("<div id=\"emailField\">\n");
      out.write("               \n");
      out.write("            <input type=\"submit\" class=\"btn\" value=\"Update profile\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <!--a class=\"dashboard-link\" href=\"dashboard.jsp\">Return to Dashboard</a-->  \n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write(" \n");
      out.write("\n");
      out.write("    <!-- Add more HTML/CSS for formatting as needed -->\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
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
      out.write(" \n");
      out.write("<!-- Js -->\n");
      out.write("\n");
      out.write("<!-- End Js -->\n");
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
