package abstraction;

public class EnglandTeam extends Cricketteam {
	
	public void jersey() {
		System.out.println("Dark Blue jersey");
	}
	
	public void captain() {
		System.out.println("England Team Captain : JOE ROOT");
	}

	@Override
	public void batsmen() {
		System.out.println("Batsmen Are :: J Roy ,A Hales ,J Root ,E Morgan ,J Buttler ,S Billings.");
		
	}

	@Override
	public void bowlers() {
		System.out.println("Bowlers Are :: M Ali ,C Woakes ,L Plunket ,D Willey.");
		
	}

	@Override
	public void allrounder() {
		System.out.println("AllRounder  :: B Stokes.");
		
	}
	

}
