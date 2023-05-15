package Lecture20;

import java.util.Arrays;
import java.util.Stack;

public class NGE {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 6, 2, 9, 7, 2 };
		int ans[] = new int[arr.length];

//		Arrays.fill(ans, -1);
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] > arr[i]) {
//					ans[i] = arr[j];
//					break;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(ans));

		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.peek()] = arr[i];
				st.pop();
			}
			st.push(i);
		}

		while (!st.isEmpty()) {
			ans[st.peek()] = -1;
			st.pop();
		}
		System.out.println(Arrays.toString(ans));

	}

}
