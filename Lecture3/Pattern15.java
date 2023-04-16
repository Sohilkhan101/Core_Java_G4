package Lecture3;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int nsp=0;
		int nst=n;
		int row=(2*n)-1;
		
		int i=1;
		while(i<=row) {
			
			for(int j=0;j<nsp;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<nst;j++) {
				System.out.print("*");
			}
			
			if(i<n) {
				nst--;
				nsp+=2;
			}else {
				nst++;
				nsp-=2;
			}
			
			i++;
			System.out.println();
			
		}
	}

}
