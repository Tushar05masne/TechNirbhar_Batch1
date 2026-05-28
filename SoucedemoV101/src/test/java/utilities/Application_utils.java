package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Application_utils {
	
	public static void javaScript_ScrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void javaScript_Click(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public static void javaScript_HighlightElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// highlight with red border
		js.executeScript("arguments[0].style.border='7px solid red'", element);
		
		// add background color yellow
		js.executeScript("arguments[0].style.backgroundColor='yellow'", element);
	}
	
	public static WebElement explicitWaitForClickableElement(WebDriver driver, int timeout, WebElement element)
	{
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return explicitWait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void captureScreenShot(WebDriver driver) throws IOException
	{
		Date now = new Date();			// creating object of Date class which stores the current system date and time
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(now);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	
		String targetFilePath = System.getProperty("user.dir")+"\\ScreenShots\\"+"test_"+timeStamp+".png";
		File targetFile = new File(targetFilePath);
		
		FileHandler.copy(sourceFile, targetFile);					
	}
	
	
}
