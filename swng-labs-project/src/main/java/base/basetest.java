package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class basetest {
	
	protected static WebDriver driver;

    @BeforeSuite	
	public static void setup() throws InterruptedException {
    	ChromeOptions options = new ChromeOptions();

    	// Disable password manager prompts
    	options.addArguments("--disable-save-password-bubble");
    	// Disable popup blocking
    	options.addArguments("--disable-popup-blocking");
    	// Disable credential leak detection (the “Change your password” popup)
    	options.addArguments("--disable-features=PasswordManagerEnabled,PasswordLeakDetection");
    	// Optional: run in incognito mode for a clean profile
    	options.addArguments("--incognito");

    	driver = new ChromeDriver(options);

		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.saucedemo.com/");
		
	}
	

	
	@AfterSuite	
	public static void close() {
		//driver.quit();
	}

}
