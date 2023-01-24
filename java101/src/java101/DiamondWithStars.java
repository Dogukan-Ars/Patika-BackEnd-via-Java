package java101;

import java.util.Scanner;

public class DiamondWithStars {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		n = scan.nextInt();
		
		int i,j,k;
		i = 1;
		while (i <= n) {
			k = 1;
			while (k <= n - i) {
				System.out.print(" ");
				k++;
			}
			j = 1;
			while (j <= 2 * i - 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		i = 1;
		while (i <= n - 1) {
			k = 1;
			while (k <= i) {
				System.out.print(" ");
				k++;
			}
			j = 1;
			while (j <= 2 * (n - i) - 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
