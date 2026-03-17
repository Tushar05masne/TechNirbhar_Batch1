package Day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// It will remove message "Chrome is being controlled by automated test software" from Chrome browser while running the application.



public class DisableAutomatedMsgOnScreen {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		//options.addArguments("--incognito");		// opens browser in incognito mode
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	}

}
