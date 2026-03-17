package Day6;

// navigational commands:
// 1. driver.navigate().to()			--> move to specific page
// 2. driver.navigate().back()		--> move to backward page
// 3. driver.navigate().forward()	--> move to forward page
// 4. driver.navigate().refresh()	--> reloads the page

// driver.get() method will accepts url in the string format
// driver.navigate().to() method accepts url in both 'string' and 'URL object' format
// navigate().to() method internally calls the get method. when navigate().to() method called, 
	//it will 1st check is it string format or object format.
			// if in string format then it will directly call the .get() method.
			// if in 'URL object' format then internally it will 1st convert object into string format 
				//and then it will pass into get() method. 

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.nopcommerce.com/");
		
		//driver.navigate().to("https://demo.nopcommerce.com/");	//accepts url in the string format
													// internally navigate().to() method call the 'get' method only
			
		//URL myurl = new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to(myurl);						// accepts URL object only	
		
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();		
		
		
		//driver.quit();
		
		
	}

}
