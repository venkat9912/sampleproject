package innerClasses;

import java.util.*;

public class LocalClass {
	public void display() {
		class Inner{
			public void show(){
				String s="program";
				System.out.print("hello ");
				System.out.print(s);
			}
		}
		Inner i=new Inner();
		i.show();
	}

	public static void main(String[] args) {
		
		LocalClass l=new LocalClass();
		l.display();
		

	}

}
