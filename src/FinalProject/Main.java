package FinalProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col;
		System.out.println("***Welcome to Mine Sweeper Game***");
		System.out.println("Please enter game board size :");
		System.out.print("Enter the row size : ");
		row = scan.nextInt();
		System.out.print("Enter the column size : ");
		col = scan.nextInt();
		
		MineSweeper mine = new MineSweeper(row, col);
		mine.run();
	}
	
	

}
