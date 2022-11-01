import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan Rudra
 */
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        setBounds(100,200,1100,665);
        setLocation(0,0);
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
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jSigninB = new javax.swing.JButton();
        jBanner = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        jSignupB = new javax.swing.JButton();
        jVendorLogin = new javax.swing.JButton();
        jUsername_tag = new javax.swing.JLabel();
        jPassword_tag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 620));
        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.setBorder(null);
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(716, 219, 275, 30);

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setBorder(null);
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(716, 305, 275, 40);

        jSigninB.setBackground(new java.awt.Color(0, 153, 255));
        jSigninB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSigninB.setForeground(new java.awt.Color(255, 255, 255));
        jSigninB.setText("SIGN IN");
        jSigninB.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        jSigninB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSigninBActionPerformed(evt);
            }
        });
        jPanel1.add(jSigninB);
        jSigninB.setBounds(612, 425, 125, 47);

        jBanner.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBanner.setForeground(new java.awt.Color(255, 255, 255));
        jBanner.setText("WEDDING PLANNER");
        jPanel1.add(jBanner);
        jBanner.setBounds(580, 120, 410, 53);

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lbl_username);
        lbl_username.setBounds(720, 270, 140, 19);

        lbl_password.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lbl_password);
        lbl_password.setBounds(720, 370, 140, 22);

        jSignupB.setBackground(new java.awt.Color(0, 153, 255));
        jSignupB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSignupB.setForeground(new java.awt.Color(255, 255, 255));
        jSignupB.setText("SIGN UP");
        jSignupB.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        jSignupB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignupBActionPerformed(evt);
            }
        });
        jPanel1.add(jSignupB);
        jSignupB.setBounds(828, 425, 111, 47);

        jVendorLogin.setBackground(new java.awt.Color(0, 153, 255));
        jVendorLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVendorLogin.setForeground(new java.awt.Color(255, 255, 255));
        jVendorLogin.setText("Login as vendor");
        jVendorLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        jVendorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVendorLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jVendorLogin);
        jVendorLogin.setBounds(685, 500, 210, 50);

        jUsername_tag.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jUsername_tag.setText("Username");
        jPanel1.add(jUsername_tag);
        jUsername_tag.setBounds(560, 220, 120, 29);

        jPassword_tag.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPassword_tag.setText("Password");
        jPanel1.add(jPassword_tag);
        jPassword_tag.setBounds(559, 313, 130, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased

        lbl_password.setText("");
    }//GEN-LAST:event_passwordKeyReleased

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased

        lbl_username.setText("");
    }//GEN-LAST:event_usernameKeyReleased

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void jSigninBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSigninBActionPerformed
        if(username.getText().trim().isEmpty() && password.getText().trim().isEmpty()){
            lbl_username.setText("Enter the Username");
            lbl_password.setText("Enter the Password");
        }
        else if(username.getText().trim().isEmpty()){
            lbl_username.setText("Enter the Username");
        }
        else if(password.getText().trim().isEmpty()){
            lbl_password.setText("Enter the Password");
        }
        else{
            try{
                if(username.getText().equals("admin")){
                    JOptionPane.showMessageDialog(null, "Welcome !");
                    String x = username.getText();
                    Details menu = new Details();
                    menu.setLoggedInUser(x);
                    menu.setVisible(true);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid");
                    password.setText("");
                    username.setText("");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jSigninBActionPerformed

    private void jVendorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVendorLoginActionPerformed
        vendorLogin menu = new vendorLogin();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jVendorLoginActionPerformed

    private void jSignupBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignupBActionPerformed
        Signup menu = new Signup();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jSignupBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//              The code will start from here 
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBanner;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPassword_tag;
    private javax.swing.JButton jSigninB;
    private javax.swing.JButton jSignupB;
    private javax.swing.JLabel jUsername_tag;
    private javax.swing.JButton jVendorLogin;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
