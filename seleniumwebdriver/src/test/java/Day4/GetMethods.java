package Day4;


//get methods:
// get(url), getTitle(), getCurrentUrl(), getPageSource(),getWindowHandle(),getWindowHandles()



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		//get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// getTitle() -> get the title of the webpage
		String title = driver.getTitle();
		System.out.println("Title:"+title);		//OrangeHRM
		
		// getCurrentUrl() - returns current url of the webpage
		String curr_url = driver.getCurrentUrl();
		System.out.println(curr_url);	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		// getPageSource() - It will give us the page source of the application
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns Id of the single browser window
			// It is dynamic in nature. It keeps on changing whenever we re-run the application 
		String windowid = driver.getWindowHandle();
		System.out.println("Window Id:"+windowid);	//DCBA13E92FEDD299FD9597951FDE4614	- 1st time
													// AED79375E65E56A07516188BA8706892	- 2nd time
	
		//getWindowHandles() - returns Id's of the multiple browser windows
		
		Thread.sleep(3000);			// we need to add this because it was throwing "NoSuchElementException" exception 
									// "no such element: Unable to locate element" --> it is because of the synchronization problem
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();	// opens new browser window
		
		Set<String> windowids = 	driver.getWindowHandles();
		System.out.println(windowids);	// gives set collection of 2 window id's.
										// [887BE3E83E810B0491695A002D223401, 5AFBB03B68C9BF9170031545ED6A4030]
		
	}
	

}
