package java101;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		double h, m, bmi;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height in meter: ");
		h = input.nextDouble();
		System.out.println("Please enter your mass: ");
		m = input.nextDouble();
		
		bmi = m / (h * h);
		System.out.println("Your Body/Mass Index: " + bmi);
		
	}

}
