/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ramaz
 */
public class user_add extends HttpServlet {

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
            out.println("<title>Servlet user_add</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet user_add at " + request.getContextPath() + "</h1>");
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
        java.sql.Connection con;
        HttpSession session = request.getSession(true);
        
        switch ((String) request.getParameter("action")) {

            case "add": {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muhasebe?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
                    String userQuery = " insert into users (name, surname, email, password, role_id, company_id)"
                            + " values (?, ?, ?, ?, ?, ?)";
                    PreparedStatement ps2 = con.prepareStatement(userQuery);
                    ps2.setString(1, request.getParameter("name"));
                    ps2.setString(2, request.getParameter("surname"));
                    ps2.setString(3, request.getParameter("Email"));
                    ps2.setString(4, request.getParameter("password"));
                    ps2.setString(5, (String) request.getParameter("role_id"));
                    ps2.setString(6, (String) session.getAttribute("company_id"));
                    ps2.execute();
                    con.close();
                    response.sendRedirect("Tables.jsp");
                    processRequest(request, response);
                } catch (Exception e) {
                    response.getWriter().append(e.toString());
                    System.err.println(e);
                }
            }
            case "update": {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muhasebe?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
                    String productQuery = "update users set name = ?, surname = ?, email = ?, password= ?, role_id = ? where user_id=?";
                    PreparedStatement preparedStmt = con.prepareStatement(productQuery);
                    preparedStmt.setString(1, request.getParameter("name"));
                    preparedStmt.setString(2, request.getParameter("surname"));
                    preparedStmt.setString(3, request.getParameter("Email"));
                    preparedStmt.setString(4, request.getParameter("password"));
                    preparedStmt.setString(5, (String) request.getParameter("role_id"));
                    preparedStmt.setString(6, request.getParameter("user_id"));
                    preparedStmt.executeUpdate();
                    response.sendRedirect("Tables.jsp");
                } catch (Exception e) {
                    response.getWriter().append(e.toString());
                }

            }

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
