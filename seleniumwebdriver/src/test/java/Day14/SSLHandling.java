package Day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// SSL - Secure Socket Layer Handling
	// Some webpages are secured and need an SSL certificate for opening it. Without certificate it will not work
				// It shows an error while opening as - Privacy error
	// To access those pages we have to set .setAcceptInsecureCerts() to true.

public class SSLHandling {
	
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);	// access SSL certificates accepts insecure certificates
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		
		System.out.println("Title of the page: "+driver.getTitle());

	}

}
