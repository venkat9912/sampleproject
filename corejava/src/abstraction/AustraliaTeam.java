package abstraction;

 public class AustraliaTeam extends Cricketteam {
	
	 public void jersey() {
		System.out.println("Yellow jersey");
	}
	 
	public void captain() {
		System.out.println("Australian Team Captain : STEVEN SMITH");
	}

	@Override
	public void batsmen() {
		System.out.println(("Batsmen Are :: D Warner ,A Finch ,S Smith ,G Maxwell ,M Wade ,P Handscomb."));
		
	}

	@Override
	public void bowlers() {
		System.out.println("Bowlers Are :: P Cummins ,M Starc ,N Lyon ,J Hazlewood.");
		
	}

	@Override
	public void allrounder() {
		System.out.println("AllRounder  :: M Marsh.");
		
	}

}
