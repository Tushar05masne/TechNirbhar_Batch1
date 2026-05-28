package steps;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pages.login_page;
import pages.products_page;
import utilities.JsonUtil;

public class ProductPageSteps {
	 
	private products_page products_page;
	 private Map<String, String> creds;

    public ProductPageSteps(WebDriver driver,String TestcaseName) {
        this.products_page = new products_page(driver);
        creds = JsonUtil.getTestData("TestData.json", TestcaseName);

    }
    
    public void addProduct_Andcheckout() {
    	products_page.select_product();
    	products_page.add_to_cart();
    	products_page.select_checkout();
    }

	public void SwagLab_ProductPageLogogetText_validate() {

		String aSwagLab_ProductPageLogogetText = products_page.SwagLab_ProductPageLogogetText();

		String eSwagLab_ProductPageLogogetText = creds.get("eSwagLab_ProductPageLogo_text");

		Assert.assertTrue(aSwagLab_ProductPageLogogetText.equals(eSwagLab_ProductPageLogogetText),
				"actual SwagLab_ProductPageLogogetText did not match");

	}
    
    
    
   


}

