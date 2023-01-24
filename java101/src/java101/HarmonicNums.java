package java101;

import java.util.Scanner;

public class HarmonicNums {

	public static void main(String[] args) {
		int n;
		double a = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			a += (1.0/i); // we need to change one of the variable to double. We can change '1' to '1.0', or 'int i' to 'double i'
		}
		// 1. Loop -> i = 1, a = 0 + (1/1) == 1
		// 2. Loop -> i = 2, a = 1 + (1/2) == 1.5
		// 3. Loop -> i = 3, a = 0 + (1/3) == 1.83
		System.out.println(a);

	}

}
