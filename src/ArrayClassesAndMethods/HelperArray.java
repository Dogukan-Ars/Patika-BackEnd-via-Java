package ArrayClassesAndMethods;

public class HelperArray {
	// equality method
	static boolean equals(int[] l1, int[] l2) {
		if (l1.length != l2.length) {
			return false;
		}
		
		for (int i = 0; i < l1.length; i++) {
			if (l1[i] != l2[i]) {
				return false;
			}
		}
		return true;
	}
	
	//binary search method
	static int search(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	// copy method
	static int[] copy(int[] arr, int value) {
		for (int i = 0; i < 5; i++) {
			arr[i] = value;
		}
		return arr;
	}	
	
	// creating array method
	static void print(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	// fill method
	static int[] fill(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
		}
		return arr;
	}
	
	// fill method double
	static double[] fill(double[] arr2, double value) {
		for (int i = 2; i < arr2.length; i++) {
			arr2[i] = value;
		}
		return arr2;
	}
	
//	void print(double[] arr) {
//		System.out.print("[ ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println("]");
//	}
}
