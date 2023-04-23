package Lecture11;

public class Person_client {
	public static void main(String[] args) {
		Person p = new Person();
		p.name="raj";
		p.age=14;
		p.intro();
		
		Person p1 = new Person("ram",20);
		p1.intro();
	}
	
	static {
		System.out.println("Inside Static");
	}

}
