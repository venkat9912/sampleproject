package abstraction;

import java.util.Scanner;

public class Test  {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Team Name :: ");
		String team=sc.nextLine();
		
		
		if(team.equals("india")) {
		
		IndiaTeam it=new IndiaTeam();
		it.jersey();
		it.captain();
		it.batsmen();
		it.bowlers();
		it.allrounder();
		}
		
		
		if(team.equals("england")){
	 
	    EnglandTeam et=new EnglandTeam();
	    et.jersey();
		et.captain();
		et.batsmen();
		et.bowlers();
		et.allrounder();
		}
		
		
		if(team.equals("australia")){
		
		AustraliaTeam at=new AustraliaTeam();
		at.jersey();
		at.captain();
		at.batsmen();
		at.bowlers();
		at.allrounder();
		 }
		
		}

}
