package java101;

public class PalindromeNumbers {

	static boolean isPalindrome(int num){
		int temp = num, reverseNum = 0, lastDigit;
		while (temp != 0) {
			// System.out.println("=======================");
			// System.out.println("Number => " + temp);
			lastDigit = temp % 10;
			// System.out.println("Last digits => " + lastDigit);
			reverseNum = (reverseNum * 10) + lastDigit;
			// System.out.println("New Number => " + reverseNum);
			temp /= 10;
			// System.out.println("Temporary number's new value => " + temp);
		}
		if (num == reverseNum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(9889));

	}

}
