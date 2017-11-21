package newPackage;

public class BankAccount {
	private double balance;
	private String name;
	
	BankAccount(double balance, String name) {
		this.balance = balance;
		this.name = name;
	}
	
	public void Deposit(double amount) {
		if (amount > 0) {
			balance += Math.abs(amount);
		}
	}
	
	public void Withdraw(double amount) {
		if (amount != 0 && balance - amount > 0) {
			balance -= Math.abs(amount);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
}
