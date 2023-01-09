package java101;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		int shortEdgeOne, shortEdgeTwo;		
		double hypotenuse;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first short edge longority: ");
		shortEdgeOne = input.nextInt();
		System.out.println("Please enter second short edge longority: ");
		shortEdgeTwo = input.nextInt();
		
		hypotenuse = Math.sqrt((shortEdgeOne * shortEdgeOne) + (shortEdgeTwo * shortEdgeTwo));		
		System.out.println("Hypotenuse longority is: " + hypotenuse);
	}

}
