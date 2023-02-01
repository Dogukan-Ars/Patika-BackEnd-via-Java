package Arrays;

public class OneDimensional {

	public static void main(String[] args) {
		double[] list1 = new double[5]; // double[1] list1; list1 = new double[5] they are same
		list1[0] = 4.1;
		System.out.println(list1[0]);
		
		
		String[] days = {"Monday", "Tuesday", "Wednesday"};
		String[] weekend = new String[] {"Saturday", "Sunday"}; // we can use like this
		weekend[0] = "Sunday";
		System.out.println(weekend[0]);
		for (int i = 0; i <= weekend.length; i++) {
			System.out.println(days[i]);
		}
	}

}
