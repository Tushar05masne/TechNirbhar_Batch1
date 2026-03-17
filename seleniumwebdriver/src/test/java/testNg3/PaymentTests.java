package testNg3;

import org.testng.annotations.Test;

public class PaymentTests {

	@Test(priority = 1, groups = {"sanity", "regression","functional"})
	void paymentInRupees()
	{
		System.out.println("This is payment in Rupees..");
	}
	
	@Test(priority = 2, groups = {"sanity","regression","functional"})
	void paymentInDollers()
	{
		System.out.println("This is payment in Dollers..");
	}
	
}
