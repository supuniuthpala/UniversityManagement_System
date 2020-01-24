package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DatabaseConnection {
    private Connection connection;
    private static DatabaseConnection dBConnection;
    private DatabaseConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/University", "root", "1234");
    }
    public static DatabaseConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dBConnection==null){
            dBConnection=new DatabaseConnection();
        }
        return dBConnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
