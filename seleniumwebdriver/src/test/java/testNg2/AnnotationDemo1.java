package testNg2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1. Login	--> @BeforeMethod
 * 2. Search	 --> @Test
 * 3. Logout	--> @AfterMethod
 * 4. Login	--> @BeforeMethod
 * 5. Advanced Search --> @Test	
 * 6. Logout	 --> @AfterMethod
 * 
 * */

// All the validations we should put in the @Test annotation methods because only @Test methods are participate in the results.
// All the methods will be executed but only @Test methods will give results.



public class AnnotationDemo1 {

	@BeforeMethod
	void login() {
		System.out.println("This is Login @BeforeMethod from AnnotationDemo1..");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("This is Logout @AfterMethod from AnnotationDemo1..");
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("This is search from AnnotationDemo1..");
	}
	
	@Test(priority = 2)
	void advancedSearch() {
		System.out.println("This is advanced search from AnnotationDemo1..");
	}
	
	
}
