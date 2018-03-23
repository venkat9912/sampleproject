package league;

import java.util.*;

public class Matches {
	public void match() {
		String[] groupA= {"india","australia","england","new zealand"};
		String[] groupB= {"srilanka","south africa","bangladesh","pakistan"};
		
		HashSet<String>game=new HashSet<String>();
		HashSet<String>game1=new HashSet<String>();
		HashSet<String>game2=new HashSet<String>();
		
		while(true) {
			
			int rand1=(int)(Math.random()*groupA.length);
			int rand2=(int)(Math.random()*groupB.length);
			
			
			game1.add(groupA[rand1]);
			game2.add(groupB[rand2]);
			if(game1.size()==4&&game2.size()==4) {
				break;
			}
			
		}
		ArrayList<String>sport1=new ArrayList<String>(game1);
		ArrayList<String>sport2=new ArrayList<String>(game2);
		
		
		for(int i=0;i<4;i++) {
			game.add(sport1.get(i)+" vs "+sport2.get(i));
			
		}
		System.out.println(game);
		
	}
	public static void main(String[]args) {
		Matches m=new Matches();
	m.match();
	
	}

}
