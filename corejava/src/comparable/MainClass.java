package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Student1> al=new ArrayList<Student1>();  
		al.add(new Student1(101,"Vijay",23,"ece"));  
		al.add(new Student1(106,"Ajay",27,"cse"));  
		al.add(new Student1(105,"Jai",21,"it"));  
		//COMPARABLE  
		Collections.sort(al);  
		for(Student1 st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		} 
	//	System.out.println();

	}

}
