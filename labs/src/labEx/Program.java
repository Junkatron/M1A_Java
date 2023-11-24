package labEx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1, 100, "Jas");
		try {
			acc1.withdraw(50);
			acc1.getDetails();
			acc1.withdraw(60);
			acc1.getDetails();
		} catch (IllegalArgumentException e) {
			System.out.println("Withdrawal not completed. You do not have enough money.");
		}
		finally {
			// Always close account regardless of success or error.
			acc1.close();
		}
		
		// To test this:
		// * Execute programme at least once so the file is created.
		// * Set the file to Read Only using Windows File Explorer.
		// * Rerun programme and it should now fail.
		try {
			log("This is a test log message.");
		} catch (IOException e) {
			System.out.println("*** Failed to wrie log message ***");
			e.printStackTrace();
		}

	}
	
	private static void log(String msg)
		throws IOException
	{
		// The log file ends up in the "labs" folder the the current workspace.
		File file = new File("log.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(msg + "\r\n");
		br.close();
		fr.close();
	}
}
