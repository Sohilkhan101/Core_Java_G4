package Lecture11;

public class Methods {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		System.out.println(add(a, b));
		Methods m = new Methods();
		System.out.println(m.sub(a, b));
	}

	private int sub(int a, int b) {
		return a - b;
	}

	private static int add(int a, int b) {
		return a + b;
	}
	
	static {
		System.out.println("Inside Static");
	}

}
