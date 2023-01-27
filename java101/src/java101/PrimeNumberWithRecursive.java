package java101;

import java.util.Scanner;

public class PrimeNumberWithRecursive {

	static boolean isPrime(int n, int a) {
		
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == a) {
			return true;
		}
		if (n % a == 0) 
			return false;
		return isPrime(n,a+1);
	} 
	
	static int a = 2;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = scan.nextInt();
		if (isPrime(n,a))
			System.out.println("Number " + n + ", is Prime Number");
		else
			System.out.println("Number " + n + ", is not Prime Number");
	}

}
