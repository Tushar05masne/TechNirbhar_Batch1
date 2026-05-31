package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class basetest {
	
	protected static WebDriver driver;

	public static  ExtentReports extent;
	public static ExtentTest test;
   

    @BeforeSuite
    public void setup_extentReport() {
    	// Create the directory if it doesn't exist
    	try {
    		String reportDir = "test-output/reports";
    		FileUtils.forceMkdir(new File(reportDir));
    	} catch (Exception e) {
    		e.printStackTrace();
    	}

    	
    	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/reports/extent.html");
    	extent = new ExtentReports();
    	extent.attachReporter(sparkReporter);

         extent.setSystemInfo("Tester", "Tushar");
         extent.setSystemInfo("Environment", "QA");
       
    }
    @BeforeClass
	public static void setup() throws InterruptedException {
    	ChromeOptions options = new ChromeOptions();

    	// Disable password manager prompts
    	options.addArguments("--disable-save-password-bubble");
    	// Disable popup blocking
    	options.addArguments("--disable-popup-blocking");
    	// Disable credential leak detection (the “Change your password” popup)
    	options.addArguments("--disable-features=PasswordManagerEnabled,PasswordLeakDetection");
    	// Optional: run in incognito mode for a clean profile
    	options.addArguments("--incognito");

    	driver = new ChromeDriver(options);

		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.saucedemo.com/");
		
	}
	

	
	@AfterSuite	
    public void closeReport() {
    	if (extent != null) {
    		extent.flush();
    	}
    }

}
