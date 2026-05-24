package steps;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import org.openqa.selenium.WebDriver;

import pages.login_page;

public class LoginSteps {
	
    private login_page loginPage;

    public LoginSteps(WebDriver driver) {
        this.loginPage = new login_page(driver);
    }
    //@Given("I am on the login page")
    String content = new String(Files.readAllBytes(Paths.get("src/test/resources/credentials.json")));
    JSONObject obj = new JSONObject(content);
    String username = obj.getString("username");
    String password = obj.getString("password");
    
    public void loginWithCredentials(String username, String password) {
        loginPage.enter_username(username);
        loginPage.enter_password(password);
        loginPage.click_login();
    }

//    public String getLoginError() {
//        //return loginPage.getErrorMessage();
//    }
}

