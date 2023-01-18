package java101;

import java.util.Scanner;

public class FlightTicket {

	public static void main(String[] args) {
		int dist, age, flightType;
		double perDist = 0.1, totalDist, flightTypeDisc, discPriceFlightType, child = 0.5, student = 0.1, retired = 0.3, cDisc, sDisc, rDisc, discPriceChild, discPriceStudent, discPriceRetired;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your distance from type of KM");
		dist = input.nextInt();
		System.out.println("Please enter your age");
		age = input.nextInt();
		System.out.println("Please choose your fligt type \n1- One way\t2- Round trip");
		flightType = input.nextInt();
		
		totalDist = perDist * dist;
		
		if (dist > 0 && age > 0 && (flightType == 1 || flightType == 2)) {	
			if (age < 12) {
				cDisc = totalDist * child;		
				discPriceChild = (totalDist - cDisc);				
				if (flightType == 2) {
					flightTypeDisc = discPriceChild * 0.2;
					discPriceFlightType = (discPriceChild - flightTypeDisc) * 2;
					System.out.print("Congratulations! You have " + (cDisc + flightTypeDisc) + " TL discount. Round trip flight discounted price is : " + discPriceFlightType + " TL");
				} else if (flightType == 1) {
					System.out.println("Congratulations! You have " + cDisc + " TL discount. Your discounted price is :" + discPriceChild + " TL");					
				}
			} else if (age >= 12 && age <= 24) {
				sDisc = totalDist * student;
				discPriceStudent = (totalDist - sDisc);				
				if (flightType == 2) {
					flightTypeDisc = discPriceStudent * 0.2;
					discPriceFlightType = (discPriceStudent - flightTypeDisc) * 2;
					System.out.print("Congratulations! You have " + (sDisc + flightTypeDisc) + " TL discount. Round trip flight discounted price is : " + discPriceFlightType + " TL");
				} else if (flightType == 1) {
					System.out.println(" Congratulations! You have " + sDisc + " TL discount. Your discounted price is :" + discPriceStudent + " TL");
				}
			} else if (age > 65) {
				rDisc = totalDist * retired;
				discPriceRetired = (totalDist - rDisc);				
				if (flightType == 2) {
					flightTypeDisc = discPriceRetired * 0.2;
					discPriceFlightType = (discPriceRetired - flightTypeDisc) * 2;
					System.out.print("Congratulations! You have " + (rDisc + flightTypeDisc) + " TL discount. Round trip flight discounted price is : " + discPriceFlightType + " TL");
				} else if (flightType == 1) {
					System.out.println(" Congratulations! You have " + rDisc + " TL discount. Your discounted price is :" + discPriceRetired + " TL");
				}
			}
			
		} else {
			System.out.println("Invalid enter! Please check your information and make sure them POSITIVE and VALID");
		}		
	}
}
