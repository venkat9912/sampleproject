package colletions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	int id;
	String name;
	String department;

	public ArrayListExample(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public static void main(String[] args) {
		ArrayListExample e=new ArrayListExample(1,"srinivas","java_developer");
		ArrayListExample e1=new ArrayListExample(2,"prashanth","java_developer");
		ArrayListExample e2=new ArrayListExample(3,"sanjaykumar","java_developer");
		
		ArrayList<ArrayListExample> al=new ArrayList<ArrayListExample>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
		ArrayListExample a=(ArrayListExample) itr.next();
		System.out.println(a.getId()+" "+a.getName()+" "+a.getDepartment());
		}
		for(ArrayListExample s:al) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getDepartment());
		}
		}	
}
		
		

	
	

