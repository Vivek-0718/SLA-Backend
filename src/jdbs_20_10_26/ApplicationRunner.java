package jdbs_20_10_26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ApplicationRunner {

    static void loginCheck() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scan.nextLine();
        System.out.print("Password(emp_id): ");
        int pass = scan.nextInt();

        Db_Connection newConnect = new Db_Connection();
        Connection conn = newConnect.createConnection();
        String query = """
                SELECT emp_name,emp_id FROM employees WHERE emp_id=?
                """;
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, pass);
            ResultSet rs = ps.executeQuery();
            if(!rs.next()){
                System.out.println("User not found. Please register");
            }
            while (rs.next()) {
                int emp_id = rs.getInt("emp_id");
                String emp_name = rs.getString("emp_name");
                if (username.equals(emp_name) && pass == emp_id) {
                    EmployeeRunner.afterLogin();
                } else{
                    System.out.println("User not found. Please register");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void main() throws SQLException {
        Scanner scan = new Scanner(System.in);
        Actions emp = new Actions();
        int choice = 0;
        do {
            System.out.println("**************** Employee Management ****************");
            System.out.println("0 - Quit Application");
            System.out.println("1 - Register");
            System.out.println("2 - Login");
            System.out.print("Enter action: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    emp.insertValues();
                    break;
                case 2:
                    loginCheck();
                    break;
                case 0:
                    System.out.println("Thank you");
                    break;
            }
        } while (choice != 0);
    }
}
