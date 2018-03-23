package atm_project;

public class WithdrawAmount extends DepositAmount {
	
	public void withdraw(int amount) {
		
		
		if(amount>balance) {
			System.out.println("Insufficient Funds.");
		}else {
		balance= (balance-amount);
		System.out.println("Available Current Balance is :: "+balance);	
		
	}
		
	}
}
