package java101;

import java.util.Iterator;
import java.util.Scanner;

public class GreatestAndLowestNums {

	public static void main(String[] args) {
		int nums, n, largest = 0, smallest = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many number do you want to enter? : ");
		nums = scan.nextInt();
		
		int i = 1;
		while (i <= nums) {
			System.out.print("Enter " + i + ". number : ");
			n = scan.nextInt();
			i++;
			if (n > largest) {
				largest = n;
			}
			if (n < smallest) {
				smallest = n;
			}
		}
		System.out.println("The Largest number is : " + largest);
		System.out.println("The Smallest number is : " + smallest);
	}

}
