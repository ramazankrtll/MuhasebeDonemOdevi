/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ramaz
 */
public class Bill {
    
    private String bill_id,seller_id,buyer_id,date;
    private int bill_cost,paid_cost;

    public Bill(String bill_id, String seller_id, String buyer_id, int bill_cost, int paid_cost,String date) {
        this.bill_id = bill_id;
        this.seller_id = seller_id;
        this.buyer_id = buyer_id;
        this.bill_cost = bill_cost;
        this.paid_cost = paid_cost;
        this.date=date;
    }

    public String getBill_id() {
        return bill_id;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public String getBuyer_id() {
        return buyer_id;
    }

    public int getBill_cost() {
        return bill_cost;
    }

    public int getPaid_cost() {
        return paid_cost;
    }

    public String getDate() {
        return date;
    }
    
    
    
}
