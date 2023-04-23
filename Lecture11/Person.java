package Lecture11;

public class Person {
	String name;
	int age;

	public Person() {
		System.out.println("constr");
	}
//
	public Person(String nam , int ag) {
//		int age=7;
//		String name="abc";
		this.name=nam;
		this.age=ag;
	}

	public void intro() {
		System.out.println(name + " " + age);
	}

}
