import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
import javax.swing.*;

class Boot extends JFrame implements ActionListener {
    JLabel msg;
    JButton signin;
    JButton signup;

    Boot() {
        signin = new JButton("Sign in");
        signup = new JButton("Sign Up");
        System.out.println("REDIRECTED");
        JPanel BootPanel = new JPanel();
        msg = new JLabel();
        msg.setText("Boot");
        BootPanel.add(msg);
        BootPanel.add(signup);
        BootPanel.add(signin);
        setTitle("Planer-Boot");
        add(BootPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        signin.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        // Object activeBt = ae.getSource();
        // if (activeBt == signup) {
        // Signup active = new Signup();
        // active.setVisible(true);
        // } else if (activeBt == signin) {
        // Signin active = new Signin();
        // active.setVisible(true);
        // }
        // setVisible(false);
    }
}

// Test file
class graphics {
    public static void main(String arg[]) {
        try {
            Boot form = new Boot();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}