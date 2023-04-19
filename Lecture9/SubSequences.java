package Lecture9;

public class SubSequences {
	public static void main(String[] args) {
		String s = "abc";
		int total = 1 << s.length();
		System.out.println(total);
		
		

		for (int i = 0; i < total; i++) {
			int pos = 0;
			int n = i;
			while (n != 0) {
				if ((n & 1) != 0) {
					System.out.print(s.charAt(pos));
				}
				pos++;
				n >>= 1;
			}
			System.out.println();

		}
	}

}
