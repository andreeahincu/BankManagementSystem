package bankmanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner;
	static Integer lastaccid=1;
	static ArrayList<Account> accounts;
    static ArrayList<CurrentAccount> cAccounts;
	static ArrayList<SavingsAccount> sAccounts;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accounts = new ArrayList<>();
		cAccounts = new ArrayList<>();
		sAccounts = new ArrayList<>();
		scanner = new Scanner(System.in);
		
		
		int i=0;
		System.out.println("Welcome to bank management system ");
		do {
		System.out.println(" Please choose an option: ");
		System.out.println("1. Create new account");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		 i = scanner.nextInt();
		
		switch(i) {
			case 1: new CreateAccount(scanner, lastaccid, accounts, cAccounts, sAccounts);
				break;
			case 2: new Login(scanner, accounts, cAccounts, sAccounts);
				break;
			case 3: 
				System.out.println("Exiting now");
				//scanner.close();
				break;
			default:
				System.out.println("Please choose an option from the above, 1, 2 or 3");
				break;
			}

		}while(i!=3);
		//scanner.close();
	}
	
}
	
	

	
	

