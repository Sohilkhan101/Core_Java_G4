package Lecture9;

public class CheckithBit {
	public static void main(String[] args) {
		int n=8;
		int pos=4;
		n=n>>(pos-1);
		System.out.println(n);
		if((n&1)==1) {
			System.out.println("Set");
		}else {
			System.out.println("Unset");
		}
	}

}
