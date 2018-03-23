package atm_project;



public class DepositAmount extends AvailableBal {
	
	
	public void depositing(int amount) {
	
	balance=(int)balance+amount;
	
	
	
	System.out.println("deposited successfully");
	System.out.println("Available Current Balance is :: "+balance);

}
}
