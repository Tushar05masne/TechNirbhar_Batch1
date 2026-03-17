package testNg2.pack3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	@Test
	void testTitle()
	{
		String act_title = "Openshot";
		String exp_title = "Opercart";
		
		//Assert.assertEquals(act_title, exp_title);
		
		if(exp_title.equals(act_title)) {
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
		
	}
	
	

}
