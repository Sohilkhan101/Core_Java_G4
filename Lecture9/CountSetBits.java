package Lecture9;

public class CountSetBits {
	public static void main(String[] args) {
		int n = 767996;
		int count = 0;

//		while (n != 0) {
//			if ((n & 1) == 1) {
//				count++;
//			} 
//			n >>= 1;
//		}
//		System.out.println(count);

		n = 8;
		count = 0;
		while (n != 0) {
			int mask = n - 1;
			n = n & mask;
			count++;
		}
		System.out.println(count);

	}

}
