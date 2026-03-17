package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		// id
		//driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
		
		//	tag and id -->	 tag#id	--> tagname is optional
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		// 	tag and class-->		tag.classname --> tagname is optional
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Asus mobiles");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Asus Laptop");
		//driver.findElement(By.cssSelector("nav.menu-container")).click();
		//driver.findElement(By.cssSelector(".menu-container")).click();
		
		//tag and attribute -->	tag[attribute="value"]	--> attribute should be unique, tagname is optional
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Mobile");
		//driver.findElement(By.cssSelector("[id='small-searchterms']")).sendKeys("T-shirts");
		
		//tag class attribute -->	tag.classname[attribute="value"]	--> tagname is optional
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Hard discs");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Hard discs");
		
	}

}
