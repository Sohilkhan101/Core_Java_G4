package Lecture14;

import java.util.StringTokenizer;

public class Tokanizer {
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("sky is blue");
		System.out.println(st);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	
		StringTokenizer st1 = new StringTokenizer("4+5*6/12*7","+*/");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer("4+5*6/12*7","+*/",true);
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
