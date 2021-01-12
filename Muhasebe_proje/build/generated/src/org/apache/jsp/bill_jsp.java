package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Companies;
import model.products;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <table border=\"0\"  align=\"center\" style=\" margin-top: 70px;\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"3\" style=\"background-color: #c54f00; height: 40px;\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <TD style=\"background-image: url(img/logo.png); background-repeat:no-repeat;\" colspan=\"2\"><h1 style=\"color:orangered;\"><BR><br>Muhasebe Anonim Şirketleri</h1></TD>\n");
      out.write("                <td><h1>FATURA</h1></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td style=\"background-image: url(assets/img/Maliye_Bakanligi_34-logo.png); background-repeat:no-repeat; background-size: 100px; width:130px; height: 150px; background-position: center\"> </td>\n");
      out.write("                <td style=\"width:300px;\"> <P> SERİ <b>A</b> </P>\n");
      out.write("                    <P> Sıra Numarası : <b>A2321</b></p>\n");
      out.write("                    <p> Fatura Tarihi: </p>\n");
      out.write("                    <p> Futura Numarası: </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><b> Alıcı Bilgileri </b></td>\n");
      out.write("                <td colspan=\"2\"><b> Satıcı Bilgileri </b></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><p><b>Sayın: </b>  </p>\n");
      out.write("                    <p><b>Müşteri web adresi:</b></p>\n");
      out.write("                    <p><b>Müşteri Adress :</b>  </p></td>\n");
      out.write("                <td colspan=\"2\"><p><b>Sayın: </b> ");
      out.print(session.getAttribute("company_name"));
      out.write("</p>\n");
      out.write("                    <p><b>Müşteri web adresi:</b>");
      out.print(session.getAttribute("web_address"));
      out.write("</p>\n");
      out.write("                    <p><b>Müşteri Adress :</b>");
      out.print(session.getAttribute("company_location"));
      out.write(" </p></td>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    <table border=\"1\"  align=\"center\" style=\" margin-top: 10px; \">\n");
      out.write("        <tr>\n");
      out.write("            <td style=\"padding-top:20px; width: 200px\"> Ürün ad</td>\n");
      out.write("            <td style=\"padding-top:20px; width: 80px\">Adet</td>\n");
      out.write("            <td style=\"padding-top:20px; width: 50px\">Birim</td>\n");
      out.write("            <td style=\"padding-top:20px; width: 100px\"> Maliyet </td>\n");
      out.write("            <td style=\"padding-top:20px; width: 300px\">Satış Fiyat</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> </td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> </td>\n");
      out.write("            <td> </td>\n");
      out.write("            <td> </td>\n");
      out.write("            <td></td>\n");
      out.write("            <td> <p><b>Toplam Tutar :</b></p>\n");
      out.write("                <p><b>Odenen Tutar :</p>\n");
      out.write("                <p><b>İmza : </b></p></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("    </table>\n");
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
