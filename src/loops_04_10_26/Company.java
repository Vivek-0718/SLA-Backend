package loops_04_10_26;

public class Company {
    private final int tax = 10;
    private static int emp_count = 5;
    private String name;
    private double salary;

    public Company(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void viewSalary() {
        if (this.salary > 50000) {
            System.out.println(this.name + " - " + this.salary + " - " + "High Salary");
        } else {
            System.out.println(this.name + " - " + this.salary + " - " + "Normal Salary");

        }
    }

    public static void main(String[] args) {
        String[] names = {"Arun", "Priya", "Karthik", "Divya", "Suresh"};
        double[] salaries = {45000, 62000, 50000, 75000, 30000};
        for (int i = 0; i < emp_count; i++) {
            Company emp = new Company(names[i], salaries[i]);
            emp.viewSalary();
        }
    }
}
