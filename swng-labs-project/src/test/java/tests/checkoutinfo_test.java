package tests;

import org.testng.annotations.Test;

import base.basetest;
import pages.checkout_info;

public class checkoutinfo_test extends basetest {

	@Test
	
	public void checkout_continue() throws InterruptedException {
		
		checkout_info info_fill  = new checkout_info(driver);
		info_fill.checkout_info_page();
		Thread.sleep(3000);
		info_fill.continue_checkout();

	}
	
}
