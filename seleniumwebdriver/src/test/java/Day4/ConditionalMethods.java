package Day4;

// conditional methods:
//isDisplayed(), isEnabled(), isSelected()

// browser methods: 	.close(), .quite()


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		
		//isDisplayed()
		WebElement logo=	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		boolean isdisplayed = logo.isDisplayed();
		System.out.println("Display status of logo: "+isdisplayed);	//true
		
		// isEnabled()	--> mostly used for the input boxes, radio buttons, drop downs, buttons and check boxes
		// used to check is element operational or not
		
		boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Enable status First Name box:"+status);
		
		//isSelected() -> mostly used for radio buttons, check boxes, drop downs
		
		boolean newsletter_checkbox = driver.findElement(By.xpath("//input[@id='NewsLetterSubscriptions_0__IsActive']")).isSelected();
		System.out.println("New letter Check box selected status:"+newsletter_checkbox);
		
		WebElement male_radio =	driver.findElement(By.xpath("//input[@id='gender-male']"));
		boolean female_radio = driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();
		
		System.out.println("Before selection: ");
		System.out.println("Radiobutton 'Male' selected status:"+male_radio.isSelected());	//false
		System.out.println("Radiobutton 'Female' selected status:"+female_radio);		//false
		
		male_radio.click();		// select male radio button
		System.out.println("After selection: ");
		System.out.println("Radiobutton 'Male' selected status:"+male_radio.isSelected());	//true
		System.out.println("Radiobutton 'Female' selected status:"+female_radio);		//false

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+ link.size());
		
		
		Thread.sleep(3000);
		//driver.close();	// close single browser window wherever the driver is focused.
		driver.quit();		// closes all the browser windows
		
		
	
	
	}

}
