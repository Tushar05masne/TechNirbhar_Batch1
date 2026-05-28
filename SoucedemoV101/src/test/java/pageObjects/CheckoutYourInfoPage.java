package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInfoPage extends BasePage {
	
	public CheckoutYourInfoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='First Name' and @id='first-name']")
	WebElement textFirstName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name' and @id='last-name']")
	WebElement textLastName;
	
	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code' and @id='postal-code']")
	WebElement textPostalCode;
	
	@FindBy(xpath = "//input[@type='submit' and @id='continue']")
	WebElement buttonContinue;
	
	@FindBy(xpath = "//button[@id='cancel']")
	WebElement buttonCancel;
	
	public void setFirstName(String firstname) {
		textFirstName.sendKeys(firstname);
	}
	
	public void setLastName(String lastname) {
		textLastName.sendKeys(lastname);
	}
	
	public void setPostalCode(String postalcode) {
		textPostalCode.sendKeys(postalcode);
	}
	
	public void clickButtonContinue() {
		buttonContinue.click();
	}
	
	public void clickButtonCancel() {
		buttonCancel.click();
	}
	
}
