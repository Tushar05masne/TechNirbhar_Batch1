package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class ProductPage {

		WebDriver driver;
		WaitUtils wait;
		
		public ProductPage(WebDriver driver) {
			this.driver=driver;
			wait = new WaitUtils(driver);
		}
		
		public void addToCart() {
			wait.click(By.id("add-to-cart-sauce-labs-backpack"));
			
		}
		
		public void openCart() {
			wait.click(By.className("shopping_cart_link"));
		}
}
