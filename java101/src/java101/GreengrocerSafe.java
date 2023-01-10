package java101;

import java.util.Scanner;

public class GreengrocerSafe {

	public static void main(String[] args) {
		int a, b, e, p, t;
		double apple = 3.67, banana = 0.95, eggplant = 5.00, pear = 2.14, tomato = 1.11, total;
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many kg apple do you want? ");
		a = input.nextInt();
		System.out.print("How many kg banana do you want? ");
		b = input.nextInt();
		System.out.print("How many kg eggplant do you want? ");
		e = input.nextInt();
		System.out.print("How many kg pear do you want? ");
		p = input.nextInt();
		System.out.print("How many kg tomato do you want? ");
		t = input.nextInt();
				
		total = a * apple + b * banana + e * eggplant + p * pear + t * tomato;
		System.out.println(total);
	}

}
