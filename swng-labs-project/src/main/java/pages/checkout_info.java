package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkout_info {

	
private WebDriver driver;
	
	public checkout_info(WebDriver driver){
		this.driver = driver;
	}
	
	public void checkout_info_page() throws InterruptedException{
		
		WebElement First_name = driver.findElement(By.id("first-name"));
		WebElement Last_name = driver.findElement(By.id("last-name"));
		WebElement zip_code = driver.findElement(By.id("postal-code"));
		
		First_name.sendKeys("Sanika");
		//Thread.sleep(2000);
		Last_name.sendKeys("Jamadar");
		//Thread.sleep(2000);
		zip_code.sendKeys("411001");
	}
	
	public void continue_checkout(){
		
		WebElement continue_button = driver.findElement(By.id("continue"));
		continue_button.click();
		
	}
	
	
	
	
}
