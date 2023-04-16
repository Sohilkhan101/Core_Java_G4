package Lecture3;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = (2 * n) - 1;
		int nst = 1;

		int i = 1;
		while (i <= row) {

			for (int j = 0; j < nst; j++) {
				System.out.print("*");
			}

			if (i < n) {
				nst++;
			} else {
				nst--;
			}

			System.out.println();
			i++;
		}
	}

}
