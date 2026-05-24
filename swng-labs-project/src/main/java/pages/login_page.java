package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.basetest;

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

	public void enter_username(String username) {
		Email_loginpage.sendKeys(username);
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
