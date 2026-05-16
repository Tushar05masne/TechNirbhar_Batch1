package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class products_page {
	private WebDriver driver;
	
	public products_page(WebDriver driver){
		this.driver = driver;
	}
	
	public void select_product() {
	WebElement product_backpack = driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
	String text_of_Product = product_backpack.getText();
	System.out.println("Item name: " + text_of_Product);
	
	}
    public void add_to_cart() {
    	WebElement Add_to_cart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    	Add_to_cart.click();
    }	
    public void select_checkout() {
    	WebElement Checkout_icon = driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
    	Checkout_icon.click();
    
    }
}
