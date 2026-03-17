package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// By name
		//driver.findElement(By.name("NewsLetterEmail")).sendKeys("mahesh@gmail.com");
		
		// By id
		//driver.findElement(By.id("small-searchterms")).sendKeys("Macbook");
		
		// By linktext and partial linktext
		//driver.findElement(By.linkText("Electronics")).click();
		//driver.findElement(By.partialLinkText("Electro")).click();
		//driver.findElement(By.linkText("Camera & photo")).click();
		
		// By classname		--> to locate a group of elements
		//List<WebElement>	headerLinks= driver.findElements(By.className("header-links"));
		//System.out.println("Total number of header links: "+headerLinks.size());
			
		//By tagname		--> to locate a group of elements
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+ link.size());
		
		List<WebElement>	total_images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images: "+total_images.size());
			
	}

}
