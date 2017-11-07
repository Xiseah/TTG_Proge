package dev.mart.proge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
	public static void main(String args[]) {
		// ::::::test cases
		// 1
		System.out.println(sameFirstLast(Arrays.asList(1, 2, 3))); // false
		System.out.println(sameFirstLast(Arrays.asList(1, 2, 3, 1))); // true
		System.out.println(sameFirstLast(Arrays.asList(1))); // false
		// 2
		System.out.println(makePi()); // [3, 1, 4]
		// 3
		System.out.println(sum(Arrays.asList(1, 2, 3, 4))); // 10
		System.out.println(sum(Arrays.asList(5, 2, 11))); // 18
		System.out.println(sum(Arrays.asList(7, 0, 0, 0, 0, 0))); // 7
		// 4
		System.out.println(rotateLeft(Arrays.asList(1, 2, 3))); // [2, 3, 1]
		System.out.println(rotateLeft(Arrays.asList(5, 11, 9))); // [11, 9, 5]
		System.out.println(rotateLeft(Arrays.asList(7, 0, 0))); // [0, 0, 7]
		// 5
		System.out.println(maxList(Arrays.asList(1, 2, 3, 4))); // [4, 4, 4, 4]
		System.out.println(maxList(Arrays.asList(11, 5, 9))); // [11, 11, 11]
		System.out.println(maxList(Arrays.asList(1, 2, 10, 4, 5))); // [10, 10, 10, 10, 10]
		// 6
		System.out.println(has23(Arrays.asList(1, 2, 4))); // true
		System.out.println(has23(Arrays.asList(11, 42, 3))); // true
		System.out.println(has23(Arrays.asList(10, 20, 30, 40))); // false
		// 6.5
		System.out.println(double23(Arrays.asList(1, 2, 3, 4))); // false
		System.out.println(double23(Arrays.asList(1, 2, 3, 4, 5, 7 ,2))); // true
		System.out.println(double23(Arrays.asList(1, 2, 3, 3))); // true
		// 7
		System.out.println(fix23(Arrays.asList(1, 2, 3, 4))); // [1, 2, 0, 4]
		System.out.println(fix23(Arrays.asList(2, 3, 5))); // [2, 0, 5]
		System.out.println(fix23(Arrays.asList(1, 2, 1))); // [1, 2, 1]
		// 8
		System.out.println(biggerTwo(Arrays.asList(1, 2), Arrays.asList(3, 4))); // [3, 4]
		System.out.println(biggerTwo(Arrays.asList(3, 4), Arrays.asList(1, 2))); // [3, 4]
		System.out.println(biggerTwo(Arrays.asList(1, 2), Arrays.asList(1, 1))); // [1, 2]
		// 9
		System.out.println(makeMiddle(Arrays.asList(1, 2, 3, 4))); // [2, 3]
		System.out.println(makeMiddle(Arrays.asList(7, 1, 2, 3, 4, 9))); // [2, 3]
		System.out.println(makeMiddle(Arrays.asList(1, 2, 3))); // null
		// 10
		System.out.println(frontPiece(Arrays.asList(1, 2, 3, 4), 2)); // [1, 2]
		System.out.println(frontPiece(Arrays.asList(1, 2, 3, 4), 3)); // [1, 2, 3]
		System.out.println(frontPiece(Arrays.asList(1, 2, 3, 4), 10)); // [1, 2, 3, 4]
	}
	// 1
	public static boolean sameFirstLast(List<Integer> nums) {
		if (nums != null && nums.size() > 1) {
			return nums.get(0) == nums.get(nums.size() - 1);
		} else {
			return false;
		}
	}

	// 2
	public static List<Integer> makePi() {
		return Arrays.asList(3, 1, 4);
	}

	// 3
	public static int sum(List<Integer> nums) {
		int result = 0;  
		for (int num : nums) {
			  result += num;
		}
		return result;
	}
	
	// 4
	public static List<Integer> rotateLeft(List<Integer> nums) {
		List<Integer> rotatedList = new ArrayList<Integer>(nums.subList(1, nums.size()));
		int firstElem = nums.get(0);
		rotatedList.add(firstElem);
		return rotatedList;
	}
	
	// 5
	public static List<Integer> maxList(List<Integer> nums) {
		int biggest = 0;
		for (int num : nums) {
			if (num > biggest) {
				biggest = num;
			}
		}
		List<Integer> maxList = new ArrayList<Integer>();
		for (int i = 0; i < nums.size(); i++) {
			maxList.add(biggest);
		}
		return maxList;
	}
	
	// 6
	public static boolean has23(List<Integer> nums) {
		return nums.indexOf(2) > 0 || nums.indexOf(3) > 0;
	}
	// 6.5
	public static boolean double23(List<Integer> nums) {
		int count2 = 0;
		int count3 = 0;
		for (int num : nums) {
			if (num == 2) count2++;
			if (num == 3) count3++;
		}
		return count2 >= 2 || count3 >= 2;
	}
	
	// 7
	public static List<Integer> fix23(List<Integer> nums) {
		for (int i = 0; i < nums.size() - 1; i++) {
			if (nums.get(i) == 2 && nums.get(i + 1) == 3&& i != nums.size()) {
				nums.set(i + 1, 0);
			}
		}
		return nums;
	}
	
	// 8
	public static List<Integer> biggerTwo(List<Integer> a, List<Integer> b) {
		return sum(a) > sum(b) ? a : b;
	}
	
	// 9
	public static List<Integer> makeMiddle(List<Integer> nums) {
		return nums.size() % 2 == 0 ? nums.subList(nums.size()/2 - 1, nums.size()/2 + 1) : null;
	}
	
	// 10
	public static List<Integer> frontPiece(List<Integer> nums, int n) {
		if (nums.size() > n) {
			return nums.subList(0, n);
		} else {
			return nums;
		}
	}
}







