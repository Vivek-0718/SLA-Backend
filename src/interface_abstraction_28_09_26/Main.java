package interface_abstraction_28_09_26;

public class Main {

	public static void main(String[] args) {
//		1
		Payment p1 = new Upi();
		Payment p2 = new CreditCard();
		p1.payment();
		p2.payment();
		System.out.println();

//		2
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		v1.start();
		v1.stop();
		v2.start();
		v2.stop();
		System.out.println();

//		3
		BankAccount a1 = new BankAccount("ADS123", "John", 50000.0);
		a1.deposit(50000);
		a1.withdraw(10000);
		System.out.println(a1.getBalance());
		System.out.println();

//		4
		Manager manager = new Manager("Alice", 80000);
		manager.work();
		System.out.println("Bonus: " + manager.calculateBonus());
		System.out.println();

//		5
		CollegeStudent s1 = new CollegeStudent("John", 123, "abc", "qwe");
		s1.showDetails();
	}

}
