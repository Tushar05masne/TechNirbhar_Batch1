package Day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Alerts/Popups
// 		Alert myalert =	driver.switchTo().alert();			
//		myalert.accept();	// clicks on OK button
//		myalert.dismiss();	// clicks on Cancel button
//myalert.getText();			// gets text on the alert box/window
//myalert.sendKeys("text");	// types message in the input box

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(4000);
		
		//1) Normal Alert with OK button
		
		// alert is not a web-element. so for closing we have to switch to that alert window and then do the operations
		Alert myAlert =	driver.switchTo().alert();			
		System.out.println(myAlert.getText());		// to get the text from alert window 
		myAlert.accept();			// clock on ok
		
		// 2) Confirmation Alert - OK and Cancel
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(4000);

		Alert myalert =	driver.switchTo().alert();
		myalert.accept();		// clicks on OK button
//		myalert.dismiss();		// clicks on Cancel button
	
		// 3) Prompt alert - it provides Input box and we have to enter text in that input box and click on OK or Cancel	
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		
		Alert myAlert2 = driver.switchTo().alert();
		myAlert2.sendKeys("Welcome to Automation.");		// it will type the message in the Input Box but we are not able to see the typed message.
															// the message will be printed on the webpage. 
//		myAlert2.accept();		// if we click on OK button, the output will be printed on the screen/webpage.
		myAlert2.dismiss();		// if we click on cancel button, the output will be 'null'
	
	}

}
