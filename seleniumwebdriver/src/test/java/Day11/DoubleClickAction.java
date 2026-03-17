package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// getText() vs getAttribute()
//	<input id="xyz"> Welcome </input>
	// getText() --> returns the inner text of the webelement	--> Welcome
	// getAttribute("id") --> returns the value of the attribute 'id' --> xyz

public class DoubleClickAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		// switch to frame
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement copy_button = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		
		box1.clear();		// clears the box1
		box1.sendKeys("Welcome Mahesh");	
		
		// Double click action on the button
		Actions act = new Actions(driver);
	
		act.doubleClick(copy_button).perform();

		// validation for the values in box1 and box2
		if(box1.getText().equals(box2.getText()))	
		{
			System.out.println("Same text in both the box.");
		}
		else {
			System.out.println("Different text in both the box.");
		}
		
		String textInBox2 = box2.getText();			// here we are not getting the value 
		System.out.println("Text in box2: "+textInBox2);

		// if we are not getting the value in the box then we have to use getAttribute() instead of getText()
	
		String text2 = box2.getAttribute("value");		// --> value is the attribute of field1
		System.out.println("Text in box2 by getAttribute(): "+text2);
	
	}

}
