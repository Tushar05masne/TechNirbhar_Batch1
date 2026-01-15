package Mahesh;


//Access Modifiers
//public -> we can access it everywhere. we just need to import that class/package where we want to access that variable
//private -> we can access it only within the same class.
//protected -> we can use it within the same class, same package and it's child/sub class even if that subclass is in another package.
//default -> when we don't provide any modifier then it is default. we can access it in the same class and in the same package


public class BankAccount {

	String accountType;						// default-> same class and same package
	public int accountNumber;				// public -> everywhere
	private double accountBalance;			// private -> within same class
	protected String customerName;			// protected-> same and child class(in other package also)
	
	
	//parameterized constructor
	public BankAccount(String accType,int accNumber,double accBalance, String custName) {
		
		this.accountType = accType;
		this.accountNumber = accNumber;
		this.accountBalance = accBalance;
		this.customerName = custName;		
	}
	
	
	public double deposite(double amount) {	
		accountBalance+=amount;
		return accountBalance;
	}
	
	public void withdraw(double amount) {
		
		if(amount<accountBalance) {
			accountBalance-=amount;
			System.out.println("Transaction Successfull. Withdrawn "+amount+" Rs. and Your balance is: "+accountBalance);
		}
		else {
			System.out.println("Insufficient Balance to withdraw. Your balance is: "+accountBalance);
		}
	}
	
	public double get_account_balance() {
		return accountBalance;	
	}
	
	
}
