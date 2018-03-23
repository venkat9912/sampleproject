package exception_handling;

public class NestedTryCatch {

	public static void main(String[] args) {
	try {
		try {
			System.out.println("going to divide...");
			int a=21;
			int b=0;
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int a[]=new int[5];
			a[5]=21/4;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("other statements...");

		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("completed.");

	}

}
