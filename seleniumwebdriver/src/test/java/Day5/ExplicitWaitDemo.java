package Day5;

// Explicit wait is not like implicit wait(write once and applicable to all the script)
	// it is specific to web element/ web page 
	// Explicit wait works on the condition and that condition we have to specify by until()

// 2 steps -> 1.Declaration	2.Usage
	// 1st create WebDriverWait object - declaration
	// 2nd - apply that wait on the elements explicitly which are causing exception

// Explicit wait works on the condition. If the condition is satisfied then only it will wait. it waits max 10sec. 
		// within 10 sec if the element located then only it will return that element. else throw an exception.
			// we can handle that exception with try catch block


//it is conditional based, it will work more effectively. we use .until() for condition check
//we need to write multiple wait statements for multiple elements


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
				
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));		//Declaration
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtusername	= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtusername.sendKeys("Admin");	// it will return the element and that we can access directly
		
		WebElement	txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		txtpassword.sendKeys("admin123");
		
		WebElement loginbtn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		loginbtn.click();
		
		// explicit wait works on the condition. if the condition is true then only it will waits
		//wherever we have synchronization problem, there only we need to write explicit wait. other elements don't need it.
				
		

	}

}
