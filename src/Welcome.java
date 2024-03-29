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
import javax.swing.*;
import java.awt.*;
public class Welcome extends javax.swing.JFrame {

    public Welcome() {
        initComponents();
        // To change the title bar color
        setDefaultLookAndFeelDecorated(true);
        //
        
        // setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setResizable(false);
        setLocationRelativeTo(null);
        jSidePanel.setBackground(new  Color(153,0,102,60));
    }

    protected void CloseWelcome() {
        setVisible(false);
    }

    private void formatButton(String name, JButton button) {
        button.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        button.setText(name);
        button.setOpaque(true);
        // button.setSize(new Dimension(40, 10));
        // button.setBounds(new Rectangle(40, 18));
        // button.setMargin(new Insets(2, 14, 2, 14));
        button.setBorder(
                new javax.swing.border.LineBorder(
                        new java.awt.Color(153, 0, 101),
                        1,
                        true));
    }

    private void hoverAction(JButton button) {
        button.addMouseListener(
                new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        button.setBackground(new Color(224, 153, 206));
                    }

                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        button.setBackground(jPanel2.getBackground());
                    }
                });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSidePanel = new javax.swing.JPanel();
        jCenterPanel = new javax.swing.JPanel();
        jwelcome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDBButton = new javax.swing.JButton();
        jSignupButton = new javax.swing.JButton();
        jSigninButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planer");
        setBackground(new java.awt.Color(153, 0, 101));
        setMinimumSize(new java.awt.Dimension(880, 515));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jSidePanel.setBackground(new java.awt.Color(153, 0, 101));

        javax.swing.GroupLayout jSidePanelLayout = new javax.swing.GroupLayout(jSidePanel);
        jSidePanel.setLayout(jSidePanelLayout);
        jSidePanelLayout.setHorizontalGroup(
            jSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        jSidePanelLayout.setVerticalGroup(
            jSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(jSidePanel);

        jCenterPanel.setMaximumSize(new java.awt.Dimension(378, 400));
        jCenterPanel.setMinimumSize(new java.awt.Dimension(378, 400));
        jCenterPanel.setLayout(new java.awt.GridBagLayout());

        jwelcome.setFont(new java.awt.Font("Butler Stencil", 1, 80)); // NOI18N
        jwelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jwelcome.setText("Welcome");
        jwelcome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jwelcome.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jCenterPanel.add(jwelcome, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridLayout(3, 0, 0, 20));

        formatButton("Connect", jDBButton);
        hoverAction(jDBButton);

        jDBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jDBButton);

        formatButton("Signup", jSignupButton);
        hoverAction(jSignupButton);

        jSignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignupButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jSignupButton);

        formatButton("Signin", jSigninButton);
        hoverAction(jSigninButton);

        jSigninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSigninButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jSigninButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(80, 80, 80, 80);
        jCenterPanel.add(jPanel2, gridBagConstraints);

        getContentPane().add(jCenterPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDBButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jDBButtonActionPerformed
        getContentPane().remove(jCenterPanel);
        getContentPane().add(new Datatab());
        validate();
    }//GEN-LAST:event_jDBButtonActionPerformed

    private void jSignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignupButtonActionPerformed
        getContentPane().remove(jCenterPanel);
        getContentPane().add(new Signuptab());
        validate();
    }//GEN-LAST:event_jSignupButtonActionPerformed

    private void jSigninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSigninButtonActionPerformed
        getContentPane().remove(jCenterPanel);
        getContentPane().add(new Signintab());
        validate();
    }//GEN-LAST:event_jSigninButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Welcome MainWindow = new Welcome(); 
                MainWindow.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jCenterPanel;
    private javax.swing.JButton jDBButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jSidePanel;
    private javax.swing.JButton jSigninButton;
    private javax.swing.JButton jSignupButton;
    private javax.swing.JLabel jwelcome;
    // End of variables declaration//GEN-END:variables
}
