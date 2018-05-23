package oop;

public class BankAccount {  //we know this is the parent class because of the constructors using same name as the class
	//define variables 
	String accountNumber;
	
	//static belong to the CLASS not the object instance and final is constant
	private static final String routingNumber = "12345678";// 
	//Instance Variable
	String name;
	private String ssn;  //encapsulation works=============================hide our variables
	String accountType;
	double balance = 0;
	

	//constructors definitions: unique methods
		//1. They are used to define / setup / initialize properties of an object
		//2. Constructors are IMPLICITLY called upon instantiation
		//3. The same name as the class itself
		//4. Constructors have NO return type
	
	//this is 3 different constructors we know because same name as the class
	//Constructors Definitions:unique methods
	//constructors are methods so they have open close brackets arguments and body
	BankAccount(){  
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading call same method name with different arguments java know which one you are calling based on the arguments passed
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all local variables they are define within blocks
		System.out.println("NEW ACCOUNT:" + accountType);
		System.out.println("INITIAL DEPOSIT OF: $ " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
			
		} else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		
		System.out.println(Msg);
		balance = initDeposit;
		
		
	}
	
	// Getters / Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name = name;  // this is a local variable
	}
	
	public String getName() {
		return name;
	}
	
	
	//encapsulation works ==============hide our variables inside of the client class that access it publically through methods
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	
	
	
	//define methods available >>state and behavior of objects
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
		
	//Private : can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS:  $" + balance);
	}

	
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	void getStatus() {
	
	}
	
	@Override
	public String toString() {
		return "[ NAME:" + name  + ". ACCOUNT#" + accountNumber + ". ROUTING #" + routingNumber + ". BALANCE: $" + balance + " ]"; 
	}
	
}
