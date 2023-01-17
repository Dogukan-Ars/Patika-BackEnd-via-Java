package java101;

import java.util.Scanner;

public class SortingNumbers {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		// Sorting numbers from largest to smallest
		
		/*
		  
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println("num1 > num2 > num3 --->  " + num1 + " > " + num2 + " > " + num3);
			} else {
				System.out.println("num1 > num3 > num2 --->  " + num1 + " > " + num3 + " > " + num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println("num2 > num1 > num3 --->  " + num2 + " > " + num1 + " > " + num3);
			} else {
				System.out.println("num2 > num3 > num1 --->  " + num2 + " > " + num3 + " > " + num1);
			}
		}else {
			if (num1 > num2) {
				System.out.println("num3 > num1 > num2 --->  " + num3 + " > " + num1 + " > " + num2);
			}else {
				System.out.println("num3 > num2 > num1 --->  " + num3 + " > " + num2 + " > " + num1);
			}			
		} 
		
		*/
		
		// Sorting numbers from smallest to largest
		
		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.println("num1 < num2 < num3 --->  " + num1 + " < " + num2 + " < " + num3);
			} else {
				System.out.println("num1 < num3 < num2 --->  " + num1 + " < " + num3 + " < " + num2);
			}
		} else if (num2 < num1 && num2 < num3) {
			if (num1 < num3) {
				System.out.println("num2 < num1 < num3 --->  " + num2 + " < " + num1 + " < " + num3);
			} else {
				System.out.println("num2 < num3 < num1 --->  " + num2 + " < " + num3 + " < " + num1);
			}
		}else {
			if (num1 < num2) {
				System.out.println("num3 < num1 < num2 --->  " + num3 + " < " + num1 + " < " + num2);
			}else {
				System.out.println("num3 < num2 < num1 --->  " + num3 + " < " + num2 + " < " + num1);
			}			
		}
		
	}

}
