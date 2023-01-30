package BoxerSimulator;

public class Match {
	// Qualifications
	Boxer b1;
	Boxer b2;
	int minWeight;
	int maxWeight;
	int round = 0;
	
	Match(Boxer b1, Boxer b2, int minWeight, int maxWeight){
		this.b1 = b1;
		this.b2 = b2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	void run() {
		if (isCheck()) {
			while (this.b1.health > 0 && this.b2.health > 0) {
				round = round+1;
				System.out.println("===== ROUND " + round + " =====");
				if (isFirst()) {
					this.b2.health = this.b1.hit(this.b2);
					if (isWin()) {
						break;
					}
				} else {
					this.b1.health = this.b2.hit(this.b1);
					if (isWin()) {
						break;
					}
				}				
				System.out.println("Boxer's current healths : " + this.b1.name + " = " + this.b1.health + " " + this.b2.name + " = " + this.b2.health);
			}
		}else {
			System.out.println("Boxers weight cathegory don't fit the rule!!!");
		}
	}
	
	boolean isCheck() {
		return (this.b1.weight >= minWeight && this.b1.weight <= maxWeight) && 
				(this.b2.weight >= minWeight && this.b2.weight <= maxWeight);
	}
	
	boolean isWin() {
		if (this.b1.health == 0) {
			System.out.println(this.b2.name + " WON!");
			return true;
		}
		if (this.b2.health == 0) {
			System.out.println(this.b1.name + " WON!");
			return true;
		}
		return false;
	}
	
	boolean isFirst() {
		double randomChance = Math.random() * 100;
		return randomChance >= 50;
	}
	
}
