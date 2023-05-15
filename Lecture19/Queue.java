package Lecture19;

public class Queue {
	protected int front = 0;
	int rear = 0;
	protected int size = 0;
	protected int[] data;

	public Queue() {
		data = new int[5];
	}

	public Queue(int val) {
		data = new int[val];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == data.length;
	}

	public void add(int val) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is Full");
		}
		int idx = (front + size) % data.length;
		data[idx] = val;
		size++;
	}

	public int remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int val = data[front];
		front = (front + 1) % data.length;
		size--;
		return val;
	}
	
	public int Size() {
		return size;
	}
	
	public void display() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		
		int k=front;
		for(int i=0;i<size;i++) {
			System.out.print(data[k]+" ");
			k++;
		}
	}

}
