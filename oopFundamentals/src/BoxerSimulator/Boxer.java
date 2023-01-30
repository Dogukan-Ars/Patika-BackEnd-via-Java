package BoxerSimulator;

public class Boxer {
	// Qualifications
	
	String name;
	int damage;
	int health;
	int weight;
	int dodge;
	
	Boxer(String name, int damage, int health, int weight, int dodge) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		if (dodge >= 0 && dodge <= 100) {
			this.dodge = dodge;
		} else {
			this.dodge = 0;
		}
	}
	
	int hit(Boxer foe) {
		System.out.println(this.name + " => " + foe.name + " " + this.damage + " damage dealt.");
		if (foe.isDodge()) {
			System.out.println(foe.name + " dodged the damage!");
			System.out.println("-----------");
			return foe.health;
		}
		if (foe.health - this.damage < 0) {
			return 0;
		}
		return foe.health - this.damage;
	}
	
	boolean isDodge() {
		double randomNum = Math.random() * 100;
		return randomNum <= this.dodge;
	}
}
