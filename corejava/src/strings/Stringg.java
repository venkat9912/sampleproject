package strings;

public class Stringg {

	public static void main(java.lang.String[] args) {
		String s="java_string_is_";
		
		System.out.println(s);
		
		System.out.println(s.concat("immutable"));
		
		System.out.println(s);
		
		
		//	string methods
		System.out.println(s.length());
		System.out.println(s.charAt(14));
		System.out.println(s.substring(5));
		System.out.println(s.indexOf("t"));
		System.out.println(s.substring(0,4));
		System.out.println(s.substring(5));
		System.out.println(s.replace('_', '-'));
		System.out.println(s.codePointAt(1));
		System.out.println(s.toUpperCase());
		System.out.println(s.codePointCount(1, 9));
		System.out.println(s.intern());
		
		

	}

}
