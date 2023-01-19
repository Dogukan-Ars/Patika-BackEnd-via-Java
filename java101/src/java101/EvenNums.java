package java101;

import java.util.Scanner;

public class EvenNums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		num = input.nextInt();
		
		/* with For
		for (int i = 1; i <= num; i++) {			
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}*/
		
		// with While
		int i = 0;
		while (i <= num) {
			i++;
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
			}
		}

	}

}
