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
public class employee {
    
    private int user_id,role_id;
    private String name,surname,email,company_id;

    

    public employee(int user_id, String company_id, int role_id, String name, String surname, String email) {
        this.user_id = user_id;
        this.company_id = company_id;
        this.role_id = role_id;
        this.name = name;
        this.surname = surname;
        this.email = email;

    }

    public int getUser_id() {
        return user_id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public String getRole_id() {
        if(this.role_id==1){
            return "İşletme Sahibi";
        }else if(this.role_id==2){
            return "Ürün Müdürü";
        }else if(this.role_id==3){
            return "Ürün Danışmanı";
        }
        return "Hesap Müdürü";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
   
}
