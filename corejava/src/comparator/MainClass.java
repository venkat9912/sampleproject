package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();

		al.add(new Student(100,"sanjay",22,"ECE"));
		al.add(new Student(102,"prashanth",23,"CSE"));
		al.add(new Student(103,"sudhir",22,"IT"));
		al.add(new Student(101,"srinivas",23,"ECE"));
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Student a=(Student)itr.next();
			System.out.println(a.getRollno()+" "+a.getName()+" "+a.getAge()+" "+a.getDept());
		}
		System.out.println("");
		//COMPARATOR
		Collections.sort(al,new NameComparator());
		for(Student s:al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age+" "+s.dept);
		}
		System.out.println("");
		
		Collections.sort(al,new AgeComparator());
		for(Student s1:al) {
			System.out.println(s1.rollno+" "+s1.name+" "+s1.age+" "+s1.dept);
		}
	}

}
