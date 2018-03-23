package colletions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


public class ArrayListExample1 {
	
	private int id;
	private String name;
	private String department;

	public ArrayListExample1(int id, String name, String department) {
		
		this.id = id;
		this.name = name;
		this.department = department;
	}
	@Override
    public String toString() {
 
        return "name: "+ this.id +" | department: "+ this.name +" | id: "+this.department;
    }
 
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public static void main(String[] args) {
		
		
		
		ArrayList<ArrayListExample1> al=new ArrayList<>();
		al.add(new ArrayListExample1(1,"srinivas","java_developer"));
		al.add(new ArrayListExample1(2,"prashanth","java_developer"));
		al.add(new ArrayListExample1(3,"sanjaykumar","java_developer"));
		
		/*al.stream().filter(a-> a.getName().matches("java_developer"))
		.findFirst()
		.ifPresent(System.out::println);

		al.stream().filter(emp->emp.getName().matches("java_developer"))
        .findAny()
        .ifPresent(System.out::println);*/
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
		ArrayListExample1 a=(ArrayListExample1) itr.next();
		System.out.println(a.getId()+" "+a.getName()+" "+a.getDepartment());
		}
		for(ArrayListExample1 s:al) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getDepartment());
		}
		
		
		
		}	
}
