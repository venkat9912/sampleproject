package myprojects;

public class Arrays {
	public void array() {

	
		int [] index=new int[4];
		index[0]=2;
		index[1]=0;
		index[2]=1;
		index[3]=3;
		
		String [] islands=new String[4];
		islands[0]="bermuda";
		islands[1]="fiji";
		islands[2]="arozes";
		islands[3]="cozumel";
		
		int y=0;
		int ref;
		
		while(y<4) {
			ref=index[y];
			System.out.print("island = ");
			System.out.println(islands[ref]);
			y=y+1;
		}

	}

}
