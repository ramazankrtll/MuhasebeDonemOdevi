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
public class Companies {
    
        private String company_Id,company_Name,company_Location,web_Address;

    public Companies(String company_Id, String company_Name, String company_Location, String web_Address) {
        this.company_Id = company_Id;
        this.company_Name = company_Name;
        this.company_Location = company_Location;
        this.web_Address = web_Address;
    }
        

    public String getCompany_Id() {
        return company_Id;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public String getCompany_Location() {
        return company_Location;
    }

    public String getWeb_Address() {
        return web_Address;
    }
        
    
}
