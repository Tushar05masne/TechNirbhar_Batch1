package encapsulationDemo;

public class GetBankAccountInfo {

	public static void main(String[] args) {

		BankAccount bnkacc = new BankAccount();
		
		bnkacc.name = "Mahesh More";
		System.out.println(bnkacc.name);
		
		bnkacc.setAccountNumber(1002048);
		System.out.println(bnkacc.getAccountNumber());
		
		bnkacc.setBalanace(1728990);
		System.out.println(bnkacc.getBalance());
		
	}

}
