package Lecture18;

public abstract class Abstract_Demo {

	public int add(int a, int b) {
		return a + b;
	}

	public abstract int mul(int a, int b);

	public abstract int sub(int a, int b);

//	public static void main(String[] args) {
//		Abstract_Demo a = new Abstract_Demo() {
//			@Override
//			public int sub(int a, int b) {
//				return a + b;
//			}
//
//			@Override
//			public int mul(int a, int b) {
//				return a * b;
//			}
//		};
//		a.add(4, 6);
//	}
}
