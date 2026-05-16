package tests;

import org.testng.annotations.Test;

import base.basetest;
import pages.checkout_page;
import pages.products_page;

public class checkout_test extends basetest {
	
	@Test
	
	public void checkout_product() throws InterruptedException {
		checkout_page checkout = new checkout_page(driver);
		
		Thread.sleep(2000);
		//checkout.item_visibility();
		checkout.checkout_click();

	}

}
