package myprojects;

public class BreakContinue {

	public static void main(String[] args) {
		int[] numbers= {15,57,54,12,18,35,66,98,28,0,78,96,28};
		int sum=0;
		for(int i=0;i<=numbers.length;i++) {
			if(numbers[i]<=0) {
				System.out.println("Break statement coming because the number is :" +numbers[i]);
			break;
			}
			else if(numbers[i]%2 !=0) {
				System.out.println("Continue statement coming because the number is :" +numbers[i]);
			continue;
			}
			else {
				sum=sum+numbers[i];
				
			}
			
		}
		System.out.println("sum of all even numbers:" +sum);
	}

}
