package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Iframe_Test extends TestBase {

	public static void main(String[] args) throws InterruptedException {
		
		driver = TestBase.getDriver(browser);

		driver.get("https://demo.automationtesting.in/Frames.html");

		Thread.sleep(1000);

		driver.manage().window().maximize();
		
		
		//Iframe
		
		
		
		//driver.switchTo().frame("singleframe");  //----with name or ID
		//driver.switchTo().frame(1); //--------Using index
		
		
		WebElement AutomationDemoSite_Home_XYZ_Frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"))	;

		
		driver.switchTo().frame(AutomationDemoSite_Home_XYZ_Frame);


		
		
		WebElement AutomationDemoSite_Home_RandomIPField = driver.findElement(By.xpath("(//input[@type='text'])"))	;
		
		AutomationDemoSite_Home_RandomIPField.sendKeys("ABCV");
		
		//back to main page
		
		driver.switchTo().parentFrame();
		
		
		WebElement AutomationDemoSite_Home_HomeTab = driver.findElement(By.xpath("//a[text()='Home']"));
		
		AutomationDemoSite_Home_HomeTab.click();

		
		
	}

}
