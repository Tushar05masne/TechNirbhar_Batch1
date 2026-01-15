package encapsulationDemo;

public class BankAccount {

	private double accNo;
	public String name;
	private double balance;

	public double getAccountNumber() {
		return accNo;
	}
	
	public void setAccountNumber(double accNo) {
		this.accNo = accNo;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalanace(double balance) {
		this.balance = balance;
	}
	
	
}
