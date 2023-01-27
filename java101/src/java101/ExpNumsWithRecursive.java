package java101;

import java.util.Scanner;

public class ExpNumsWithRecursive {

	static int exp(int a, int b) {
		 if (a == 1 || b == 0) {	          
	            return 1;
	        }
	        return a * exp(a, b-1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the base number : ");
		int a = scan.nextInt();
		System.out.print("Enter the exponential number : ");
		int b = scan.nextInt();
		
		System.out.println(exp(a,b));
	}

}
