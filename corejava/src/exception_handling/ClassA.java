package exception_handling;

public class ClassA {
	public void ClassA() throws MyException {
		CustomException x=new CustomException();
		x.exception(5);
	}
	public static void main(String[] args) throws MyException {
		ClassA y=new ClassA();
		y.ClassA();
	}

}
