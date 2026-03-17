package testNg2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * 1. Login	--> @BeforeMethod
 * 2. Search	 --> @Test
 * 3. Advanced Search --> @Test	
 * 4. Logout	 --> @AfterMethod
 * 
 * */

public class AnnotationDemo2 {

	@BeforeClass
	void login() 
	{
		System.out.println("This is Login Before class..");
	}
	
	@AfterClass
	void logout() 
	{
		System.out.println("This is logout after class..");
	}
	
	@Test(priority = 1)
	void search() 
	{
		System.out.println("This is search from AnnotationDemo2..");
	}
	
	@Test(priority = 2)
	void advancedSearch() 
	{
		System.out.println("This is Advanced search from AnnotationDemo2..");
	}
	
	
}
