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

public class Study_TestNG_Annotation2 {

	//(invocationCount=5)
	@Test (groups={"regression"})
	public void TC1() {

		System.out.println("Hi this is TC1 from Study_TestNG_Annotation 2");

	}

	@Test (groups={"regression"})
	public void TC2() {

		System.out.println("Hi this is TC2 from Study_TestNG_Annotation 2 ");

	}

	@Test (groups={"sanity"})
	public void TC3() {

		System.out.println("Hi this is TC3 from Study_TestNG_Annotation 2");

	}

	@Test  (groups={"sanity"})
	public void TC4() {

		System.out.println("Hi this is TC4 from Study_TestNG_Annotation 2 ");

	}

	@Test  (groups={"regression"})
	public void TC5() {

		System.out.println("Hi this is TC5 from Study_TestNG_Annotation 2");

	}


}
