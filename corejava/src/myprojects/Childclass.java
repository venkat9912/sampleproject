package myprojects;

public class Childclass extends Inheritance {
	int num=52;
	public void display() {
		System.out.println("this is the method of sub class");
	}
	public void my_method() {
		Childclass c=new Childclass();
		c.display();
		super.display();
		
		System.out.println("the value of sub class = "+c.num);
		System.out.println("the value of super class = "+super.num);
	}


public static void main(String[] args) {
	Childclass x=new Childclass();
	x.my_method();

}
}