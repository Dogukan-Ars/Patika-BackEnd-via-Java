package java101;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = scan.nextInt();
		
		int i = 1;
		while (i < n) {
			if (n % i == 0) {
				sum += i;
			}			
			i++;
		}
		
		if (n != sum) {
			System.out.println(n + " isn't a Perfect Number.");
		} else {
			System.out.println(n + " is a Perfect Number!!!");
		}
	}

}
