/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Helper;


import java.sql.*;

/**
 *
 * @author Çağrı
 */
public class DBConnect {

    Connection conn = null;
    
    String url = "jdbc:mysql://localhost:3306/kutuphane_sistemi";
    String username = "root";
    String password = "225658";
    
    public DBConnect(){
    }
    
    public Connection connectDB() {
        
        try {
            this.conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
   
}