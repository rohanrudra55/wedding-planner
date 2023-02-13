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
import javax.swing.*;

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
        button.setSize(new Dimension(50, 18));
        button.setBorder(
                new javax.swing.border.LineBorder(
                        new java.awt.Color(153, 0, 101),
                        1,
                        true));
    }

    public Datatab() {
        setMaximumSize(new Dimension(378, 400));
        setSize(new Dimension(378, 400));
        setBackground(new Color(153, 0, 102));
        setLayout(new GridBagLayout());
        GridBagConstraints constrains;

        // Field
        jDataPanel.setLayout(new GridLayout(2, 2, 20, 20));
        jUserLable.setText("username");
        jDataPanel.add(jUserLable);
        jDataPanel.add(jUserField);
        jPassLabel.setText("password");
        jDataPanel.add(jPassLabel);
        jDataPanel.add(JPasField);

        constrains = new GridBagConstraints();
        add(jDataPanel, constrains);

        // Buttons

        jButtonPanel.setLayout(new GridLayout(1, 0, 20, 0));
        formatButton("Back", jBackButton);
        jBackButton.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jBackButtonActionPerformed(evt);
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
        add(jButtonPanel, constrains);
    }

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jConneButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

}
