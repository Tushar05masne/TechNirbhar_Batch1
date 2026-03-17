package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElements2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("#input")).sendKeys("Yayati");		// NoSuchElementException
		
		//This Element is inside single shadow DOM.
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		WebElement searchbox = shadow.findElement(By.cssSelector("#input"));	
		searchbox.sendKeys("Yayati");
	}

}
