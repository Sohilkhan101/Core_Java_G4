package Lecture17;

public class StudentClient {
	public static void main(String[] args){
		Student st = new Student();
//		st.name = "abc";
//		st.age = 14;
		
//		try {
//			st.setAge(-17);
//		}catch (Exception e2) {
////			System.out.println(e2);
//			e2.printStackTrace();
//		}
		st.setAge(-23);
		st.setName("abc");
		st.intro();
	}

}
