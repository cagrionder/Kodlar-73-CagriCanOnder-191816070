/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;
import Helper.DBConnect;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Çağrı
 */
public abstract class Account {
    
    
    DBConnect conn = new DBConnect();
    Statement st = null;
    ResultSet rs = null;
    
    private int id;
    private String username;
    private String password;
    private String name;
  
    public Account(int id, String name, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
    }
    
    public Account(){
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
}

