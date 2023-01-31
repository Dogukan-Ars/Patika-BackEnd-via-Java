package EmployeeSalary;


public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Adam Smith", 8500, 45, 2000);
		employee1.printInfo();
		Employee employee2 = new Employee("Reiner Heinfield", 10300, 41, 2014);
		employee2.printInfo();
	}

}
