package Lecture10;

public class Student_Client {
	public static void main(String[] args) {
		Student s = new Student();
		s.age = 12;
		s.name = "Rahul";

		Student s1 = new Student();
		s1.age = 13;
		s1.name = "Raj";

		System.out.println(s.name + " " + s.age);
		System.out.println(s1.name + " " + s1.age);

		Swap(s, s1);
		
		System.out.println(s.name + " " + s.age);
		System.out.println(s1.name + " " + s1.age);

	}

	private static void Swap(Student s, Student s1) {
		// TODO Auto-generated method stub
		Student temp = s;
		s = s1;
		s1 = temp;
	}

}
