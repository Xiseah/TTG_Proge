package dev.martkaasik;

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
		// 7
		
		// 8
		
		// 9
		
		
		// 10
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
	
	// 7
	
	
	// 8
	
	
	// 9
	
	
	// 10
	
}
