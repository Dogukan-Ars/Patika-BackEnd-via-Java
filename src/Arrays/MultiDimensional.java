package Arrays;

public class MultiDimensional {

	public static void main(String[] args) {		
		int[][] matris = new int[6][6];
		int[][] matris2 = {
				{0, 453, 939, 243, 783, 891},
				{453, 0, 490, 384, 620, 439},
				{939, 490, 0, 834, 863, 423},
				{243, 384, 839, 0, 544, 823},
				{783, 620, 863, 544, 0, 1045},
				{891, 439, 423, 823, 1045, 0}
		};			
		System.out.println(matris2[5][4]);
				
		int[][] matris3 = new int [3][]; //matris.length => first row value, matris3[0].length => first column value
		// matris3[0][1] , [0][2]...[0][n]
		int number = 1;
		for (int i = 0; i < matris3.length; i++) { // matris3[i] => first row values
			for (int j = 0; j < matris3[i].length; j++) { // matris3[0][1]
				matris[i][j] = number++;
			}
		}
//		System.out.println(matris[2][3]);
		
		for (int i = 0; i < matris3.length; i++) {
			for (int j = 0; j < matris3[i].length; j++) {
				System.out.print(matris[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

}
