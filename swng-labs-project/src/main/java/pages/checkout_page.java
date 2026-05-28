package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkout_page {

private WebDriver driver;
	
	public checkout_page(WebDriver driver){
		this.driver = driver;
	}
	
	public void item_visibility() {
		WebElement item_name = driver.findElement(By.xpath("//*[@id='item_4_title_link'])"));
		boolean item = item_name.isDisplayed();
		System.out.println("Product name visible: " +item);
		
	}
	
	public void checkout_click() {
		WebElement checkout_button = driver.findElement(By.xpath("//*[@id='checkout']"));
		checkout_button.click();
	}
	
	
	
	
	
}
