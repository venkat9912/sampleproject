package assessment;

public class Armstrong {

	public static void main(String[] args) {
		int a,num,temp,c=0;
		num=153;
		temp=num;
		while(num>0) {
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		if(temp==c) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not An Armstrong Number");
		}
		}

	}


