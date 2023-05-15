package Lecture22;

public class Linkedlist {

	public class Node {
		int data;
		Node next;

		public Node() {

		}

		public Node(int val) {
			this.data = val;
		}

	}

	Node head;
	Node tail;
	int size = 0;

	public void addFirst(int val) {
		Node nn = new Node(val);
//		nn.data = val;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void addLast(int val) {
		if (size == 0) {
			addFirst(val);
		} else {
			Node nn = new Node(val);
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void addAtPosition(int val, int k) {
		if (k == 1) {
			addFirst(val);
		} else {
			Node temp1 = getNode(k - 1);
			Node temp2 = getNode(k);
//			Node temp2 = temp1.next;
			Node nn = new Node(val);
			temp1.next = nn;
			nn.next = temp2;
			size++;
		}
	}

	public Node getNode(int k) {
		Node temp = head;
		for (int i = 1; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void removeFirst() {
		Node temp = head;
		head = head.next;
		temp.next = null;
		size--;
	}

	public void removekthPosition(int k) {
		if (k == 1) {
			removeFirst();
			return;
		}
		if (k == size) {
			removeLast();
			return;
		}
		Node temp1 = getNode(k - 1);
		Node temp2 = getNode(k);
		temp1.next = temp2.next;
		temp2.next = null;
		size--;

	}

	public void removeLast() {
		Node temp = getNode(size - 1);
		temp.next = null;
		tail = temp;
		size--;
	}

	public int getFirst() {
		return head.data;
	}

	public int getLast() {
		return tail.data;
	}

	public int getKthPosition(int k) {
		return getNode(k).data;
	}

	public int size() {
		return size;
	}

	public void reverse() {
		Node prev = null;
		Node curr = head;
		Node next = head;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

}
