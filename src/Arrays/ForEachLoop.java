package Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		// Example 1
		/*
		int[] list = {1, 2, 3, 4};
		
		int sum = 0;
		for(int i: list) {
			sum += i;
			System.out.println(i);
		}		
		System.out.println(sum);
		*/
		
		// Example 2
		/*
		String[] cars = {"BMW", "Mercedes", "Audi"};
		for (String str : cars) {
			System.out.println(str);
		}
		
		
		// Example 3 - Multi Dimensional
		int[][] matris = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12},
		};
		
		// print with for loop
		for(int i = 0; i < matris.length; i++)  {
			for(int j = 0; j < matris[i].length; j++) {
//				System.out.print(matris[i][j] + "\t");
			}
//			System.out.println();
		}
		
		// print with foreach loop
		for(int[] row : matris) {
			for(int col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}*/
		
		 int[] scores = new int[10];
	        scores = new int[3];
	        scores = new int[]{215, 234, 218, 189, 221, 290};

	        for (int score : scores) {
	            System.out.print(score + "  ");
	        }
	}

}
