package Lecture17;

public class Try_CatchDemo2 {
	public static void main(String[] args) {
		int[] arr = new int[6];
//		String s = null;

		try {
			
			try {
				arr[10] = 18;
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
//			System.out.println(s.length());

			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally");
		}

	}

}
