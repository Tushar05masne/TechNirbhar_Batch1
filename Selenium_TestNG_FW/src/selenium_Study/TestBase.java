package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.opera.OperaDriver;



public class TestBase {

	protected static WebDriver driver;
	static String browser = " chrome ";

	public static WebDriver getDriver(String browser) {

		// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\tusha\\OneDrive\\Desktop\\TechNirbhar\\Selenium_TestNG_FW\\Selenium_TestNG_FW\\lib\          \chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		
		
		//WebDriverManager.chromedriver().setup();

	

//		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://www.example.com");
		
		if ((browser.trim()).equalsIgnoreCase("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("--headless"); // Run without UI
			// options.addArguments("--disable-extensions");
		    //options.addArguments("----incognito");
			driver = new ChromeDriver(options); // Launches Chrome
		
		
		}
		
		else if ((browser.trim()).equalsIgnoreCase("edge")) {
			driver = new EdgeDriver(); // Launches edge
		} else if ((browser.trim()).equalsIgnoreCase("FirefoxDriver")) {
			driver = new FirefoxDriver(); // // Launches Firefox

		}
		else if ((browser.trim()).equalsIgnoreCase("safari")) {
			driver = new SafariDriver(); // // Launches Firefox

		}
		else if ((browser.trim()).equalsIgnoreCase("opera")) {
			//driver=new OperaDriver();

		}
	
		else {

			System.out.println("Please pass right browser name");

		}
		return driver;
	}

}
