package jdbc_20_10_26;

import java.sql.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Actions {
    Db_Connection newConnect = new Db_Connection();
    Connection con = newConnect.createConnection();

    Scanner scan = new Scanner(System.in);

    public void insertValues() throws SQLException {
        System.out.println("Register new employee");
        String query = """
                INSERT INTO employees(emp_id,emp_name,salary,department) VALUES(?,?,?,?)
                """;
        PreparedStatement ps = con.prepareStatement(query);
        System.out.print("Enter employee id:");
        ps.setInt(1, scan.nextInt());
        scan.nextLine();
        System.out.print("Enter employee name:");
        ps.setString(2, scan.nextLine());
        System.out.print("Enter employee salary:");
        ps.setDouble(3, scan.nextDouble());
        scan.nextLine();
        System.out.print("Enter employee department:");
        ps.setString(4, scan.nextLine());
        int rs = ps.executeUpdate();
        if (rs >= 1) {
            System.out.println("Employee added");
        } else {
            System.out.println("Error");
        }
    }

    public void selectAllStatement() throws SQLException {
        String query = "SELECT * FROM employees";
        Statement st = con.createStatement();
        ResultSet rowsAffected = st.executeQuery(query);
        while (rowsAffected.next()) {
            int empId = rowsAffected.getInt("emp_id");
            String name = rowsAffected.getString("emp_name");
            double salary = rowsAffected.getDouble("salary");
            String department = rowsAffected.getString("department");
            System.out.println(empId + " | " + name + " | " + salary + " | " + department);
        }
    }

    public void idBasedSelect() throws SQLException, NoSuchElementException {
        String query = """
                SELECT * FROM employees WHERE emp_id=?
                """;
        PreparedStatement ps = con.prepareStatement(query);
        System.out.print("Enter employee id:");
        ps.setInt(1, scan.nextInt());
        ResultSet rowsAffected = ps.executeQuery();
        while (rowsAffected.next()) {
            int empId = rowsAffected.getInt("emp_id");
            String name = rowsAffected.getString("emp_name");
            double salary = rowsAffected.getDouble("salary");
            String department = rowsAffected.getString("department");
            System.out.println(empId + " | " + name + " | " + salary + " | " + department);
        }
    }

    public void idBasedUpdate() {
        String query = """
                UPDATE employees SET emp_name=?,salary=?,department=? WHERE emp_id=?
                """;
        try (PreparedStatement ps = con.prepareStatement(query)) {
            System.out.print("Enter ID to update: ");
            int targetId = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Updated Name: ");
            ps.setString(1, scan.nextLine());
            System.out.print("Enter Updated Salary: ");
            ps.setDouble(2, scan.nextDouble());
            scan.nextLine();
            System.out.print("Enter Updated department: ");
            ps.setString(3, scan.nextLine());
            ps.setInt(4, targetId);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                System.out.println("Employee details updated successfully");
            } else {
                System.out.println("Updated failed");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void idBasedDelete() {
        String query = """
                DELETE FROM employees WHERE emp_id=?
                """;
        try (PreparedStatement ps = con.prepareStatement(query)) {
            System.out.print("Enter ID to delete: ");
            ps.setInt(1, scan.nextInt());
            if (ps.executeUpdate() == 1) {
                System.out.println("Employee details deleted successfully");
            } else {
                System.out.println("Delete failed");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
