package java101;

import java.util.Scanner;

public class VATCalculater {

	public static void main(String[] args) {
		double amount, withVatPrice, amountOfVat;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter price: ");
		amount = input.nextDouble();
		
		boolean vatRate = amount > 0 && amount < 1000;
		amountOfVat = vatRate ? 0.18 : 0.08;
		
		withVatPrice = amount + (amount * amountOfVat);
		
		
		System.out.println("With VAT price: " + withVatPrice);
		System.out.println("Amount of VAT: " + amountOfVat );
		
	}

}
