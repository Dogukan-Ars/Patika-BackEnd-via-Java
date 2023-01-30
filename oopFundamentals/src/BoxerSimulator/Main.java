package BoxerSimulator;

public class Main {

	public static void main(String[] args) {
		Boxer b1 = new Boxer("Muhammed Ali", 20, 120, 86,30);
		Boxer b2 = new Boxer("Mike Tyson", 30, 130, 90, 40);

		Match match = new Match(b1, b2, 85, 95);
		match.run();
	}

}
