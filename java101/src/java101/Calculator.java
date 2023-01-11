package java101;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double number1, number2;
		int select;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		number1 = input.nextDouble();
		System.out.print("Enter Number 2: ");
		number2 = input.nextDouble();
		
		System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		System.out.print("Selection: ");
		
		select = input.nextInt();		
		
		switch (select) {
		case 1:
			System.out.println("Addition : " + (number1 + number2));
			break;
		case 2:
			System.out.println("Subtraction : " + (number1 - number2));
			break;
		case 3:
			System.out.println("Multiplication : " + (number1 * number2));
			break;
		case 4:
			if (number2 != 0) {
				System.out.println("Division : " + (number1 / number2));
			} else {
				System.out.println("Entered number can not divide to 0(zero)!!!" );
			}
			break;
		default:
			System.out.println("Wrong input, please check your selection!!!");
		}
		
		// If-else Version
		
//		if (select == 1) {
//			System.out.println("Addition : " + (number1 + number2));
//		} else if (select == 2) {
//			System.out.println("Subtraction : " + (number1 - number2));
//		} else if (select == 3) {
//			System.out.println("Multiplication : " + (number1 * number2));
//		} else if (select == 4) {
//			if (number2 != 0) {
//				System.out.println("Division : " + (number1 / number2));
//			} else {
//				System.out.println("Entered number can not divide to 0(zero)!!!");
//			}			
//		} else {
//			System.out.println("Wrong input, please check your selection!!!");
//		}
	}

}
