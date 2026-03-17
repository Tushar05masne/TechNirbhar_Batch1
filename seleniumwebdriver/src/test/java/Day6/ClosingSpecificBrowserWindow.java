package Day6;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs =	driver.getWindowHandles();	// to get the ID's of all the windows
		
		for(String winId:windowIDs)		// for loop for the looping over all the window's Id's
		{
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println(title);
		
			// if condition for the operation on the specific window
			if(title.equals("Human Resources Management Software | HRMS | OrangeHRM")||title.equals("some other title"))
			{
				driver.close();
			}
		
		}
		
		
		
	}

}
