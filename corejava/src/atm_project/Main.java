package atm_project;

import java.util.Scanner;

public class Main {
	 

	public static void main(String[] args) {
		
		
		Scanner m=new Scanner(System.in);
		ChangePin w=new ChangePin();
		
		while(true) {
			System.out.println("Enter Pin Number :: ");
			int p=m.nextInt();
			
			
			if(w.pin==p) {
				System.out.println("1.AvailableBalance"
				+ " 2.DepositAmount "
				+ "3.WithdrawAmount\n"
				+ "4.ChangePin "
				+ "5.Exit\n ");
		
		
		System.out.println("Choose your option :: ");
		int i=m.nextInt();
		
		
		if(i==1) {
			w.available();
		}
		
		
		else if(i==2) {
			System.out.println("Enter Amount :: ");
			int j=m.nextInt();
			w.depositing(j);
		}
		else if(i==3) {
			System.out.println("Enter Withdraw Amount :: ");
			int x=m.nextInt();
			w.withdraw(x);
		}
		else if(i==4) {
			System.out.println("Enter New Pin Number :: ");
			int y=m.nextInt();
			w.setPinn(y);	
		}
		else if(i==5) {
			System.out.println("Thank You, Visit Again.");
			break;
			}
			
		else {
			System.out.println("Sorry, Invalid Option");
		}
		}
			else {	
			System.out.println("Invalid Pin Number, Please Try Again.");
			continue;
		}
	}
		
	}
}

