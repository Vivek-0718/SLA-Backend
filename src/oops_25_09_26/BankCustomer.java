package oops_25_09_26;

public class BankCustomer {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(123,10000.00);
		System.out.println(a1.getAccountNumber());
		a1.deposit(2000);
		a1.withdraw(1000);;
		System.out.println(a1.getBalance());
	}

}
