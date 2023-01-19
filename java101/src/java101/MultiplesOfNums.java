package java101;

import java.util.Scanner;

public class MultiplesOfNums {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the limit number : ");
		num = scan.nextInt();
		
		System.out.println("**For multiples of four**");
		for (int i = 1; i <= num; i*=4) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		System.out.println("**For multiples of four**");
		for (int j = 1; j <= num; j*=5) {
			System.out.print(j + ", ");
		}
		System.out.println();
		
		System.out.println("***Same for both numbers***");
		for (int i = 1, j = 1; i <= num && j <= num; i*=4, j*=5) {
			System.out.println("Multiples of four : " + i + " --- Multiples of five : " + j);
		}
	}

}
