package OopFundamentals;

public class Car {
	// Qualifications	
	String type;
	String model;
	String color;
	int speed;
	int speedLimit;
	
	// Constructors
	Car(String model, String color, int speed){
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.type = "Sedan";
		this.speedLimit = 180;
		System.out.println("Founding method with parameter was created");
	}
	Car(){
		System.out.println("Empty founding method was created");
	}
	
	
	void increaseSpeed(int increment) {
		if ((speed + increment) < speedLimit) {
			this.speed += increment;
		}
	}
	
	void decreaseSpeed (int decrease) {
		if (this.speed > 0) {
			this.speed -= decrease;
		}
	}
	
	void printSpeed() {
		System.out.println(this.model + " Your speed : " + this.speed);
	}
	
	void printInfo() {
		System.out.println("Model \t: " + this.model);
		System.out.println("Color \t: " + this.color);
		System.out.println("Type \t: " + this.type);
		System.out.println("Speed \t: " + this.speed);
	}
}
