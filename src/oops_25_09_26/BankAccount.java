package oops_25_09_26;

public class BankAccount {
	private int accountNumber;
	private double balance;

	public BankAccount(int accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
}
