package user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.UUID;
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ramaz
 */
public class RegisterProcess extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet register</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet register at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = String.valueOf(UUID.randomUUID());
        java.sql.Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://b034d5b35bbf23:a420dbcd@eu-cdbr-west-03.cleardb.net/heroku_1eb6b33e63b0397?reconnect=true", "b034d5b35bbf23", "a420dbcd");
           String companyQuery = " insert into companies (company_id, company_name, company_location, web_address)"
            + " values (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(companyQuery);
            ps.setString(1, id);
            ps.setString(2, request.getParameter("company_name"));
            ps.setString(3, request.getParameter("company_location"));
            ps.setString(4, request.getParameter("web_address"));

            String userQuery = " insert into users (name, surname, email, password, role_id, company_id)"
            + " values (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps2 = con.prepareStatement(userQuery);
            ps2.setString(1, request.getParameter("name"));
            ps2.setString(2, request.getParameter("surname"));
            ps2.setString(3, request.getParameter("email"));
            ps2.setString(4, (request.getParameter("password")));
            ps2.setString(5, "1");
            ps2.setString(6, id);
            ps.execute();
            ps2.execute();
            con.close();
            response.sendRedirect("index.jsp");
            
            
        } catch (Exception e) {
            response.getWriter().append(e.toString());
            System.err.println(e);
        }
         processRequest(request, response);
         
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
