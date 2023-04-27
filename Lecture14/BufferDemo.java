package Lecture14;

public class BufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("   abc   ");

//		System.out.println(sb.reverse());
//		System.out.println(sb.delete(0, 1));
//		System.out.println(sb.deleteCharAt(0));
//		System.out.println(sb.replace(0, 1, "abcdef"));
		sb.trimToSize();
		System.out.println(sb);
	}

}
