package PracticesAndHomeworks;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
//		int[][] matrix = {
//				{1, 2, 3},
//				{4, 5, 6}
//		};
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int row = scan.nextInt();
		System.out.print("Enter the columns : ");
		int col = scan.nextInt();
		int[][] matrix = new int[row][col];
		System.out.println("Enter the elements of the array");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Main Matrix : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of main matrix : ");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}

}
