package java101;

import java.util.Scanner;

public class VATCalculater {

	public static void main(String[] args) {
		double amount, withVatPrice, amountOfVat;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter price: ");
		amount = input.nextDouble();
		
		boolean highRate = amount > 0 && amount < 1000;
		boolean lowRate = amount > 1000;
		amountOfVat = highRate ? 0.18 : 0.08;
		
		withVatPrice = amount + (amount * amountOfVat);
		
		
		System.out.println("With VAT price: " + withVatPrice);
		System.out.println("Amount of VAT: " + amountOfVat );
		
	}

}
