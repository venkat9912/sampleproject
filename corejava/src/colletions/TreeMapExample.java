package colletions;

import java.util.Map;
import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();

		map.put(1, "prashanth");
		map.put(3, "sanjay");
		map.put(2, "srinivas");
		map.put(5, "sudhir");
		System.out.println("TreeMap::");
		//USING FOREACH
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println();
		
		HashMap<Integer,String> map1=new HashMap<Integer,String>();

		map1.put(1, "prashanth");
		map1.put(3, "sanjay");
		map1.put(2, "srinivas");
		map1.put(5, "sudhir");
		System.out.println("HashMap::");
		
		//USING FOREACH
		for(Map.Entry m:map1.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println();
		
		//USING ITERATOR
		Iterator<Map.Entry<Integer,String>> itr=map1.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	/*	System.out.println();
		
		LinkedHashMap<Integer,String> map2=new LinkedHashMap<Integer,String>();

		map2.put(1, "prashanth");
		map2.put(3, "sanjay");
		map2.put(2, "srinivas");
		map2.put(5, "sudhir");
		System.out.println("LinkedHashMap::");
		
		//USING FOREACH
		for(Map.Entry m:map2.entrySet())
		
		{
			
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
	}

}
