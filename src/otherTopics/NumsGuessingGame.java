package otherTopics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumsGuessingGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(100);
//		int num = (int)(Math.random() * 100); // Same with below
		
		Scanner scan = new Scanner(System.in);
		int right = 0;
		int selected;
		int[] wrong = new int[5];
		boolean isWin = false;
		boolean isIncorrect = false;
		
		while (right < 5) {
			System.out.print("Please enter your guess : ");
			selected = scan.nextInt();
			
			if (selected < 0 || selected > 99) {
				System.out.println("Please enter your guess between 0 to 100!!!");
				if (isIncorrect) {
					right++;
					System.out.println("If you enter out of range again, your right's will be deducted!!");
				}else {
					isIncorrect = true;
					System.out.println("Too much invalid entrance. Your remaining right is : " + (5 - right));
				}
				continue;
			}
			if (selected == number) {
				System.out.println("Congratulations, you hit the bull's-eye! Your guess is : " + number);
				isWin = true;
				break;
			} else {				
				System.out.println("Your guess is not correct, try again :)");
				if (selected > number) {
					System.out.println(selected + " number is greater than secret number.");
				}else {
					System.out.println(selected + " number is lower than secret number.");
				}
				wrong[right++] = selected;
				System.out.println(5-right + " rights left.");				
			}			
		}
		if (!isWin) {
			System.out.println("GAME OVER! Secret number was : " + number);	
			if (!isIncorrect) {
				System.out.println("Your guesses are : " + Arrays.toString(wrong));
			}
		}
		
		
	}

}
