package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage {
	
	public CheckoutOverviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[text()='Finish' and @id='finish']")
	WebElement buttonFinish;
	
	@FindBy(xpath = "//button[text()='Cancel' and @id='cancel']")
	WebElement buttonCancel;
	
	public void clickButtonFinish() {
		buttonFinish.click();
	}
	
	public void clickButtonCancel() {
		buttonCancel.click();
	}
	
}
