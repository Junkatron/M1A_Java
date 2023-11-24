package labEx;

public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1, 100, "Jas");
		try {
			acc1.withdraw(50);
			acc1.getDetails();
			acc1.withdraw(60);
			acc1.getDetails();
		} catch (Exception e) {
			System.out.println("Withdrawal not completed. You do not have enough money.");
		}
		finally {
			// Always close account regardless of success or error.
			acc1.close();
		}
	}
}
