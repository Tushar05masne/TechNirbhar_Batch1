package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;


public class Application_utils {

	public static String get_calender_Date(String DateFormat, int daysToAdd_Or_Subtract) {

		SimpleDateFormat sdf = new SimpleDateFormat(DateFormat);

		// Current date
		Date now = new Date();
		System.out.println("Today's date is " + sdf.format(now));

		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		//String str = Integer.toString(daysToAdd_Or_Subtract);

		while (daysToAdd_Or_Subtract > 0) {

			cal.add(Calendar.DAY_OF_MONTH, 1); // move forward by one day
			System.out.println("Adding 1 day");

			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
				daysToAdd_Or_Subtract--; // count only weekdays
			}
		}
		while (daysToAdd_Or_Subtract < 0) {
			
			cal.add(Calendar.DAY_OF_MONTH, -1); // move backward by one day
			System.out.println("Subtracting 1 day");

			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
				daysToAdd_Or_Subtract++; // count only weekdays
			}
		}
		
	
		Date future_Back_Current_Date = cal.getTime();

		String s_Final_Date = sdf.format(future_Back_Current_Date);

		System.out.println("Date after " + daysToAdd_Or_Subtract + " Days " + s_Final_Date);
		return s_Final_Date;
	}
	
	public static void JavaScript_ScrollIntoView(WebDriver driver,WebElement ele) {
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;		
		jse.executeScript("arguments[0].scrollIntoView(true)", ele);
		
	}
    public static void JavaScript_Click(WebDriver driver,WebElement ele) {
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;		
		jse.executeScript("arguments[0].click()", ele);
		
	}
   public static void elementClick(WebDriver driver,WebElement ele) {
		
	   
	   JavaScript_HighlightElement(driver, ele);
	   ele.click();
		
	}
   public static void JavaScript_HighlightElement(WebDriver driver,WebElement ele) {	
	   
		JavascriptExecutor jse=(JavascriptExecutor)driver;		
      // Highlight with a red border
		jse.executeScript("arguments[0].style.border='3px solid blue'", ele);

      // Optional: add background color
    	jse.executeScript("arguments[0].style.backgroundColor='yellow'", ele);

		
	}
	public static void CaptureScreenShot(WebDriver driver) throws IOException {
		
		File Src_folder = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String RandomNum = RandomString.make(5);
		String dynamicPath = "C:\\Users\\tusha\\OneDrive\\Desktop\\TechNirbhar\\Selenium_TestNG_FW\\Selenium_TestNG_FW\\ScreenShots\\test"+ RandomNum + ".png";
		File dest = new File(dynamicPath);
		FileHandler.copy(Src_folder, dest);

	}

	public static void Select_DropDown_By_Text(WebElement ele, String value) {

		Select select_Color_DD = new Select(ele);
		select_Color_DD.selectByVisibleText(value);

	}

	public static void Select_DropDown_By_Index(WebElement ele, String index) {

		int Int_index = Integer.parseInt(index);
		Select select_Color_DD = new Select(ele);
		select_Color_DD.selectByIndex(Int_index);

	}

	public static void Select_DropDown_By_Value(WebElement ele, String attribute_Value) {

		Select select_Color_DD = new Select(ele);
		select_Color_DD.selectByValue(attribute_Value);

	}
	public static void deSelect_DropDown_By_Text(WebElement ele, String value) {

		Select select_Color_DD = new Select(ele);
		select_Color_DD.deselectByVisibleText(value);

	}

	public static void deSelect_DropDown_By_Index(WebElement ele, String index) {

		int Int_index = Integer.parseInt(index);
		Select select_Color_DD = new Select(ele);
		select_Color_DD.deselectByIndex(Int_index);

	}

	public static void deSelect_DropDown_By_Value(WebElement ele, String attribute_Value) {

		Select select_Color_DD = new Select(ele);
		select_Color_DD.deselectByValue(attribute_Value);

	}
	public static void Multi_checkBox_Select(WebDriver driver, String [] multi_value) throws InterruptedException {
		
		 // multi_value= {"saturday", "monday","friday"};
		  
			for (String e : multi_value) {

				WebElement Multi_CheckBox = driver.findElement(By.xpath("//input[@id='" + e + "']"));
				Thread.sleep(50);
				Multi_CheckBox.click();
			}
	}
	
	
	

}
