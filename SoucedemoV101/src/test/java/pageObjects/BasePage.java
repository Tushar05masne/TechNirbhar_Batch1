package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div/button[text()='Open Menu']")
	WebElement buttonOpenMenu;
	
	@FindBy(xpath = "//div/nav/a[@id='inventory_sidebar_link']")
	WebElement linkAllItems;
	
	@FindBy(xpath = "//div/nav/a[@id='about_sidebar_link']")
	WebElement linkAbout;

	@FindBy(xpath = "//div/nav/a[@id='logout_sidebar_link']")
	WebElement linkLogout;
	
	@FindBy(xpath = "//div/nav/a[@id='reset_sidebar_link']")
	WebElement linkResetAppState;

	@FindBy(xpath = "//div/button[@id='react-burger-cross-btn']")
	WebElement buttonCloseSidebarMenu;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement linkShoppingCart;
	
	public void clickSidebarOpenMenu() {
		buttonOpenMenu.click();
	}
	
	public void clickSidebarAllItems() {
		linkAllItems.click();
	}
	
	public void clickSidebarAbout() {
		linkAbout.click();
	}
	
	public void clickSidebarLogout() {
		linkLogout.click();
	}
	
	public void clickSidebarResetAppState() {
		linkResetAppState.click();
	}
	
	public void clickSidebarCloseMenu() {
		buttonCloseSidebarMenu.click();
	}
	
	public void clickShoppingCart() {
		linkShoppingCart.click();
	}	
}
