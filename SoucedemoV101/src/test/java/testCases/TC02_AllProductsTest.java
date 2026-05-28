package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AllProductsPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC02_AllProductsTest extends BaseClass{
	
	@Test
	public void testProducts() {
		
		// Login Page
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(p.getProperty("username"));
		loginPage.setPassword(p.getProperty("password"));
		loginPage.clickLogin();
		
		// All Products Page
		AllProductsPage allProductsPage = new AllProductsPage(driver);
        Assert.assertTrue(allProductsPage.isProductsPageExist(), "Products page is not displayed!");
		allProductsPage.printAllProducts();
				
		int numberOfProducts = allProductsPage.getAllProductsCount();
		System.out.println("Number of products are:"+numberOfProducts);
		
		allProductsPage.clickButtonAddToCartSauceLabsBackpack();
		allProductsPage.clickButtonAddToCartSauceLabsBikeLight();
		
		allProductsPage.clickShoppingCart();
		
		//allProductsPage.clickProduct(4);
	}

}
