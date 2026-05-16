package application1Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.Reporter;
public class TestNG_Demo {
	
	
  @Test (invocationCount = 5, threadPoolSize = 1)
  public void TC1() throws IOException {
	  
	// Initialize driver
      WebDriver driver = new ChromeDriver();

      // Open URL
      driver.get("https://testautomationpractice.blogspot.com/");

      // Maximize window
      driver.manage().window().maximize();

      // Explicit wait example
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Wikipedia1_wikipedia-search-input")));
      
    
      String content = new String(Files.readAllBytes(Paths.get("src/test/resources/Test.json")));
	    
	    JSONObject obj = new JSONObject(content);
      
	    //JSONArray myArray = obj.getJSONArray("skills");
	    
	    //System.out.println(myArray);
      
      JSONObject employee = obj.getJSONObject("TC1");

      int id = employee.getInt("id");
      String name = employee.getString("name");
      String role = employee.getString("role");
      boolean active = employee.getBoolean("active");
    
        String eHomePageFormTitle = employee.getString("HomePageFormTitle");
      
      
      
    	WebElement testAutomation_HomePage_FormTitle = driver.findElement(By.xpath("//*[text()='GUI Elements']"));

      
    	String aHomePage_FormTitle = testAutomation_HomePage_FormTitle.getText();   
    	
    	boolean HomePage_FormTitle_IsDisplayed = testAutomation_HomePage_FormTitle.isDisplayed();
    	
//    	if(eHomePageFormTitle.equals(aHomePage_FormTitle)) {
//    		
//    		System.out.println("HomePage_FormTitle is matching with expected");
//    	}
//    	else {
//    		
//    		System.out.println("HomePage_FormTitle is not matching with expected");
//
//    	}
    	
    	SoftAssert softAssert = new SoftAssert();
    	softAssert.assertEquals(aHomePage_FormTitle,eHomePageFormTitle , "eHomePageFormTitle is not matching with aHomePage_FormTitle");

    	//Assert.assertEquals(aHomePage_FormTitle,eHomePageFormTitle,"eHomePageFormTitle is not matching with aHomePage_FormTitle");      
      
    	//Assert.assertTrue(HomePage_FormTitle_IsDisplayed,"HomePage_FormTitle_is not Displayed");
    	
    	
    	softAssert.assertTrue(HomePage_FormTitle_IsDisplayed,"HomePage_FormTitle_is not Displayed");
    	
    	
      
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      
      
      	WebElement testAutomation_Home_Name = driver.findElement(By.id("name"));

		// clear()


		testAutomation_Home_Name.clear();

		// sendKeys()

		testAutomation_Home_Name.sendKeys("Monika");
		System.out.println("Name Entered");
		
		
    	softAssert.assertAll();

    	driver.quit();
      // Perform actions...
      
      // Close browser
      //driver.quit();
  }
  
  @Test
  public void TC2() {
	  
	  System.out.println("Hello this is TC 3 and its pass");
	  
	  Reporter.log("hi Good morning",true);
	  
  }
  
  
  @Test (groups={"sanity"})
  public void TC3() {
	  
	  System.out.println("Hello this is TC 4 from TestNG_Demo class-----pass");

	  
  }
  
  @Test
  public void m1() {
	  System.out.println("Hi this is m1 method");
	  
	  Reporter.log("Hi this is m1 method",true);
	  
  }
  @Test
  public void m2() {
	  
	  System.out.println("Hello this is m2 and its pass");
	  
	  Reporter.log("Hello this is m2 and its pass",true);
	  
  }
  
  
}
