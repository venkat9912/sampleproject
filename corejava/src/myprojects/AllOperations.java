package myprojects;

import java.util.Scanner;

public class AllOperations {

	public static void main(String[] args) {
	Addition add=new Addition();
	Sub sub=new Sub();
	Division div=new Division();
	Multiplication multin=new Multiplication();
	Modular mod=new Modular();
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter A value==");
	int a=sc.nextInt();
	System.out.println("enter B value==");
	int b=sc.nextInt();
	
	add.addition(a, b);
	sub.subb(a, b);
	div.division(a, b);
	multin.multi(a, b);
	mod.modular(a, b);

	}

}
