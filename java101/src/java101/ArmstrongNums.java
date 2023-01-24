package java101;

import java.util.Scanner;

public class ArmstrongNums {
			//function to check if the number is Armstrong or not
			static boolean isArmstrong(int n)
			{
				int temp, digits=0, last=0, sum=0;
				//assigning n into a temp variable
				temp=n;
				//loop execute until the condition becomes false
				while(temp>0)
				{
					temp /= 10;
					digits++;
				}
				temp = n;
				while(temp>0)
				{
					//determines the last digit from the number
					last = temp % 10;
					//calculates the power of a number up to digit times and add the resultant to the sum variable
					sum +=  (Math.pow(last, digits));
					//removes the last digit
					temp = temp/10;
				}
				//compares the sum with n
				if(n==sum)
					//returns if sum and n are equal
					return true;
				//returns false if sum and n are not equal
				else return false;
			}
			//driver code
			public static void main(String args[]) 
			{
				int num;
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter the limit: ");
				//reads the limit from the user
				num=sc.nextInt();
				System.out.println("Armstrong Number up to "+ num + " are: ");
				for(int i=0; i<=num; i++)
					//function calling
					if(isArmstrong(i))
					//prints the armstrong numbers
					System.out.print(i+ ", ");
			}   
//		
//		int n, digits = 0, digitsValue, digitsPow, result = 0;
//		
//		for (int i = 1; i <= 2000; i++) {
//			// finding number of digits
//			n = i;
//			while (n > 0) {
//				digitsValue = n % 10;
//				result += (digitsValue * digitsValue * digitsValue);
//				n /= 10;
//			}
//			
////			while (n != 0) {
////				digitsValue = n % 10;
////				// 1*1*1*1 = 1^4
////				digitsPow = 1;
////				for (int j = 1; j <= digits; j++) {
////					digitsPow *= digitsValue;					
////				}
////				result += digitsPow;
////				n /= 10;			
////			}
//			if (result == i) 
//				System.out.println(i + " is an Armstrong Number");
//			
//			result = 0;
//		}		
		
		/* Is the entered number an Armstrong Number or Not
		 * 
		int a, digits = 0, digitsValue, digitsPow = 0, result = 0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		int tempA = a;
		
		while (tempA != 0) {
			tempA /= 10;
			digits++;
		}
		tempA = a;
		System.out.println(digits);
		
		while (tempA != 0) {
			digitsValue = tempA % 10;
			digitsPow = 1;
			// 1 * 1 * 1 * 1 = 1^4
			for (int i = 1; i <= digits; i++) {
				digitsPow *= digitsValue;
			}
			result += digitsPow;
			tempA /= 10;
		}
		
		if (result == a) {
			System.out.println("Number " + a + " is an Armstrong Number");
		} else {
			System.out.println("Number " + a + " is not an Armstrong Number");
		}
		System.out.println(result);
		
		 */
				
		
		
		/* Necessary Formulas
		
		// Finding Digits
		// 2451 / 10 = 245
		// 245 / 10 = 24
		// 24 / 10 = 2
		// 2 / 10 = 0
		// There are four process below. It means the number has 4 Digits. So we can find the digits of numbers to divide them by 10 until 0.
		
		while (a != 0) {
			a /= 10;
			numCounter++;
		}
		
		// Finding The Last Digit
		
		// We can find the last digits by modding.
		// 2451 % 10 = 1
		
		int b = 2451;
		int c = b % 10;
		
		
		int sub = 2, sup = 3;
		int result = 1;
		for (int i = 1; i <= sup; i++) {
			result *= sub;
		}
		System.out.println(result);
		*/
	}


