package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;

public class LoginTest extends BaseTest {
	
	 @DataProvider(name = "loginData")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"standard_user", "secret_sauce"}
	        };
	    }
	
	@Test(dataProvider = "loginData")
    public void testLogin(String username, String password) throws InterruptedException {

		// Create object of LoginPage
        LoginPage login = new LoginPage(driver);
        ProductPage product = new ProductPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);

        // Perform login
        login.login("standard_user", "secret_sauce");


	   product.addToCart();
	   Thread.sleep(2000);
	   
	   product.openCart();
	   Thread.sleep(2000);
	  
       checkout.checkout();
       Thread.sleep(2000);
       
       String msg = driver.findElement(By.className("complete-header")).getText();
       Assert.assertEquals(msg,"THANK YOU FOR YOUR ORDER" );
	}
}
