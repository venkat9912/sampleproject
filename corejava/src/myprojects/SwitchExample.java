 package myprojects;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter GRADE::");
		String character=sc.nextLine();
		
		switch(character)
		{
		case "A":System.out.println("You are Grade A Employee: Bonus="+8000);
			break;
		case "B":System.out.println("You are Grade B Employee: Bonus="+5000);
			break;
		case "C":System.out.println("You are Grade C Employee: Bonus="+2000);
			break;
			default:System.out.println("You are Grade D Employee: Bonus="+1000);
		}

	}

}
