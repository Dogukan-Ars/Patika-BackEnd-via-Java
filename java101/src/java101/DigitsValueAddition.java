package java101;

import java.util.Scanner;

public class DigitsValueAddition {

	public static void main(String[] args) {
		int a, digits = 0, digitsValue, digitsTotal = 0, result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		a = scan.nextInt();
		int tempA = a;
		
		while (tempA != 0) {
			tempA /= 10;
			digits++;
		}
		tempA = a;
		System.out.println("Number of Digits are : " + digits);
		
		while (tempA != 0) {
			digitsValue = tempA % 10;
			System.out.print(digitsValue + ", ");
			// 1 * 1 * 1 * 1 = 1^4
			for (int i = 1; i <= digits; i++) {
				digitsTotal = digitsValue;
			}
			result += digitsTotal;
			tempA /= 10;
		}
		System.out.println("\nTotal of digits : " + result);

	}

}
