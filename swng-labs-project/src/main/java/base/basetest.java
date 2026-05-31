package base;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {

    protected WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeSuite
    public void setupExtentReport() {
        try {
            String reportDir = "test-output/reports";
            FileUtils.forceMkdir(new File(reportDir));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
                System.getProperty("user.dir") + "/test-output/reports/extent.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Tester", "Tushar");
        extent.setSystemInfo("Environment", "QA");
    }

    @BeforeClass
    public void setupDriver() {
        WebDriverManager.chromedriver().setup(); // auto-manages driver version

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-features=PasswordManagerEnabled,PasswordLeakDetection");
        options.addArguments("--incognito");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void tearDownDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void closeReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}
