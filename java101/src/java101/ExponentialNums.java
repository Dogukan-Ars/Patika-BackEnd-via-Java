package java101;

import java.util.Scanner;

public class ExponentialNums {

	public static void main(String[] args) {
		int a,n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base number : ");
		a = scan.nextInt();
		System.out.println("Enter exponent number : ");
		n = scan.nextInt();
		int total = 1;
		
		/* 
		// ********* with While Loop
		
		// 3^4 = 3*3*3*3
		int i = 1;
		while (i <= n) {
			total *= a;
			i++;
		}
		
		System.out.println("Result : " + total);
		*/
		
		// ********** with For Loop
		
		for (int i = 1; i <= n; i++) {
			total *= a;			
		}
		System.out.println("Result : " + total);

	}

}
