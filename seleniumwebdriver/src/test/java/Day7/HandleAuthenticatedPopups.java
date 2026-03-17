package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopups {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");	// it will popups window of Username and Password where we have to provide it
													// with the switch.To() or wait(), we are not able to switch to that window, as it is authenticated popup window
											// we have to inject username and password in the url
		// Syntax:									
		//https://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
