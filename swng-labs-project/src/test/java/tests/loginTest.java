package tests;

import org.testng.annotations.Test;

import base.basetest;
import steps.LoginSteps;
import steps.ProductPageSteps;

public class loginTest extends basetest {
  @Test
  public void positiveLoginTest() {
	  
	    LoginSteps login = new LoginSteps(driver, "positiveLoginTest");
		ProductPageSteps product = new ProductPageSteps(driver, "positiveLoginTest");


		login.loginWithCredentials();
		login.ValidateURL(driver);
		product.SwagLab_ProductPageLogogetText_validate();
  }
}
