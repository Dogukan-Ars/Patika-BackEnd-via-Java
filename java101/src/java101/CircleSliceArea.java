package java101;

import java.util.Scanner;

public class CircleSliceArea {

	public static void main(String[] args) {
		int r,a;
		double area;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		r = input.nextInt();
		System.out.println("Enter angle: ");
		a = input.nextInt();
				
		area = (Math.PI * (r * r) * a) / 360;
		System.out.println("Area of Circle Slice: " + area);
	}

}
