package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotPass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--[if lt IE 7]><html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if (IE 7)&!(IEMobile)]><html class=\"no-js lt-ie9 lt-ie8\" lang=\"en\"><![endif]-->\n");
      out.write("<!--[if (IE 8)&!(IEMobile)]><html class=\"no-js lt-ie9\" lang=\"en\"><![endif]-->\n");
      out.write("<!--[if (IE 9)]><html class=\"no-js ie9\" lang=\"en\"><![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html lang=\"en-US\"> <!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<!-- Meta Tags -->\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("\n");
      out.write("<title>Shortcodes | Brushed | Responsive One Page Template</title>   \n");
      out.write("\n");
      out.write("<meta name=\"description\" content=\"Insert Your Site Description\" /> \n");
      out.write("\n");
      out.write("<!-- Mobile Specifics -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"HandheldFriendly\" content=\"true\"/>\n");
      out.write("<meta name=\"MobileOptimized\" content=\"320\"/>   \n");
      out.write("\n");
      out.write("<!-- Mobile Internet Explorer ClearType Technology -->\n");
      out.write("<!--[if IEMobile]>  <meta http-equiv=\"cleartype\" content=\"on\">  <![endif]-->\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link href=\"_include/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Main Style -->\n");
      out.write("<link href=\"_include/css/main.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Supersized -->\n");
      out.write("<link href=\"_include/css/supersized.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"_include/css/supersized.shutter.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- FancyBox -->\n");
      out.write("<link href=\"_include/css/fancybox/jquery.fancybox.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Font Icons -->\n");
      out.write("<link href=\"_include/css/fonts.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Shortcodes -->\n");
      out.write("<link href=\"_include/css/shortcodes.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Responsive -->\n");
      out.write("<link href=\"_include/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"_include/css/responsive.css\" rel=\"stylesheet\">\n");
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
      out.write("<!-- End Analytics -->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- This section is for Splash Screen -->\n");
      out.write("<!--section id=\"jSplash\">\n");
      out.write("\t<div id=\"circle\"></div>\n");
      out.write("</section>\n");
      out.write("<!-- End of Splash Screen -->\n");
      out.write("\n");
      out.write("<!-- Homepage Slider -->\n");
      out.write("<!--div id=\"home-slider\">\t\n");
      out.write("\t<div class=\"overlay\"></div>\n");
      out.write("    \n");
      out.write("    <!--div class=\"slider-text\"-->\n");
      out.write("    \t<!--div id=\"slidecaption\"></div-->\n");
      out.write("    <!--/div-->   \n");
      out.write("\t\n");
      out.write("\t<!--div class=\"control-nav\">\n");
      out.write("        <a id=\"prevslide\" class=\"load-item\"><i class=\"font-icon-arrow-simple-left\"></i></a>\n");
      out.write("        <a id=\"nextslide\" class=\"load-item\"><i class=\"font-icon-arrow-simple-right\"></i></a>\n");
      out.write("        <ul id=\"slide-list\"></ul-->\n");
      out.write("        \n");
      out.write("        <!--a id=\"nextsection\" href=\"#shortcodes\"><i class=\"font-icon-arrow-simple-down\"></i></a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- End Homepage Slider -->\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("<!--header>\n");
      out.write("    <div class=\"sticky-nav\">\n");
      out.write("    \t<a id=\"mobile-nav\" class=\"menu-nav\" href=\"#menu-nav\"></a>\n");
      out.write("        \n");
      out.write("        <!--div id=\"logo\">\n");
      out.write("        \t<a id=\"goUp\" href=\"#home-slider\" title=\"Brushed | Responsive One Page Template\">Brushed Template</a>\n");
      out.write("        </div-->\n");
      out.write("        \n");
      out.write("        <!--nav id=\"menu\">\n");
      out.write("        \t<ul id=\"menu-nav\">\n");
      out.write("            \t<li><a href=\"index.html#home-slider\" class=\"external\">Home</a></li>\n");
      out.write("                <li><a href=\"index.html#work\" class=\"external\">Our Work</a></li>\n");
      out.write("                <li><a href=\"index.html#about\" class=\"external\">About Us</a></li>\n");
      out.write("                <li><a href=\"index.html#contact\" class=\"external\">Contact</a></li>\n");
      out.write("                <li class=\"current\"><a href=\"shortcodes.html\">Login</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("<!-- End Header -->\n");
      out.write("\n");
      out.write("<!--h2>Form on Hero Image</h2-->\n");
      out.write("<div class=\"bg-img\">\n");
      out.write("  <form action=\"/action_page.php\" class=\"containerss\">\n");
      out.write("    <h4>Don’t worry, we’ve got you back</h4>\n");
      out.write("    <h6 class=\"font-weight-light\">Please enter below details</h6>\n");
      out.write("\n");
      out.write("    <label for=\"email\"><b>Email</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("    <label for=\"psw\"><b>New Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("    <label for=\"psw-repeat\"><b>Confirm Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" required>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <button type=\"submit\" class=\"btn\">Reset</button>\n");
      out.write("\n");
      out.write(" <br>\n");
      out.write("    <p>Well done the password has been restored <a href=\"login.jsp\">Click to login </a>.</p>\n");
      out.write("    \n");
      out.write("  </form>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("<!-- Footer -->\n");
      out.write("<!--footer>\n");
      out.write("\t<!--p class=\"credits\">&copy;2023 Brushed. <a href=\"http://themes.alessioatzeni.com/html/brushed/\" title=\"Brushed | Responsive One Page Template\">Brushed Template</a> by <a href=\"http://www.alessioatzeni.com/\" title=\"Alessio Atzeni | Web Designer &amp; Front-end Developer\">4IRI</a></p-->\n");
      out.write("\n");
      out.write("    <!--p class=\"credits\">&copy;2023 4IRI |. All rights reserved.   </p> \n");
      out.write("</footer>\n");
      out.write("<!-- End Footer -->\n");
      out.write("\n");
      out.write("<!-- Back To Top -->\n");
      out.write("<a id=\"back-to-top\" href=\"#\">\n");
      out.write("\t<i class=\"font-icon-arrow-simple-up\"></i>\n");
      out.write("</a>\n");
      out.write("<!-- End Back to Top -->\n");
      out.write("\n");
      out.write("<!-- Js -->\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script> <!-- jQuery Core -->\n");
      out.write("<script src=\"_include/js/bootstrap.min.js\"></script> <!-- Bootstrap -->\n");
      out.write("<!--script src=\"_include/js/supersized.3.2.7.min.js\"></script> <!-- Slider -->\n");
      out.write("<script src=\"_include/js/waypoints.js\"></script> <!-- WayPoints -->\n");
      out.write("<script src=\"_include/js/waypoints-sticky.js\"></script> <!-- Waypoints for Header -->\n");
      out.write("<script src=\"_include/js/jquery.isotope.js\"></script> <!-- Isotope Filter -->\n");
      out.write("<script src=\"_include/js/jquery.fancybox.pack.js\"></script> <!-- Fancybox -->\n");
      out.write("<script src=\"_include/js/jquery.fancybox-media.js\"></script> <!-- Fancybox for Media -->\n");
      out.write("<script src=\"_include/js/jquery.tweet.js\"></script> <!-- Tweet -->\n");
      out.write("<script src=\"_include/js/plugins.js\"></script> <!-- Contains: jPreloader, jQuery Easing, jQuery ScrollTo, jQuery One Page Navi -->\n");
      out.write("<script src=\"_include/js/main.js\"></script> <!-- Default JS -->\n");
      out.write("<!-- End Js -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
