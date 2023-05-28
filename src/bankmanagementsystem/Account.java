package bankmanagementsystem;

public class Account {
	// properties
	private String firstName;
	private String lastName;
	private String id;
	private double balance;
	private int passcode;
	
	// default constructor
	public Account() {
		
	}
	
	// parameterized constructor
	public Account(String firstName, String lastName, String id, double balance, int passcode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.balance = balance;
		this.passcode = passcode;
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getPasscode() {
		return passcode;
	}
	
	public void setPasscode(int passcode) {
		this.passcode = passcode;
	}
	
}
