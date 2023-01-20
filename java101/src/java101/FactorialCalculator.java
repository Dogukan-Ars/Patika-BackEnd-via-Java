package java101;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		/* 
		// n! = 1 * 2 * 3 * 4 * ... * n
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Factorial Number : ");
		int n = scan.nextInt();
		int total = 1;
		
		for (int i = 1; i <= n; i++) {
			total = total * i;
		}
		System.out.println(n + "! = " + total);
		*/
		
		int n, nFact = 1, r, rFact = 1, fact = 1;
		double c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the main combination element : ");
		n = scan.nextInt();
		System.out.println("Enter the second combination element : ");
		r = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {			
			nFact = nFact * i;
		}
		System.out.println(nFact);
		for (int j = 1; j <= r; j++) {
			rFact = rFact * j;
		}
		System.out.println(rFact);		
		for (int k = 1; k <= (n-r); k++) {
			fact = fact * k;
		}
		c = nFact / (rFact * (fact)); // Original combination formula is  --->  C(n,r) = n! / (r! * (n-r)!)
		System.out.println(c);
	}

}
