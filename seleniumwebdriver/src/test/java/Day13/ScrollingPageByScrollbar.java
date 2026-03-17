package Day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// ScrollBar is not a Web element. it is not a part of the page. 
// It is browser's quality that if the elements in the page increases, the scroll bar will be appeared.	
// 3 types:
	// 1) Scroll Down the page by pixel number
	// 2) Scroll down the page till element is visible
	// 3) Scroll page till the end of the page
	// Scrolling up to the initial position

public class ScrollingPageByScrollbar {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// 1) Scroll Down the page by pixel number	
		js.executeScript("window.scrollBy(0,5000)","");		// scrolls down by 5000 pixel
		System.out.println(js.executeScript("return window.pageYOffset;"));	// returns exact position where scrollbar has stopped	
																	// It's YOffset, because we have to scroll the bar up and down on the Y-axis position 	
			
		// 2) Scroll down the page till element is visible
		WebElement elemnt = driver.findElement(By.xpath("//h2[@id='the-internet-(heroku-app)']"));
		js.executeScript("arguments[0].scrollIntoView();", elemnt);		// arguments[0] - elemnt, scrollIntoView() - used to scroll down till the element into view	
		System.out.println(js.executeScript("return window.pageYOffset;"));	// returns exact position where scrollbar has stopped ->	// 6653.60009765625

		// 3) Scroll page till the end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	// scroll down till the height- scrollHeight
		System.out.println(js.executeScript("return window.pageYOffset"));	// 21914.400390625
		
		Thread.sleep(5000);
		
		// Scrolling up to the initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
