package OopFundamentals;

public class Main {

	public static void main(String[] args) {
		Car audi = new Car("Audi", "Blue", 10);
		audi.printInfo();
		
//		audi.model = "Audi";
//		audi.speed = 10;
//		audi.increaseSpeed(20);
//		audi.decreaseSpeed(10);
//		audi.printSpeed();
		
		Car bmw = new Car();
		bmw.model = "BMW";
		bmw.speed = 20;
//		bmw.increaseSpeed(25);		
//		bmw.increaseSpeed(20);
//		bmw.increaseSpeed(100);
//		bmw.increaseSpeed(60); // Speed limit was 180, so this line didn't run because of the limit.
//		bmw.printSpeed();
		
		Car mercedes = new Car();
		mercedes.model = "Mercedes";
		mercedes.speed = 30;
//		mercedes.printSpeed();
	}
	
	

}
