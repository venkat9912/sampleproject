package strings;

public class StringBufferr {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("java string buffer");
		
		System.out.println(s);
		
		System.out.println(s.append(" is mutable"));
		
		System.out.println(s);
		System.out.println(s.reverse());
		System.out.println(s.capacity());

	}

}
