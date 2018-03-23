package strings;

import java.util.Arrays;

public class Stringexample {
	
	int [] array= {1,2,3,4};
	
	public String toString() {
		return Arrays.toString(array);
	}


		public static void main(String[]args) {
			Stringexample s=new Stringexample();
			
			System.out.println(s);
		}
}
