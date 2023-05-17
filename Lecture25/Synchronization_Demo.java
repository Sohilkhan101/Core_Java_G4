package Lecture25;

public class Synchronization_Demo extends Thread {

	public void run() {

		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + " " + "Printing...");

		}
	}

	public static void main(String[] args) {
		Synchronization_Demo t1 = new Synchronization_Demo();
		Synchronization_Demo t2 = new Synchronization_Demo();
		t1.setName("Thread A");
		t2.setName("Thread B");
		t1.start();
		t2.start();
	}

}
