package Lecture14;

public class BuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb);
		sb.append("def");
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.setCharAt(4, 'a');
		System.out.println(sb);
		System.out.println(sb.lastIndexOf("a"));
	}

}
