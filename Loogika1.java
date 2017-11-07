package dev.mart.proge;

// from yours truly BigBoy Mart

public class Loogika1 {
	public static void main(String arg[]) {		
	 
		System.out.println(monkeyTrouble(true, true));
		System.out.println(monkeyTrouble(false, false));
		System.out.println(monkeyTrouble(true, false));
		System.out.println(monkeyTrouble(false, true));
		
		System.out.println(sumDouble(1, 2));
		System.out.println(sumDouble(3, 2));
		System.out.println(sumDouble(2, 2));
		
		System.out.println(diff21(10));
		System.out.println(diff21(26));
		System.out.println(diff21(21));
		
		System.out.println(parrotTrouble(true, 6));
		System.out.println(parrotTrouble(true, 7));
		System.out.println(parrotTrouble(false, 6));
		
		System.out.println(makes10(9, 10));
		System.out.println(makes10(9, 9));
		System.out.println(makes10(1, 9));
		
		System.out.println(posNeg(1, -1, false));
		System.out.println(posNeg(-1, 1, false));
		System.out.println(posNeg(-4, -5, true));
		
		System.out.println(notString("candy"));
		System.out.println(notString("x"));
		System.out.println(notString("not bad"));
		
		System.out.println(frontBack("code"));
		System.out.println(frontBack("a"));
		System.out.println(frontBack("ab"));
		
		System.out.println(front3("Java"));
		System.out.println(front3("Chocolate"));
		System.out.println(front3("abc"));
		
		System.out.println(backAround("cat"));
		System.out.println(backAround("Hello"));
		System.out.println(backAround("a"));
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}
	
	public static int sumDouble(int a, int b) {
		return (a == b) ? 2 * (a + b) : a + b;
	}
	
	public static int diff21(int n) {
		return n < 21 ? 21 - n : (n - 21) * 2;
	}
	
	public static boolean parrotTrouble(boolean talking, int hour) {
		return talking && 7 > hour || hour > 20;
	}
	
	public static boolean makes10(int a, int b) {
		return a == 10 || b == 10 || a + b == 10;
	}
	
	public static boolean posNeg(int a, int b, boolean negative) {
		return negative ? a < 0 && b < 0 : a < 0 ^ b < 0;
	}
	
	public static String notString(String str) {
		return "not " + str;
	}
	
	public static String frontBack(String str) {
		int len = str.length();
		return len > 1 ? 
				str.charAt(len - 1) + 
				str.substring(1, len - 1) + 
				str.charAt(0) : str;
	}
	
	public static String front3(String str) {
		String front = str.substring(0, 3);
		return front + front + front;
	}
	
	public static String backAround(String str) {
		char lastChar = str.charAt(str.length() - 1);
		return lastChar + str + lastChar;
	}
}