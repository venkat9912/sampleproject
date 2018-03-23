package myprojects;

public class Example8 {

	public static void main(String[] args) {
	new Thread (new Runnable() {
		public void run() {
			System.out.println("old way");
		}
	}).start();

	
	new Thread(()-> System.out.println("new way")).start();
	}

}
