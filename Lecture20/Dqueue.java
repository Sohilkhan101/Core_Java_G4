package Lecture20;

import Lecture19.Queue;

public class Dqueue extends Queue {

	@Override
	public void add(int val) throws Exception {
		if (isFull()) {
			int[] newarr = new int[2 * this.data.length];

			for (int i = 0; i < size; i++) {
				newarr[i] = data[front];
				front = (front + 1) % data.length;
			}
			data = newarr;
			front = 0;
		}
		super.add(val);
	}
}
