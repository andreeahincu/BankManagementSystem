package bankmanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	public Login(Scanner scanner, ArrayList<Account> accounts, ArrayList<CurrentAccount> cAccounts, ArrayList<SavingsAccount> sAccounts) {
		System.out.println("Enter first name: ");
		String firstName = scanner.next();
		
		System.out.println("Enter last name: ");
		String lastName = scanner.next();
		
		System.out.println("Enter balance: ");
		double balance = scanner.nextDouble();
		
		System.out.println("Enter account id: ");
		String id = scanner.next();
		
		System.out.println("Enter passcode:");
		int passcode = scanner.nextInt();
		
		//Account account = new Account(); // se creaza un cont gol
		boolean existAsCurrent = false;
		boolean existAsSavings = false;
		/*for(Account acc : accounts) {
			if( acc.getId() == id && acc.getPasscode() == passcode)
				exist = true;
				account = acc;
		} // se cauta contul in lista de conturi deja existente
		*/
		
		CurrentAccount cA = new CurrentAccount(firstName, lastName, id, balance, passcode);
		for(CurrentAccount cr : cAccounts) {
			if(cr.getId().equals(id) && cr.getPasscode()==passcode) {
				System.out.println("Current account found");
				existAsCurrent = true;
				//new Menu(scanner, cA);
				//cA = cr;
			} else {
				System.out.println("Account not found of type current");
			    }
			}
		
		
		SavingsAccount sA = new SavingsAccount(firstName, lastName, id, balance, passcode);
		for(SavingsAccount sv : sAccounts) {
			if(sv.getId().equals(id) && sv.getPasscode()==passcode) {
				System.out.println("Savings Account found");
				existAsSavings = true;
				//new Menu(scanner, sA);
				//sA = sv;
			} else {
				System.out.println("Account not found of type savings");
			}
		}
		
		
		if(existAsCurrent) {
			new Menu(scanner, cA);
		} else if(existAsSavings) {
			new Menu(scanner, sA);
		} else {
			System.out.println("Account doesn't exist");
		}
	}
}
