package java101;

public class BreakAndContinue {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("Value of 'i' became 5");
				break;
			}
			System.out.println(i);
		}
		
		// We use continue when we don't want to print something. We pass that thing with command of continue.
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		
		// with while loop
		
		int i = 1;
		while (i < 10) {
			i++;
			if (i%2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
