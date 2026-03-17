package testNg4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Parameterization-->
//	1. @DataProvider	 --> data driven testing	
//	2. using xml file ---> parallel testing


// Data providers are used to extract data from the database/excel file and provide it to the test methods. 
// All data providers are defined in one class only and have different names.


public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "dp")			// dataProvider is the name of the Data Provider which provides data to the test
	void testLogin(String email, String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name = "dp", indices = {0,2,3})		// indices - row number of data which we want to test
	Object[][] loginData() 
	{
		Object data[][] = {
				{"abc@gmail.com","test123"},
				{"xyz@gmail.com","test123"},
				{"morebe@gmail.com","test@123"},
				{"pqr@gmail.com","test123"},
				
				};
		return data;
	}
	
	
	
}
