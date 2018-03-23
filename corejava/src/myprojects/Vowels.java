package myprojects;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		String character =sc.nextLine();
		
		switch(character) 
		{
		case "a":System.out.println("it is vowel");
		    break;
		case "e":System.out.println("it is vowel");
	     	break;
		case "i":System.out.println("it is vowel");
	     	break;
		case "o":System.out.println("it is vowel");
			break;
		case "u":System.out.println("it is vowel");
			break;
		case "A":System.out.println("it is vowel");
	     	break;
		case "E":System.out.println("it is vowel");
	     	break;
		case "I":System.out.println("it is vowel");
	     	break;
		case "O":System.out.println("it is vowel");
	     	break;
		case "U":System.out.println("it is vowel");
	     	break;
       
	default:System.out.println("it is not vowel");
	}

}
}