package PracticesAndHomeworks;

public class DublicateEvenNums {
	static boolean isFind(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] list = {3, 7, 3, 3, 2, 9, 10, 6, 7, 21, 12, 1, 33, 8, 9, 1, 4, 6, 4, 8, 12};
		int[] duplicate = new int[list.length];
		int startIndex = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] % 2 == 0) {
					if ((i != j) && (list[i] == list[j])) {
						if (!isFind(duplicate, list[i])) {
							duplicate[startIndex++] = list[i];
						}
						break;
					}
				}
			}
		}
		
		for (int value : duplicate) {
			if (value != 0) {
				System.out.print(value + ", ");
			}
		}
	}

}
