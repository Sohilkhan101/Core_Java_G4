package Lecture16;

//81615
public class toString_Demo {

	public static void main(String[] args) {

		String s = "Abc";	
		System.out.println(s);
		int n = 12345;
		String st = Integer.toString(n);
		System.out.println(st);

		String k1 = "abc";

		StringBuffer s1 = new StringBuffer(k1);
		System.out.println(s1);

		String k2 = "xyz";
		StringBuilder s2 = new StringBuilder(k2);
		System.out.println(s2);

		String k3 = s1.toString();
		System.out.println(k3);

		StringBuilder s4 = new StringBuilder(k3);
		System.out.println(s4);
	}

}
