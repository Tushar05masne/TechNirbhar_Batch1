package Day12;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// act.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).perform();	-> click on the webelement(link)



public class OpenLinkInNewTab {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement registerLink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));

		// ctrl+registerLink
		act.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).perform();
		
		//switching to registration page
		List<String> windowIds = new ArrayList<String>(driver.getWindowHandles());	// gives window ids of both the browser windows	
		System.out.println(windowIds);	// [289F27FC88123E275278AE83CF8EE763, 20FEB1C08A3BADA7FCFFC89E502203AE]
		
		driver.switchTo().window(windowIds.get(1));	// switch to another window(registration page)
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Maheshhhh Moreee");
		
		// switching back to main/Home page
		driver.switchTo().window(windowIds.get(0));
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Asus Laptop");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
	}

}
