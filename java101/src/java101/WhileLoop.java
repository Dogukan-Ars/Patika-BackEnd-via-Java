package java101;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int password;
		boolean isPasswordCorrect = false;
		
		Scanner input = new Scanner(System.in);
		
		
		while (!isPasswordCorrect) {
			System.out.println("Enter a password : ");
			password = input.nextInt();
			if (password == 123) {
				System.out.println("Correct");
				isPasswordCorrect = true;
			}else {
				System.out.println("Incorrect");
			}
		}
		
				
		/* Fundamental of While loop
		  
		int i = 1, k;
		System.out.println("Program began");
		while(i<=5) {
			System.out.println(i);
			k = 1;
			while (k<=10) {
				System.out.print(k + ",");
				k++;
			}
			System.out.println();
			i++;
		}
		System.out.println("Program ended");
		*/

		
		/* Finding mid point
		
		int left = 100, right = 200;
		
		while (++left < --right);
		System.out.println(left);
		*/
		
	}

}
