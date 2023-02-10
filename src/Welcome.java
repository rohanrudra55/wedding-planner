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
public class Welcome extends javax.swing.JFrame {

    public Welcome() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jCenterPanel = new javax.swing.JPanel();
        jwelcome = new javax.swing.JLabel();
        jDBButton = new javax.swing.JButton();
        jSignupButton = new javax.swing.JButton();
        jSigninButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane.setBackground(new java.awt.Color(153, 0, 102));
        jDesktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane.setMaximumSize(new java.awt.Dimension(1750, 1030));
        jDesktopPane.setMinimumSize(new java.awt.Dimension(175, 103));

        jCenterPanel.setForeground(new java.awt.Color(60, 63, 65));

        jwelcome.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        jwelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jwelcome.setText("Welcome");
        jwelcome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jwelcome.setOpaque(true);

        jDBButton.setText("Connect");
        jDBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonActionPerformed(evt);
            }
        });

        jSignupButton.setText("Signup");
        jSignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignupButtonActionPerformed(evt);
            }
        });

        jSigninButton.setText("Signin");
        jSigninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSigninButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCenterPanelLayout = new javax.swing.GroupLayout(jCenterPanel);
        jCenterPanel.setLayout(jCenterPanelLayout);
        jCenterPanelLayout.setHorizontalGroup(
            jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jwelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCenterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDBButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSigninButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSignupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(154, 154, 154))
        );
        jCenterPanelLayout.setVerticalGroup(
            jCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCenterPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jDBButton)
                .addGap(18, 18, 18)
                .addComponent(jSigninButton)
                .addGap(18, 18, 18)
                .addComponent(jSignupButton)
                .addContainerGap(68, Short.MAX_VALUE))
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

    private void jDBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBButtonActionPerformed
        Database page = new Database();
        page.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jDBButtonActionPerformed

    private void jSignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignupButtonActionPerformed
        Signup active = new Signup();
        active.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jSignupButtonActionPerformed

    private void jSigninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSigninButtonActionPerformed
        Signin active = new Signin();
        active.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jSigninButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jCenterPanel;
    private javax.swing.JButton jDBButton;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JButton jSigninButton;
    private javax.swing.JButton jSignupButton;
    private javax.swing.JLabel jwelcome;
    // End of variables declaration//GEN-END:variables
}
