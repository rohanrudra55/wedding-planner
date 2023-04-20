
import java.awt.Color;
import javax.swing.JButton;

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
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu2
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
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
                        button.setBackground(jSidePanel.getBackground());
                    }
                });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSidePanel = new javax.swing.JPanel();
        jHeading = new javax.swing.JLabel();
        jButtonPanel = new javax.swing.JPanel();
        jPrice = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jItems = new javax.swing.JPanel();
        jEvent = new javax.swing.JButton();
        jVenue = new javax.swing.JButton();
        jFood = new javax.swing.JButton();
        jExtra = new javax.swing.JButton();
        jDefaultPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planer");
        setBackground(new java.awt.Color(153, 0, 102));
        setMaximumSize(new java.awt.Dimension(880, 515));
        setMinimumSize(new java.awt.Dimension(880, 515));
        setResizable(false);
        setSize(new java.awt.Dimension(880, 515));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSidePanel.setBackground(new java.awt.Color(217, 182, 205));
        jSidePanel.setLayout(new java.awt.GridBagLayout());

        jHeading.setFont(new java.awt.Font("Butler Stencil", 1, 48)); // NOI18N
        jHeading.setForeground(new java.awt.Color(0, 0, 0));
        jHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHeading.setText("Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.insets = new java.awt.Insets(24, 25, 24, 25);
        jSidePanel.add(jHeading, gridBagConstraints);

        jButtonPanel.setOpaque(false);
        jButtonPanel.setLayout(new java.awt.GridLayout(2, 0, 0, 20));

        jPrice.setBackground(new java.awt.Color(217, 182, 205));
        jPrice.setForeground(new java.awt.Color(255, 255, 255));
        jPrice.setText("Get Price");
        formatButton("Get Price", jPrice);
        hoverAction(jPrice);
        jPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 101)));
        jButtonPanel.add(jPrice);

        jBack.setBackground(new java.awt.Color(217, 182, 205));
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("Back");
        formatButton("Back", jBack);
        hoverAction(jBack);
        jBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 101)));
        jButtonPanel.add(jBack);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(67, 92, 54, 88);
        jSidePanel.add(jButtonPanel, gridBagConstraints);

        jItems.setOpaque(false);
        jItems.setLayout(new java.awt.GridLayout(4, 0));

        jEvent.setBackground(new java.awt.Color(217, 182, 205));
        jEvent.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jEvent.setForeground(new java.awt.Color(255, 255, 255));
        jEvent.setText("Event");
        jEvent.setBorder(null);
        jEvent.setBorderPainted(false);
        jEvent.setFocusPainted(false);
        jEvent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jItems.add(jEvent);

        jVenue.setBackground(new java.awt.Color(217, 182, 205));
        jVenue.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jVenue.setForeground(new java.awt.Color(255, 255, 255));
        jVenue.setText("Venue");
        jVenue.setBorder(null);
        jVenue.setBorderPainted(false);
        jVenue.setFocusPainted(false);
        jItems.add(jVenue);

        jFood.setBackground(new java.awt.Color(217, 182, 205));
        jFood.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jFood.setForeground(new java.awt.Color(255, 255, 255));
        jFood.setText("Food");
        jFood.setBorder(null);
        jFood.setBorderPainted(false);
        jFood.setFocusPainted(false);
        jItems.add(jFood);

        jExtra.setBackground(new java.awt.Color(217, 182, 205));
        jExtra.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jExtra.setForeground(new java.awt.Color(255, 255, 255));
        jExtra.setText("Extra Services");
        jExtra.setBorder(null);
        jExtra.setBorderPainted(false);
        jExtra.setFocusPainted(false);
        jItems.add(jExtra);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        jSidePanel.add(jItems, gridBagConstraints);

        getContentPane().add(jSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 520));

        jDefaultPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDefaultPanelLayout = new javax.swing.GroupLayout(jDefaultPanel);
        jDefaultPanel.setLayout(jDefaultPanelLayout);
        jDefaultPanelLayout.setHorizontalGroup(
            jDefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jDefaultPanelLayout.setVerticalGroup(
            jDefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        getContentPane().add(jDefaultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 620, 515));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JPanel jButtonPanel;
    private javax.swing.JPanel jDefaultPanel;
    private javax.swing.JButton jEvent;
    private javax.swing.JButton jExtra;
    private javax.swing.JButton jFood;
    private javax.swing.JLabel jHeading;
    private javax.swing.JPanel jItems;
    private javax.swing.JButton jPrice;
    private javax.swing.JPanel jSidePanel;
    private javax.swing.JButton jVenue;
    // End of variables declaration//GEN-END:variables
}
