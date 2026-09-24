package operators_24_09_26;

public class Salary {
	double salary;
	double increment;
	double total;

	public Salary(double salary, double increment) {
		this.salary = salary;
		this.increment = increment;
	}

	public double calcCTC() {
		double incrementedAmount = this.salary * this.increment / 100;
		total = salary + incrementedAmount;
		return this.total;
	}

	public boolean checkSal() {
		return this.total > 28000 ? true : false;
	}

	public static void main(String[] args) {
		Salary s1 = new Salary(25000, 15);
		System.out.println(s1.calcCTC());
		System.out.println(s1.checkSal());
	}

}
