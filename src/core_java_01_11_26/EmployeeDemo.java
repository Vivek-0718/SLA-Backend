package core_java_01_11_26;

public class EmployeeDemo {
    String name;
    double baseSalary;

    EmployeeDemo(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }

    void showDetails() {
        System.out.println("Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class Developer extends EmployeeDemo {
    double bonus;

    Developer(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void showDetails() {
        System.out.println("Developer: " + name + ", Salary: " + calculateSalary());
    }
}

class Trainer extends EmployeeDemo {
    double allowance;

    Trainer(String name, double baseSalary, double allowance) {
        super(name, baseSalary);
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return baseSalary + allowance;
    }

    @Override
    void showDetails() {
        System.out.println("Trainer: " + name + ", Salary: " + calculateSalary());
    }
}

class OfficeDemo{
    public static void main(String[] args) {
        EmployeeDemo e1 = new EmployeeDemo("Ravi", 30000);
        EmployeeDemo e2 = new Developer("Anita", 50000, 10000);
        EmployeeDemo e3 = new Trainer("Karthik", 40000, 5000);

        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
    }
}