package testCases;

import org.testng.annotations.Test;

import pageObjects.AllProductsPage;
import pageObjects.CheckoutYourInfoPage;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import pageObjects.YourCartPage;
import testBase.BaseClass;

public class TC05_CheckoutYourInfoTest extends BaseClass {

	@Test
	public void testCheckoutYourInfo() {
		
		//Login Page
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(p.getProperty("username"));
		loginPage.setPassword(p.getProperty("password"));
		loginPage.clickLogin();
		
		// All Products Page
		AllProductsPage allProductsPage = new AllProductsPage(driver);
		allProductsPage.clickProduct(3);
		
		//Product Page
		ProductPage productPage = new ProductPage(driver);
		productPage.clickAddToCart();
		productPage.clickShoppingCart();
		
		//Your cart page
		YourCartPage yourCartPage = new YourCartPage(driver);
		yourCartPage.clickButtonCheckout();
		
		//CheckoutYourInfo Page
		CheckoutYourInfoPage checkoutYourInfoPage = new CheckoutYourInfoPage(driver);
		checkoutYourInfoPage.setFirstName("Mahesh");
		checkoutYourInfoPage.setLastName("More");
		checkoutYourInfoPage.setPostalCode("416416");
		checkoutYourInfoPage.clickButtonContinue();
			
	}

}
