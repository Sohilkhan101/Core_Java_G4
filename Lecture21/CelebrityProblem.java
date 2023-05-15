package Lecture21;

import java.util.Stack;

public class CelebrityProblem {
	public static void main(String[] args) {

		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 1, 0 }, { 1, 1, 1, 0 } };

		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}

		while (st.size() != 1) {
			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 1) {
				st.push(b);
			} else {
				st.push(a);
			}

		}
		System.out.println(st);
		int ans = st.pop();

		boolean b = false;
		for (int i = 0; i < arr.length; i++) {
			if (i != ans && (arr[ans][i] == 1 || arr[i][ans] == 0)) {
				b = true;
			}
		}

		if (!b) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}

	}

}
