package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestBase {

	static WebDriver driver;
	
	public static WebDriver getDriverName(String browser) {
		
		if(browser.trim().equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		} 
		else if (browser.trim().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();			
		}
		else if (browser.trim().equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
			
		}
		else if (browser.trim().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();			
		}
		else {
			System.out.println("Please pass right browser name.");
		}
		
		return driver;
	}
}
