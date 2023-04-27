package Lecture14;

public class Stringbuffer {
	public static void main(String[] args) {
		String s = "abc";
		StringBuffer sb = new StringBuffer(s);

		int start = (int) System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append("a");
		}
		int end = (int) System.currentTimeMillis();
		System.out.println(end - start);

		s = "abc";
		start = (int) System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			s = s + "a";
		}
		end = (int) System.currentTimeMillis();
		System.out.println(end - start);
	}

}
