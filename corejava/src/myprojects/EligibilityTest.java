package myprojects;

public class EligibilityTest {
	
public static void main(String[] args) {
	
	Eligibility e1=new Eligibility();
	e1.setAge(32);
	Eligibility e2=new Eligibility();
	e2.setAge(12);
	
	System.out.println("e1 : "+e1.getAge());
	System.out.println("e2 : "+e2.getAge());
	
	e1.vote();
	e2.vote();
	
}

}
