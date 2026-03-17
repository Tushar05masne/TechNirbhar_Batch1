package testNg2.pack3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	void test()
	{
		//Assert.assertEquals("xyz","xyz");	// passed
		
		//Assert.assertEquals("xyz","abc");	// failed
		//Assert.assertEquals("123",123);		// failed
		//Assert.assertEquals("abc", 123);		// failed
		
		//Assert.assertNotEquals("xyz", "xyz");	// failed
		//Assert.assertNotEquals("xyz",123);		// passed
		//Assert.assertNotEquals(123,456);			// PASSED
		
		//Assert.assertTrue(false);		// failed
		//Assert.assertTrue(true);			// PASSED

		//Assert.assertFalse(false);	// passed
		//Assert.assertFalse(true);	// failed
		
		//Assert.assertTrue(1==1);		// passed
		//Assert.assertTrue(1==2);		// Failed
		
		Assert.fail();				// failed
			
		
	}
	

}
