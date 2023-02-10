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
import java.sql.*;

public class Profile {

    private static String username;
    private static String name;
    private static String mobile;
    private static String event;
    private static String password;
    private static String account;
    private static int check;
    static Connect db = new Connect();

    Profile() {
        username = "admin";
        password = "admin";
        account = "admin";
    }

    public void resetChecker() {
        check = 0;
    }

    public void setAccount(String account) {
        this.account = account;
        check++;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setName(String name) {
        this.name = name;
        check++;
    }

    public void setPassword(String password) {
        this.password = password;
        check++;
    }

    public void setUsername(String username) {
        this.username = username;
        check++;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
        check++;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void update() {

        try {
            if (check < 4) {
                JOptionPane.showMessageDialog(null, "Empty feild !");
            } else {
                String query = "insert into signupdetails values('" + name + "','" + mobile + "','" + username + "','" + password + "')";
                db.state.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Registered !");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private boolean getDetails(String inputUser) {
        try {

            String query = "SELECT * FROM signupdetails";

            ResultSet rs = db.state.executeQuery(query);
            while (rs.next()) {
                name = rs.getString("name");
                mobile = rs.getString("mobile");
                username = rs.getString("user");
                password = rs.getString("pswd");
                if (check(username, inputUser)) {
                    return true;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return false;
    }

    private boolean check(String input1, String input2) {
        return ((input1.trim().toLowerCase()).equals(input2.trim().toLowerCase()));
    }

    public boolean authenticate(String inputUsername, String inputPassword, String inputAccount) {
        if (getDetails(inputUsername) && check(inputPassword, password) && check(inputAccount, account)) {
            return true;
        } else {
            return false;
        }
    }
}
