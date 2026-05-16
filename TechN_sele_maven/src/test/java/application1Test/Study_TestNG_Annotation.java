package application1Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Study_TestNG_Annotation {

	@Test (priority=1,dependsOnMethods={"TC5"})
	public void TC1() {

		System.out.println("Hi this is TC1 from Study_TestNG_Annotation ");

	}

	@Test (priority=0)
	public void TC2() {

		System.out.println("Hi this is TC2 from Study_TestNG_Annotation ");

	}

	@Test (priority=4)
	public void TC3() {

		System.out.println("Hi this is TC3 from Study_TestNG_Annotation ");

	}

	@Test (groups={"sanity"})
	public void TC4() {

		System.out.println("Hi this is TC4 from Study_TestNG_Annotation ");

	}

	@Test (priority=3,enabled=true)
	public void TC5() {

		System.out.println("Hi this is TC5 from Study_TestNG_Annotation ");

	}

//	@BeforeMethod
//	public void beforeMethod() {
//
//		System.out.println("Hi this is beforeMethod from Study_TestNG_Annotation ");
//
//	}
//
//	@AfterMethod
//	public void afterMethod() {
//
//		System.out.println("Hi this is afterMethod from Study_TestNG_Annotation ");
//
//	}
//
//	@BeforeClass
//	public void beforeClass() {
//
//		System.out.println("Hi this is beforeClass from Study_TestNG_Annotation ");
//
//	}
//
//	@AfterClass
//	public void afterClass() {
//
//		System.out.println("Hi this is afterClass from Study_TestNG_Annotation ");
//
//	}
//
//	@BeforeTest
//	public void beforeTest() {
//
//		System.out.println("Hi this is beforeTest from Study_TestNG_Annotation ");
//
//	}
//
//	@AfterTest
//	public void afterTest() {
//
//		System.out.println("Hi this is afterTest from Study_TestNG_Annotation ");
//
//	}
//
//	@BeforeSuite
//	public void beforeSuite() {
//
//		System.out.println("Hi this is beforeSuite from Study_TestNG_Annotation ");
//
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//
//		System.out.println("Hi this is afterSuite from Study_TestNG_Annotation ");
//
//	}

}
