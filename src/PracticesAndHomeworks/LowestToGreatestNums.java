package PracticesAndHomeworks;

import java.util.Arrays;
import java.util.Scanner;

public class LowestToGreatestNums {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an array limit : ");
		int n = scan.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the " + (i+1)  + ". element of array : ");
			list[i] = scan.nextInt();
			System.out.println(list[i]);
		}
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
	}

}
