package Lecture11;

public class C {
	public static void main(String[] args) {
		// Case 1
//		A a = new A();
//		System.out.println(a.d1);
//		System.out.println(a.d2);
//		a.fun();
//		a.fun1();
		
		
		//Case 2
		A a = new B();
		System.out.println(a.d1);
		System.out.println(a.d2);
//		a.fun2();
		a.fun1();
		a.fun();
		
		System.out.println(((B)a).d1);
		System.out.println(a.d2);
		((B)a).fun2();
		((A)a).fun(); // Not Done
	
//		Case 3
		
		
		
//		Case 4

	}
}
