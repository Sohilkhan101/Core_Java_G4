package Lecture2;

public class Pattern6 {
	public static void main(String[] args) {
		int n=5;
		int nsp=0;
		int nst=n;
		int row=n;
		int i=0;
		while(i<row) {
			
			for(int j=0;j<nsp;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<nst;j++) {
				System.out.print("*");
			}
			System.out.println();
			nsp=nsp+2;
			nst--;
			i++;
		}
	}

}
