package interface_abstraction_28_09_26;

public class BankAccount {
	String accountNumber;
	protected String accountHolderName;
	private double balance;

	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0)
			balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Invalid or insufficient funds.");
		}
	}

	public double getBalance() {
		return balance;
	}

	String getAccountNumber() {
		return accountNumber;
	}
}
