package exception_handling;

public class CustomException {
	public void exception(int a) throws MyException {
		if(a<10) {
			System.out.println("custom exception...");
			throw new MyException() ;	
		}
	}
		public static void main(String[] args)  {
			CustomException c=new CustomException();
			try {
			c.exception(1);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}


