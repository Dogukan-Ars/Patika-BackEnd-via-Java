package java101;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		// If - Else
		
		
//		int a = 10, b = 20, c=12;
		
//		if ((a<b) && (a<c)) {
//			System.out.println("Smallest number is A");
//		}else if ((b<a) && (b<c)) {
//			System.out.println("Smallest number is B");
//		}else {
//			System.out.println("Smallest number is C");
//		}
		
//		if (a<b) {
//			if (a<c) {
//				if (a == 10) {
//					System.out.println("Number A is 10");
//				}
//				System.out.println("Smallest number is A");
//			}else {
//				System.out.println("Number A is greater than number C");
//			}
//		}
		
		
		
		
//		boolean compare = a == b;
//		String str = compare ? "Equal" : "Not equal!";
//		System.out.println(str);
		
//		if (compare) {
//			a = 50;
//			System.out.println("Number a : " + a);
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not equal!");
//		}
//		
//		System.out.println("Program finished!");
		
			
		
//		if (day == 1) {
//			System.out.println("Today is Monday");
//		}else if (day == 2) {
//			System.out.println("Today is Tuesday");
//		}else if (day == 3) {
//			System.out.println("Today is Wednesday");
//		}else if (day == 4) {
//			System.out.println("Today is Thursday");
//		}else if (day == 5) {
//			System.out.println("Today is Friday");
//		}else if (day == 6) {
//			System.out.println("Today is Saturday");
//		}else if (day == 7) {
//			System.out.println("Today is Sunday");
//		}else {
//			System.out.println("Wrong enter!!! There is no day name with your number.");
//		}
		
		// Switch - Case
		
		int day;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number between 1 to 7");
		day = input.nextInt();
		
		switch (day) {
		case 1: 
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Wrong enter!!! There is no day name with your number.");
		}
		

	}

}
