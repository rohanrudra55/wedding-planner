import java.sql.*;
import java.util.Properties;
class test {
    public static void main(String[] args) {
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;

        try {
            String url1 = "jdbc:mysql://localhost:3306/aavikme";
            String user = "root";
            String password = "aa";

            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null)
                System.out.println("Connected to the database test1");

            String url2 = "jdbc:mysql://localhost:3306/aavikme?user=root&password=aa";
            conn2 = DriverManager.getConnection(url2);
            if (conn2 != null) {
                System.out.println("Connected to the database test2");
            }

            String url3 = "jdbc:mysql://localhost:3306/aavikme";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "aa");

            conn3 = DriverManager.getConnection(url3, info);
            if (conn3 != null) {
                System.out.println("Connected to the database test3");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}