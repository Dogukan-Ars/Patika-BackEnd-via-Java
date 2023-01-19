package java101;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// We use for loop if we know how many times we want to run a code.
		
		/*for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}*/
		
		Scanner input = new Scanner(System.in);
		int number;
		// with For Loop
		/*for(boolean run = true; run;) {
			System.out.print("Enter number : ");
			number = input.nextInt();
			if (number<0) {
				run = false;
			}
		}*/
		
		
		// with While Loop
		/* 
		System.out.print("Enter number : ");
		number = input.nextInt();
		while (number > 0) {
			System.out.print("Enter number : ");
			number = input.nextInt();
		}*/
		
		
		// with Do-While Loop
		do {
			System.out.print("Enter number : ");
			number = input.nextInt();
		} while (number > 0);
		
	}

}
