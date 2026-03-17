package Day5;

import java.time.Duration;

// Implicit wait:
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		--> max 10sec waits

	// we have to add implicitWait at the beginning of the automation script after the driver instance
	// we have to write it only one time at the beginning and it is applicable to all the script
	// it will not wait till the maximum time if the element is available 
	//till we close/quite our driver, the implicit wait is alive

	// disadvantage - if the time is not sufficient then we will get the exception

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 	// Implicit wait 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		

	}

}
