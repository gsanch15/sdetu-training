package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//create a new bank account >> think instantiate an object

		BankAccount acc1 = new BankAccount();   // calling the class that was done already to create a new object from the BankAccount Class
		//acc1.accountNumber = "01689453";
		
		//acc1.name = "Roger Hue"
		// with encapsulation : public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		//encapsulation works =========================================================
		acc1.setSsn("234823423");
		System.out.println("SSN: " + acc1.getSsn());
		//acc1.balance = 10000;
		//acc1.showActivity(); //It is not available to us since we are not in that class anymore and it is private in BankAccount class
		//System.out.println(acc1.toString());
		
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);

		System.out.println(acc1.toString());
		/*
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "01689453";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "01689453";
		acc3.checkBalance();
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();  
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		cd1.accountNumber = "12345";
		cd1.toString();
		System.out.println(cd1.toString()); 
		*/
		
		
		//System.out.println(acc1.routingNumber);
	//	System.out.println(acc2.routingNumber);
		//System.out.println(acc3.routingNumber);
	}
	
}
