
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;

import javax.swing.*;
/*
 * The MIT License
 *
 * Copyright 2023 ADITI MANDAL.
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
 * @author ADITI MANDAL
 */
public class Signintab extends JPanel {
    private JPanel jCenterSignupPanel = new JPanel();

    private JLabel jwelcome = new JLabel();

    private JLabel jUsrNmLabel = new JLabel();
    private JTextField jUsrNmField = new JTextField();
    private JLabel jPswLabel = new JLabel();
    private JTextField jPswField = new JTextField();
    private JLabel jUsrTypLable = new JLabel();
    private JComboBox jComboTyp = new JComboBox<>();

    private JPanel jButtonPanel = new JPanel();

    private JButton jBackButton = new JButton();
    private JButton jSigninButton = new JButton();

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
                        button.setBackground(getBackground());
                    }
                });
    }

    private void formatLabel(JLabel lable, String text) {
        lable.setText(text);
        lable.setFont(new Font("Arial", 0, 15));
    }

    private void formatFeild(JTextField field) {
        field.setBorder(new MatteBorder(0, 0, 1, 0, new Color(153, 0, 101)));
        field.setBackground(getBackground());
    }

    public Signintab() {
        setMaximumSize(new Dimension(378, 400));
        setSize(new Dimension(378, 400));
        setLayout(new GridBagLayout());
        GridBagConstraints constrains;

        // // Title
        // jwelcome.setText("Hello User!");
        // jwelcome.setFont(new Font("Butler Stencil", 0, 50));

        constrains = new GridBagConstraints();
        constrains.gridx = 0;
        constrains.gridy = 0;
        // constrains.fill = GridBagConstr aints.HORIZONTAL;
        constrains.insets = new Insets(50, 50, 50, 50);
        add(jwelcome, constrains);

        // Field
        jCenterSignupPanel.setLayout(new GridLayout(4, 2, 12, 10));
        jCenterSignupPanel.setOpaque(false);
        jUsrTypLable.setText("UserType");
        jComboTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Admin", "Agent", "Vendor","Demo" }));
        jUsrTypLable.setFont(new Font("Arial", 1, 20));
        jCenterSignupPanel.add(jUsrTypLable);
        jCenterSignupPanel.add(jComboTyp);

        formatLabel(jUsrNmLabel, "Username");
        formatFeild(jUsrNmField);
        jCenterSignupPanel.add(jUsrNmLabel);
        jCenterSignupPanel.add(jUsrNmField);

        formatLabel(jPswLabel, "Password");
        formatFeild(jPswField);
        jCenterSignupPanel.add(jPswLabel);
        jCenterSignupPanel.add(jPswField);

        constrains = new GridBagConstraints();
        constrains.gridx = 0;
        constrains.gridy = 1;
        constrains.weightx = 0.25;
        constrains.weighty = 0;
        constrains.ipadx = 20;
        constrains.ipady = 2;
        constrains.insets = new Insets(50, 25, 50, 25);
        add(jCenterSignupPanel, constrains);

        // Buttons

        jButtonPanel.setLayout(new GridLayout(1, 0, 20, 0));
        jButtonPanel.setOpaque(false);
        formatButton("Back", jBackButton);
        hoverAction(jBackButton);
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });

        jButtonPanel.add(jBackButton);
        formatButton("Signin", jSigninButton);
        hoverAction(jSigninButton);
        jSigninButton.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jSigninButtonActionPerformed(evt);
                    }
                });

        jButtonPanel.add(jSigninButton);
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
        JFrame f1 = (JFrame) SwingUtilities.windowForComponent(this);
        Welcome active = new Welcome();
        active.setVisible(true);
        f1.setVisible(false);
    }

    private void jSigninButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String userValue = jUsrNmField.getText();
        String pswValue = jPswField.getText();
        String typeValue = (String) jComboTyp.getSelectedItem();

        Profile loginAuthenticate = new Profile();
        if (!(loginAuthenticate.authenticate(userValue, pswValue, typeValue))) {
            jUsrNmField.setText("");
            jPswField.setText("");
        } else {
            JFrame f1 = (JFrame) SwingUtilities.windowForComponent(this);
            Menu active = new Menu();
            active.setVisible(true);
            f1.setVisible(false);
        }
    }
}