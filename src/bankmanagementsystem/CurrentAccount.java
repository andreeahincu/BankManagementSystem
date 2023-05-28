package bankmanagementsystem;

public class CurrentAccount extends Account{
	
	/*String firstName;
	String lastName;
	int id;
	double balance;
	int passcode;*/
	
	public CurrentAccount() {
		super();
	}
	
	public CurrentAccount(String firstName, String lastName, String id, double balance, int passcode) {
		super(firstName, lastName, id, balance, passcode);
	}
	
	// Method to deposit money in the current account
		 public void depositInCR(CurrentAccount acc, double amount) {
			 double depositFee = 1.37;
			 if(amount > depositFee*2) {
				 acc.setBalance(acc.getBalance() + amount - depositFee);
				 System.out.println("You have successfully deposited " + amount + "$"); 
			 } else {
				 System.out.println("You have to deposit at least " + 2*depositFee + "$");
			 }
		 }
		 
	
	// Method to withdraw money from the current account
		 public void withdrawFromCR(CurrentAccount acc, double amount) {
			 double withdrawFee = 2.17;
			 if(acc.getBalance() >= amount + withdrawFee) {
				 acc.setBalance(acc.getBalance()-amount-withdrawFee);
				 System.out.println("You have successfully withdrawn " + amount +"$");
			 } else {
				 System.out.println("Not enough funds");
			 }
		 }
	
}
