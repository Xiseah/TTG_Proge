public class Loogika {

	public static void main(String args[]) {
		System.out.println(cigarParty(30, false)); // false
		System.out.println(cigarParty(50, false)); // true
		System.out.println(cigarParty(70, true)); // true

		System.out.println(caughtSpeeding(60, false)); // 0
		System.out.println(caughtSpeeding(65, false)); // 1
		System.out.println(caughtSpeeding(65, true)); // 0

		System.out.println(sortaSum(3, 4)); // 7
		System.out.println(sortaSum(9, 4)); // 20
		System.out.println(sortaSum(10, 11)); // 21

		System.out.println(specialEleven(22)); // true
		System.out.println(specialEleven(23)); // true
		System.out.println(specialEleven(24)); // false

		System.out.println(old35(3)); // true
		System.out.println(old35(10)); // true
		System.out.println(old35(15)); // false

		System.out.println(answerCell(false, false, false)); // true
		System.out.println(answerCell(false, false, true)); // false
		System.out.println(answerCell(true, false, false)); // false

		System.out.println(twoAsOne(1, 2, 3)); // true
		System.out.println(twoAsOne(3, 1, 2)); // true
		System.out.println(twoAsOne(3, 2, 2)); // false

		System.out.println(maxMod5(2, 3)); // 3
		System.out.println(maxMod5(11, 6)); // 6
		System.out.println(maxMod5(7, 7)); // 0
		
		System.out.println(shareDigit(12, 23)); // true
		System.out.println(shareDigit(12, 43)); // false
		System.out.println(shareDigit(24, 42)); // false
		
		System.out.println(sumLimit(2, 3)); // 5
		System.out.println(sumLimit(8, 3)); // 8
		System.out.println(sumLimit(8, 1)); // 9
	}

	public static boolean cigarParty(int cigars, boolean isWeekend) {
		return isWeekend || cigars >= 40 && cigars <= 60;
	}

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday) {
			if (speed <= 55) {
				return 0;
			} else if (speed <= 75) {
				return 1;
			} else {
				return 2;
			}
		} else {
			if (speed <= 50) {
				return 0;
			} else if (speed <= 70) {
				return 1;
			} else {
				return 2;
			}
		}
	}

	public static int sortaSum(int a, int b) {
		return a + b >= 10 && a + b < 20 ? 20 : a + b;
	}

	public static boolean specialEleven(int n) {
		return n % 11 == 0 || n % 11 == 1 || n % 11 == 10;
	}

	public static boolean old35(int n) {
		return n % 3 == 0 ^ n % 5 == 0;
	}

	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		return !(isAsleep || isMorning && !isMom);
	}

	public static boolean twoAsOne(int a, int b, int c) {
		return a + b == c || a + c == b || b + c == a;
	}

	public static int maxMod5(int a, int b) {
		if (a == b) return 0;
		
		if (a % 5 == b % 5) {
			return a > b ? b : a;
		} else { 
			return a > b ? a : b;
		}
	}

	public static boolean shareDigit(int a, int b) {
		int aFirst = (int)(a / 10);
		int aSecond = (a % 10);
		int bFirst = (int)(b / 10);
		int bSecond = (b % 10);
		return aFirst == bFirst || aFirst == bSecond || aSecond == bFirst || aSecond == bSecond;
		
	}

	public static int sumLimit(int a, int b) {
		return String.valueOf(a+b).length() == String.valueOf(a).length() ? a + b : a;
	}
}

















