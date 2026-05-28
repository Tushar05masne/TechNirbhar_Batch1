package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage{
	
	public YourCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@id='checkout']")
	WebElement buttonCheckout;

	@FindBy(xpath = "//button[@id='continue-shopping']")
	WebElement buttonContinueShopping;
		
	@FindBy(xpath = "//div[@class='cart_list']")
	List<WebElement> purchaseItemsList;
	
	public void clickButtonCheckout() {
		buttonCheckout.click();
	}
	
	public void clickButtonContinueShopping(){
		buttonContinueShopping.click();
	}
		
	public void listPurchaseItems() {
		System.out.println("The list of purchase items:");
		for(WebElement item:purchaseItemsList) {
			System.out.println(item.getText());
		}
	}
}
