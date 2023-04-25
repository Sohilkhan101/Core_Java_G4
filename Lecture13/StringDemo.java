package Lecture13;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "abcabc";
//		String s2 = "abc";
		String s2 = "abfd";

//		System.out.println(s);
//		s = s.concat("abc");
//		System.out.println(s);

		String s3 = new String("abc");
		System.out.println(s3);

//		System.out.println(s1 == s2);
//		System.out.println(s3 == s1);
		
		System.out.println(s2.equals(s1));
		
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.contains("gh"));
		System.out.println(s1.indexOf('c'));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.trim());

		

	}

}
