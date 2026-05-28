package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement textUserName;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement textPassword;

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement buttonLogin;

	public void setUserName(String username) {
		textUserName.sendKeys(username);
	}

	public void setPassword(String password) {
		textPassword.sendKeys(password);
	}

	public void clickLogin() {
		buttonLogin.click();
	}

}
