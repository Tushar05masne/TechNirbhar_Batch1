package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pages.login_page;

public class LoginSteps {
	
    private login_page loginPage;

    public LoginSteps(WebDriver driver) {
        this.loginPage = new login_page(driver);
    }
    @Given("I am on the login page")
    public void loginWithCredentials(String username, String password) {
        loginPage.enter_username(username);
        loginPage.enter_password(password);
        loginPage.click_login();
    }

//    public String getLoginError() {
//        //return loginPage.getErrorMessage();
//    }
}

