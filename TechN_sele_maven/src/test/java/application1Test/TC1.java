package application1Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import java.time.Duration;

public class TC1 {

	public static void main(String[] args) {
		
		
		        // Initialize driver
		        WebDriver driver = new ChromeDriver();

		        // Open URL
		        driver.get("https://testautomationpractice.blogspot.com/");

		        // Maximize window
		        driver.manage().window().maximize();

		        // Explicit wait example
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Wikipedia1_wikipedia-search-input")));

		        // Perform actions...
		        
		        // Close browser
		        driver.quit();

	}

}
