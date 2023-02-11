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
public class MyDialouge extends javax.swing.JFrame {

    public MyDialouge() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInputPanel = new javax.swing.JPanel();
        jShowPanel = new javax.swing.JPanel();
        jBottomPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database Connection");
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setPreferredSize(new java.awt.Dimension(500, 222));
        setSize(getPreferredSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInputPanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jInputPanelLayout = new javax.swing.GroupLayout(jInputPanel);
        jInputPanel.setLayout(jInputPanelLayout);
        jInputPanelLayout.setHorizontalGroup(
            jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jInputPanelLayout.setVerticalGroup(
            jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jInputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 42, 320, 120));

        jShowPanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jShowPanelLayout = new javax.swing.GroupLayout(jShowPanel);
        jShowPanel.setLayout(jShowPanelLayout);
        jShowPanelLayout.setHorizontalGroup(
            jShowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jShowPanelLayout.setVerticalGroup(
            jShowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jShowPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 170, 120));

        jBottomPanel.setBackground(new java.awt.Color(153, 153, 153));
        jBottomPanel.setMaximumSize(new java.awt.Dimension(500, 30));
        jBottomPanel.setMinimumSize(new java.awt.Dimension(500, 30));
        jBottomPanel.setLayout(new java.awt.GridLayout(1, 1, 50, 0));

        jButton2.setText("jButton2");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBottomPanel.add(jButton2);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jBottomPanel.add(jButton1);

        getContentPane().add(jBottomPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 300, 30));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyDialouge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBottomPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jInputPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jShowPanel;
    // End of variables declaration//GEN-END:variables
}
