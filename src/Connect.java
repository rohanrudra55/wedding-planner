/*
 * The MIT License
 *
 * Copyright 2023 ADITI MANDAL.
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
 * @author ADITI MANDAL
 */
import java.sql.*;

public class Connect {

    private static String root;
    private static String password;

    Connection con;
    Statement state;

    public Connect() {
        try {
            String query = "CREATE DATABASE weddingsys;\n"
                    + "USE weddingsys;\n"
                    + "DROP TABLE IF EXISTS `signupdetails`;\n"
                    + "CREATE TABLE `signupdetails` (\n"
                    + "  `name` varchar(20) DEFAULT NULL,\n"
                    + "  `mobile` varchar(10) DEFAULT NULL,\n"
                    + "  `user` varchar(20) DEFAULT NULL,\n"
                    + "  `pswd` varchar(25) DEFAULT NULL\n"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;\n" 
                    + "LOCK TABLES `signupdetails` WRITE;\n"
                    + "INSERT INTO `signupdetails` VALUES ('aditi','1234','aditi','1234');\n"
                    + "UNLOCK TABLES;";

//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///weddingsys?createDatabaseIfNotExist=true", root, password);
            state = con.createStatement();
            state.executeQuery(query);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setRoot(String input) {
        root = input;
    }

    public void setPassword(String input) {
        password = input;
    }
}
