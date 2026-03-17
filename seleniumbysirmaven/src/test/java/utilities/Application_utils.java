package utilities;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.SelectableChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Application_utils {

	public static void javaScript_ScrollIntoView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void javaScript_Click(WebDriver driver, WebElement element)
	{
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
	
	public static void captureScreenShot(WebDriver driver) throws IOException
	{
		Date now = new Date();			// creating object of Date class which stores the current system date and time
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(now);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File	 sourceFile =	ts.getScreenshotAs(OutputType.FILE);
	
		String targetFilePath = System.getProperty("user.dir")+"\\ScreenShots\\"+"test_"+timeStamp+".png";
		File targetFile = new File(targetFilePath);
		
		FileHandler.copy(sourceFile, targetFile);					
	}
	
	public static void selectCheckboxes(WebDriver driver, String[] selectDays) throws InterruptedException
	{
		for(String day:selectDays)
		{
			WebElement testAutomation_Home_SelectDay_Checkbox = driver.findElement(By.xpath("//input[@id='"+day+"']"));
			testAutomation_Home_SelectDay_Checkbox.click();
			Thread.sleep(1000);
		}
	}
	
	public static void dropDownOptionsList(Select selectCountry_DropdownObj)
	{
		List<WebElement>	selectCountry_Dropdown_OptionsList = selectCountry_DropdownObj.getOptions();
		System.out.println("Number of countries in dropdown are: "+selectCountry_Dropdown_OptionsList.size());
		System.out.println("The Countries are:");
		
		for(WebElement country:selectCountry_Dropdown_OptionsList)
		{
			System.out.println(country.getText());
		}
		
	}

	public static void selectMultipleColors(Select multiselectColorsObj, String[] multiselectColorsList) throws InterruptedException
	{
		for(String color:multiselectColorsList)
		{
			multiselectColorsObj.selectByVisibleText(color);
			Thread.sleep(1000);
		}
	}
	
	public static void selectSortedMultipleAnimals(Select multiselectSortedListAnimalObj, String[] multiselectAnimalSortedList) throws InterruptedException
	{
		String animal1 = "";
		for(String animal:multiselectAnimalSortedList)
		{
			animal1=animal.substring(0, 1).toUpperCase() + animal.substring(1);
			multiselectSortedListAnimalObj.selectByVisibleText(animal1);
			Thread.sleep(1000);
		}	
	}
	
	public static void findBrokenLinksAndCount(List<WebElement> testAutomation_Home_allLinks) throws IOException
	{
		int numberOfBrokenLinks = 0;
		for(WebElement linkElement:testAutomation_Home_allLinks)
		{
			String hrefValue = linkElement.getAttribute("href");
		
			if(hrefValue==null || hrefValue.isEmpty())
			{
				System.out.println("No href value for link.");
				continue;
			}
			
			URL linkURL = new URL(hrefValue);
			HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefValue+"--> Broken Link");
				numberOfBrokenLinks++;
			}
			else {
				System.out.println(hrefValue+"--> Not a broken link.");
			}	
		}
		System.out.println("Number of broken links are:"+numberOfBrokenLinks);	//9		
	}	
	
}
