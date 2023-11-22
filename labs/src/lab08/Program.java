package lab08;

public class Program {

	public static void main(String[] args) {
		Account account1 = new Account(1, "Jas", 0);
		account1.Deposit(100);
		account1.Withdraw(50);
		account1.getDetails();
	}

}
