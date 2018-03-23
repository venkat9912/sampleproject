package comparator;

public class Student {
	
	int rollno;
	String name;
	int age;
	String dept;
	public Student(int rollno, String name, int age, String dept) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getDept() {
		return dept;
	}
	
}
