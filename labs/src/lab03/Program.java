package lab03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aNumber = getInt("Enter an Integer: ");
		String text = getString("Enter a String: ");
		
		System.out.println("Your entered: " + aNumber + " AND " + text);
	}
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
			return s.nextInt();
	}

	public static String getString(String prompt ) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
			return s.nextLine();
	}
}
