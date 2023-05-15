package Lecture19;

public class stack {

	protected int[] arr = new int[5];
	int tos = -1;
	int size = 0;

	public boolean isEmpty() {
//		if (tos == -1) {
//			return true;
//		}
//		return false;
		return tos==-1;
	}

	public void push(int val) throws Exception {
		if (isfull()) {
			throw new Exception("Stack is full");
		}
		tos++;
		arr[tos] = val;
		size++;
	}

	public void pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		tos--;
		size--;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[tos];
	}

	public boolean isfull() {
		return tos == arr.length - 1;
	}

	public void Display() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
 		}

		for (int i = 0; i <= tos; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}
