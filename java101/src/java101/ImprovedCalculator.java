package java101;

import java.util.Iterator;
import java.util.Scanner;

public class ImprovedCalculator {
	
	static int sum(int a, int b) {
		int result = a + b;
		System.out.println("Addition Result : " + result);
		return result;
	}
	
	static int minus(int a, int b) {
		int result = a - b;
		System.out.println("Substraction Result : " + result);
		return result;
	}
	
	static int multi(int a, int b) {
		int result = a * b;
		System.out.println("Multiplication Result : " + result);
		return result;
	}
	
	static int divide(int a, int b) {
		if (b == 0) {
			return 0;
		}
		int result = a / b;
		System.out.println("Divide Result : " + result);
		return result;
	}
	
	static int exp(int a, int b) {
		int result = 1;
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		
		return result;
	}
	
	static int mod(int a, int b) {		
		return a % b;
	}
	
	static void rect(int a, int b) {
		System.out.println("Perimeter : " + (2*(a + b)));
		System.out.println("Area : " + (a * b));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		
		String menu = "1- Addition Process\n"
				+ "2- Substraction Process\n"
				+ "3- Multiplication Process\n"
				+ "4- Divide Process\n"
				+ "5- Exponential Process\n"
				+ "6- Mode Process\n"
				+ "7- Rectangle Area and Perimeter Calculation\n"
				+ "8- Quit";
		System.out.println(menu);
		while (true) {
			
			System.out.print("Select a process : ");
			select = scan.nextInt();
			if (select == 0) {
				break;
			}
			System.out.print("Enter the first number : ");
			int a = scan.nextInt();
			System.out.print("Enter the second number : ");
			int b = scan.nextInt();
			
			switch (select) {
			case 1:
				sum(a,b);
				break;
			case 2:
				minus(a,b);
				break;
			case 3:
				multi(a,b);
				break;
			case 4:
				if (divide(a, b) == 0) 
					System.out.println("Second number must be different from ZERO!!!");				
				break;
			case 5:
				System.out.println("Exponential Result : " + exp(a,b));
				break;
			case 6:
				System.out.println("Mode Result : " + mod(a,b));
				break;
			case 7:
				rect(a,b);
				break;
			default:
				System.out.println("Invalid enterance!!!");
			}
		}
		System.out.println("Goodbye :)");
	}
	

}
