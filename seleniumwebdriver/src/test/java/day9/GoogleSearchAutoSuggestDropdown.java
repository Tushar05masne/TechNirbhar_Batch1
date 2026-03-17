package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@title='Search' and @name='q']")).sendKeys("mahesh");
		Thread.sleep(5000);
		
		List<WebElement>	searchList 	= driver.findElements(By.xpath("//textarea[@title='Search']/../../../following-sibling::div/child::div[4]//ul/li"));
		
		System.out.println(searchList.size());
		
		for(WebElement search:searchList)
		{
			System.out.println(search.getText());
		}

		searchList.get(0).click();	// it will click on the 1st element in the list
	}

}
