package Lecture17;

public class Student {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
//		int age=0;
//		if(age<0) {
//			System.out.println("age can not be -Ve");
//		}
		
		try {
		if(age <0)
		 throw new Exception("age can not be -Ve");
		this.age = age;

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void intro() {
		System.out.println(name + " " + age);
	}

}
