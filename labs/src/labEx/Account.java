package labEx;

public class Account {
	private int id = 0;
	private double balance = 0;
	String owner = "";
	
	public Account(int id, double balance, String owner) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}
	
	void withdraw(double amount) {
		if (balance - amount < 0) {
			throw new IllegalArgumentException();
		}
		balance -= amount;
	}

	void deposit(double amount) {
		balance += amount;
	}
	
	void close() {
		System.out.printf("Account %d is closed\n", this.id);
	}
	
	void getDetails() {
		System.out.println("Account ID: "+ this.id);
		System.out.println("Balance: " + this.balance);
		System.out.println("Owner:" + this.owner);
	}
}
