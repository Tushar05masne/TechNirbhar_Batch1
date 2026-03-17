package testNg6;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// by using PageFactory	- this is more flexible and usable. Now a days,mostly this type is used.
	// PageFactory is a predefined class available in selenium WebDriver
public class LoginPage2 {

	WebDriver driver;
	
	// constructor
	public LoginPage2(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);	// MANDATORY Statement	// initiate all the elements by driver which we have passed
	}
	
	//Locators
//	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
//	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
//	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	@FindBy(xpath = "//input[@placeholder='Username']") 
	WebElement txt_username_loc;			// @FindBy annotation will directly find the element and store it into the variable of WebElement type 
	
	@FindBy(xpath = "//input[@placeholder='Password']") 
	WebElement txt_password_loc;
	
	@FindBy(xpath = "//button[normalize-space()='Login']") 
	WebElement btn_login_loc;
	
	
	// if we want to capture the group of web elements
	@FindBy(tagName = "a") 
	List<WebElement> links;		// links variable is of List type and contains the group of web elements
	
	
	//Action methods
	public void setUserName(String user)
	{
		txt_username_loc.sendKeys(user);		// we directly use only the variable_name.action_type 
	}
	
	public void setPassword(String pwd)
	{
		txt_password_loc.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login_loc.click();
	}
	
	
	
	
	
}
