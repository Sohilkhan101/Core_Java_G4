package Lecture18;

public interface Inter3  extends inter1 , Inter2{
	
	void size();
	void print();
	
	int val=15;
	
	default void A() {
		System.out.println("Default Method");
	}
	
	static void B() {
		System.out.println("Static Method");
 	}

}
