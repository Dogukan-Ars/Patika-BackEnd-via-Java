package ArrayClassesAndMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Equal
		int[] list = {1, 2, 3};
		int[] list2 = {1, 2, 3};		
		int[] list3 = {3, 4, 5};
		
		System.out.println(HelperArray.equals(list, list3));
//		System.out.println(Arrays.equals(list, list2));
		
/*
// Copying and binary search in the arrays
 
		int[] list = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};		
//		list = HelperArray.copy(list, list.length); 
		int[] copyList = Arrays.copyOfRange(list, 2, 7); // we can copy of "a certain range " of arrays to create another array
		System.out.println(Arrays.toString(copyList));
		System.out.println(Arrays.toString(list));
//		int[] copyList = Arrays.copyOf(list, 4); // we can copy of arrays to create another array
		
//		Arrays.sort(list);
//		System.out.println(Arrays.toString(list));
//		System.out.println(Arrays.binarySearch(list, 55));
		
		
//		System.out.println(HelperArray.search(list, -11));
*/
		
/*
// Filling the arrays

		int[] list = {1, 2, 3, 4, 5, 6, 7};
		list = HelperArray.fill(list, 10);		
		System.out.println(Arrays.toString(list));
		double[] list2 = {4, 532, 432, 21, 54, 6, 0, 2};
//		Arrays.fill(list2, 2, 7, 10); // it will change the numbers of index of 2 to 7, to 10.
		list2 = HelperArray.fill(list2, 0);
		System.out.println(Arrays.toString(list2));
		
		
//		Arrays.fill(list, 10); // it will change all the elements of list array to 10.
//		System.out.println(Arrays.toString(list));
		
//		HelperArray.print(list); // if we make the void method to static, we can use it like this without creating the new object.
//		HelperArray.print(list2);
		
//		double[] list3 = {2.2, 5.5, 4.4, 3.3};
//		HelperArray helper = new HelperArray();		
//		helper.print(list3);

 */
	}
}
