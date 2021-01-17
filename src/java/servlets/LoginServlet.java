/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ramaz
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con;
        String sqlLogin;
        PreparedStatement stmt;
        ResultSet rs;
       
        try {
          Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muhasebe?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
            sqlLogin = "SELECT users.user_id,users.name,users.surname,users.email,users.company_id,users.role_id,companies.company_name,companies.company_location,companies.web_address, users.photo from users,companies where email = ? and password=? and users.company_id = companies.company_id";
            stmt = con.prepareStatement(sqlLogin);
            stmt.setString(1, request.getParameter("email"));
            stmt.setString(2, request.getParameter("password"));
            rs = stmt.executeQuery();
            rs.next();

            if (rs.getRow() > 0) {
                HttpSession session = request.getSession(true);
                session.setAttribute("user_id", rs.getString("user_id"));
                session.setAttribute("name", rs.getString("name"));
                session.setAttribute("surname", rs.getString("surname"));
                session.setAttribute("email", rs.getString("email"));
                session.setAttribute("company_id", rs.getString("company_id"));
                session.setAttribute("role_id", rs.getString("role_id"));
                session.setAttribute("company_name", rs.getString("company_name"));
                session.setAttribute("company_location", rs.getString("company_location"));
                session.setAttribute("web_address", rs.getString("web_address"));
                
                
                Blob blob = rs.getBlob("photo");
               if(blob != null){
                InputStream inputStream = blob.getBinaryStream();
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int bytesRead = -1;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                byte[] imageBytes = outputStream.toByteArray();
                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                session.setAttribute("photo", base64Image);

                inputStream.close();
                outputStream.close();
               }
                con.close();
                response.sendRedirect("dashbord.jsp");
            } else {
                response.sendRedirect("login.jsp");
            }
        } catch (Exception ex) {
            response.getWriter().write(ex.toString());
            System.out.println(ex);
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
