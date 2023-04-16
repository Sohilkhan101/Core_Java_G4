package Lecture5;

import java.util.Arrays;

public class ArraySelfExceptOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 4 };

		int[] left = new int[nums.length];
		int sum = 1;
		for (int i = 0; i < nums.length; i++) {
			left[i] = sum;
			sum = sum * nums[i];
		}
		System.out.println(Arrays.toString(left));

		sum = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			left[i] = left[i] * sum;
			sum = sum * nums[i];
		}
		System.out.println(Arrays.toString(left));

	}

}
