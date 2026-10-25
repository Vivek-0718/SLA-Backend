package jdbs_20_10_26;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeRunner {
    public static void afterLogin() throws SQLException {
        Actions emp = new Actions();
        Db_Connection newConnect = new Db_Connection();
        Connection con = newConnect.createConnection();
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("**************** Employee Management ****************");
            System.out.println("0 - Logout");
            System.out.println("1 - Insert new employee");
            System.out.println("2 - Select all employees");
            System.out.println("3 - Select employee based on id");
            System.out.println("4 - Update employee based on id");
            System.out.println("5 - Delete employee based on id");
            System.out.print("Enter Action:");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    emp.insertValues();
                    break;
                case 2:
                    emp.selectAllStatement();
                    break;
                case 3:
                    emp.idBasedSelect();
                    break;
                case 4:
                    emp.idBasedUpdate();
                    break;
                case 5:
                    emp.idBasedDelete();
                    break;
                case 0:
                    con.close();
                    System.out.println("Successfully logged out");
                    break;
                default:
                    System.out.println("Enter a valid action");
            }
        } while (choice != 0);
    }
}
