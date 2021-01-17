/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOP;

import model.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Bill;
import model.Companies;
import model.products;

/**
 *
 * @author ramaz
 */
public class DBoperations {

    Connection con;

    public DBoperations() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://b034d5b35bbf23:a420dbcd@eu-cdbr-west-03.cleardb.net/heroku_1eb6b33e63b0397?reconnect=true", "b034d5b35bbf23", "a420dbcd");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<employee> getEmployees(String company_id, String user_id) {
        ResultSet rs = null;
        List<employee> empList = new ArrayList<>();
        try {
            String query = "select * from users where company_id = ? and user_id != ?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, company_id);
            preparedStmt.setString(2, user_id);
            rs = preparedStmt.executeQuery();
            while (rs.next()) {
                int u_id = rs.getInt("user_id");
                int role_id = rs.getInt("role_id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String comp_id = rs.getString("company_id");

                empList.add(new employee(u_id, comp_id, role_id, name, surname, email));
            }
        } catch (Exception e) {

        }
        return empList;
    }

    public List<products> getProducts(String company_id) {
        ResultSet rs = null;
        List<products> proList = new ArrayList<>();
        try {
            String query = "select * from products where company_id = ?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, company_id);
            rs = preparedStmt.executeQuery();
            while (rs.next()) {
                String p_name = rs.getString("product_name");
                String c_id = rs.getString("company_id");
                int cst = rs.getInt("cost");
                int piece_ = rs.getInt("piece");
                int s_cost = rs.getInt("sell_cost");
                int p_id = rs.getInt("product_id");

                proList.add(new products(p_id, cst, piece_, s_cost, c_id, p_name));
            }
        } catch (Exception e) {

        }
        return proList;
    }

    public List<Companies> getCompanies(String company_id) {
        ResultSet rs = null;
        List<Companies> CompList = new ArrayList<>();
        try {
            String query = "select * from companies where company_id != ?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, company_id);
            rs = preparedStmt.executeQuery();
            while (rs.next()) {
                String c_name = rs.getString("company_name");
                String c_id = rs.getString("company_id");
                String c_Location = rs.getString("company_location");
                String w_Address = rs.getString("web_address");

                CompList.add(new Companies(c_id, c_name, c_Location, w_Address));
            }
        } catch (Exception e) {

        }
        return CompList;
    }

    public Companies getCompanie(String company_id) {
        ResultSet rs = null;
        String c_name = null;
        String c_id = null;
        String c_Location = null;
        String w_Address = null;

        try {
            String query = "select * from companies where company_id = ?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, company_id);
            rs = preparedStmt.executeQuery();

            while (rs.next()) {
                c_name = rs.getString("company_name");
                c_id = rs.getString("company_id");
                c_Location = rs.getString("company_location");
                w_Address = rs.getString("web_address");

            }
        } catch (Exception e) {

        }
        return new Companies(c_id, c_name, c_Location, w_Address);
    }

    public List<Bill> getBill(String company_id) {
        ResultSet rs = null;
        List<Bill> BillList = new ArrayList<>();
        try {
            String query = "select * from bill where buyer_id = ? or seller_id = ?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, company_id);
            preparedStmt.setString(2, company_id);
            rs = preparedStmt.executeQuery();
            while (rs.next()) {
                String bill_Id = rs.getString("bill_id");
                String seller_id = rs.getString("seller_id");
                String buyer_id = rs.getString("buyer_id");
                int bill_cost = rs.getInt("bill_cost");
                int paid_cost = rs.getInt("paid_cost");
                String date = rs.getString("date");

                BillList.add(new Bill(bill_Id, seller_id, buyer_id, bill_cost, paid_cost,date));
            }
        } catch (Exception e) {

        }
        return BillList;
    }

    public List<products> getBillProducts(String bill_id) {
        ResultSet rs = null;
        List<products> BillList = new ArrayList<>();
        try {
            String query = "select * from product_sell, products where product_sell.bill_id = ? and products.product_id = product_sell.product_id";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, bill_id);
            rs = preparedStmt.executeQuery();
            while (rs.next()) {
                String p_name = rs.getString("product_name");
                String c_id = rs.getString("company_id");
                int cst = rs.getInt("cost");
                int piece = rs.getInt("piece");
                int s_cost = rs.getInt("sell_cost");
                int p_id = rs.getInt("product_id");

                BillList.add(new products(p_id,cst,piece,s_cost,c_id,p_name));
            }
        } catch (Exception e) {

        }
        return BillList;
    }

}
