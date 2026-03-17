package Day7;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Handle alert without using driver.switchTo().alert()
//	by using explicit wait
public class HandleAlertsUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));		// explicit wait
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(4000);
		
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());	// As soon as condition is true, it will captures alert and assign it to myalert
		
		myalert.getText();
		myalert.accept();
	}

}
