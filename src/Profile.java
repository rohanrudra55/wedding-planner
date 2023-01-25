import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  
import java.util.*;

class Profile{
    private String username;
    private String name;
    private String mobile;
    private String event;
    private String password;
    private String account;

    Profile(){
        username = "admin";
        password = "admin";
        account = "admin";
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    private boolean check(String input1, String input2) {
        return ((input1.trim().toLowerCase()).equals(input2.trim().toLowerCase()));
    }
    public boolean authenticate(String inputUsername,String inputPassword,String inputAccount){
        if (check(inputPassword, password) && check(inputAccount, account) && check(inputUsername, username)) {
            System.out.println("LOGGED IN");
            return true;
        }
        else{
            return false;
        }
    }
}