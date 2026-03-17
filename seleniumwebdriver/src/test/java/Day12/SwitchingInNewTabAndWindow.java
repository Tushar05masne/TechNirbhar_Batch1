package Day12;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

// These 2 functionalities are from Selenium 4.x onwards.
// 1) .newWindow(WindowType.TAB)	-> opens other URL in new tab and control focuses on new tab 
// 2) .newWindow(WindowType.WINDOW) -> opens other URL in new window and control focuses on new window

public class SwitchingInNewTabAndWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
