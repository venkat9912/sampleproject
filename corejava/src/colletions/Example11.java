package colletions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Example11 {

	public static void main(String[] args) {
	LinkedHashSet<String> al=new LinkedHashSet<String>();	
	al.add("srinivas");
	al.add("sanjay");
	al.add("prashanth");
	al.add("sanjay");
	
	//USING TOSTRING
	System.out.println(al.toString());
	
	
	HashSet<String> al1=new HashSet<String>();
	al1.add("srinivas");
	al1.add("sanjay");
	al1.add("prashanth");
	al1.add("sanjay");
	//DIRECT PRINTING
	System.out.println(al1);
	
	TreeSet<String> al2=new TreeSet<String>();
	al2.add("srinivas");
	al2.add("sanjay");
	al2.add("prashanth");
	al2.add("sanjay");
	
	//USING ITERATOR
	Iterator itr=al2.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());	
	}
	//USING FOR EACH
	for(String b:al) {
	System.out.println(b);
}
	}

}
