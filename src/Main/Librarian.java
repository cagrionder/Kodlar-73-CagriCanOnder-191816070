/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;


import Interface.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Çağrı
 */
public class Librarian extends Account implements ILibrarian{

   Connection con = conn.connectDB();
   PreparedStatement pst = null;
    
    public Librarian(int id, String name, String username, String password) {
        super(id, name, username, password);
    }

    public Librarian(){
    }
    
   @Override
    public boolean addBook(){
        return true;
    }
   
    public boolean addBook(String book_id, String book_title, String book_author, String book_isbn, String book_publisher, String book_page ) throws SQLException{
        String query = "INSERT INTO all_book" + "(book_id, book_title, book_author, book_isbn, book_publisher, book_page) VALUES" + "(?, ?, ?, ?, ?, ?)";
        boolean control = false;
        try {
             
            pst = con.prepareStatement(query);
            pst.setString(1, book_id);
            pst.setString(2, book_title);
            pst.setString(3, book_author);
            pst.setString(4, book_isbn);
            pst.setString(5, book_publisher);
            pst.setString(6, book_page);
            pst.executeUpdate();
            control = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return control;
    }
    
   @Override
    public boolean deleteBook(){
        return true;
    }
    
    public boolean deleteBook(String book_id) throws SQLException{
        
        
        String query = "DELETE FROM all_book where book_id = ?";
        boolean control = false;
        try {
             
            pst = con.prepareStatement(query);
            pst.setString(1, book_id);
            pst.executeUpdate();
            control = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return control;
     
    }
    
    @Override
    public boolean updateBook() {
        return true;
    }
    
    public boolean updateBook(String book_id, String book_title, String book_author, String book_isbn, String book_publisher, String book_page) throws SQLException{
        
        String query = "UPDATE all_book SET book_page = ?, book_title = ?, book_author = ?, book_isbn = ?, book_publisher = ? where book_id = ?" ;
        boolean control = false;
        try {
             
            pst = con.prepareStatement(query);
            pst.setString(1, book_page);
            pst.setString(2, book_title);
            pst.setString(3, book_author);
            pst.setString(4, book_isbn);
            pst.setString(5, book_publisher);
            pst.setString(6, book_id);
            pst.executeUpdate();
            control = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return control;
     
    }
    
    @Override
    public boolean addMember() {
        return true;
    }
    
    public boolean addMember(String member_firstname, String member_lastname, String member_user, String member_posta, String member_pass ) throws SQLException{
        String query = "INSERT INTO member" + "(member_firstname, member_lastname, member_user, member_posta, member_pass) VALUES" + "(?, ?, ?, ?, ?)";
        boolean control = false;
        try {
             
            pst = con.prepareStatement(query);
           // pst.setInt(1, id);
            pst.setString(1, member_firstname);
            pst.setString(2, member_lastname);
            pst.setString(3, member_user);
            pst.setString(4, member_posta);
            pst.setString(5, member_pass);
            pst.executeUpdate();
            control = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return control;
    }
    
    @Override
    public boolean deleteMember() {
        return true;
    }
    
    public boolean deleteMember(int id){
        String query = "DELETE FROM member where id = ?";
        boolean control = false;
        try {
             
            pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.executeUpdate();
            control = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return control;
     
    }
    
    @Override
    public boolean updateMember() {
        return true;
    }
    
    public boolean updateMember(int id, String member_firstname, String member_lastname, String member_user, String member_posta, String member_pass) throws SQLException{
        
        String query = "UPDATE member SET member_firstname = ?, member_lastname = ?, member_user = ?, member_posta = ?, member_pass = ? where id = ?" ;
        boolean control = false;
        try {
             
            pst = con.prepareStatement(query);
            pst.setString(1, member_firstname);
            pst.setString(2, member_lastname);
            pst.setString(3, member_user);
            pst.setString(4, member_posta);
            pst.setString(5, member_pass);
            pst.setInt(6, id);
            pst.executeUpdate();
            control = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return control;
     
    }
    
    
    
    public ArrayList<Book> getBookList() throws SQLException{
        ArrayList<Book> list = new ArrayList<>();
        Book ob;
        
        try {
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM all_book");
        while (rs.next()) {
            ob = new Book(rs.getString("book_id"),rs.getString("book_title"),
                    rs.getString("book_author"), rs.getString("book_isbn"), 
                    rs.getString("book_publisher"), rs.getString("book_page"));
            
            list.add(ob);
    }  
        } catch (Exception e) {
        }
        
        return list; 
            
        }
    
    public ArrayList<Member> getMemberList() throws SQLException{
        ArrayList<Member> list = new ArrayList<>();
        Account ob;
        
        try {
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM member");
        while (rs.next()) {
        ob = new Member(rs.getInt("id"),rs.getString("member_firstname"),
                    rs.getString("member_lastname"), rs.getString("member_user"), 
                    rs.getString("member_posta"), rs.getString("member_pass"));
            
               
            list.add((Member) ob);
        }  
        } catch (Exception e) {
        }
        
        return list; 
            
        }
    
    public boolean borrowBook(int member_id, String member_firstname, String member_lastname, String book_id, String book_title, String book_author, String book_isbn, String book_publisher, String book_page, String issue_date) throws SQLException{
        
        String query = "INSERT INTO borrow_book" + "(member_id, member_firstname, member_lastname, book_id, book_title, book_author, book_isbn, book_publisher, book_page, issue_date) VALUES" + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        boolean control = false;
        
        try {
        
            pst = con.prepareStatement(query);
            pst.setInt(1, member_id);
            pst.setString(2, member_firstname);
            pst.setString(3, member_lastname);
            pst.setString(4, book_id);
            pst.setString(5, book_title);
            pst.setString(6, book_author);
            pst.setString(7, book_isbn);
            pst.setString(8, book_publisher);
            pst.setString(9, book_page);
            pst.setString(10, issue_date);
            
            pst.executeUpdate();
        control = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        
        }
      
        return control;
        
    }
    
    public boolean returnBook(int member_id, String member_firstname, String member_lastname, String book_id, String book_title, String book_author, String book_isbn, String book_publisher, String book_page, String return_date, String issue_date) throws SQLException{
        
        String query = "INSERT INTO return_book" + "(member_id, member_firstname, member_lastname, book_id, book_title, book_author, book_isbn, book_publisher, book_page,issue_date, return_date) VALUES" + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        boolean control = false;
        
        try {
        
            pst = con.prepareStatement(query);
            pst.setInt(1, member_id);
            pst.setString(2, member_firstname);
            pst.setString(3, member_lastname);
            pst.setString(4, book_id);
            pst.setString(5, book_title);
            pst.setString(6, book_author);
            pst.setString(7, book_isbn);
            pst.setString(8, book_publisher);
            pst.setString(9, book_page);
            pst.setString(10, issue_date);
            pst.setString(11, return_date);
            
            pst.executeUpdate();
        control = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        
        }
      
        return control;
        
    }
    
    public ArrayList<BorrowBook> getBorrowList() throws SQLException{
        ArrayList<BorrowBook> list = new ArrayList<>();
        BorrowBook ob;
        
        try {
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM borrow_book");
        while (rs.next()) {
        ob = new BorrowBook(rs.getInt("member_id"), rs.getString("member_firstname"), rs.getString("member_lastname"), 
                rs.getString("issue_date"), rs.getString("book_id"), rs.getString("book_title"), rs.getString("book_author"), 
                rs.getString("book_isbn"), rs.getString("book_publisher"), rs.getString("book_page"));
            
               
            list.add(ob);
        }  
        } catch (Exception e) {
        }
        
        return list; 
            
    }
    
    
    public ArrayList<ReturnBook> getReturnList() throws SQLException{
        ArrayList<ReturnBook> list = new ArrayList<>();
        ReturnBook ob;
        
        try {
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM return_book");
        while (rs.next()) {
        ob = new ReturnBook(rs.getString("return_date"),rs.getInt("member_id"), rs.getString("member_firstname"), rs.getString("member_lastname"), 
                rs.getString("issue_date"), rs.getString("book_id"), rs.getString("book_title"), rs.getString("book_author"), 
                rs.getString("book_isbn"), rs.getString("book_publisher"), rs.getString("book_page"));
            
               
            list.add(ob);
        }  
        } catch (Exception e) {
        }
        
        return list; 
            
    }

}
  
