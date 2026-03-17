package Day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// SVG - Scalable Vector Graphics - To draw the 2D graphics images. - circle,rectangle, polygon, graphs etc.
//SVG elements does not support Xpath. it has length,width,height, x y coordinates etc.
	// If we have SVG elements then we have to use name() methods as an attribute. name()='svg',local-name()='circle',name()='path' etc. 
	// When we inspect the SVG element, it will not provide the correct Xpath. We have to use the Selector-Hub for locating X-path

public class HandleSVGElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Absolute xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]/*[name()='svg'][1]")).click();
	
		// rel xpath using text infront of logo eg. 'Time'
		//driver.findElement(By.xpath("//span[normalize-space()='Time']")).click();
		
		// relative xpath
		//driver.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']")).click();	// NoSuchElementException

		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']")).click();
	}

}
