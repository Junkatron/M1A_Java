package lab06;

import java.util.Scanner;

public class Lab6 {
	public void part1() {
		grades();
	}

	public void grades() {
		int numStudents = 5;
		String[] names = new String[numStudents];
		int[] marks = new int[numStudents];
		
		for (int i = 0; i < marks.length; i++) {
			String nameText = String.format("Enter name for student %d: ", i);
			names[i] = getString(nameText);
			
			String markText = String.format("Enter a grade mark between 1..100 for student %d: ", i);
			while (true)
			{
				String inputMark = getString(markText);
				Integer mark = tryParseInt(inputMark);
				// Check input is valid.
				if (mark == null) {
					System.out.println("Error: Value must be an integer. Try again.");
				} else if (!(mark > 0 && mark <= 100)) {
					System.out.println("Error: marks must be between 1..100. Try again.");
				} else {
					marks[i] = mark;
					break;
				}
			}
		}
		
		for (int i = 0; i < marks.length; i++) {
			String resultText = "Grade for student %d is: %s\n";
			// Get result
			if (marks[i] >= 71) {
				System.out.printf(resultText, i, "Distinction");
			}
			else if (marks[i] >= 61 && marks[i] <= 70) {
				System.out.printf(resultText, i, "Merit");
			}
			else if (marks[i] >= 50 && marks[i] <= 60) {
				System.out.printf(resultText, i, "Pass");
			}
			else if (marks[i] >= 61 && marks[i] <= 70) {
				System.out.printf(resultText, i, "Merit");
			}
			else {
				System.out.printf(resultText, i, "Fail");
			}
		}
	}
	
	// Copied this from the interweb
	public Integer tryParseInt(String text) {
		try {
			return Integer.parseInt(text);
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	public int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public String getString(String prompt ) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}

}
