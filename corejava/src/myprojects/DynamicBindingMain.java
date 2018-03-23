package myprojects;

public class DynamicBindingMain extends DynamicBinding {
	int a=22;
	static int i=23;
	public static void method1() {
		System.out.println("child class method1...");
	}
	
	public void method2() {
		System.out.println("child class method2...");
	}

	public static void main(String[] args) {
		DynamicBinding d=new DynamicBindingMain();
	//	DynamicBindingMain db=new DynamicBindingMain();
		d.method1();
		d.method2();
      System.out.println(i);
    //  System.out.println(db.a);
	}

}
