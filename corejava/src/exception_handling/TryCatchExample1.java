package exception_handling;

public class TryCatchExample1 {

	public static void main(String[] args) {
		try {
			int a[]=new int [5];
			a[5]=4/2;
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound");
		}

		catch(Exception e) {
			System.out.println("exception");
		}
		System.out.println("rest of the code...");
		
	}

}
