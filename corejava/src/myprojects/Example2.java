package myprojects;

public class Example2 {

	public static void main(String[] args) {
		
		int breakLimit=11;
		
		outer: for(int i=0; ;i++) {
			for(int j=0;j<12;j++) {
				
				if(j>i) {
					System.out.println();
					continue outer;
				}
				System.out.print(" "+(i*j));
			}
			if(i==breakLimit) {
				break outer;
			}
			System.out.println();
		}

	}

}
