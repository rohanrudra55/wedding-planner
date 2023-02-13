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

public class Database extends javax.swing.JFrame {

    public Database() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDesktopPanel = new javax.swing.JDesktopPane();
        jDatabasePanel = new javax.swing.JPanel();
        jwelcome = new javax.swing.JLabel();
        jInputPanel = new javax.swing.JPanel();
        jUsrNmLabel = new javax.swing.JLabel();
        jUsrNmField = new javax.swing.JTextField();
        jPswLabel = new javax.swing.JLabel();
        jPswField = new javax.swing.JPasswordField();
        jButtonPanel = new javax.swing.JPanel();
        jConnectButton = new javax.swing.JButton();
        jBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPanel.setBackground(new java.awt.Color(153, 0, 102));
        jDesktopPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPanel.setMaximumSize(new java.awt.Dimension(880, 515));
        jDesktopPanel.setMinimumSize(new java.awt.Dimension(880, 515));

        jDatabasePanel.setForeground(new java.awt.Color(60, 63, 65));
        jDatabasePanel.setLayout(new java.awt.GridBagLayout());

        jwelcome.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jwelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jwelcome.setText("MySQL");
        jwelcome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jwelcome.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jDatabasePanel.add(jwelcome, gridBagConstraints);

        jInputPanel.setLayout(new java.awt.GridLayout(2, 2, 20, 20));

        jUsrNmLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jUsrNmLabel.setText("Username");
        jInputPanel.add(jUsrNmLabel);

        jUsrNmField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jInputPanel.add(jUsrNmField);

        jPswLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPswLabel.setText("Password");
        jInputPanel.add(jPswLabel);

        jPswField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jInputPanel.add(jPswField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 90, 58, 90);
        jDatabasePanel.add(jInputPanel, gridBagConstraints);

        jButtonPanel.setMaximumSize(new java.awt.Dimension(0, 0));
        jButtonPanel.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jConnectButton.setText("Connect");
        jConnectButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jConnectButton.setMaximumSize(new java.awt.Dimension(50, 18));
        jConnectButton.setMinimumSize(new java.awt.Dimension(50, 18));
        jConnectButton.setName(""); // NOI18N
        jConnectButton.setPreferredSize(new java.awt.Dimension(50, 18));
        jConnectButton.setSize(new java.awt.Dimension(50, 18));
        jConnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConnectButtonActionPerformed(evt);
            }
        });
        jButtonPanel.add(jConnectButton);

        jBackButton.setText("Back");
        jBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBackButton.setMaximumSize(new java.awt.Dimension(50, 18));
        jBackButton.setMinimumSize(new java.awt.Dimension(50, 18));
        jBackButton.setPreferredSize(new java.awt.Dimension(50, 18));
        jBackButton.setSize(new java.awt.Dimension(50, 18));
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });
        jButtonPanel.add(jBackButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(94, 78, 76, 77);
        jDatabasePanel.add(jButtonPanel, gridBagConstraints);

        jDesktopPanel.setLayer(jDatabasePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jDatabasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addComponent(jDatabasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
        welcomepage();
    }//GEN-LAST:event_jBackButtonActionPerformed

    private void jConnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConnectButtonActionPerformed

        Connect.setRoot(jUsrNmField.getText());
        Connect.setPassword(jPswField.getText());
        Connect create = new Connect();
        welcomepage();
    }//GEN-LAST:event_jConnectButtonActionPerformed

    private void welcomepage() {
        Welcome active = new Welcome();
        active.setVisible(true);
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBackButton;
    private javax.swing.JPanel jButtonPanel;
    private javax.swing.JButton jConnectButton;
    public javax.swing.JPanel jDatabasePanel;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JPanel jInputPanel;
    private javax.swing.JPasswordField jPswField;
    private javax.swing.JLabel jPswLabel;
    private javax.swing.JTextField jUsrNmField;
    private javax.swing.JLabel jUsrNmLabel;
    private javax.swing.JLabel jwelcome;
    // End of variables declaration//GEN-END:variables
}
