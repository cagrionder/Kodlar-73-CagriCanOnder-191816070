/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import static Design.EditBook.lib;
import Helper.DBConnect;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Çağrı
 */
public class SearchBook extends javax.swing.JFrame {

    /**
     * Creates new form SearchBook
     */
    
    DefaultTableModel bookTable = null;
    Object [] bookData = null;
    DBConnect conn = new DBConnect();
    Connection con = conn.connectDB();
    PreparedStatement pst = null;
    ResultSet rs = null;
    Object [] findBook = null;
    JTableHeader header = null;
    
    private void backGround(){
        jScrollPane1.getViewport().setBackground(new Color(241,242,246));
    }
    
    private void colFont(){
        header = table_searchBook.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 16) {
        });
    }
    
    public void listed() throws SQLException{
        bookTable = (DefaultTableModel) table_searchBook.getModel();
        Object [] colBookName = new Object[6];
        colBookName[0] = "Kitap ID";
        colBookName[1] = "Kitap Adı";
        colBookName[2] = "Kitap Yazarı";
        colBookName[3] = "ISBN";
        colBookName[4] = "Yayınevi";
        colBookName[5] = "Sayfa Sayısı";
        bookTable.setColumnIdentifiers(colBookName);
        bookData = new Object[6];
        for (int i = 0; i < lib.getBookList().size(); i++) {
            bookData[0] = lib.getBookList().get(i).getBookID();
            bookData[1] = lib.getBookList().get(i).getBookTitle();
            bookData[2] = lib.getBookList().get(i).getBookAuthor();
            bookData[3] = lib.getBookList().get(i).getBookISBN();
            bookData[4] = lib.getBookList().get(i).getBookPublisher();
            bookData[5] = lib.getBookList().get(i).getBookPage();
            bookTable.addRow(bookData);
          
        }
    }
    
    public void findBook(String quest) throws SQLException{
        bookTable = (DefaultTableModel) table_searchBook.getModel();
        String query = "SELECT * FROM all_book WHERE book_title like '" + quest + "%'";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        findBook = new Object[6];
        while (rs.next()) {            
            findBook [0] = rs.getString("book_id");
            findBook [1] = rs.getString("book_title");
            findBook [2] = rs.getString("book_author");
            findBook [3] = rs.getString("book_isbn");
            findBook [4] = rs.getString("book_publisher");
            findBook [5] = rs.getString("book_page");
            bookTable.addRow(findBook);
            
            
        }
        
    }
    public SearchBook() throws SQLException {
        initComponents();
        listed();
        table_searchBook.setRowHeight(25);
        colFont();
        backGround();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fld_searchBook = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_searchBook = new javax.swing.JTable();
        lbl_exit2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 242, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fld_searchBook.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fld_searchBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fld_searchBookKeyReleased(evt);
            }
        });
        jPanel1.add(fld_searchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 410, 37));

        table_searchBook.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        table_searchBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap ID", "Kitap Adı", "Kitap Yazarı", "ISBN", "Yayınevi", "Sayfa Sayısı"
            }
        ));
        jScrollPane1.setViewportView(table_searchBook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1100, 400));

        lbl_exit2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_exit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit2.setText("X");
        lbl_exit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exit2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_exit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_search_140px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 140, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fld_searchBookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fld_searchBookKeyReleased
        bookTable.setRowCount(0);
        String quest = fld_searchBook.getText().toLowerCase();
        try {
            findBook(quest);
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_fld_searchBookKeyReleased

    private void lbl_exit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exit2MouseClicked
        dispose();
    }//GEN-LAST:event_lbl_exit2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SearchBook().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SearchBook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fld_searchBook;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_exit2;
    private javax.swing.JTable table_searchBook;
    // End of variables declaration//GEN-END:variables
}
