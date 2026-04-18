package application1Test;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Reporter;
public class TestNG_Demo {
  @Test
  public void TC1() {
	  
	// Initialize driver
      WebDriver driver = new ChromeDriver();

      // Open URL
      driver.get("https://testautomationpractice.blogspot.com/");

      // Maximize window
      driver.manage().window().maximize();

      // Explicit wait example
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Wikipedia1_wikipedia-search-input")));
      
      
      
      	WebElement testAutomation_Home_Name = driver.findElement(By.id("name"));

		// clear()


		testAutomation_Home_Name.clear();

		// sendKeys()

		testAutomation_Home_Name.sendKeys("Monika");
		System.out.println("Name Entered");

      // Perform actions...
      
      // Close browser
      //driver.quit();
  }
  
  @Test
  public void TC2() {
	  
	  System.out.println("Hello this is TC 3 and its pass");
	  
	  Reporter.log("hi Good morning",true);
	  
  }
  
  
  @Test
  public void TC3() {
	  
	  System.out.println("Hello this is TC 4-----pass");

	  
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
