package Lecture11;

public class Student_Client {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="Rahul";
		s1.age=16;
		
		Student s2 = new Student();
		s2.name="Raj";
		s2.age=18;
		
		System.out.println(s1.age+" "+s1.name);
		System.out.println(s2.age+" "+s2.name);
//		swap(s1,s2);
		String cname="Hello";
		int cage=20;
		Swap2(s1,s2,s1.name,s2.age,cage,cname);
		System.out.println(s1.age+" "+s1.name);
		System.out.println(s2.age+" "+s2.name);	
	}
	private static void Swap2(Student s1, Student s2, String name, int age, int cage, String cname) {
		// TODO Auto-generated method stub
		s1.name=cname;
		s1.age=age;
		s2.name="_";
		s1.name=s2.name;
		cname=s1.name;
		age=cage;	
	}

//	private static void swap(Student s1, Student s2) {
//		// TODO Auto-generated method stub
//		
//		s1=new Student();
//		s1.name=s2.name;
//		s2.age=s1.age;
//		
//		s2=new Student();
//		s2.name="Abc";
//		s1.age=15;
//	}

}
