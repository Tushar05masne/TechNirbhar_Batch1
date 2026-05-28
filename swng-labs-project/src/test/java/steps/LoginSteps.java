package steps;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pages.login_page;
import utilities.CommonUtil;
import utilities.JsonUtil;
import utilities.JsonUtil2;

public class LoginSteps {

	private login_page loginPage;
	private Map<String, String> creds;

	public LoginSteps(WebDriver driver, String TestcaseName) {
		this.loginPage = new login_page(driver);
		creds = JsonUtil.getTestData("TestData.json", TestcaseName);

	}

	public void loginWithCredentials() {
		loginPage.enter_username(creds.get("Username"));
		loginPage.enter_password(creds.get("Password"));
		loginPage.click_login();
	}

	public void ValidateURL(WebDriver driver) {

		Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"),
				"Login failed or inventory page not loaded!");

	}
}
