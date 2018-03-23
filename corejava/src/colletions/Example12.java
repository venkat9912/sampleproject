package colletions;

import java.util.TreeSet;

public class Example12 implements Comparable<Example12> {
	
	private String name;
	private String id;
	public Example12(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	@Override
	public int compareTo(Example12 o) {
		
		return id.compareTo(o.getId());
	}
	public static void main(String []args) {
		TreeSet<Example12> al=new TreeSet<Example12>();
		
		al.add(new Example12("srinivas","1"));
		al.add(new Example12("sanjay","9"));
		al.add(new Example12("prashanth","5"));
		al.add(new Example12("sudhir","4"));
		
	//	System.out.println(al);
		
		for(Example12 a:al) {
			System.out.println(a.getName()+" "+a.getId());
		}
		
	}

}
