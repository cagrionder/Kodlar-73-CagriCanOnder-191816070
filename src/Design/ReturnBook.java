/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import Helper.DBConnect;
import Main.Librarian;
import Main.Member;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author Çağrı
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBook
     */
    
    Statement st = null;
    ResultSet rs = null;
    DBConnect conn = new DBConnect();
    Connection con = conn.connectDB();
    PreparedStatement pst =null;
    Librarian lib = new Librarian();
    DefaultTableModel returnTable = null;
    Object [] returnData = null;
    Member member = new Member();
    JTableHeader header = null;
    
    private void colFont(){
        header = table_returnBook.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 16) {
        });
    }
    
    public void listed() throws SQLException{
         returnTable = (DefaultTableModel) table_returnBook.getModel();
         
         Object [] colName = new Object[10];
         colName [0] = "Kullanıcı ID";
         colName [1] = "Kullanıcı Ad";
         colName [2] = "Kullanıcı Soyad";
         colName [3] = "Kitap ID";
         colName [4] = "Kitap Adı";
         colName [5] = "Kitap Yazarı";
         colName [6] = "ISBN";
         colName [7] = "Yayınevi";
         colName [8] = "Sayfa Sayısı";
         colName [9] = "Ödünç Tarihi";
         returnTable.setColumnIdentifiers(colName);
         returnData = new Object[10];
         for (int i = 0; i < lib.getBorrowList().size(); i++){
             returnData [0] = lib.getBorrowList().get(i).getMemberID();
             returnData [1] = lib.getBorrowList().get(i).getFirstName();
             returnData [2] = lib.getBorrowList().get(i).getLastName();
             returnData [3] = lib.getBorrowList().get(i).getBookID();
             returnData [4] = lib.getBorrowList().get(i).getBookTitle();
             returnData [5] = lib.getBorrowList().get(i).getBookAuthor();
             returnData [6] = lib.getBorrowList().get(i).getBookISBN();
             returnData [7] = lib.getBorrowList().get(i).getBookPublisher();
             returnData [8] = lib.getBorrowList().get(i).getBookPage();
             returnData [9] = lib.getBorrowList().get(i).getIssueDate();
             returnTable.addRow(returnData);
         }
    }
    
    public void update() throws SQLException{
        DefaultTableModel updateTable = (DefaultTableModel) table_returnBook.getModel();
        updateTable.setRowCount(0);
        for (int i = 0; i < lib.getBorrowList().size(); i++){
             returnData [0] = lib.getBorrowList().get(i).getMemberID();
             returnData [1] = lib.getBorrowList().get(i).getFirstName();
             returnData [2] = lib.getBorrowList().get(i).getLastName();
             returnData [3] = lib.getBorrowList().get(i).getBookID();
             returnData [4] = lib.getBorrowList().get(i).getBookTitle();
             returnData [5] = lib.getBorrowList().get(i).getBookAuthor();
             returnData [6] = lib.getBorrowList().get(i).getBookISBN();
             returnData [7] = lib.getBorrowList().get(i).getBookPublisher();
             returnData [8] = lib.getBorrowList().get(i).getBookPage();
             returnData [9] = lib.getBorrowList().get(i).getIssueDate();
             returnTable.addRow(returnData);
         }
    }
    
    public void selected(){
        int i = table_returnBook.getSelectedRow();
        TableModel model = table_returnBook.getModel();
        fld_returnMemberID.setText(model.getValueAt(i, 0).toString());
        fld_returnBookID.setText(model.getValueAt(i, 3).toString());
        fld_returnBookTitle.setText(model.getValueAt(i, 4).toString());
        fld_returnBookAuthor.setText(model.getValueAt(i, 5).toString());
        fld_returnBookISBN.setText(model.getValueAt(i, 6).toString());
        fld_returnBookPublisher.setText(model.getValueAt(i, 7).toString());
        fld_returnBookPage.setText(model.getValueAt(i, 8).toString());
    }
    
    public void memberSelected(){
        int i = table_returnBook.getSelectedRow();
        TableModel model = table_returnBook.getModel();
        if (Integer.parseInt(model.getValueAt(i, 0).toString()) == member.getMemberID()){
        
            fld_returnMemberID.setText(model.getValueAt(i, 0).toString());
            fld_returnBookID.setText(model.getValueAt(i, 3).toString());
            fld_returnBookTitle.setText(model.getValueAt(i, 4).toString());
            fld_returnBookAuthor.setText(model.getValueAt(i, 5).toString());
            fld_returnBookISBN.setText(model.getValueAt(i, 6).toString());
            fld_returnBookPublisher.setText(model.getValueAt(i, 7).toString());
            fld_returnBookPage.setText(model.getValueAt(i, 8).toString());
        }
    }
    
     public void deleteBook(String book_id) throws SQLException{
        
        
        String query = "DELETE FROM borrow_book where book_id = ?";
        
        try {
             
            pst = con.prepareStatement(query);
            pst.setString(1, book_id);
            pst.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
    }
    
    public ReturnBook() throws SQLException {
        initComponents();
        listed();
        table_returnBook.setRowHeight(25);
        colFont();
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
        jLabel6 = new javax.swing.JLabel();
        fld_returnMemberID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fld_returnBookTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fld_returnBookAuthor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fld_returnBookISBN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fld_returnBookPublisher = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fld_returnBookPage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fld_returnBookID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        return_date = new com.toedter.calendar.JDateChooser();
        btn_returnBook = new javax.swing.JButton();
        btn_returnBookClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_returnBook = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 242, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel6.setText("Kitap ID :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, 20));

        fld_returnMemberID.setEditable(false);
        fld_returnMemberID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(fld_returnMemberID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 250, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel1.setText("Kitap Adı :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, 20));

        fld_returnBookTitle.setEditable(false);
        fld_returnBookTitle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(fld_returnBookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 250, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setText("Yazar Adı :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, 20));

        fld_returnBookAuthor.setEditable(false);
        fld_returnBookAuthor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(fld_returnBookAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 250, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setText("ISBN :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 80, 20));

        fld_returnBookISBN.setEditable(false);
        fld_returnBookISBN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(fld_returnBookISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 250, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setText("Yayınevi Adı :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 110, 20));

        fld_returnBookPublisher.setEditable(false);
        fld_returnBookPublisher.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(fld_returnBookPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setText("Tarih :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 110, 20));

        fld_returnBookPage.setEditable(false);
        fld_returnBookPage.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(fld_returnBookPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 250, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Kullanıcı ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 110, 40));

        fld_returnBookID.setEditable(false);
        fld_returnBookID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(fld_returnBookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 250, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_people_64px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel8.setText("Sayfa Sayısı :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 110, 20));

        return_date.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(return_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 250, 30));

        btn_returnBook.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_returnBook.setText("Geri Ver");
        btn_returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnBookActionPerformed(evt);
            }
        });
        jPanel1.add(btn_returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 140, 50));

        btn_returnBookClose.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_returnBookClose.setText("Geri Dön");
        btn_returnBookClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnBookCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btn_returnBookClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 140, 50));

        table_returnBook.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        table_returnBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı ID", "Kullanıcı Ad", "Kullanıcı Soyad", "Kitap ID", "Kitap Adı", "Kitap Yazarı", "ISBN", "Yayınevi", "Sayfa Sayısı", "Ödünç Tarihi"
            }
        ));
        table_returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_returnBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_returnBook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1100, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_returnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_returnBookMouseClicked
        if (member.getMemberID() > 0 ){
            memberSelected();
        }
        else
        selected();
        
    }//GEN-LAST:event_table_returnBookMouseClicked

    private void btn_returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnBookActionPerformed
        if (fld_returnBookAuthor.getText().length() == 0 || fld_returnBookID.getText().length() == 0 || fld_returnBookISBN.getText().length() == 0 ||
                fld_returnBookPage.getText().length() == 0 || fld_returnBookPublisher.getText().length() == 0 || fld_returnBookTitle.getText().length() == 0 ||
                fld_returnMemberID.getText().length() == 0 || return_date.getDate() == null){
            
            JOptionPane.showMessageDialog(null, "Boş Alan Bırakmayınız.");
        }
        
        else{
        
        try {
            
            String query = "SELECT * FROM borrow_book" ;
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            TableModel model = table_returnBook.getModel();
            if (rs.next()) {
                
                int selectMemberID = Integer.parseInt(fld_returnMemberID.getText());
                int i = table_returnBook.getSelectedRow();
                
                String selectMemberFName = model.getValueAt(i, 1).toString();
                String selectMemberLName = model.getValueAt(i, 2).toString();
                String selectIssueDate = model.getValueAt(i, 9).toString();
                
                String selectID = fld_returnBookID.getText();
                String selectTitle = fld_returnBookTitle.getText();
                String selectAuthor = fld_returnBookAuthor.getText();
                String selectISBN = fld_returnBookISBN.getText();
                String selectPublisher = fld_returnBookPublisher.getText();
                String selectPage = fld_returnBookPage.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(return_date.getDate());
                
                
            
            boolean control = lib.returnBook(selectMemberID, selectMemberFName, selectMemberLName, selectID, selectTitle, selectAuthor, selectISBN, selectPublisher, selectPage, date, selectIssueDate);
                if (control) {
                    lib.addBook(selectID, selectTitle, selectAuthor, selectISBN, selectPublisher, selectPage);
                    deleteBook(selectID);
                    update();
                    fld_returnBookAuthor.setText("");
                    fld_returnBookID.setText("");
                    fld_returnBookISBN.setText("");
                    fld_returnBookPage.setText("");
                    fld_returnBookPublisher.setText("");
                    fld_returnBookTitle.setText("");
                    fld_returnBookTitle.setText("");
                    return_date.setDate(null);
                    JOptionPane.showMessageDialog(null, "İşlem Başarılı");
                    
                }
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Böyle Bir Kullanıcı Sisteme Kayıtlı Değil..");
            }
          
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    }//GEN-LAST:event_btn_returnBookActionPerformed

    private void btn_returnBookCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnBookCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btn_returnBookCloseActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ReturnBook().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_returnBook;
    private javax.swing.JButton btn_returnBookClose;
    private javax.swing.JTextField fld_returnBookAuthor;
    private javax.swing.JTextField fld_returnBookID;
    private javax.swing.JTextField fld_returnBookISBN;
    private javax.swing.JTextField fld_returnBookPage;
    private javax.swing.JTextField fld_returnBookPublisher;
    private javax.swing.JTextField fld_returnBookTitle;
    private javax.swing.JTextField fld_returnMemberID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser return_date;
    private javax.swing.JTable table_returnBook;
    // End of variables declaration//GEN-END:variables
}
