package interface_abstraction_28_09_26;

public abstract class Employee {
	protected String name;
	protected double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public abstract void work();
}

interface Bonus {
	double calculateBonus();
}

class Manager extends Employee implements Bonus {


	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void work() {
		System.out.println("managing people");
	}

	@Override
	public double calculateBonus() {
		return salary * 0.10 + salary;
	}
}