package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.basetest;
import pages.login_page;

public class login_test extends basetest{
	
	@Test
	public void test_LoginPage() throws InterruptedException {
		login_page login = new login_page(driver);
		Thread.sleep(2000);
		login.enter_username();
		login.enter_password();
		login.click_login();
		 Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"),
	                "Login failed or inventory page not loaded!");
	    
	}
	
	
}