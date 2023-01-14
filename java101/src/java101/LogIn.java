package java101;

import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		String userName = "patika", password = "java101", newPass, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Username : ");
		userName = input.nextLine();
				
		if (userName.equals("patika")){
			System.out.print("Password : ");
			password = input.nextLine();
				if (password.equals("java101")) {
				System.out.println("You successfully entered.");			
				} else {
				System.out.println("Your information is wrong, please check it again!!!");
				
					if (!password.equals("java101")) {
						System.out.println("Your password is invalid!! Do you want to reset your password? Press 'Y'");
						y = input.nextLine();
						if (y.equals("y")) {
							System.out.println("Enter a new password");
							newPass = input.nextLine();
							
							if (!newPass.equals("java101")) {
								System.out.println("New password is created.");
							} else {
								System.out.println("Password couldn't created! It shouldn't be the last one.");
							}
						}
					}
				}
				
		} else {
			System.out.println("Your Username is wrong!");
		}		
	}
}
