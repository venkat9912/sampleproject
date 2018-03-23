package strings;

public class HashCodeEquals {
	
	char a='s';
	int b=101;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeEquals other = (HashCodeEquals) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}


	public static void main(String[] args) {
		
		HashCodeEquals hc=new HashCodeEquals();
		HashCodeEquals hce=new HashCodeEquals();
		
		System.out.println(hc);
		System.out.println(hce);
		

	}

}
