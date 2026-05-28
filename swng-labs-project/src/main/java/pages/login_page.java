package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.basetest;
import utilities.CommonUtil;
import utilities.JsonUtil;

public class login_page {

	private WebDriver driver;

	@FindBy(name = "user-name")
	private WebElement Email_loginpage;

	@FindBy(id = "password")
	private WebElement Password_loginpage;

	@FindBy(id = "login-button")
	private WebElement Login_button;

	public login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//	Map<String, String> creds = JsonUtil.getTestData("src/test/java/TestData/Test.json","" );
//	String username = creds.get("Username");
//	String password = creds.get("Password");

	public void enter_username(String username) {
		Email_loginpage.sendKeys(username);
		CommonUtil.implicitWaits_seconds(driver, 20);
	}

	public void enter_password(String password) {
		Password_loginpage.sendKeys(password);
	}

	public void click_login() {
		Login_button.click();
	}

	public void getErrorMessage() {

	}

}
