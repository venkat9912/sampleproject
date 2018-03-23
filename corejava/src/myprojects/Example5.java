package myprojects;

public class Example5 {
	public void printOut(StringBuffer str1) {
		System.out.println(str1.append("Reference"));
	}

	public static void main(String[] args) {
		Example5 e=new Example5();
		StringBuffer str2=new StringBuffer("Pass By ");
		e.printOut(str2);
		System.out.println(str2);

	}

}
