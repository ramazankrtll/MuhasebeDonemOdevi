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
public class product_add extends HttpServlet {

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
            out.println("<title>Servlet product_add</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet product_add at " + request.getContextPath() + "</h1>");
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

        if (request.getParameter("action").equals("add")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://b034d5b35bbf23:a420dbcd@eu-cdbr-west-03.cleardb.net/heroku_1eb6b33e63b0397?reconnect=true", "b034d5b35bbf23", "a420dbcd");
                String userQuery = " insert into products (product_name,company_id,cost,piece,sell_cost)"
                        + " values (?, ?, ?, ?, ?)";
                PreparedStatement ps2 = con.prepareStatement(userQuery);
                ps2.setString(1, request.getParameter("product_name"));
                ps2.setString(2, (String) session.getAttribute("company_id"));
                ps2.setString(3, request.getParameter("cost"));
                ps2.setString(4, request.getParameter("piece"));
                ps2.setString(5, request.getParameter("sell_cost"));
                ps2.execute();
                con.close();
                response.sendRedirect("dashbord.jsp");
                processRequest(request, response);
            } catch (Exception e) {
                response.getWriter().append(e.toString());
                System.err.println(e);
            }
        } else {
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://b034d5b35bbf23:a420dbcd@eu-cdbr-west-03.cleardb.net/heroku_1eb6b33e63b0397?reconnect=true", "b034d5b35bbf23", "a420dbcd");
                String productQuery = "update products set product_name = ?, cost = ?, piece = ?, sell_cost = ? where product_id = ?";
                PreparedStatement preparedStmt = con.prepareStatement(productQuery);
                preparedStmt.setString(1, request.getParameter("product_name"));
                preparedStmt.setString(2, request.getParameter("cost"));
                preparedStmt.setString(3, request.getParameter("piece"));
                preparedStmt.setString(4, request.getParameter("sell_cost"));
                preparedStmt.setString(5, request.getParameter("product_id"));
                preparedStmt.executeUpdate();
                response.sendRedirect("dashbord.jsp");
            } catch (Exception e) {
                response.getWriter().append(e.toString());
            }

        }

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
