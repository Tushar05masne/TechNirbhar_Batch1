package Day6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs =	driver.getWindowHandles();
		
		// we have to convert this set collection into list collection because 
			// we don't extract individual items from set and also we don't have indexing in set to access the elements
		
		//Approach 1	- if we have 2,3 or 4 browser windows then only use
		List<String> windowList= new ArrayList(windowIDs);
		
		String parentId = windowList.get(0);
		String childId = windowList.get(1);
		
			//switch to child window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
			// switch to parent window
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		
		// Approach 2 - if multiple browsers are there then use for loop
		
		for(String winID:windowIDs)
		{
			String title = driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
				// write code for some validations on the parent window
			}
		}
	}

}
