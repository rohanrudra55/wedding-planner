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
import java.awt.*;
import java.lang.constant.Constable;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.MouseInputListener;

public class Datatab extends JPanel {

    private JPanel jButtonPanel = new JPanel();
    private JPanel jDataPanel = new JPanel();

    private JLabel jTitle = new JLabel();

    private JLabel jUserLable = new JLabel();
    private JTextField jUserField = new JTextField();
    private JLabel jPassLabel = new JLabel();
    private JTextField JPasField = new JTextField();

    private JButton jBackButton = new JButton();
    private JButton jConneButton = new JButton();

    private void formatButton(String name, JButton button) {
        button.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        button.setText(name);
        // button.setSize(new Dimension(40, 10));
        // button.setBounds(new Rectangle(40, 18));
        // button.setMargin(new Insets(2, 14, 2, 14));
        button.setBorder(
                new javax.swing.border.LineBorder(
                        new java.awt.Color(153, 0, 101),
                        1,
                        true));
    }

    public Datatab() {
        setMaximumSize(new Dimension(378, 400));
        setSize(new Dimension(378, 400));
        // setBackground(new Color(200, 200, 200));
        setLayout(new GridBagLayout());
        GridBagConstraints constrains;

        // Title
        jTitle.setText("MySQL");
        jTitle.setFont(new Font("Butler Stencil", 0, 50));

        constrains = new GridBagConstraints();
        constrains.gridx = 0;
        constrains.gridy = 0;
        // constrains.fill = GridBagConstr aints.HORIZONTAL;
        constrains.insets = new Insets(50, 50, 50, 50);
        add(jTitle, constrains);

        // Field
        jDataPanel.setLayout(new GridLayout(2, 2, 20, 20));
        jDataPanel.setOpaque(false);
        jUserLable.setText("username");
        jUserLable.setFont(new Font("Arial", 1, 20));
        jDataPanel.add(jUserLable);
        jUserField.setBorder(new MatteBorder(0, 0, 1, 0, new Color(153, 0, 101)));
        jUserField.setBackground(getBackground());
        jDataPanel.add(jUserField);
        jPassLabel.setText("password");
        jPassLabel.setFont(new Font("Arial", 1, 20));
        jDataPanel.add(jPassLabel);
        JPasField.setBorder(new MatteBorder(0, 0, 1, 0, new Color(153, 0, 101)));
        JPasField.setBackground(getBackground());
        jDataPanel.add(JPasField);

        constrains = new GridBagConstraints();
        constrains.gridx = 0;
        constrains.gridy = 1;
        constrains.weightx = 0.25;
        constrains.weighty = 0;
        constrains.ipadx = 20;
        constrains.ipady = 2;
        constrains.insets = new Insets(50, 25, 50, 25);
        add(jDataPanel, constrains);

        // Buttons

        jButtonPanel.setLayout(new GridLayout(1, 0, 20, 0));
        jButtonPanel.setOpaque(false);
        formatButton("Back", jBackButton);
        jBackButton.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jBackButtonActionPerformed(evt);
                    }
                });
        jBackButton.addMouseListener(
                new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jBackButtonMouseEntered(evt);
                    }

                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        jBackButtonMouseExited(evt);
                    }
                });

        jButtonPanel.add(jBackButton);
        formatButton("Connect", jConneButton);
        jConneButton.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jConneButtonActionPerformed(evt);
                    }
                });
        jButtonPanel.add(jConneButton);
        constrains = new GridBagConstraints();
        constrains.gridx = 0;
        constrains.gridy = 2;
        constrains.ipadx = 50;
        constrains.ipady = 2;
        constrains.weightx = 0;
        constrains.weighty = 0;
        constrains.insets = new Insets(50, 50, 50, 50);
        add(jButtonPanel, constrains);
    }

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jConneButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jBackButtonMouseEntered(java.awt.event.MouseEvent evt) {
        jBackButton.setBackground(new Color(153, 0, 101));

    }

    private void jBackButtonMouseExited(java.awt.event.MouseEvent evt) {
        jBackButton.setBackground(getBackground());

    }

}
