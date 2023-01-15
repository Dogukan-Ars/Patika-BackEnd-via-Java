package java101;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		int math, physic, chem, turk, music;
		double ave;
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Math grade : ");
		math = input.nextInt();
		
		System.out.println("Physic grade : ");
		physic = input.nextInt();
		
		System.out.println("Chemistry grade : ");
		chem = input.nextInt();
		
		System.out.println("Turkish grade : ");
		turk = input.nextInt();
		
		System.out.println("Music grade : ");
		music = input.nextInt();
		
		if((math <= 100 && math >= 0) && (physic <= 100 && physic >= 0) && (chem <= 100 && chem >= 0) && (turk <= 100 && turk >= 0) && (music<= 100 && music >= 0)) {
			ave = (math + physic + chem + turk + music) / 5;
			if(ave <= 55) {
				System.out.println("You failed! You need to study next time.");
				System.out.println("Your average grade is " + ave);
			}else {
				System.out.println("You passed");
				System.out.println("Your average grade is " + ave);
			}
		} else {
			System.out.println("Invalid enterence!!! Lecture notes must be between 0 to 100");
		}
	}

}
