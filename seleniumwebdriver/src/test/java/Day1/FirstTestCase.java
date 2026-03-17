package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
//
//		//1) Launch Browser
//		//ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
//		
//		//2) Open Url "https://demo.opencart.com/"
//		driver.get("https://www.google.com/");
//		
//		//3) Validate title -> "Google"
//		String title = driver.getTitle();
//		
//		if (title.equals("Google"))
//		{
//			System.out.println("Test Passed");
//		}
//		else {
//			System.out.println("Test Failed");
//		}
//		
//		//4) Close the browser
//		driver.close();
		
	
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.nopcommerce.com/");
		
		String cur_title = driver.getTitle();
		
		if(cur_title.equals("nopCommerce demo store")) 
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}			
		driver.close();
	
	}

}
