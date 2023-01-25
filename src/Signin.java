import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
import javax.swing.*;

class Signin extends JFrame implements ActionListener, ItemListener {

  JButton signinB;
  JButton back;
  JPanel loginPanel;
  JLabel userLabel, passLabel, typeLable, userMsg, passMsg;

  JComboBox dropMenu;
  final JTextField userFeild, passField;
  String accountType = "Admin";

  public void updateState() {
    userLabel.setText(accountType + "'s username");
    passLabel.setText(accountType + "'s password");
  }

  Signin() {
    typeLable = new JLabel();
    typeLable.setText("Welcome !");

    String accountTypes[] = { accountType, "Agent", "Vendor" };
    dropMenu = new JComboBox(accountTypes);
    dropMenu.addItemListener(this);

    userLabel = new JLabel();
    userMsg = new JLabel();
    userFeild = new JTextField(15);

    passLabel = new JLabel();
    passMsg = new JLabel();
    passField = new JPasswordField(15);
    updateState();

    signinB = new JButton("Sign in");
    back = new JButton("Back");
    loginPanel = new JPanel();
    loginPanel.add(typeLable);
    loginPanel.add(dropMenu);
    loginPanel.add(userLabel);
    loginPanel.add(userFeild);
    loginPanel.add(userMsg);
    loginPanel.add(passLabel);
    loginPanel.add(passField);
    loginPanel.add(passMsg);
    loginPanel.add(signinB);
    loginPanel.add(back);

    add(loginPanel, BorderLayout.CENTER);
    signinB.addActionListener(this);
    back.addActionListener(this);
    setTitle("Planer");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == signinB) {
      String userValue = userFeild.getText();
      String passValue = passField.getText();
      Profile loginAuthenticate = new Profile();

      if (loginAuthenticate.authenticate(userValue, passValue, accountType)) {
        Menu page = new Menu();
        page.setVisible(true);
        setVisible(false);
      } else {
        userFeild.setText("");
        passField.setText("");
      }
    }
    if (ae.getSource() == back) {
      Boot page = new Boot();
      page.setVisible(true);
      setVisible(false);
    }
  }

  public void itemStateChanged(ItemEvent e) {
    if (e.getSource() == dropMenu) {
      accountType = (String) dropMenu.getSelectedItem();
      updateState();
    }
  }
}
