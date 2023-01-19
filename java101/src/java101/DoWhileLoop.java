package java101;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// Do-While is similar to the While loop. They are the same but different for one exception, Do-while always runs for a time if the condition is proper. But the code cannot run in a while loop if the condition is false.
		
		int pass;
		boolean askPassword = true;
		
		Scanner input = new Scanner(System.in);
				
		do {
			System.out.print("Enter your password: ");
			pass = input.nextInt();
			if (pass == 123) {
				System.out.println("Correct");
				askPassword = false;
			}else {
				System.out.println("Incorrect!!!");
			}
		} while (askPassword);
	}

}
