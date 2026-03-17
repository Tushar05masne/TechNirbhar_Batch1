package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
			//Xpath with single attribute
		//driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Headphones");
		//driver.findElement(By.xpath("//img[@title='Show products in category Electronics']")).click();
		
		//Xpath with multiple attribute
//		driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("Drivers,Tshirts");

		
		
		//Xpath with 'and', 'or' operators
		//driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("Tshirts");
		//driver.findElement(By.xpath("//input[@name='xyzz' or @placeholder='Search store']")).sendKeys("Tshirts");

		
		
		// Xpath with inner text --> text()		--> only works with innertext and links
			// inner text is a text given to the tag like <a href="https://xyz.com">Electronics</a>
						// innertext -> yes -> Electronics ,  linktext -> yes -> Electronics
			// <h3>Electronics</h3> --> innertext -> yes -> Electronics, linktext -> No
		/*
		driver.findElement(By.xpath("//*[text()='Electronics']")).click();
		String value= driver.findElement(By.xpath("//button[text()='Search']")).getText();
		System.out.println(value);
		*/
		
	
		//For handling dynamic attributes, we have to use contains() and starts-with() methods
		
		// Xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'earc')]")).sendKeys("Mobile");

		// xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys(" Laptops");
		
	
		// chained xpath --> if we dont have any attribute for the targeted element then we can use chained xpath
		boolean isDispayed	= driver.findElement(By.xpath("//div[@role='group']/a/img")).isDisplayed();
		System.out.println(isDispayed);
		
		boolean isAvailable	= driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
		System.out.println(isAvailable);		
		
		
		
	}

}
