package myprojects;

public class ConstructorChain {
	
	ConstructorChain(){
		
		System.out.println("Defaul constructor");
	}
	ConstructorChain(int x){
		this();
		System.out.println(x+" single parameter");	
	}
	ConstructorChain(int x,int y){
		this(10);
		System.out.println(x-y+" double parameter");
	}
	

	public static void main(String[] args) {
		
		new ConstructorChain(10,3);
		

	}

}
