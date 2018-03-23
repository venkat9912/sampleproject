package comparable;

 class Student1 implements Comparable<Student1> {
	int rollno;
	String name;
	int age;
	String dept;
	public Student1(int rollno, String name, int age, String dept) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	public String getname() {
		return name;
	}
	
	
	
	/*@Override
	public int compareTo(Student1 o) {
		if(age==o.age)
			return 0;
			else if(age>o.age)
				return 1;
			else
				return -1;
	}*/
	public int compareTo(Student1 o) {
		return name.compareTo(o.getname());
	}
	
	
	
}
