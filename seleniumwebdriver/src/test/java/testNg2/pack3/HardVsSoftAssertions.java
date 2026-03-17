package testNg2.pack3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// In Hard assertion, all the methods are static. that's why we have to call all the methods by 'Assert' classname
// In Soft assertion, methods are not static. that's why we have to create an object of the 'SoftAssert' class 
		// and with that object we have to call the methods of the SoftAssert class.


public class HardVsSoftAssertions {

	@Test
	void test_hardAssertion() {
		
		System.out.println("TestingHA1..");
		System.out.println("TestingHA1..");
		
		//Assert.assertEquals(1, 1);		// hard assertion	// passed
		Assert.assertEquals(1, 2);		// failed. The instructions of the method from this onward will not be executed
	
		System.out.println("TestingHA2..");
		System.out.println("TestingHA2..");
	}
	
	@Test
	void test_softAssertion() {
		
		System.out.println("Testing1..");
		System.out.println("Testing1..");
		
		SoftAssert sa = new SoftAssert();		// create an object of the 'SoftAssert' class
		
		sa.assertEquals(1,2);			// soft assertion. Even if it is failed, the instructions from this onwards will be executed.  
	
		System.out.println("Testing2..");
		System.out.println("Testing2..");
		
		sa.assertAll();		// mandatory.  If we don't write this, even if test failed, then also it gives "Passed" as an output.
		
	}
	
}
