package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

/*	DDT - Data Driven Test
 
 * */

public class TC003_LoginDDT extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = "Datadriven")	//LoginData-name of the dataProvider from the DataProviders.java		
	public void verify_loginDDT(String email, String pwd, String expected)
	{
		logger.info("******* Starting TC003_LoginDDT ************");
		
		try
		{
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		logger.info("Login button clicked...");
		
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);	
		lp.clickLogin();

		//MyAccount
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExist();
	
//		 *  Data is valid --> login success	--> test pass	--> we have to logout 
//		 * 					  login failed	--> test fail 
//		 * 
//		 * Data is invalid --> login success	--> test fail	--> we have to logout
//		 * 						login failed	--> test pass	
		
		
		if (expected.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{
				macc.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if (expected.equalsIgnoreCase("Invalid"))
			{
			if(targetPage==true)
			{
				macc.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
			}
		} catch (Exception e) 
		{
			Assert.fail();
	
		}
		
		logger.info("******* Finished TC003_LoginDDT ************");

				
	}
	
	
	
}
