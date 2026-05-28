package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.basetest;
import pages.login_page;
import pages.products_page;
import steps.LoginSteps;
import steps.ProductPageSteps;
import utilities.CommonUtil;

public class product_test extends basetest {

	@Test

	public void Addproduct_Validateproduct() {

		LoginSteps login = new LoginSteps(driver, "TC1");
		ProductPageSteps product = new ProductPageSteps(driver, "TC1");

		login.loginWithCredentials();
		login.ValidateURL(driver);
		product.addProduct_Andcheckout();

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
