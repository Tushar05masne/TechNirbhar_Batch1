package testNg2.pack;

// If we want to execute multiple classes together, we use xml.
// For 'Test' level and 'Suite' level execution, we have to create and run the xml file.


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

	@Test
	void abc() {
		System.out.println("This is abc() from C1 class..");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("This is BeforeTest method");
	}
	
}
