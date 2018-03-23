package myprojects;

public class Eligibility {
	
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int s) {
		age=s;
	}
	void vote() {
	if(age>21) {
		System.out.println("eligible");
	}
	else {
		System.out.println("not eligible");
	}

}
}
