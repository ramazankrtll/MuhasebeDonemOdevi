package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Bill;
import model.Companies;
import model.products;
import java.util.List;
import DBOP.DBoperations;

public final class bills_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("    <title>\n");
      out.write("        Fatura\n");
      out.write("    </title>\n");
      out.write("    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.1/css/all.css\" integrity=\"sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/now-ui-dashboard.css?v=1.5.0\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("        <link href=\"assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"\">\n");
      out.write("    <div class=\"wrapper \">\n");
      out.write("        <div class=\"sidebar\" data-color=\"orange\">  \n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"dashbord.jsp\" class=\"simple-text logo-normal\">\n");
      out.write("                    Muhasebe\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar-wrapper\" id=\"sidebar-wrapper\">\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li class=\"active \">\n");
      out.write("                        <a href=\"dashbord.jsp\">\n");
      out.write("                            <i class=\"now-ui-icons design_app\"></i>\n");
      out.write("                            <p>Anasayfa</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"user.jsp\">\n");
      out.write("                            <i class=\"now-ui-icons users_single-02\"></i>\n");
      out.write("                            <p>Admin profili</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Tables.jsp\">\n");
      out.write("                            <i class=\"now-ui-icons design_bullet-list-67\"></i>\n");
      out.write("                            <p>Kullanici listesi</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"bills.jsp\">\n");
      out.write("                            <i class=\"now-ui-icons files_paper\"></i>\n");
      out.write("                            <p>Faturalar</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li> \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-panel\" id=\"main-panel\">\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-transparent  bg-primary  navbar-absolute\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-wrapper\">\n");
      out.write("                        <div class=\"navbar-toggle\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggler\">\n");
      out.write("                                <span class=\"navbar-toggler-bar bar1\"></span>\n");
      out.write("                                <span class=\"navbar-toggler-bar bar2\"></span>\n");
      out.write("                                <span class=\"navbar-toggler-bar bar3\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("                                <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("                                <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        </nav>\n");
      out.write("                        <!-- End Navbar -->\n");
      out.write("                        <div class=\"panel-header panel-header-sm\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <div class=\"card card-chart\">\n");
      out.write("                                        <div class=\"card-header\">\n");
      out.write("                                            <h4 class=\"card-title\">Faturalar</h4>       \n");
      out.write("                                            <div style=\"height: 200px; overflow-x: hidden; overflow-y: scroll;\">\n");
      out.write("                                                <table class=\"table\">\n");
      out.write("                                                    <thead class=\" text-primary\">\n");
      out.write("                                                    <th>#</th><th>Fatura No</th><th>Satıcı</th><th>Alıcı </th><th>Maliyet </th><th>Satış Fiyatı </th><th>Rapor Olustur </th>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("\n");
      out.write("                                                        ");

                                                            DBoperations dc = new DBoperations();
                                                            List<Bill> list2 = dc.getBill((String) session.getAttribute("company_id"));
                                                            for (int i = 0; i < list2.size(); i++) {
                                                                Companies seller_company = dc.getCompanie(list2.get(i).getSeller_id());
                                                                Companies buyer_company = dc.getCompanie(list2.get(i).getBuyer_id());
                                                        
      out.write("\n");
      out.write("                                                    <form action=\"bill.jsp\">\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>");
      out.print(i + 1);
      out.write("</td>\n");
      out.write("                                                            <td class=\"bill_idd\">");
      out.print(list2.get(i).getBill_id());
      out.write("</td>\n");
      out.write("                                                            <td class=\"seller_idd\">");
      out.print(seller_company.getCompany_Name());
      out.write("</td>\n");
      out.write("                                                            <td class=\"buyer_idd\">");
      out.print(buyer_company.getCompany_Name());
      out.write("</td>\n");
      out.write("                                                            <td class=\"bill_costt\">");
      out.print(list2.get(i).getBill_cost());
      out.write("</td>\n");
      out.write("                                                            <td class=\"paid_costt\">");
      out.print(list2.get(i).getPaid_cost());
      out.write("</td>\n");
      out.write("                                                            <td><button type=\"submit\" id=\"sepetbutton\" class=\"btn btn-primary now-ui-icons files_paper use-address\"></button></td>\n");
      out.write("                                                            <td class=\"product-id\" style=\"display:none\">");
      out.print(list2.get(i).getBill_id());
      out.write("</td>\n");
      out.write("                                                             <input type=\"hidden\" class=\"form-control\" id=\"seller_id\" name=\"seller_company\" value=\"");
      out.print(seller_company );
      out.write("\"/>\n");
      out.write("                                                             <input type=\"hidden\" class=\"form-control\" id=\"_id\" name=\"buyer_company\" value=\"");
      out.print(buyer_company );
      out.write("\"/>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </form>\n");
      out.write("                                                        ");
 }
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                </table>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-footer\">\n");
      out.write("                                            <br>\n");
      out.write("                                            <br>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--   Core JS Files   -->\n");
      out.write("                <script src=\"assets/js/core/jquery.min.js\"></script>\n");
      out.write("                <script src=\"assets/js/core/popper.min.js\"></script>\n");
      out.write("                <script src=\"assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("                <script src=\"assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("                <!-- Chart JS -->\n");
      out.write("                <script src=\"assets/js/plugins/chartjs.min.js\"></script>\n");
      out.write("                <!--  Notifications Plugin    -->\n");
      out.write("                <script src=\"assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("                <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("                <script src=\"assets/js/now-ui-dashboard.min.js?v=1.5.0\" type=\"text/javascript\"></script><!-- Now Ui Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("                <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <script>\n");
      out.write("\n");
      out.write("                    $(\".use-address\").click(function () {\n");
      out.write("                        var $row = $(this).closest(\"tr\");    // Find the row\n");
      out.write("                        var $product_name = $row.find(\".bill_idd\").text(); // Find the text\n");
      out.write("                        var $piece = $row.find(\".seller_idd\").text();\n");
      out.write("                        var $cost = $row.find(\".buyer_idd\").text();\n");
      out.write("                        var $sell_cost = $row.find(\".sell_costt\").text();\n");
      out.write("                        var $sell_cost = $row.find(\".paid_costt\").text();\n");
      out.write("                        // Let's test it out\n");
      out.write("                        var $product_id = $row.find(\".product-id\").text(); // Find the text\n");
      out.write("                        $(\"#pr_id\").val($product_id);\n");
      out.write("                        $(\"#input_productname\").val($product_name);\n");
      out.write("                        $(\"#inputpiece\").val($piece);\n");
      out.write("                        $(\"#inputcost\").val($cost);\n");
      out.write("                        $(\"#inputsell\").val($sell_cost);\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                </script>\n");
      out.write("                </body>\n");
      out.write("                </html>");
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
