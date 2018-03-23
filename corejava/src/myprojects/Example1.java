package myprojects;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string  ");
		String name=s.nextLine();
		String lower=name.toLowerCase();
		
		for(int i=0;i<lower.length();i++) {
			char x=lower.charAt(i);
			if(x=='a' ||x=='e' ||x=='i' ||x=='o' ||x=='u') {
				System.out.print(name.charAt(i)+" ");
				
			}
			
		}

	}

}
