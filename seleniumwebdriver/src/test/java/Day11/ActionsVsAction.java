package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//Actions Vs Action:
	// Actions - class - which is used to perform mouse actions
	// Action - interface - which is used to store created actions by build() method

	// whenever we want to create an action and store it and we can use that action later whenever we want to, 
		//at that time we have to use Action interface to create and store the action and perform later

public class ActionsVsAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button =	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions act = new Actions(driver);
		
		Action myaction = act.contextClick(button).build();	// building/creating an action and storing into myaction variable
		myaction.perform();		// performing an action which have stored in the  'myaction' variable
		
	}

}
