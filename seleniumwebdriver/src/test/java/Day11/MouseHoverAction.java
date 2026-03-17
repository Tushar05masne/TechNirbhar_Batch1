package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Mouse actions -
//	1)Mouse hover  	- .moveToElement(element)	
//	2)Right Click  	- .contextClick(element)
//	3)Double Click	- .doubleClick(element)
//	4)Drag and Drop	- .dragAndDrop(source, target)

// Actions - Predefined class provided in selenium which is used to perform mouse actions
		// build() and perform() are mandatory methods for mouse actions
		// build()	- create an action	- it will build an action
		// perform() - perform an action - if we use it without build() method then it will build as well as perform the action
						// if we use it without build(), then it will internally call the build() method and then perform an action 


public class MouseHoverAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement computers	= driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		WebElement notebooks = driver.findElement(By.xpath("//a[contains(text(),'Computers')]/../following-sibling::div/child::div[2]/a[@role='button' and @class='menu__link']"));		
		
		Actions act = new Actions(driver);	// for mouse operations, we have to create an object of Actions class and provide the driver object
		
		// Mouse hover
		act.moveToElement(computers).moveToElement(notebooks).click().build().perform();	// for mouse operations, we have to use build() and perform() methods
		
		
		
	}

}
