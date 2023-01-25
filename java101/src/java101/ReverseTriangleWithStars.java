package java101;

import java.util.Scanner;

public class ReverseTriangleWithStars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		int n = scan.nextInt();
		
		int i = 0;
		while (i <= n - 1) {
			int k = 0;
			while (k <= i - 1) {
				System.out.print(" ");
				k++;
			}
			int j = 0;
			while (j <= n - i - 1) {
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println();
		}
		

	}

}
