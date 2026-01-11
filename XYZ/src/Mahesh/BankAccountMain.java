package Mahesh;

public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount acc= new BankAccount("Savings",101,10000,"Mahesh More") ;
		
		System.out.println("Account Type: "+acc.accountType);
		System.out.println("Account Number: "+acc.accountNumber);
		System.out.println("Customer Name: "+acc.customerName);
		//System.out.println(acc.accountBalance);	// as accountBalance-> private -> we can access only within same class

		
		double accountBalance =	acc.get_account_balance();
		System.out.println("The default balance is: "+accountBalance+" Rs.");
		double accountBalance1=acc.deposite(20000.90);
		System.out.println("Transaction Successfull. Amount Deposited and Your balance is: "+accountBalance1+" Rs.");
		acc.withdraw(5000);
	}

}
