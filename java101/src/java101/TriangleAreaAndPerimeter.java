package java101;

import java.util.Scanner;

public class TriangleAreaAndPerimeter {

	public static void main(String[] args) {
		int a, b, c;
		double perimeter, u, area;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter longorities of the triangle edges: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		perimeter = (a + b + c);
		u = perimeter / 2;
		area = Math.sqrt(u *(u - a) * (u - b) * (u - c));
		System.out.println("Perimeter of triangle: " + perimeter);
		System.out.println("Area of triangle: " + area);
		
	}

}
