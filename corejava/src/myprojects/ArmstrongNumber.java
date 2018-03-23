package myprojects;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int c=0,a,temp;
		Scanner in=new Scanner(System.in);
		System.out.print("enter value == ");
		int num=in.nextInt();
		temp=num;
		
		while(num>0) {
			
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		if(temp==c) {
			System.out.println("the given number is  armstrong");
		}
		else {
			System.out.println("the given number is not armstrong");
		}
	}

}
