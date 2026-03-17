package testCases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import org.apache.logging.log4j.LogManager;	// Log4j
import org.apache.logging.log4j.Logger;		// Log4j


public class BaseClass {

	public static WebDriver driver;		// we have to make 'WebDriver' as a static because at the time of report generation, in 'onTestFailure' method in 'ExtentReportManager' class,
										// we are creating one more object of the Base class.i.e. we are creating 2 objects. So at the time of calling captureScreen() method 			
										// in the 'onTestFailure' method, it creates conflict that which object of WebDriver have to use to call the method. So make 'WebDriver' as a static.	
	public Logger logger;
	public Properties p;
	
	@BeforeClass(groups = {"Sanity","Regression","Master"})
	@Parameters({"os","browser"})
	public void setup(String os, String br) throws IOException
	{
		// loading config.properties file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p = new Properties();
		p.load(file);
		
		logger = LogManager.getLogger(this.getClass());	// load the log4j2.xml file. it always fetch resources folder
														// add only this one line for logger, we will get logging file. 

		
		
		// Standalone setup(single machine) - same machine work as a hub as well as node
		// Hub and Node setup(multiple machine) - one machine work as a hub and other machines are work as node
		// for the standalone Grid(Hub+node) setup we have to write below code. 

		// this is for remote environment - if we want to run our test cases remotely
			// execution_env - variable decalred in config.properties file. Based on it's value, test cases runs locally or remotely

		// before execution of the testcases, we have to start the grid environment.
		// D:\myWork\Testing>java -jar selenium-server-4.40.0.jar standalone		--> fire command in the cmd
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//os
			if (os.equalsIgnoreCase("windows")) 
			{
				capabilities.setPlatform(Platform.WIN11);
			} 
			else if (os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);	
			}
			else {
				System.out.println("No matching OS");
				return;
			}
			
			// browser
			switch (br.toLowerCase()) {
			case "chrome": capabilities.setBrowserName("Chrome"); break;
			case "edge" : capabilities.setBrowserName("MicrosoftEdge"); break;
			default: System.out.println("No matching browser.");	break;
			}
			
			// we have to make an object of RemoteWebDriver and give url to run the test on remote server
			// 192.168.0.115 - localhost
			driver = new RemoteWebDriver(new URL("http://localhost:4444"),capabilities);
		}
		
		// this is for local environment	- if we want to run our test cases locally	
		else if(p.getProperty("execution_env").equalsIgnoreCase("local"))			// if we use only if then it throws 'NullPointerException'. we have to use else if statement
		{
			switch (br.toLowerCase())
			{
				case "chrome": driver = new ChromeDriver(); break;
				case "edge" : driver = new EdgeDriver(); break;
				case "firefox" : driver = new FirefoxDriver(); break;
				default: System.out.println("Invalid Browser..."); return;
			}
		}
				
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));		// reading value of appURL from config.properties file
		driver.manage().window().maximize();	
	}
	
	@AfterClass(groups = {"Sanity","Regression","Master"})
	public void tearDown() 
	{
		driver.quit();
	}
	
	public String randomString() 
	{
		String generatedString =	RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomNumber()
	{
		String generatedNumber =	RandomStringUtils.randomNumeric(10);
		return generatedNumber;	
	}
	
	public String randomAlphaNumeric()
	{
		String generatedString =	RandomStringUtils.randomAlphabetic(3);
		String generatedNumber =	RandomStringUtils.randomNumeric(3);
		return (generatedString+"@"+generatedNumber);

	}
	
	public String captureScreen(String tname) {
		
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath = System.getProperty("user.dir")+"\\screenshots\\"+tname+"_"+timeStamp+".png";
		File targeFile = new File(targetFilePath);
		
		sourceFile.renameTo(targeFile);
		
		return targetFilePath;
		
	}
	
	
	
}
