import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
import javax.swing.*;

class Signup extends JFrame {
    JLabel msg;

    Signup() {
        System.out.println("REDIRECTED");
        JPanel servicePanel = new JPanel();
        msg = new JLabel();
        msg.setText("Welcome");
        servicePanel.add(msg);
        setTitle("Planer-Signup");
        add(servicePanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
}
