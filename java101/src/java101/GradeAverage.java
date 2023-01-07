package java101;
import java.util.Scanner;
public class GradeAverage {

	public static void main(String[] args) {
		// Creating variables
		int math, phisic, chem, turk, hist, music;
		
		// To describe scanner class
		Scanner inp = new Scanner(System.in);
		
		// Taking values from user
		System.out.print("Your Mathmatic score: ");
		math = inp.nextInt();
		
		System.out.print("Your Phisic score: ");
		phisic = inp.nextInt();
		
		System.out.print("Your Chemistry score: ");
		chem = inp.nextInt();
		
		System.out.print("Your Turkish score: ");
		turk = inp.nextInt();
		
		System.out.print("Your History score: ");
		hist = inp.nextInt();
		
		System.out.print("Your Music score: ");
		music = inp.nextInt();
		
		int total = (math + phisic + chem + turk + hist + music);
		double result = total / 6.0;
		System.out.println("Your average point is : " + result);
		
		String str = result >= 60 ? "Passed" : "Failed";
		System.out.println(str);
	}

}
