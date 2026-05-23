package tests;

import org.testng.annotations.Test;

import base.basetest;
import pages.products_page;

public class product_test extends basetest{
	
	@Test (dependsOnMethods = {"login_test"})
	
	public void Add_product() {
	products_page product = new products_page(driver);
	product.select_product();
	
	product.add_to_cart();
	product.select_checkout();
	
	
	}
}
