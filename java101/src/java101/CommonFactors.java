package java101;

import java.util.Iterator;
import java.util.Scanner;

public class CommonFactors {

	public static void main(String[] args) {
		// EBOB = Greatest common divisor
		// EKOK = Least common multiple
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = scan.nextInt();
		
		System.out.println("Enter second number: ");
		int n2 = scan.nextInt();
		int gcd = 1;
		
		int i = n1;
		while (i >= 1) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
				System.out.println(gcd);
				break;
			}
			i--;
		}
		int k = 1;
		while (k <= (n1 * n2)) {
			if (k % n1 == 0 && k % n2 == 0) {
				System.out.println(k);
				break;
			}
			k++;
		}
		System.out.println((n1 * n2) / gcd);
		
		/*
		// with For Loop
		
		for (int k = n1; k >= 1; k--) { // it cast 14 times for numbers of 18 and 24			
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
				System.out.println(gcd);
				break;
			}
		} 
		
		for (int i = 1; i <= (n1 * n2); i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				System.out.println(i);
				break;
			}
		}		
		
		System.out.println((n1*n2) / gcd);
		*/
		
		
		/*// Greatest common divisor example
		int gcd = 1;
		
		if (n1 > n2) { // it cast 18 times for numbers of 18 and 24
			for (int i = 1; i <= n2; i++) {
				System.out.println(i);
				if (n1 % i == 0 && n2 % i == 0) {
					System.out.println(i);
					gcd = i;
				}
			}
		} else {
			for (int i = 1; i <= n1; i++) {
				if (n1 % i == 0 && n2 % i == 0) {
					System.out.println(i);
					gcd = i;
				}
			}
		}		
		System.out.println("**************************");
		for (int k = n1; k >= 1; k--) { // it cast 14 times for numbers of 18 and 24
			System.out.println(k);
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
				System.out.println(gcd);
				break;
			}
		} 
		*/
	}

}
