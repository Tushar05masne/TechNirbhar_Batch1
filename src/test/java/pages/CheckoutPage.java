package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.WaitUtils;

public class CheckoutPage {

	WebDriver driver;
	WaitUtils wait;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver);
	}

	public void checkout() throws InterruptedException {

		// Click checkout button
        wait.click(By.id("checkout"));
		
        // Fill details
        driver.findElement(By.id("first-name")).sendKeys("Tejaswini");
		driver.findElement(By.id("last-name")).sendKeys("Masne");
		driver.findElement(By.id("postal-code")).sendKeys("412303");

		//Thread.sleep(1000); // 2 seconds

		wait.click(By.id("continue"));
	
		
		wait.click(By.id("finish"));
	}

}
