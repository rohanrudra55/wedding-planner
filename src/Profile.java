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
import javax.swing.*;

public class Profile {

    private static String username;
    private static String name;
    private static String mobile;
    private static String event;
    private static String password;
    private static String account;

    Profile() {
        username = "admin";
        password = "admin";
        account = "admin";
    }

    public static void setAccount(String account) {
        this.account = account;
        System.out.println("in profile");
    }

    public void setEvent(String event) {
        this.event = event;
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

    public void updateDB() {

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else {
                Conn c = new Conn();
                String query = "insert into signupdetails values('" + name + "','" + mobile + "','" + username + "','" + password + "')";
                c.s.executeUpdate(query);
                System.out.println("Updated");
            }

        } catch (Exception e) {
            System.out.println(e);

        }
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
