package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets/img/apple-icon.png\">\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.png\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("  <title>\n");
      out.write("    Now UI Dashboard by Creative Tim\n");
      out.write("  </title>\n");
      out.write("  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("  <!--     Fonts and icons     -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.1/css/all.css\" integrity=\"sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr\" crossorigin=\"anonymous\">\n");
      out.write("  <!-- CSS Files -->\n");
      out.write("  <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"assets/css/now-ui-dashboard.css?v=1.5.0\" rel=\"stylesheet\" />\n");
      out.write("  <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("  <link href=\"assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"user-profile\">\n");
      out.write("  <div class=\"wrapper \">\n");
      out.write("    <div class=\"sidebar\" data-color=\"orange\">\n");
      out.write("      <!--\n");
      out.write("        Tip 1: You can change the color of the sidebar using: data-color=\"blue | green | orange | red | yellow\"\n");
      out.write("    -->\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <a href=\"http://www.creative-tim.com\" class=\"simple-text logo-normal\">\n");
      out.write("          Muhasebe\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"sidebar-wrapper\" id=\"sidebar-wrapper\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("          <li class=\"active \">\n");
      out.write("           <a href=\"dashbord.jsp\">\n");
      out.write("              <i class=\"now-ui-icons design_app\"></i>\n");
      out.write("              <p>Anasayfa</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"user.jsp\">\n");
      out.write("              <i class=\"now-ui-icons users_single-02\"></i>\n");
      out.write("              <p>Admin profili</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"Tables.jsp\">\n");
      out.write("              <i class=\"now-ui-icons design_bullet-list-67\"></i>\n");
      out.write("              <p>Kullanici listesi</p>\n");
      out.write("            </a>\n");
      out.write("          </li> \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main-panel\" id=\"main-panel\">\n");
      out.write("      <!-- Navbar -->\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-transparent  bg-primary  navbar-absolute\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"navbar-wrapper\">\n");
      out.write("            <div class=\"navbar-toggle\">\n");
      out.write("              <button type=\"button\" class=\"navbar-toggler\">\n");
      out.write("                <span class=\"navbar-toggler-bar bar1\"></span>\n");
      out.write("                <span class=\"navbar-toggler-bar bar2\"></span>\n");
      out.write("                <span class=\"navbar-toggler-bar bar3\"></span>\n");
      out.write("              </button>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <!-- End Navbar -->\n");
      out.write("      <div class=\"panel-header panel-header-sm\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"content\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-8\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-header\">\n");
      out.write("                <h5 class=\"title\">Admin Bilgileri</h5>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <form>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 pr-1\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <input type=\"text\" class=\"form-control\" value=\"");
      out.print(session.getAttribute("name") );
      out.write("\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 pl-1\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input type=\"email\" class=\"form-control\" value=\"");
      out.print(session.getAttribute("surname") );
      out.write("\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 pr-1\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" value=\"");
      out.print(session.getAttribute("company_name") );
      out.write("\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 pl-1\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Soyad\" value=\"");
      out.print(session.getAttribute("company_location") );
      out.write("\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Sirket Adresi\" value=\"");
      out.print(session.getAttribute("email") );
      out.write("\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Sirket Eposta\" value=\"");
      out.print(session.getAttribute("web_address") );
      out.write("\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                       <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input type=\"buttton\" class=\"form-control\" placeholder=\"Güncelle\" value=\"\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <div class=\"card card-user\">\n");
      out.write("              <div class=\"image\">\n");
      out.write("                <img src=\"assets/img/bg5.jpg\" alt=\"...\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"author\">\n");
      out.write("                  <a href=\"#\">\n");
      out.write("                    <img class=\"avatar border-gray\" src=\"assets/img/admin.png\" alt=\"...\">\n");
      out.write("                    <h5 class=\"title\">");
      out.print(session.getAttribute("name"));
      out.write(' ');
      out.print(session.getAttribute("surname"));
      out.write("</h5>\n");
      out.write("                  </a>\n");
      out.write("                  <p class=\"description\">\n");
      out.write("                      <label>");
      out.print(session.getAttribute("company_name"));
      out.write(" </label>\n");
      out.write("                  </p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <hr>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!--   Core JS Files   -->\n");
      out.write("  <script src=\"assets/js/core/jquery.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/core/popper.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("  <!--  Google Maps Plugin    -->\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("  <!-- Chart JS -->\n");
      out.write("  <script src=\"assets/js/plugins/chartjs.min.js\"></script>\n");
      out.write("  <!--  Notifications Plugin    -->\n");
      out.write("  <script src=\"assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("  <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("  <script src=\"assets/js/now-ui-dashboard.min.js?v=1.5.0\" type=\"text/javascript\"></script><!-- Now Ui Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("  <script src=\"assets/demo/demo.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
