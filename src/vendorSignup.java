
import javax.swing.JOptionPane;

public class vendorSignup extends javax.swing.JFrame {

    public vendorSignup() {
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
        jCreate = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phn_no = new javax.swing.JTextField();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_phn = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jCustomersignup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 10));
        jPanel1.setLayout(null);

        jCreate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCreate.setText("Create");
        jCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateActionPerformed(evt);
            }
        });
        jPanel1.add(jCreate);
        jCreate.setBounds(230, 470, 125, 40);

        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(230, 140, 300, 50);

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(230, 280, 300, 50);

        phn_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phn_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phn_noKeyReleased(evt);
            }
        });
        jPanel1.add(phn_no);
        phn_no.setBounds(230, 370, 300, 50);

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_username);
        lbl_username.setBounds(230, 190, 200, 20);

        lbl_password.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_password);
        lbl_password.setBounds(230, 260, 230, 20);

        lbl_email.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_email);
        lbl_email.setBounds(230, 340, 200, 20);

        lbl_phn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_phn.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_phn);
        lbl_phn.setBounds(230, 430, 220, 20);

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(230, 210, 300, 50);

        jCustomersignup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCustomersignup.setText("Sign up as Customer");
        jCustomersignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCustomersignupActionPerformed(evt);
            }
        });
        jPanel1.add(jCustomersignup);
        jCustomersignup.setBounds(230, 550, 194, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 150, 108, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 280, 112, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Phone No.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 380, 112, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 220, 112, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("WEDDING PLANNER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 50, 366, 53);
        jPanel1.add(img);
        img.setBounds(630, 10, 440, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateActionPerformed
        // TODO add your handling code here:
        if(username.getText().trim().isEmpty() && password.getText().trim().isEmpty() && email.getText().trim().isEmpty() && phn_no.getText().trim().isEmpty()){
            lbl_username.setText("Enter the Username");
            lbl_password.setText("Enter the Password");
            lbl_email.setText("Enter the Email Address");
            lbl_phn.setText("Enter the Phone Number");
        }
        else if(username.getText().trim().isEmpty()){
            lbl_username.setText("Enter the Username");
        }
        else if(password.getText().trim().isEmpty()){
            lbl_password.setText("Enter the Password");
        }
        else if(email.getText().trim().isEmpty()){
            lbl_email.setText("Enter the Email Address");
        }        
        else if(phn_no.getText().trim().isEmpty()){
            lbl_phn.setText("Enter the Phone Number");
        }        
        else{
            try{

                JOptionPane.showMessageDialog(null, "Account Created");
                vendorLogin menu = new vendorLogin();
                menu.setVisible(true);
                setVisible(false);
                
             
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jCreateActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        // TODO add your handling code here:
        lbl_username.setText("");
    }//GEN-LAST:event_usernameKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
        lbl_email.setText("");
    }//GEN-LAST:event_emailKeyReleased

    private void phn_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phn_noKeyReleased
        // TODO add your handling code here:
        lbl_phn.setText("");
    }//GEN-LAST:event_phn_noKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
        lbl_password.setText("");
    }//GEN-LAST:event_passwordKeyReleased

    private void jCustomersignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCustomersignupActionPerformed
        
        Signup menu = new Signup();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jCustomersignupActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendorSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel img;
    private javax.swing.JButton jCreate;
    private javax.swing.JButton jCustomersignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_phn;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phn_no;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
