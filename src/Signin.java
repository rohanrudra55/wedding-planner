
import javax.swing.JOptionPane;

/*
 * The MIT License
 *
 * Copyright 2023 alpha.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
/**
 *
 * @author alpha
 */
public class Signin extends javax.swing.JFrame {

    public Signin() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jCenterPanel = new javax.swing.JPanel();
        jwelcome = new javax.swing.JLabel();
        jUsrNmLabel = new javax.swing.JLabel();
        jPswLabel = new javax.swing.JLabel();
        jUsrNmField = new javax.swing.JTextField();
        jPswField = new javax.swing.JPasswordField();
        jSigninButton = new javax.swing.JButton();
        jComboTyp = new javax.swing.JComboBox<>();
        jUsrTypLable = new javax.swing.JLabel();
        jBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane.setBackground(new java.awt.Color(153, 0, 102));
        jDesktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane.setMaximumSize(new java.awt.Dimension(880, 515));
        jDesktopPane.setMinimumSize(new java.awt.Dimension(880, 515));
        jDesktopPane.setLayout(new javax.swing.OverlayLayout(jDesktopPane));

        jCenterPanel.setForeground(new java.awt.Color(60, 63, 65));
        jCenterPanel.setMaximumSize(new java.awt.Dimension(378, 400));
        jCenterPanel.setMinimumSize(new java.awt.Dimension(378, 400));
        jCenterPanel.setPreferredSize(new java.awt.Dimension(378, 400));

        jwelcome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jwelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jwelcome.setText("Sign In");
        jwelcome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jwelcome.setOpaque(true);

        jUsrNmLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jUsrNmLabel.setText("Username");
        jUsrNmLabel.setSize(new java.awt.Dimension(83, 23));

        jPswLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jPswLabel.setText("Password");
        jPswLabel.setMaximumSize(new java.awt.Dimension(83, 23));
        jPswLabel.setMinimumSize(new java.awt.Dimension(83, 23));
        jPswLabel.setPreferredSize(new java.awt.Dimension(83, 23));
        jPswLabel.setSize(new java.awt.Dimension(83, 23));

        jUsrNmField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jUsrNmField.setMaximumSize(new java.awt.Dimension(190, 23));
        jUsrNmField.setMinimumSize(new java.awt.Dimension(190, 23));
        jUsrNmField.setPreferredSize(new java.awt.Dimension(190, 23));

        jPswField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPswField.setMaximumSize(new java.awt.Dimension(190, 23));
        jPswField.setMinimumSize(new java.awt.Dimension(190, 23));
        jPswField.setOpaque(true);
        jPswField.setPreferredSize(new java.awt.Dimension(190, 23));
        jPswField.setSize(new java.awt.Dimension(190, 23));

        jSigninButton.setText("Signin");
        jSigninButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jSigninButton.setMaximumSize(new java.awt.Dimension(78, 22));
        jSigninButton.setMinimumSize(new java.awt.Dimension(78, 22));
        jSigninButton.setName(""); // NOI18N
        jSigninButton.setPreferredSize(new java.awt.Dimension(78, 22));
        jSigninButton.setSize(new java.awt.Dimension(78, 22));
        jSigninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSigninButtonActionPerformed(evt);
            }
        });

        jComboTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Admin", "Agent", "Vendor" }));
        jComboTyp.setMaximumSize(new java.awt.Dimension(190, 23));
        jComboTyp.setMinimumSize(new java.awt.Dimension(190, 23));
        jComboTyp.setPreferredSize(new java.awt.Dimension(190, 23));
        jComboTyp.setSize(new java.awt.Dimension(190, 23));
        jComboTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTypActionPerformed(evt);
            }
        });

        jUsrTypLable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jUsrTypLable.setText("User Type");
        jUsrTypLable.setSize(new java.awt.Dimension(83, 23));

        jBackButton.setText("Back");
        jBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBackButton.setMaximumSize(new java.awt.Dimension(78, 22));
        jBackButton.setMinimumSize(new java.awt.Dimension(78, 22));
        jBackButton.setPreferredSize(new java.awt.Dimension(78, 22));
        jBackButton.setSize(new java.awt.Dimension(78, 22));
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCenterPanelLayout = new javax.swing.GroupLayout(jCenterPanel);
        jCenterPanel.setLayout(jCenterPanelLayout);
        jCenterPanelLayout.setHorizontalGroup(
            jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jwelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCenterPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCenterPanelLayout.createSequentialGroup()
                        .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPswLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jUsrNmLabel)
                            .addComponent(jUsrTypLable, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUsrNmField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboTyp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPswField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCenterPanelLayout.createSequentialGroup()
                        .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSigninButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(150, 150, 150))))
        );
        jCenterPanelLayout.setVerticalGroup(
            jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCenterPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jwelcome)
                .addGap(27, 27, 27)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsrTypLable, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsrNmLabel)
                    .addComponent(jUsrNmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPswLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPswField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(jSigninButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jDesktopPane.add(jCenterPanel);

        getContentPane().add(jDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
        Welcome active = new Welcome();
        active.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBackButtonActionPerformed

    private void jSigninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSigninButtonActionPerformed
        String userValue = jUsrNmField.getText();
        String pswValue = jPswField.getText();
        String typeValue = (String) jComboTyp.getSelectedItem();

        Profile loginAuthenticate = new Profile();
        if (!(loginAuthenticate.authenticate(userValue, pswValue, typeValue))) {
            jUsrNmField.setText("");
            jPswField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Signed");
            Menu active=new Menu();
            active.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_jSigninButtonActionPerformed

    private void jComboTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTypActionPerformed
        String typeValue = (String) jComboTyp.getSelectedItem();
        jwelcome.setText(typeValue);
    }//GEN-LAST:event_jComboTypActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBackButton;
    private javax.swing.JPanel jCenterPanel;
    private javax.swing.JComboBox<String> jComboTyp;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JPasswordField jPswField;
    private javax.swing.JLabel jPswLabel;
    private javax.swing.JButton jSigninButton;
    private javax.swing.JTextField jUsrNmField;
    private javax.swing.JLabel jUsrNmLabel;
    private javax.swing.JLabel jUsrTypLable;
    private javax.swing.JLabel jwelcome;
    // End of variables declaration//GEN-END:variables
}
