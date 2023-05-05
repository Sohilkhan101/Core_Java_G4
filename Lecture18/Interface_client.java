package Lecture18;

public class Interface_client implements Inter3 {

	@Override
	public void display() {
 		System.out.println("abc");
	}

	@Override
	public void fun() {
 		System.out.println("abc");
	}

	@Override
	public void fun2() {
 		System.out.println("fun2");
	}

	@Override
	public void size() {
 		System.out.println(10);

	}

	@Override
	public void print() {
 		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println(Inter3.val);
		Interface_client ic = new Interface_client();
		ic.fun();
		ic.fun2();
	}
}
