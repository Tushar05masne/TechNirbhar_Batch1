package Day13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();	
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.body.style.zoom = '50%'");	// sets zoom level to 50%
		Thread.sleep(3000);

		js.executeScript("document.body.style.zoom = '80%'");	// sets zoom level to 80%
		Thread.sleep(3000);
		
	}

}
