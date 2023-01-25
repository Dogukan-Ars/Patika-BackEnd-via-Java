package java101;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		int a = 0, b = 1, n, f;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = scan.nextInt();
		System.out.print(a + " " + b + " ");
		
		f = 0;
		while (f <= n) {			
			f = a + b;
			if (f > n)
				break;			
			System.out.print(f + " ");
			a = b;
			b = f;
		}

	}

}
