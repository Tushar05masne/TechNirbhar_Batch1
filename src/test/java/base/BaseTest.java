package base;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		
		 // 🔴 Disable password manager popup
        options.setExperimentalOption("prefs", new HashMap<String, Object>() {{
            put("credentials_enable_service", false);
            put("profile.password_manager_enabled", false);
        }});

        // 🔴 Disable notifications
        options.addArguments("--disable-notifications");

        // 🔴 Open in incognito (optional but useful)
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
		
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
