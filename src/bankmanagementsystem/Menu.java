package bankmanagementsystem;
import java.util.Scanner;

public class Menu {
/*	public Menu(Scanner scanner, Account acc) {
		int menuOption=0;
		System.out.println("Welcome " + acc.getFirstName() + " "+ acc.getLastName());
		do {
		System.out.println("1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
		
		 menuOption = scanner.nextInt();
		 
		switch(menuOption) {
		case 1:
			//if(CreateAccount.accountOption==1)
				
			//new Deposit(scanner, acc);
			break;
		case 2:
			//new Withdraw(scanner, acc);
			break;
		case 3:
			System.out.println("Your balance is: " + acc.getBalance());
			break;
		case 4:
			System.out.println("Exiting now...");
			//scanner.close();
			break;
		default:
			System.out.println("Please choose an option from 1 to 4");
		}
		} while(menuOption!=4);
	}*/
	
	public Menu(Scanner scanner, CurrentAccount crAcc) {
		int j=0;
		
		System.out.println("Welcome " + crAcc.getFirstName() + " "+ crAcc.getLastName());
		do {
		System.out.println("1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
		
		 j = scanner.nextInt();
		 
		switch(j) {
		case 1:
			//new Deposit(scanner, crAcc);
			System.out.println("Type the amount you want to deposit: ");
			double amountDeposited = scanner.nextDouble();
			crAcc.depositInCR(crAcc, amountDeposited);
			break;
			
		case 2:
			System.out.println("Type the amount you want to withdraw: ");
			double amountWithdrawn = scanner.nextDouble();
			//new Withdraw(scanner, crAcc);
			crAcc.withdrawFromCR(crAcc, amountWithdrawn);
			break;
			
		case 3:
			System.out.println("Your balance is: " + crAcc.getBalance() +"$");
			break;
			
		case 4:
			System.out.println("Exiting now...");
			//scanner.close();
			break;
			
		default:
			System.out.println("Please choose an option from 1 to 4");
	
		}
		
		} while(j!=4);
	}
	
	
	public Menu(Scanner scanner, SavingsAccount saveAcc) {
		int j=0;
		
		System.out.println("Welcome " + saveAcc.getFirstName() + " "+ saveAcc.getLastName());
		do {
		System.out.println("1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
		
		 j = scanner.nextInt();
		 
		switch(j) {
		case 1:
			//new Deposit(scanner, crAcc);
			System.out.println("Type the amount you want to deposit: ");
			double amountDeposited = scanner.nextDouble();
			saveAcc.depositInSV(saveAcc, amountDeposited);
			break;
			
		case 2:
			System.out.println("Type the amount you want to withdraw: ");
			double amountWithdrawn = scanner.nextDouble();
			//new Withdraw(scanner, crAcc);
			saveAcc.withdrawInSV(saveAcc, amountWithdrawn);
			break;
			
		case 3:
			System.out.println("Your balance is: " + saveAcc.getBalance() +"$");
			break;
			
		case 4:
			System.out.println("Exiting now...");
			//scanner.close();
			break;
			
		default:
			System.out.println("Please choose an option from 1 to 4");
			break;
		
		}
		
		} while(j!=4);
	}
	
	
	
	
}
