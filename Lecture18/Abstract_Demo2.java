package Lecture18;

public class Abstract_Demo2 {
	public static void main(String[] args) {
		Abstract_Demo a = new Abstract_Demo() {

			@Override
			public int mul(int a, int b) {
				return a * b;
			}

			@Override
			public int sub(int a, int b) {
				return a - b;

			}
		};
		a.add(4, 6);
	}

}
