package Mahesh2;

import Mahesh.BankAccount;

public class BankSavingAccount extends BankAccount {

	public BankSavingAccount(String accType, int accNumber, double accBalance, String custName) {
		super(accType, accNumber, accBalance, custName);
	}
	
	public void show_details() {	
		System.out.println(accountNumber);
		System.out.println(customerName);
		//System.out.println(accountType);		//as accountType -> default -> we can not access it in different package.we can access Only within same package. 
		//System.out.println(accountBalance);	//  as accountBalance-> private -> we can not access it in different class.
	}
	
	public static void main(String args[]) {
		BankSavingAccount bsa = new BankSavingAccount("Saving",102,50000,"Santosh");
		bsa.show_details();
		
	}
}
