/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;



import Helper.*;
import Main.Librarian;
import Main.Member;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Çağrı
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUI
     */
    int x, y;
    private final DBConnect connect = new DBConnect();
    private final Win10UI modernUI = new Win10UI();
    static Member member = new Member();
    
    
    
    public LoginGUI() {
        modernUI.modernDesign();
        initComponents();
        lbl_false.setVisible(false);
        lbl_false1.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        fld_adminUser = new javax.swing.JTextField();
        fld_adminPass = new javax.swing.JPasswordField();
        btn_adminLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_false = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        fld_ogrUser = new javax.swing.JTextField();
        fld_ogrPass = new javax.swing.JPasswordField();
        btn_ogrRegister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_ogrLogin = new javax.swing.JButton();
        lbl_false1 = new javax.swing.JLabel();
        lbl_exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));

        jPanel1.setBackground(new java.awt.Color(57, 57, 57));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_books_320px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(241, 242, 246));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(164, 176, 190));
        jTabbedPane1.setForeground(new java.awt.Color(57, 57, 57));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(241, 242, 246));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fld_adminUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fld_adminUser.setText("Kullanıcı Adı");
        fld_adminUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fld_adminUserFocusGained(evt);
            }
        });
        jPanel3.add(fld_adminUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 250, 30));

        fld_adminPass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fld_adminPass.setText("**********");
        fld_adminPass.setToolTipText("");
        fld_adminPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fld_adminPassFocusGained(evt);
            }
        });
        jPanel3.add(fld_adminPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 250, 30));
        fld_adminPass.getAccessibleContext().setAccessibleName("");
        fld_adminPass.getAccessibleContext().setAccessibleDescription("**************");

        btn_adminLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_adminLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_key_30px.png"))); // NOI18N
        btn_adminLogin.setText("                 Giriş Yap");
        btn_adminLogin.setHideActionText(true);
        btn_adminLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_adminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminLoginActionPerformed(evt);
            }
        });
        jPanel3.add(btn_adminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 300, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_lock_30px.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_user_30px_1.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lbl_false.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_false.setForeground(new java.awt.Color(192, 57, 43));
        lbl_false.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_false.setText("Kullanıcı Adı veya Şifre Yanlış");
        jPanel3.add(lbl_false, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 290, 30));

        jTabbedPane1.addTab("Kütüphaneci Girişi", jPanel3);

        jPanel4.setBackground(new java.awt.Color(241, 242, 246));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fld_ogrUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fld_ogrUser.setText("Kullanıcı Adı");
        fld_ogrUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fld_ogrUserFocusGained(evt);
            }
        });
        jPanel4.add(fld_ogrUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 250, 30));

        fld_ogrPass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fld_ogrPass.setText("**********");
        fld_ogrPass.setToolTipText("");
        fld_ogrPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fld_ogrPassFocusGained(evt);
            }
        });
        jPanel4.add(fld_ogrPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 250, 30));

        btn_ogrRegister.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_ogrRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_add_user_male_30px.png"))); // NOI18N
        btn_ogrRegister.setText("    Kayıt Ol");
        btn_ogrRegister.setHideActionText(true);
        btn_ogrRegister.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_ogrRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogrRegisterActionPerformed(evt);
            }
        });
        jPanel4.add(btn_ogrRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 160, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_lock_30px.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_user_30px_1.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        btn_ogrLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_ogrLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_key_30px.png"))); // NOI18N
        btn_ogrLogin.setText("   Giriş Yap");
        btn_ogrLogin.setHideActionText(true);
        btn_ogrLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_ogrLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogrLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btn_ogrLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 160, 40));

        lbl_false1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_false1.setForeground(new java.awt.Color(192, 57, 43));
        lbl_false1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_false1.setText("Kullanıcı Adı veya Şifre Yanlış");
        jPanel4.add(lbl_false1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 290, 30));

        jTabbedPane1.addTab("Kullanıcı Girişi", jPanel4);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 400));

        lbl_exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("X");
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 50, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 57, 57));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KÜTÜPHANE SİSTEMİ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 330, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        getAccessibleContext().setAccessibleName("LoginFrame");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void btn_adminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminLoginActionPerformed
        int count = 0;
        if (fld_adminUser.getText().length() == 0 || fld_adminPass.getText().length() == 0 ) {
          
           JOptionPane.showMessageDialog(null, "Lütfen Boş Alanları Doldurunuz");
          
        }
        
        else{
            
            try {
                Connection con = connect.connectDB();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM login");
                while(rs.next()){
                    if (fld_adminUser.getText().equals(rs.getString("admin_user")) && fld_adminPass.getText().equals(rs.getString("admin_password"))) {
                        Librarian lib = new Librarian();
                        lib.setId(rs.getInt("id"));
                        lib.setUsername(rs.getString("admin_user"));
                        lib.setName(rs.getString("admin_name"));
                        lib.setPassword(rs.getString("admin_password"));
                        
                        
                        Main main = new Main();
                        main.setVisible(true);
                        dispose();
                        count++;
                                
                    }
                    
                }
                
                if (!(count == 1)){
                        lbl_false.setVisible(true);
                    }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
        }
    }//GEN-LAST:event_btn_adminLoginActionPerformed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void fld_adminUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fld_adminUserFocusGained
        fld_adminUser.setText("");
    }//GEN-LAST:event_fld_adminUserFocusGained

    private void fld_adminPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fld_adminPassFocusGained
        fld_adminPass.setText("");
    }//GEN-LAST:event_fld_adminPassFocusGained

    private void btn_ogrLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogrLoginActionPerformed
        int count = 0;
        if (fld_ogrUser.getText().length() == 0 || fld_ogrPass.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Lütfne Boş Yer Bırakmayınız.");
        }
        else {
            
            try {
                Connection con = connect.connectDB();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM member");
                while (rs.next()){
                    if (fld_ogrUser.getText().equals(rs.getString("member_user")) && fld_ogrPass.getText().equals(rs.getString("member_pass"))){
                        
                        member.setMemberID(rs.getInt("id"));
                        member.setName(rs.getString("member_firstname"));
                        member.setLastName(rs.getString("member_lastname"));
                        member.setUsername(rs.getString("member_user"));
                        member.setPosta(rs.getString("member_posta"));
                        member.setPassword(rs.getString("member_pass"));
                        
                        
                        Main main = new Main();
                        main.setVisible(true);
                        dispose();
                        count++;
                    }
                }
                
                if (!(count == 1)){
                        
                        lbl_false1.setVisible(true);
                        
                    }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
           
        }
                
    }//GEN-LAST:event_btn_ogrLoginActionPerformed

    private void fld_ogrUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fld_ogrUserFocusGained
        fld_ogrUser.setText("");
    }//GEN-LAST:event_fld_ogrUserFocusGained

    private void fld_ogrPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fld_ogrPassFocusGained
        fld_ogrPass.setText("");
    }//GEN-LAST:event_fld_ogrPassFocusGained

    private void btn_ogrRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogrRegisterActionPerformed
        try {
            new Register().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_ogrRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adminLogin;
    private javax.swing.JButton btn_ogrLogin;
    private javax.swing.JButton btn_ogrRegister;
    private javax.swing.JPasswordField fld_adminPass;
    private javax.swing.JTextField fld_adminUser;
    private javax.swing.JPasswordField fld_ogrPass;
    private javax.swing.JTextField fld_ogrUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_false;
    private javax.swing.JLabel lbl_false1;
    // End of variables declaration//GEN-END:variables
}
