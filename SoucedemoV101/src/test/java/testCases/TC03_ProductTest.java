package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AllProductsPage;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class TC03_ProductTest extends BaseClass{
	
	@Test
	public void testProduct() {
				
		// Login Page
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(p.getProperty("username"));
		loginPage.setPassword(p.getProperty("password"));
		loginPage.clickLogin();
		
		// All Products Page
		AllProductsPage allProductsPage = new AllProductsPage(driver);
        Assert.assertTrue(allProductsPage.isProductsPageExist(), "Products page not displayed!");
		allProductsPage.clickProduct(5);
		
		// Product Page
		ProductPage productPage = new ProductPage(driver);
		productPage.clickAddToCart();
		productPage.clickShoppingCart();	
	}

}
