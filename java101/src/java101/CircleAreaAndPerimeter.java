package java101;

import java.util.Scanner;

public class CircleAreaAndPerimeter {

	public static void main(String[] args) {
		int r;
		double perimeter, area;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		r = input.nextInt();
		
		perimeter = Math.PI * 2 * r;
		area = Math.PI * r * r;
		System.out.println("Perimeter of Circle: " + perimeter);
		System.out.println("Area of Circle: " + area);
		
	}

}
