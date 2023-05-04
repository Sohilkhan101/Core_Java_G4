package Lecture17;

public class Try_CatchDemo1 {
	public static void main(String[] args) {
		int[] arr = new int[6];
//		String s = null;
		
		try {
//			int a = 10 / 0;
			arr[10]=18;
//			System.out.println(a);
//			System.out.println(s.length());
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
