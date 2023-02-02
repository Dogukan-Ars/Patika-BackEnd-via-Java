package PracticesAndHomeworks;

public class FrequencyOfArray {	
	public static void main(String[] args) {
		int[] list = {10, 20, 20, 10, 10, 20, 5, 20, 5};
		int[] visList = new int[list.length];
		int vis = -1;
		System.out.println("Frequency of numbers");
		for (int i = 0; i < list.length; i++) {
			int count = 1;
			for (int j = i+1; j < list.length; j++) {				
				if (list[i] == list[j]) {
					count++;
					visList[j] = vis;					
				}
			}
			
			if (visList[i] != vis) {
				visList[i] = count;
			}
		}
		for (int i = 0; i < visList.length; i++) {
			if (visList[i] != vis) {
				System.out.println("Frequency of " + list[i] + " : " + visList[i]);
			}
		}
		
	}

}
