package java101;

import java.util.Scanner;

public class TriangleWithStars {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		n = scan.nextInt();
		
		/* with For Loop
		
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= (n-i); k++) {
				System.out.print(" "); // n-1 represent the number of blanks on the head lines
			}
			//System.out.println(i); // i represent the number of lines
			for (int j = 1; j <= ((2*i) - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// with While Loop
		
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
		
		
		/* extra -> Z shape with stars
		
		int i,j;
		i = 1;
		while (i<=n) {
			j = n;
			while (j >= 1) {
				if (i == 1 || i == n || i == j)
					System.out.print("* ");
					else
						System.out.print("  ");
				j--;
			}
			System.out.println();
			i++;
		}
		 */
	}

}
