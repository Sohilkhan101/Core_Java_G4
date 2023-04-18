package Lecture8;

public class RotateImage {

	public void rotate(int[][] nums) {

		// Transpose
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j <= i; j++) {
				int temp = nums[i][j];
				nums[i][j] = nums[j][i];
				nums[j][i] = temp;
			}
		}
		// Reverse row
		for (int i = 0; i < nums.length; i++) {
			reverse(nums, i);
		}
	}

	public static void reverse(int[][] nums, int row) {
		int start = 0;
		int end = nums[0].length - 1;
		while (start < end) {
			int temp = nums[row][start];
			nums[row][start] = nums[row][end];
			nums[row][end] = temp;
			start++;
			end--;
		}
	}

}
