package innerClasses;

public class NormalInner {

	public static void main(String[] args) {
	AnonymousInner a=new AnonymousInner() {

		@Override
		void add() {
			System.out.println("add");
		}

		@Override
		void sub() {
			System.out.println("sub");
		}

	};
	
	a.add();
	a.sub();
	}

}

