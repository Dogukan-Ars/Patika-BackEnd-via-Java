package java101;

public class RecursiveMethods {
	/*
	// without recursive method
	static int f(int x) {
        int result = 0;
        for (int i = 1; i <= x; i++) {
			result += i;
		}
        return result;
    }
	*/
	
//	f(1) = 1
//	f(2) = 1 + 2
//	f(3) = 1 + 2 + 3
//	f(4) = 1 + 2 + 3 + 4
//	f(n) = F(n-1) + n;
	
	static int f(int n) {
		System.out.println("n => " + n);
		if (n == 1) {
			return 1;
		}
		int result = f(n-1) + n;
		System.out.println("result => " + result);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(f(3));
		// f(n) = f(n-1) + n;
		// f(4) = f(3) + 4
		// f(3) = f(2) + 3
		// f(2) = f(1) + 2
		// f(1) = 1
    }
}
