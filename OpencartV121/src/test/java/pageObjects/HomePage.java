package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	// Locators
	@FindBy(xpath = "//a[@title='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement lnkRegister;	

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement lnkLogin;	
	
	
	// Action methods
	public void clickMyAccount()
	{
		lnkMyaccount.click(); // when this executed, it actually runs-> driver.findElement(By.xpath("//a[@title='My Account']")).click();
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		lnkLogin.click();
	}
	
}
