package Lecture6;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int item = 12;

		int start = 0;
		int end = nums.length - 1;
		int idx = -1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (item == nums[mid]) {
				idx = mid;
				break;
			} else if (item < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(idx);
//		int a= Integer.MAX_VALUE-3;
//		int b=Integer.MAX_VALUE-2;
//		int c=a+b;
//		System.out.println(c);

	}
	

}
