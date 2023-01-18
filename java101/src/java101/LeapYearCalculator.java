package java101;

import java.util.Scanner;

public class LeapYearCalculator {

	public static void main(String[] args) {
		int year;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year :");
		year = input.nextInt();
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("This is a leap year");			
		} else {
			System.out.println("This is not a leap year");
		} 

	}

}
