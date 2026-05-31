package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.basetest;
import pages.login_page;
import pages.products_page;
import steps.LoginSteps;
import steps.ProductPageSteps;
import utilities.CommonUtil;

@Listeners(utilities.MyListerner_study.class)

public class product_test extends basetest {

	@Test

	public void Addproduct_Validateproduct() {

		LoginSteps login = new LoginSteps(driver, "positiveLoginTest");
		ProductPageSteps product = new ProductPageSteps(driver, "positiveLoginTest");
		
		test = extent.createTest("Addproduct_Validateproduct");

		
		test.info("Logging in with credentials");
		login.loginWithCredentials();
		test.info("Validating URL after login");
		login.ValidateURL(driver);
		test.info("Adding product and checking out");
		product.addProduct_Andcheckout();
		test.pass("Addproduct_Validateproduct completed successfully");
		

	}


	@Test

	public void checkCartProducts() {

		LoginSteps login = new LoginSteps(driver, "TC2");
		ProductPageSteps product = new ProductPageSteps(driver, "TC2");

		login.loginWithCredentials();
		login.ValidateURL(driver);
		product.addProduct_Andcheckout();

	}
}
