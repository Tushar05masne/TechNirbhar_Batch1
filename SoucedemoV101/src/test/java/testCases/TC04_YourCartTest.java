package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AllProductsPage;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import pageObjects.YourCartPage;
import testBase.BaseClass;

public class TC04_YourCartTest extends BaseClass {
	
	@Test
	public void testYourCart() {
		
		// Login Page
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(p.getProperty("username"));
		loginPage.setPassword(p.getProperty("password"));
		loginPage.clickLogin();
		
		// All Products Page
		AllProductsPage allProductsPage = new AllProductsPage(driver);
        Assert.assertTrue(allProductsPage.isProductsPageExist(), "Products page not displayed!");
		//allProductsPage.clickProduct(5);
		allProductsPage.clickButtonAddToCartSauceLabsBackpack();
		allProductsPage.clickButtonAddToCartSauceLabsBikeLight();
		
		
		// Product Page
		//ProductPage productPage = new ProductPage(driver);
		//productPage.clickAddToCart();
		//productPage.clickShoppingCart();
		
		// Your Cart Page
		YourCartPage yourCartPage = new YourCartPage(driver);		
		yourCartPage.listPurchaseItems();
		yourCartPage.clickShoppingCart();
		yourCartPage.listPurchaseItems();
		
		//yourCartPage.clickButtonCheckout();
		
		
	}

}
