package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@id='add-to-cart']")
	WebElement buttonAddToCart;
	
	@FindBy(xpath = "//button[@id='back-to-products']")
	WebElement buttonBackToProducts;
	
	public void clickAddToCart() {
		buttonAddToCart.click();
	}
	
	public void clickBackToProducts(){
		buttonBackToProducts.click();
	}
	
}
