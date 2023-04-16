package Lecture1;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Divident =60;
		int Divisor=34;
		
		while(Divident%Divisor!=0) {
			int rem=Divident%Divisor;
			Divident=Divisor;
			Divisor=rem;
					
		}
		
		
		
	}

}
