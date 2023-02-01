package PracticesAndHomeworks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		// finding closest numbers in array
		int[] list2 = {15, 12, 788, 1, -1, -778, 2, 0};
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = scan.nextInt();
		int min = list2[0];
		int max = list2[0];
		Arrays.sort(list2);
		
		for (int i : list2) {
			if (n > i) {
				min = i;
			}
			if (i < max && i > n) {
				max = i;
			}
		}		
		System.out.println("Minimum closest number to entrance : " + min);
		System.out.println("Maximum closest number to entrance : " + max);
		
		/*
		// finding min and max values
		
		int[] list = {56, 34, 1, 8, 101, -2, -33};
		// min = list[0], min < list[i] ? min = list[i] : ' '
		// max = list[0], max < list[i] ? max = list[i] : ' '
		int min = list[0];
		int max = list[0];
		
		for (int i : list) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}
		
		System.out.println("Minimum value : " + min);
		System.out.println("Maximum value : " + max); */
	}

}
