package Day14;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// JavascriptExecutor (I), WebDriver (I), TakesScreenshot(I) - These all interfaces are implemented by RemoteWebDriver class. 
// TakesScreenshot - Interface - which is implemented by RemoteWebDriver class
// If we have encountered any error then we have to take a screenshot of that error and forward it to the developers.
//	1) Full page screenshot		2) Specific area of the page		3) Web element
//
public class CaptureScreenshots {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1) Full page screenshot	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File	 sourceFile = ts.getScreenshotAs(OutputType.FILE);	// gets screenshot and save it in File type of object
														// This file will store in the memory but where we dont know. So for that we have to provide a path to store that file.	
		 // Create a new folder in the project as 'screenshots' where we can store all our screenshots. and provide the path to the File object
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		
		sourceFile.renameTo(targetFile);	// copy sourcefile to target file.
	
		
		// 2) Specific area of the page	
		WebElement featuredProduct = driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
		
		File sourcefile = featuredProduct.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\featured_product.png");
		
		sourcefile.renameTo(targetfile);	// copies sourcefile to targetfile
		
		// For fullpage screenshot, we are calling getScreenshotAs() method from TakesScreenshot interface 
		// For specific area of the page screenshot, we are calling getScreenshotAs() method from WebElement interface
		
		// 3)Screenshot of the specific webelement
		
			WebElement galaxy_S24 =	driver.findElement(By.xpath("//img[@class='slider-img']/../preceding::div[@class='swiper-slide swiper-slide-prev']"));
			File sourceFile1 = galaxy_S24.getScreenshotAs(OutputType.FILE);
			File targeFile1 = new File(System.getProperty("user.dir")+"\\screenshots\\galaxy_S24.png");
			sourceFile1.renameTo(targeFile1);
			
			driver.quit();
				
	}

}
