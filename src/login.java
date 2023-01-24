import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  
  
class CreateLoginForm extends JFrame implements ActionListener ,ItemListener 
{  
 
    JButton b1;  
    JPanel loginPanel;  
    JLabel userLabel, passLabel,typeLable; 
    JComboBox dropMenu; 
    final JTextField  userFeild, passField;
    String accountType="Admin";

    public void updateState(){
         userLabel.setText(accountType+"'s username"); 
         passLabel.setText(accountType+"'s password");
    }  
      

    CreateLoginForm()  
    {     
        typeLable = new JLabel();
        typeLable.setText("Welcome !");
          
        String accountTypes[]={accountType,"Agent","Vendor"};
        dropMenu = new JComboBox(accountTypes);
        dropMenu.addItemListener(this);

        userLabel = new JLabel();  
        userFeild = new JTextField(15);    
        
        passLabel = new JLabel();       
        passField = new JPasswordField(15);    
        updateState();
           
        b1 = new JButton("Login"); 
           
        loginPanel = new JPanel();  
        loginPanel.add(typeLable);
        loginPanel.add(dropMenu);
        loginPanel.add(userLabel);    //set username label to panel  
        loginPanel.add(userFeild);   //set text field to panel  
        loginPanel.add(passLabel);    //set password label to panel  
        loginPanel.add(passField);   //set text field to panel  
        loginPanel.add(b1);           //set button to panel  
           
        add(loginPanel, BorderLayout.CENTER);   
        b1.addActionListener(this);     
        b1.addActionListener(this);
        setTitle("LOGIN FORM");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);      
    }  
    
    public void actionPerformed(ActionEvent ae)      
    {  
        String userValue = userFeild.getText();          
        String passValue = passField.getText();        
        Profile loginAuthenticate = new Profile();

        if (loginAuthenticate.authenticate(userValue,passValue,accountType)){  
              
            NewPage page = new NewPage();    
        }  
        else{   
              userFeild.setText("");
              passField.setText("");
        }  
    }
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource() == dropMenu) {
 
            accountType=(String)dropMenu.getSelectedItem();
            updateState();
        }
    }  
}  
//create the main class  
class login  
{   
    public static void main(String arg[])  
    {  
        try  
        {  
            CreateLoginForm form = new CreateLoginForm();  
        }  
        catch(Exception e)  
        {     
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
}  