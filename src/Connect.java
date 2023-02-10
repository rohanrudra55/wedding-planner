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
    static Statement state;

    public Connect() {
        try {
            String query1 = "USE weddingsys;";
            String query2 = "DROP TABLE IF EXISTS `signupdetails`;";
            String query3 = "CREATE TABLE `signupdetails` ( `name` varchar(20) DEFAULT NULL,`mobile` varchar(10) DEFAULT NULL,`user` varchar(20) DEFAULT NULL,`pswd` varchar(25) DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/weddingsys?createDatabaseIfNotExist=true", root, password);
            state = con.createStatement();
            state.executeUpdate(query1);
            state.executeUpdate(query2);
            state.executeUpdate(query3);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void setRoot(String input) {
        root = input;
    }

    public static void setPassword(String input) {
        password = input;
    }
}
