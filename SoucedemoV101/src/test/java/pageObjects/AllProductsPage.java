package pageObjects;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Application_utils;

public class AllProductsPage extends BasePage {

	public AllProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div/span[text()='Products']")
	WebElement productsHeading;

	@FindBy(xpath = "//div[@class='inventory_list']/div[@class='inventory_item']//a/div[@class='inventory_item_name ']")
	List<WebElement> listAllProducts;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement buttonAddToCartSauceLabsBackpack;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement buttonAddToCartSauceLabsBikeLight;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement buttonAddToCartSauceLabsBoltTshirt;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	WebElement buttonAddToCartSauceLabsFleeceJacket;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	WebElement buttonAddToCartSauceLabsOnesie;
	
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	WebElement buttonAddToCartTestTShirt;
	
	public boolean isProductsPageExist() {
		return productsHeading.isDisplayed();
	}
		
	public int getAllProductsCount() {
		return listAllProducts.size();
	}
		
	public void printAllProducts() {
		System.out.println("List of all the products:");		
		for(WebElement product:listAllProducts) {
			System.out.println(product.getText());
			System.out.println();
		}
	}
	
	public void clickButtonAddToCartSauceLabsBackpack() {
		buttonAddToCartSauceLabsBackpack.click();
	}
	
	public void clickButtonAddToCartSauceLabsBikeLight() {
		buttonAddToCartSauceLabsBikeLight.click();
	}
	
	public void clickButtonAddToCartSauceLabsBoltTshirt() {
		buttonAddToCartSauceLabsBoltTshirt.click();
	}
	
	public void clickButtonAddToCartSauceLabsFleeceJacket() {
		buttonAddToCartSauceLabsFleeceJacket.click();
	}

	public void clickButtonAddToCartSauceLabsOnesie() {
		buttonAddToCartSauceLabsOnesie.click();
	}
	
	public void clickButtonAddToCartTestTShirt() {
		buttonAddToCartTestTShirt.click();
	}
	
	public void clickProduct(int index) {	
		
		//try {
		// Relocate the products fresh each time so that we can not get the StaleElementReferenceException		
		 WebElement product = Application_utils.explicitWaitForClickableElement(driver, 10, listAllProducts.get(index));
		
		// scrollIntoView for scrolling the page till the product find into view
		Application_utils.javaScript_ScrollIntoView(driver, product);

		try {
			System.out.println("Clicked product: " +product.getText());
			product.click();
		}
		catch (StaleElementReferenceException e) 
		{
			product = listAllProducts.get(index);
			System.out.println("Clicked product : " +product.getText());
			product.click();
		}		
	}	
}
