package Day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	// selecting Future date
	static void selectFutureDate(WebDriver driver, String expectedDate, String expectedMonth, String expectedYear)
	{
		// select month and year and compare it with expected month and year
		while(true) 
		{
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();	 // gives actual/current month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // gives actual/current year
		
			if(currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear))	
			{
				break;		// if current month,year matches actual month,year then stop/break
			}

			// if not matching then click on next button	till the match found
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();	
		}

		//select the date
		List<WebElement> allDates =	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement date:allDates)
		{
			if(date.getText().equals(expectedDate))
			{
				date.click();
				System.out.println(date.getText());
				break;
			}
		}	
	}
	
	// selecting Past date
	static void selectPastDate(WebDriver driver, String expectedDate, String expectedMonth, String expectedYear)
	{
		// select month and year and compare it with expected month and year
		while(true) 
		{
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();	 // gives actual/current month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // gives actual/current year
		
			if(currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear))	
			{
				break;		// if current month,year matches expected month,year then stop/break
			}
		
			// if not matching then click on previous button	till the match found		
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();		
		}

		//select the date
		List<WebElement> allDates =	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement date:allDates)
		{
			if(date.getText().equals(expectedDate))
			{
				date.click();
				System.out.println(date.getText());
				break;
			}
		}	
	}

	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement datePickerInputBox =	driver.findElement(By.xpath("//input[@id='datepicker']"));

		// method1 - using sendkeys
		//datePickerInputBox.sendKeys("03/07/2016");
		
		// method2 - using date picker
		String expectedYear = "2028";
		String expectedMonth = "April";
		String expectedDate = "19";
		
		datePickerInputBox.click();		// it will opens the date picker
		
		// On the basis of the requirement, call the FutureDate() or PastDate()
		selectFutureDate(driver,expectedDate,expectedMonth,expectedYear);
		//selectPastDate(driver,expectedDate,expectedMonth,expectedYear);
	}

}
