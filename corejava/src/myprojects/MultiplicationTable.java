package myprojects;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value==");
		int a=sc.nextInt();
	
		for(int i=1;i<=a;i++) {
			
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		

	}

}
