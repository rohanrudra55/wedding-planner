import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class database{
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer?allowPublicKeyRetrieval=true&useSSL=false", "root", "7029925877");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("show tables");
            while(rs.next())
            {
                System.out.println(rs.getString(0));
            }
            con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}