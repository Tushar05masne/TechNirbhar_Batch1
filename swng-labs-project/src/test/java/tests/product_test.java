package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.basetest;
import pages.login_page;
import pages.products_page;
import steps.LoginSteps;
import utilities.CommonUtil;

public class product_test extends basetest{
	
	@Test (dependsOnMethods = {"login_test"})
	
	public void Add_product() {

		//login_page login = new login_page(driver);
		products_page product = new products_page(driver);
		
		LoginSteps login=new LoginSteps(driver);

		// Thread.sleep(2000);
		CommonUtil.implicitWaits_seconds(driver, 20);
//		login.enter_username();
//		login.enter_password();
//		login.click_login();
//		Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"),
//				"Login failed or inventory page not loaded!");
		login.loginWithCredentials("Gajanan","G123");
		product.select_product();
		product.add_to_cart();
		product.select_checkout();

	}
}
