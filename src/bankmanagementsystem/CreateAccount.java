package bankmanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccount {
	public CreateAccount(Scanner scanner, int lastaccid, ArrayList<Account> accounts, ArrayList<CurrentAccount> cAccounts, ArrayList<SavingsAccount> sAccounts) {
		
		System.out.println("Enter first name: ");
		String firstName = scanner.next();
		
		System.out.println("Enter last name: ");
		String lastName = scanner.next();
		
		System.out.println("Enter balance: ");
		double balance = scanner.nextDouble();
		

		
		System.out.println("Enter a 4 digits passcode (digits only) : ");
		
		int passcode = scanner.nextInt();
		
				if(passcode>999 && passcode<10000) {
					System.out.println("Correct pin size");	
				} else {
					System.out.println("Incorrect pin size. Type a pin code of 4 digits: ");
					return;
			//passcode = scanner.nextInt();
		}
		
	
		
		System.out.println("Confirm passcode (digits only) : ");
		int passcodeConfirmation = scanner.nextInt();
		
		if(passcode != passcodeConfirmation) {
			System.out.println("Codes don't match");
			return; // adica executia se opreste daca nu e nimerit codul
		}
		
		/*System.out.println("Confirm passcode (digits only) : ");
		int passcodeConfirmation = scanner.nextInt();
		
		if(passcode != passcodeConfirmation) {
			System.out.println("Codes don't match");
			return; // adica executia se opreste daca nu e nimerit codul
		}*/
		
		
		System.out.println("Choose the type of account you want to open.\n1.Current account\n2.Savings account");
		
		int accountOption = scanner.nextInt();
		int id ; // numarul de cont porneste de la 1000000
		
		switch(accountOption) {
			case 1:
					id = 1000000 + lastaccid; 
					lastaccid ++;
					String idNou = Integer.toString(id) + "CR";
					CurrentAccount crAcc =  new CurrentAccount(firstName, lastName, idNou, balance, passcode);
					cAccounts.add(crAcc);
					System.out.println("You created a current account.\nYour account id: " + idNou); // se afiseaza id-ul creat pt contul curent
					new Menu(scanner, crAcc);
					break;
					
			case 2:
				id = 2000000 + lastaccid; 
				lastaccid ++;
				String idNou2 = Integer.toString(id) + "SV";
				SavingsAccount saveAcc =  new SavingsAccount(firstName, lastName, idNou2, balance, passcode);
				sAccounts.add(saveAcc);
				System.out.println("You created a savings account.\nYour account id: " + idNou2); // se afiseaza id-ul creat pt contul curent
				new Menu(scanner, saveAcc);
				break;
			default:
				System.out.println("Please choose an option from the above, 1 or 2");
				break;
					
		}
		
		
		//Account acc = new Account(firstName, lastName, id, balance, passcode); // se creaza un cont cu datele introduse de user
		//accounts.add(acc); // se adauga acest cont la lista de conturi
		//System.out.println("Your account id: " + id); // se afiseaza id-ul creat pt contul curent
		
		//new Menu(scanner, acc); // se afiseaza meniul cu optiunile existente pt contul nou creat
	}
}
