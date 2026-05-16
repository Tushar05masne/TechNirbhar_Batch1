package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.basetest;

public class login_page {
	
	private WebDriver driver;
	
	
	public login_page(WebDriver driver){
		this.driver = driver;
	}
	
	public void enter_username() {
		WebElement Email_loginpage = driver.findElement(By.name("user-name"));
		Email_loginpage.sendKeys("standard_user");
	}
	
	public void enter_password() {
		WebElement Password_loginpage = driver.findElement(By.id("password"));
		Password_loginpage.sendKeys("secret_sauce");
	}
	
	public void click_login() {
		WebElement Login_button = driver.findElement(By.id("login-button"));
		Login_button.click();
	}
	
	
}
