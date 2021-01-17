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
public class products {
    private int cost,piece,sell_cost,product_id;
    private String company_id,product_name;

    public products( int product_id,int cost, int piece, int sell_cost, String company_id,String product_name) {
        this.product_id=product_id;
        this.cost = cost;
        this.piece = piece;
        this.sell_cost = sell_cost;
        this.company_id = company_id;
        this.product_name=product_name;
    }

    public int getCost() {
        return cost;
    }

    public int getPiece() {
        return piece;
    }

    public int getSell_cost() {
        return sell_cost;
    }

    public String getCompany_id() {
        return company_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public int getProduct_id() {
        return product_id;
    }
    
    
}
