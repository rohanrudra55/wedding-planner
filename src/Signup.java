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
public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jCenterPanel = new javax.swing.JPanel();
        jwelcome = new javax.swing.JLabel();
        jUsrNmLabel = new javax.swing.JLabel();
        jPswLabel = new javax.swing.JLabel();
        jNmLable = new javax.swing.JLabel();
        jMbLabel = new javax.swing.JLabel();
        jNamField = new javax.swing.JTextField();
        jMbFeild = new javax.swing.JTextField();
        jUsrNmField = new javax.swing.JTextField();
        jPswField = new javax.swing.JPasswordField();
        jSignupButton = new javax.swing.JButton();
        jComboTyp = new javax.swing.JComboBox<>();
        jUsrTypLable = new javax.swing.JLabel();
        jBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane.setBackground(new java.awt.Color(0, 102, 153));
        jDesktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane.setMaximumSize(new java.awt.Dimension(1750, 1030));
        jDesktopPane.setMinimumSize(new java.awt.Dimension(175, 103));

        jCenterPanel.setForeground(new java.awt.Color(60, 63, 65));

        jwelcome.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jwelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jwelcome.setText("Welcome");
        jwelcome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jwelcome.setOpaque(true);

        jUsrNmLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jUsrNmLabel.setText("Username");

        jPswLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jPswLabel.setText("Password");

        jNmLable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jNmLable.setText("Name");

        jMbLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jMbLabel.setText("Mobile");

        jNamField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jMbFeild.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jUsrNmField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPswField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSignupButton.setText("Signup");
        jSignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignupButtonActionPerformed(evt);
            }
        });

        jComboTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Admin", "Agent", "Vendor" }));

        jUsrTypLable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jUsrTypLable.setText("User Type");

        jBackButton.setText("Back");
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCenterPanelLayout = new javax.swing.GroupLayout(jCenterPanel);
        jCenterPanel.setLayout(jCenterPanelLayout);
        jCenterPanelLayout.setHorizontalGroup(
            jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jwelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCenterPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPswLabel)
                        .addComponent(jUsrNmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jNmLable, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jUsrTypLable, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNamField)
                    .addComponent(jMbFeild)
                    .addComponent(jUsrNmField)
                    .addComponent(jPswField)
                    .addComponent(jComboTyp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(jCenterPanelLayout.createSequentialGroup()
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCenterPanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jSignupButton))
                    .addGroup(jCenterPanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jBackButton)))
                .addGap(154, 154, 154))
        );
        jCenterPanelLayout.setVerticalGroup(
            jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCenterPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jwelcome)
                .addGap(27, 27, 27)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsrTypLable))
                .addGap(18, 18, 18)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNmLable)
                    .addComponent(jNamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMbLabel)
                    .addComponent(jMbFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsrNmLabel)
                    .addComponent(jUsrNmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPswLabel)
                    .addComponent(jPswField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jSignupButton)
                .addGap(18, 18, 18)
                .addComponent(jBackButton)
                .addGap(32, 32, 32))
        );

        jDesktopPane.setLayer(jCenterPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jCenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jCenterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
        Welcome active=new Welcome();
        active.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBackButtonActionPerformed

    private void jSignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignupButtonActionPerformed
        String typeValue = (String) jComboTyp.getSelectedItem();
        Profile loggedUser = new Profile();
        loggedUser.setAccount(typeValue);
        loggedUser.setName(jNamField.getText());
        loggedUser.setPassword(jPswField.getText());
        loggedUser.setUsername(jUsrNmField.getText());
        loggedUser.updateDB();
    }//GEN-LAST:event_jSignupButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBackButton;
    private javax.swing.JPanel jCenterPanel;
    private javax.swing.JComboBox<String> jComboTyp;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JTextField jMbFeild;
    private javax.swing.JLabel jMbLabel;
    private javax.swing.JTextField jNamField;
    private javax.swing.JLabel jNmLable;
    private javax.swing.JPasswordField jPswField;
    private javax.swing.JLabel jPswLabel;
    private javax.swing.JButton jSignupButton;
    private javax.swing.JTextField jUsrNmField;
    private javax.swing.JLabel jUsrNmLabel;
    private javax.swing.JLabel jUsrTypLable;
    private javax.swing.JLabel jwelcome;
    // End of variables declaration//GEN-END:variables
}