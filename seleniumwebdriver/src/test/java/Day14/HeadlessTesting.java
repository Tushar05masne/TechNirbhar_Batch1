package Day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Headless testing -> testing done in the background.
	// Whenever we want to do the testing in background, like project is deployed and we want to check only test results at that time we do headless testing.
	// In this type, the Chromebrowser/edgebrowser is not opening and showing actions. The tests are running in the background.
	// we can only get the result in the console window.
	// This type of testing is done after project gets deployed to see the test results only.
// We have to create an object of the browser like ChromeOptions,EdgeOptions,FirefoxOptions etc.

// Advantages:
	// we can do multiple tasks at the same time. as execution happened in the background
	// faster execution
// Disadvantages:
	// user can not see the actions on the webpage. So we can not understand the flow/functionality of the test.
	// SSL handling.


public class HeadlessTesting {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");		// setting for headless mode of execution
		
		WebDriver driver = new ChromeDriver(options);	// have to pass ChromeOptions class reference to ChromeDriver object
															// to apply settings of ChromeOptions to driver object
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		
		if (title.equals("Google"))
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		
	}

}
