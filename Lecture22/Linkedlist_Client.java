package Lecture22;

public class Linkedlist_Client {
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
//		ll.addFirst(10);
//		ll.addFirst(20);
//		ll.addFirst(30);
//		ll.addFirst(40);
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.display();
//		ll.addAtPosition(80, 3);
//		ll.display();
//		ll.addAtPosition(100, 6);
//		ll.display();
//		ll.removeFirst();
// 		ll.removeLast();
		ll.reverse();
		ll.display();
//		ll.removekthPosition(2);
		ll.reverse();
		ll.display();
		
		
	}

}
