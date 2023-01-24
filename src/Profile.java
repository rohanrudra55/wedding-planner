import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  

class Profile{
    String username;
    String password;
    String account;

    Profile(){
        username="admin";
        password="admin";
        account="Admin";
    }

    public boolean authenticate(String inputUsername,String inputPassword,String inputAccount){
        if(inputUsername.equals(username) && inputPassword.equals(password) && inputAccount.equals(account)){
            return true;
        }
        else{
            return false;
        }
    }
}