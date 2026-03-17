package Day19;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
			driver.manage().window().maximize();
		
			String filepath = System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
			int rows = ExcelUtils.getRowCount(filepath, "Sheet1");
			
			for(int i=1;i<=rows;i++)
			{
				// read data from excel
				String price = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);	// (filepath,Sheetname,rownumber,cellnumber)
				String rateofinterest = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
				String per1 = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
				String per2 = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
				String freq = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
				String exp_mvalue = ExcelUtils.getCellData(filepath, "Sheet1", i, 5);
				
				//clean data and pass above data into application
				driver.findElement(By.id("principal")).clear();
				driver.findElement(By.id("interest")).clear();
				driver.findElement(By.id("tenure")).clear();
				price = price.replaceAll("[^0-9]", "");
				
				driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(price);
				driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
				driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
				
				Select perdrp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
				perdrp.selectByVisibleText(per2);
				
				Select freqdrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
				freqdrp.selectByVisibleText(freq);
				
				//driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
					
				
				WebElement calculateBtn = driver.findElement(By.xpath("//div[@class='cal_div']//a[1]"));

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", calculateBtn);
								
								
				//validation
				
				String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
				
				if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))	// we have to convert string value to double to compare price 
				{
					System.out.println("Test Passed..");
					ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "Passed");		// (filepath,Sheetname,rownumber,cellnumber,result)
					ExcelUtils.fillGreenColor(filepath,"Sheet1", i, 7);
				}
				else 
				{
					System.out.println("Test Failed..");
					ExcelUtils.setCellData(filepath, "Sheet1", i,7,"Failed");
					ExcelUtils.fillRedColor(filepath,"Sheet1", i, 7);
				}
				Thread.sleep(3000);
				driver.findElement(By.xpath("//img[@class='PL5']")).click();		// clicked on clear button

			}	// ends for-loop
			driver.quit();		
	}

}
