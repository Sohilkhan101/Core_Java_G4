package Lecture24;

//public class MultiThreadingDemo extends Thread {
//	public void run() {
//		System.out.println("Running...");
//	}
//
//	public static void main(String[] args) {
//		MultiThreadingDemo m1 = new MultiThreadingDemo();
//		m1.start();
//	}
//}

//--------------------------------------------------//

//public class MultiThreadingDemo implements Runnable {
//	public void run() {
//		System.out.println("Running...");
//	}
//
//	public static void main(String[] args) {
//
//		MultiThreadingDemo m1 = new MultiThreadingDemo();
//
//		Thread t1 = new Thread(m1);
//		Thread t2 = new Thread(m1);
//		Thread t3 = new Thread(m1);
//		t1.start();
//		t2.start();
//		t3.start();
//	}
//}

//--------------------------------------------------//

//public class MultiThreadingDemo implements Runnable {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//			System.out.println(i);
//		}
//		System.out.println("Running...");
//	}
//
//	public static void main(String[] args) {
//
//		MultiThreadingDemo m1 = new MultiThreadingDemo();
//
//		Thread t1 = new Thread(m1);
//		Thread t2 = new Thread(m1);
//		Thread t3 = new Thread(m1);
//		t1.start();
//		t2.start();
//		t3.start();
//
//	}
//}

//--------------------------------------------------//

//public class MultiThreadingDemo implements Runnable {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			try {
//				Thread.sleep(100);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//			System.out.println(i);
//		}
//	}
//
//	public static void main(String[] args) {
//
//		MultiThreadingDemo m1 = new MultiThreadingDemo();
//
//		Thread t1 = new Thread(m1 , "A");
//		System.out.println(t1.getName());
//		Thread t2 = new Thread(m1,"B");
//		System.out.println(t2.getName());
//		Thread t3 = new Thread(m1,"C");
//		System.out.println(t3.getName());
//		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		t2.start();
//		t3.start();
//
//	}
//}

//--------------------------------------------------//

//public class MultiThreadingDemo implements Runnable {
//	public void run() {
//		System.out.println("Running");
//	}
//
//	public static void main(String[] args) {
//
//		MultiThreadingDemo m1 = new MultiThreadingDemo();
//
//		Thread t1 = new Thread(m1 );
//		t1.setPriority(1);
//		
//		Thread t2 = new Thread(m1);
//		t2.setPriority(2);
//		
//		Thread t3 = new Thread(m1);
//		t3.setPriority(3);
//	
//		t1.start();
//		System.out.println(t1.isAlive());
////		t1.start();
//		System.out.println(t1.getPriority());
//		t2.start();
//		System.out.println(t2.getPriority());
//		t3.start();
//		System.out.println(t3.getPriority());
// 
//	}
//}



