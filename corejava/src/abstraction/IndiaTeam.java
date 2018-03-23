package abstraction;

 public class IndiaTeam extends Cricketteam {
	
	 public void jersey() {
		System.out.println("Blue jersey");
	}
	 
	public void captain() {
		System.out.println("Indian Team Captain : VIRAT KOHLI");
	}

	@Override
	public void batsmen() {
		System.out.println("Batsmen Are :: R Sharma ,S Dhawan ,V Kohli ,A Rahane ,MS Dhoni ,M Pandey.");
	}

	@Override
	public void bowlers() {
		System.out.println("Bowlers Are :: B Kumar ,K Yadav ,J Bumrah ,Y Chahal.");
		
	}

	@Override
	public void allrounder() {
		System.out.println("AllRounder  :: H Pandya.");
		
	}

	

}
