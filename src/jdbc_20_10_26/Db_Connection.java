package jdbc_20_10_26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_Connection {
    public Connection createConnection() {
        String url = "jdbc:mysql://localhost:3306/emp";
        String userName = "root";
        String pass = "1234";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, userName, pass);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
