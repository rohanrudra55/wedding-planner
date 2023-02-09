// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;
// public class Create_DB
// {

//     static final String DB_URL = "jdbc:mysql://localhost:3306/";
//     static final String USER ="root";
//     static final String PASS = "password";

//     public static void main(String[]args){
//         try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//         Statement stmt = conn.createStatement();)
//         {
//             String sql = "CREATR DATABASE ADA";
//             stmt.executeUpdate(sql);
//             System.out.println("Database created successfullt...");

//         }catch(SQLException e){
//             e.printStackTrace();
//         }
//     }
// }

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;

// import org.apache.tomcat.dbcp.dbcp.ConnectionFactory;
// import org.apache.tomcat.dbcp.dbcp.DriverManagerConnectionFactory;
// import org.apache.tomcat.dbcp.dbcp.PoolableConnectionFactory;
// import org.apache.tomcat.dbcp.dbcp.PoolingDriver;
// import org.apache.tomcat.dbcp.pool.impl.GenericObjectPool;

// public class DatabaseConnector {
//     public static String DB_URI = "jdbc:mysql://localhost/dbname";
//     public static String DB_USER = "test";
//     public static String DB_PASS = "password";

//     // Singleton instance
//     protected static DatabaseConnector _instance;

//     protected String _uri;
//     protected String _username;
//     protected String _password;

//     /**
//      * Singleton, so no public constructor
//      */
//     protected DatabaseConnector(String uri, String username, String password) {
//         _uri = uri;
//         _username = username;
//         _password = password;

//         GenericObjectPool connectionPool = new GenericObjectPool(null);
//         ConnectionFactory connectionFactory = new DriverManagerConnectionFactory(
//             _uri, _username, _password);
//         PoolableConnectionFactory poolableConnectionFactory =
//             new PoolableConnectionFactory(connectionFactory, connectionPool,
//                                             null, null, false, true);
//         PoolingDriver driver = new PoolingDriver();
//         driver.registerPool("test", connectionPool);
//     }

//     /**
//      * Returns the singleton instance
//      */
//     public static DatabaseConnector getInstance() {
//         if (_instance == null) {
//             _instance = new DatabaseConnector(DB_URI, DB_USER, DB_PASS);
//         }
//         return _instance;
//     }

//     /**
//      * Returns a connection to the database
//      */
//     public Connection getConnection() {
//         Connection con = null;
//         try {
//             con = DriverManager.getConnection("jdbc:apache:commons:dbcp:test");
//         } catch (SQLException e) {
//             throw new RuntimeException(e);
//         }
//         return con;
//     }
// }

// import java.sql.*;

// class Create_DB {
//     public static void main(String args[]) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con = DriverManager.getConnection(
//                     "jdbc:mysql://localhost:3306/dbl", "root", "abc");
//             // here sonoo is database name, root is username and password
//             Statement stmt = con.createStatement();
//             ResultSet rs = stmt.executeQuery("select * from emp");
//             while (rs.next())
//                 System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//             con.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }




// import java.sql.*;

// public class Create_DB {
//     private String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
//     private String MYSQL_URL = "jdbc:mysql://localhost:3306/test";

//     private Connection con;
//     private Statement st;
//     private ResultSet rs;

//     public Create_DB() {

//         try {
//             Class.forName(MYSQL_DRIVER);
//             System.out.println("Class Loaded....");
//             con = DriverManager.getConnection(MYSQL_URL, "", "");
//             System.out.println("Connected to the database....");
//             st = con.createStatement();
//             int c = st.executeUpdate("CREATE TABLE Accounts (Name VARCHAR(30))");
//             System.out.println("Table have been created.");
//             System.out.println(c + " Row(s) have been affected");
//             con.close();

//         } catch (ClassNotFoundException ex) {
//             System.out.println("ClassNotFoundException:\n" + ex.toString());
//             ex.printStackTrace();

//         } catch (SQLException ex) {
//             System.out.println("SQLException:\n" + ex.toString());
//             ex.printStackTrace();
//         }
//     }

//     public static void main(String... args) {
//         new Create_DB();
//     }
// }


// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;
// import java.sql.SQLException;
// import java.sql.*;


// public class Create_DB{
//     public static void main(String[]args){
//         //1)creating connection
//         Connection con = DriverManager.getConnection("jdbc://mysql://localhost:3306/dbl", "root", "abc");

//         //2)Create statement 
//         Statement stmt = con.createStatement();

//         String s = "INSERT INTO STUDENT VALUES(103,'ADITI')";

//         //3)Execute query
//         stmt.execute(s);

//         //4)close connection
//         con.close();
//         System.out.println("Query executed");
//     }
// }


import java.sql.*;
public class Create_DB{
    //constructor
    public Create_DB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wedding_planner_System", "root", "abc");
            Statement stmt = con.createStatement();

            // ResultSet rs = stmt.executeQuery("show tables");
            // while(rs.next())
            // {
            //     System.out.println(rs.getString(1));
            // }
            // con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[]args){
        
        Create_DB ob = new Create_DB();

    }
}