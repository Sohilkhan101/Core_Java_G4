package Lecture20;

import java.util.Stack;

public class ReverseStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);

		System.out.println(st);
		reverse(st);
		System.out.println(st);

	}

	private static void reverse(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}
		int val = st.pop();
		reverse(st);
		pushbottom(val,st);

	}

	private static void pushbottom(int val, Stack<Integer> st) {
		if(st.isEmpty()) {
			st.push(val);
			return;
		}
		int item=st.pop();
		pushbottom(val, st);
		st.push(item);
	}

}
