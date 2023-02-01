package Arrays;


public class Intro {

	static int[] reverse(int[] nums2) {
		int[] reverse = new int[nums2.length];
		for (int i = 0, j = nums2.length - 1; i < nums2.length; i++, j--) {
			reverse[i] = nums2[j];
		}
		return reverse;
	}
	
	static void printArray(int[] nums2){
		for (int i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i]);
		}
	}
	
//	static void printArray(double[] arr){
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
	
	public static void main(String[] args) {
//		int[] nums = new int [10]; // we have to describe dimension of arrays.
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = (i * 10) + 10;
//			System.out.println(nums[i]);
//		}
		
		// or we can write like this
		
		int[] nums2 = {10,20,30,40,50,60,70,80,90,100};
		for (int i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i]);
		}	
		
//		double[] nums3 = {1.1,2.2,3.3,4.4,5.5};
//		
//		printArray(nums3);
		System.out.println("===================");
		
		int[] reverseNums = reverse(nums2);
		printArray(reverseNums);
		
	}

}
