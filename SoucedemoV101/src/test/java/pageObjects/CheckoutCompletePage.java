package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage {
	public CheckoutCompletePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[text()='Back Home']")
	WebElement buttonBackHome;
	
	public void clickButtonBackHome() {
		buttonBackHome.click();
	}
}
