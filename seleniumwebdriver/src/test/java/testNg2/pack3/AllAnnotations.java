package testNg2.pack3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// in .xml file -> suit->test->class, groups->method , and also in testclass 


public class AllAnnotations {
	
	@BeforeSuite
	void bs() {
		System.out.println("This is before suite..");
	}
	
	@AfterSuite
	void as() {
		System.out.println("This is after suite..");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("This is before Test..");
	}
	
	@AfterTest
	void at() {
		System.out.println("This is after Test..");
	}
	
	@BeforeClass
	void bc() {
		System.out.println("This is before Class..");
	}
	
	@AfterClass
	void ac() {
		System.out.println("This is after Class..");
	}
	

	@BeforeMethod
	void bm() {
		System.out.println("This is before Method..");
	}
	
	@AfterMethod
	void am() {
		System.out.println("This is after Method..");
	}
	
	@Test
	void tm1() {
		System.out.println("This is Test Method 1..");
	}

	@Test
	void tm2() {
		System.out.println("This is Test Method 2..");
	}
}
