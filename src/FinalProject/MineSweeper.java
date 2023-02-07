package FinalProject;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
		int row, col, size;
		int[][] field;
		int[][] mineMap;
		boolean game = true;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		MineSweeper(int row, int col){
			this.row = row;
			this.col = col;
			this.field = new int[row][col];
			this.mineMap = new int[row][col];
			this.size = row * col;
		}
		
		public void run() {
			int row, col, success = 0;
			preGame();
			print(field);
			System.out.println("Game Started!");
			while (game) {
				print(mineMap);
				System.out.print("Row : ");
				row = scan.nextInt();
				System.out.print("Column : ");
				col = scan.nextInt();
				
				if (row < 0 || row >= this.row) {
					System.out.println("Invalid coodinate!!!");
					continue;
				}
				if (col < 0 || col >= this.col) {
					System.out.println("Invalid coodinate!!!");
					continue;
				}
				if (field[row][col] != -1) {
					checkMine(row, col);
					success ++;
					if (success == (size - (size / 4))) {
						System.out.println("****** CONGRATULATIONS ****** You won the game! ");
					}
				} else {
					game = false;
					System.out.println("'GAME OVER'");
				}
			}
		}
		
		public void preGame() {
			int randRow, randCol, count = 0;
			while (count != (size/4)) {
				randRow = rand.nextInt(row);
				randCol = rand.nextInt(col);
				if (field[randRow][randCol] != -1) {
					field[randRow][randCol] = -1;
					count++;
				}
			}			
		}
		
		public void print(int[][] arr) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] >= 0) {
						System.out.print(" ");
					}
					if (arr[i][j] == 0) {
						System.out.print(" * ");
					} else {
						System.out.print(" " + arr[i][j] + " ");
					}
					
				}
				System.out.println();
			}
		}
		
		public void checkMine(int r, int c) {
			if (field[r][c] == 0) {
				if ((r < row - 3) && (field[r+1][c] == -1)) {
					mineMap[r][c]++;
				}
				if ((c < col - 1 ) && (field[r][c+1] == -1)) {
					mineMap[r][c]++;
				}
				if ((r > 0) && (field[r-1][c] == -1)) {
					mineMap[r][c]++;
				}				
				if ((c > 0) && (field[r][c-1] == -1)) {
					mineMap[r][c]++;
				}				
				if (mineMap[r][c] == 0) {
					mineMap[r][c] = -2;
				}
			}
			
		}
}
