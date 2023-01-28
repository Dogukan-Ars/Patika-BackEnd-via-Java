package java101;

import java.util.Scanner;

public class PatternPracticeWithRecursive {

	static void pattern(int n) {
		System.out.println(n);
		if (n <= 0)
			return;		
		pattern(n-5);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		
		pattern(n);

	}

}
