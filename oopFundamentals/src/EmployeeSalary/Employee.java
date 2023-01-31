package EmployeeSalary;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	int hoursPerWeek = 40;
	int thisYear = 2021;
	double totalSalary = 0;
	
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
		
	void printInfo(){
		totalSalary = this.salary + (this.salary * raisedSalary()) + bonus() - tax();
		System.out.println("======================== \n"
				+ "Employee Name : " + this.name + "\n"
				+ "Salary : " + this.salary + "\n"
				+ "Working hours a week : " + this.workHours + "\n"
				+ "Hired year : " + this.hireYear + "\n"
				+ "Taxes : " + this.tax() + "\n"
				+ "Bonuses : " + this.bonus() + "\n"
				+ "Raised Salary : " + this.raisedSalary() + "\n"
				+ "Salary includes taxes and bonuses : " + (this.salary - tax() + bonus()) + "\n"
				+ "Total salary : " + this.totalSalary);
	}	
	
	double tax() {
		double tax = this.salary + (this.salary * raisedSalary()) + bonus();
		if (tax > 1000) {
			return tax * 0.03;
		}
		return 0.0;
	}
	
	int bonus() {
		int workHard = 0;
		if (this.workHours - this.hoursPerWeek > 0) {
			workHard = (this.workHours - this.hoursPerWeek) * 4 * 30;
		}
		return workHard;
	}
	
	double raisedSalary() {
		double perYear = 0;
		if (thisYear - hireYear < 10) {
			perYear = 0.05;
		} else if (thisYear - hireYear > 9 && thisYear - hireYear < 20) {
			perYear = 0.1;
		} else if (thisYear - hireYear > 19) {
			perYear = 0.15;
		}
		return perYear;
	}
	
}
