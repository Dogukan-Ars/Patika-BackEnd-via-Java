package java101;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your birth year : ");
		age = input.nextInt();
		
		/*
		// with If - else
		
		if (age%12==0) {
			System.out.println("Monkey");
		} else if (age%12==1) {
			System.out.println("Cockerel");
		} else if (age%12==2) {
			System.out.println("Dog");
		} else if (age%12==3) {
			System.out.println("Pig");
		} else if (age%12==4) {
			System.out.println("Mouse");
		} else if (age%12==5) {
			System.out.println("Ox");
		} else if (age%12==6) {
			System.out.println("Tiger");
		} else if (age%12==7) {
			System.out.println("Rabbit");
		} else if (age%12==8) {
			System.out.println("Dragon");
		} else if (age%12==9) {
			System.out.println("Snake");
		} else if (age%12==10) {
			System.out.println("Horse");
		} else if (age%12==11) {
			System.out.println("Sheep");
		}
		*/
		
		// with Switch - case
		
		switch (age%12) {
		case 0:
			System.out.println("Your Chinese Zodiac sign is : **Monkey**");
			break;
		case 1:
			System.out.println("Your Chinese Zodiac sign is : **Cockerel**");
			break;
		case 2:
			System.out.println("Your Chinese Zodiac sign is : **Dog**");
			break;
		case 3:
			System.out.println("Your Chinese Zodiac sign is : **Pig**");
			break;
		case 4:
			System.out.println("Your Chinese Zodiac sign is : **Mouse**");
			break;
		case 5:
			System.out.println("Your Chinese Zodiac sign is : **Ox**");
			break;
		case 6:
			System.out.println("Your Chinese Zodiac sign is : **Tiger**");
			break;
		case 7:
			System.out.println("Your Chinese Zodiac sign is : **Rabbit**");
			break;
		case 8:
			System.out.println("Your Chinese Zodiac sign is : **Dragon**");
			break;
		case 9:
			System.out.println("Your Chinese Zodiac sign is : **Snake**");
			break;
		case 10:
			System.out.println("Your Chinese Zodiac sign is : **Horse**");
			break;
		case 11:
			System.out.println("Your Chinese Zodiac sign is : **Sheep**");
			break;
		default:
			System.out.println(" ");
		}

	}

}
