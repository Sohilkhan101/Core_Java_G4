package Lecture13;

public class SubStrings {
	public static void main(String[] args) {
		String s = "hello";
//		System.out.println(s.substring(1));
//		System.out.println(s.substring(0, s.length()));

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}

		}

	}
}
