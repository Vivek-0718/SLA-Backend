package loops_04_10_26;

public class SalaryCalculation {
    private final int pf = 12;
    private double salary;

    public SalaryCalculation(double salary) {
        this.salary = salary;
    }

    public double getPfAmount() {
        return this.salary*pf/100;
    }

    public static void main(String[] args) {
        SalaryCalculation e1 = new SalaryCalculation(30000.0);
        System.out.println(e1.getPfAmount());
    }
}
