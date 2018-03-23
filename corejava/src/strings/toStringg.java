package strings;

public class toStringg {
	
	
	@Override
	public String toString() {
		return " [name=" + name + ", lname=" + lname + "]";
	}

	String name="srinivas";
	String lname="vasu";

	public static void main(String[] args) {
		toStringg str=new toStringg();
		
		System.out.println(str);
		

	}

}
