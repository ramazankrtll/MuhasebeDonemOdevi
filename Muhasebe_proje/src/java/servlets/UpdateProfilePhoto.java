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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import sun.management.Agent;

/**
 *
 * @author ramaz
 */
@MultipartConfig(maxFileSize = 16177215)

public class UpdateProfilePhoto extends HttpServlet {

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
            out.println("<title>Servlet UpdateProfilePhoto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateProfilePhoto at " + request.getContextPath() + "</h1>");
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
        InputStream inputStream = null;
        
        // resmi veritabaninin anlayacagi formata donusturup bir degiskende tutuyor.
        Part filePart = request.getPart("photo");
        if (filePart != null) {
            inputStream = filePart.getInputStream();
        }
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muhasebe?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
            String photoQuery = "update users set photo=? where user_id=?";
            PreparedStatement preparedStatement = con.prepareStatement(photoQuery);
            HttpSession session = request.getSession(true);
            preparedStatement.setString(2,(String)session.getAttribute("user_id"));
            
                
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                preparedStatement.setBlob(1, inputStream);
            }
            // resim verisini stringlere donusturuyoruz.
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = outputStream.toByteArray();

            String base64Image = Base64.getEncoder().encodeToString(imageBytes);
            session.setAttribute("photo", base64Image);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            response.getWriter().append(e.toString());
            System.err.println(e);
        }
        response.sendRedirect("user.jsp");
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
