package java101;

import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		String userName, password;
		Scanner scan = new Scanner(System.in);
		int chance = 3;
		int balance  = 1500;
		int select;
		
		// with Switch - case
		
		while (chance > 0) {
			System.out.println("Username : ");
			userName = scan.nextLine();
			System.out.println("Password : ");
			password = scan.nextLine();
			if (userName.equals("patika") && password.equals("java101")) {
				System.out.println("Hi, welcome to xBank!");
				do {
					System.out.println("1- Deposite\n"
							+ "2- Withdraw\n"
							+ "3- Learn your balance\n"
							+ "4- Log out");
					System.out.print("Please choose the process that you need :");
					select = scan.nextInt();
					int price;
					switch (select) {
					case 1:
						System.out.println("Money amount : ");
						price = scan.nextInt();
						balance += price;
						break;
					case 2:
						System.out.println("Money amount : ");
						price = scan.nextInt();
						if (price > balance) {
							System.out.println("Insufficent balance!!!");
						} else {
							balance -= price;
						}
						break;
					case 3:
						System.out.println("Your balance : " + balance);
						break;

					default:
						break;
					}
				} while (select != 4);
				System.out.println("See you later :)");
				break;
			} else {
				chance--;
				System.out.println("Your username or password is not correct!! Please try again..!");
				if (chance == 0) {
					System.out.println("Your account banned, please contact with your bank!");
				} else {
					System.out.println(chance + " times remaining");
				}
				
			}
		}		
		
		/* // with If - else	
		
		while (chance > 0) {
			System.out.println("Username : ");
			userName = scan.nextLine();
			System.out.println("Password : ");
			password = scan.nextLine();
			if (userName.equals("patika") && password.equals("java101")) {
				System.out.println("Hi, welcome to XBank!");
				do {					
					System.out.println("1- Deposite\n"
							+ "2- Withdraw\n"
							+ "3- Learn your balance\n"
							+ "4- Log out");
					System.out.print("Please choose the process that you need :");
					select = scan.nextInt();
					if (select == 1) {
						System.out.println("Money amount : ");
						int price = scan.nextInt();
						balance += price;
					} else if (select == 2) {
						System.out.println("Money amount : ");
						int price = scan.nextInt();
						if (price > balance) {
							System.out.println("Insufficent balance!!!");
						} else {
							balance -= price;
						}
					} else if (select == 3) {
						System.out.println("Your balance : " + balance);
					}
				} while (select != 4);
				System.out.println("See you later :)");
				break;
			} else {
				chance--;
				System.out.println("Your username or password is not correct!! Please try again..!");
				if (chance == 0) {
					System.out.println("Your account banned, please contact with your bank!");
				} else {
					System.out.println(chance + " times remaining");
				}
				
			}
			
		}*/
		
		
	}

}
