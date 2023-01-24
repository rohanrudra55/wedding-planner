import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  

class NewPage extends JFrame  
{  
    NewPage()  
    {
        setVisible(true);
        JLabel wel_label = new JLabel("Welcome");  
        JPanel newPanel = new JPanel();  
        newPanel.add(wel_label);
        setDefaultCloseOperation(javax.swing.  
        WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Welcome");  
        setSize(400, 200);  
    }  
}  