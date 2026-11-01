package core_java_01_11_26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "1234";

        String sql = "INSERT INTO student (id, name, marks) VALUES (?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, 101);
            ps.setString(2, "Arun");
            ps.setDouble(3, 87.5);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
