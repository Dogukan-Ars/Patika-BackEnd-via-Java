package PracticesAndHomeworks;

public class ArraysElementsAverage {

	public static void main(String[] args) {
		int[] list = {15, 6, 7, 12, 7, 9, 3};		
		double sum1 = 0.0;
		double sum2 = 0.0;
		for (int i = 0; i < list.length; i++) {
			sum1 += list[i];
		}		
		double average = sum1 / list.length;
		System.out.println("Average : " + average);
		
		for (int i = 0; i < list.length; i++) {
			sum2 += (1.0/ list[i]);
		}
		
		double harmonic = list.length / sum2;
		System.out.println("Harmonic Average : " + harmonic);
	}

}
