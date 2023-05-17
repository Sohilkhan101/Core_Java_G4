package Lecture25;
import java.util.Scanner;
class AvailableTicket {
	int avl;
	int reqJ;
	int reqM;

	public AvailableTicket(int availTickets, int reqJohn, int reqMike) {
		this.avl = availTickets;
		this.reqJ = reqJohn;
		this.reqM = reqMike;
	}

	public synchronized void booking() {

		if (Thread.currentThread().getName() == "John") {
			if (avl > reqJ) {
				System.out.println("John : booked :" + reqJ);
				avl = avl - reqJ;
			} else {
				System.out.println("John : Not booked :");
			}
		} else {

			if (avl > reqM) {
				System.out.println("Mike : booked :" + reqM);
				avl = avl - reqM;
			} else {
				System.out.println("Mike : Not booked :");
			}
		}

	}

}

public class TicketBooking extends Thread {
	static AvailableTicket avltic;

	public void run() {
		avltic.booking();
	}

	public static void main(String[] args) {
		Scanner tk = new Scanner(System.in);
		int availTickets = tk.nextInt();
		int reqJohn = tk.nextInt();
		int reqMike = tk.nextInt();
		avltic = new AvailableTicket(availTickets, reqJohn, reqMike);
		TicketBooking t1 = new TicketBooking();
		TicketBooking t2 = new TicketBooking();
		t1.setName("John");
		t2.setName("Mike");
		t1.setPriority(10);
		t1.start();
		t2.start();
		tk.close();
	}
}
