package Lecture5;

import java.util.Arrays;

public class ArraySelfExcept {

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
		
		int[] right = new int[nums.length];
		sum = 1;
		for (int i =nums.length-1 ; i >=0 ; i--) {
			right[i] = sum;
			sum = sum * nums[i];
		}
		System.out.println(Arrays.toString(right));

		for (int i = 0; i < nums.length; i++) {
			left[i] = left[i]*right[i];
		}
		System.out.println(Arrays.toString(left));

		
	}

}
