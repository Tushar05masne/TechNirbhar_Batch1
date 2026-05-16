package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class CommonUtil {

	public static void implicitWaits_seconds(WebDriver driver, int seconds) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}

}
