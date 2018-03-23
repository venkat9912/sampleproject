package innerClasses;

public class MemberClassOuter {
	private int a=123;
	 
	
	public class NormalInner {
			public int display() {
				System.out.println("this is the method of inner class");
				return a;
			}
			
	}
			public static void main(String[] args) {
				MemberClassOuter m=new MemberClassOuter();
				
				MemberClassOuter.NormalInner i=m.new NormalInner();
				
				System.out.println(i.display());
			
			}
	 }

