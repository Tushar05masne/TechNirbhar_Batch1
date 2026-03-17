package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement>	links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
		
		List<WebElement>	images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images: "+images.size());
	
//		driver.findElement(By.linkText("Sony vaio i5")).click();

	}

}
