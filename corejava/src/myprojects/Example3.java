package myprojects;

public class Example3 {

	public static void main(String[] args) {
		int k=2;
		for( k=2;k<=43;k++) {
			new Example3().checkEven(k);
		}
		
	}
		public boolean checkEven(int a) {
			if(a%2==0) {
				System.out.println(a+" is even number");
					return true;
		}
			System.out.println(a+" is odd number");
			return false;

	}

}
