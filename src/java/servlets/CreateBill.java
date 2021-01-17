/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ramaz
 */
public class CreateBill extends HttpServlet {

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
            out.println("<title>Servlet CreateBill</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreateBill at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession(true);
        String id = String.valueOf(UUID.randomUUID());
        Connection con;
        PreparedStatement stmt;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://b034d5b35bbf23:a420dbcd@eu-cdbr-west-03.cleardb.net/heroku_1eb6b33e63b0397?reconnect=true", "b034d5b35bbf23", "a420dbcd");
            String sqlBill = " insert into bill (bill_id,seller_id,buyer_id,bill_cost,paid_cost)"
                    + " values (?, ?, ?, ?, ?)";
            PreparedStatement ps2 = con.prepareStatement(sqlBill);
            ps2.setString(1, id);
            ps2.setString(2, (String) session.getAttribute("company_id"));
            ps2.setString(3, request.getParameter("company_id"));
            ps2.setString(4, request.getParameter("totalprice"));
            ps2.setString(5, (String) request.getParameter("paidcost"));
            ps2.execute();
            String[] urunlerdizi = request.getParameterValues("productid");
            for (int i = 0; i < urunlerdizi.length; i++) {
                String productQuery3 = "insert into product_sell values (?, ?)";
                PreparedStatement preparedStmt3 = con.prepareStatement(productQuery3);
                preparedStmt3.setString(1, urunlerdizi[i]);
                preparedStmt3.setString(2, id);
                preparedStmt3.execute();
            }
            response.sendRedirect("dashbord.jsp");
        } catch (Exception e) {
            System.out.println(e);
        }

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
