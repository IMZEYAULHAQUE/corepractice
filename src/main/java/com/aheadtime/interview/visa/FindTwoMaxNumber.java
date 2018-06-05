package com.aheadtime.interview.visa;

public class FindTwoMaxNumber {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, Integer.MAX_VALUE, Integer.MIN_VALUE };
		findMaxTwo(nums);
	}

	public static void findMaxTwo(int[] nums) {

		if (nums == null || nums.length == 0) {
			System.out.println("blank");
			return;
		}

		Integer firstMax = nums[0];
		Integer secondMax = nums.length > 1 ? nums[0] : null;

		for (int n : nums) {
			secondMax = n > firstMax ? firstMax : secondMax;
			firstMax = n > firstMax ? n : firstMax;
		}

		System.out.println("First : " + firstMax);
		if (secondMax != null) {
			System.out.println("Second : " + secondMax);
		}
	}
}
