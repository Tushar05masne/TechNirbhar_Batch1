package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class products_page {
	private WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id='item_4_title_link']/div")
	private WebElement product_backpack;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement Add_to_cart;

	@FindBy(xpath = "//*[@id='shopping_cart_container']")
	private WebElement Checkout_icon;
	
	@FindBy(xpath = "//*[@class='app_logo']")
	private WebElement SwagLab_ProductPageLogo;
	
	public products_page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void select_product() {
	String text_of_Product = product_backpack.getText();
	System.out.println("Item name: " + text_of_Product);
	
	}
    public void add_to_cart() {
    	Add_to_cart.click();
    }	
    public void select_checkout() {
    	Checkout_icon.click();
    
    }
    public String SwagLab_ProductPageLogogetText() { 
    	System.out.println(SwagLab_ProductPageLogo.getText());
    	return SwagLab_ProductPageLogo.getText().trim();
    }
}
