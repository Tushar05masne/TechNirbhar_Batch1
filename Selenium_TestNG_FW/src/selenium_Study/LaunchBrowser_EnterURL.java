package selenium_Study;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;
import utilities.Application_utils;
import utilities.CommonUtil;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class LaunchBrowser_EnterURL extends TestBase {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		driver = TestBase.getDriver(browser);

		driver.get("https://testautomationpractice.blogspot.com/");

		Thread.sleep(1000);

		driver.manage().window().maximize();

		Thread.sleep(100);

		// driver.quit();

	/*	WebElement testAutomation_Home_Name = driver.findElement(By.id("name"));

		// clear()

		Application_utils.JavaScript_HighlightElement(driver, testAutomation_Home_Name);

		testAutomation_Home_Name.clear();

		// sendKeys()

		testAutomation_Home_Name.sendKeys("Monika");
		Application_utils.CaptureScreenShot(driver);
		System.out.println("Name Entered");
		
		
		//implicit wait;
		CommonUtil.implicitWaits_seconds(driver, 20);
		
		//explicit wait:
		
		WebElement testAutomation_Home_email = driver.findElement(By.xpath("//input[@placeholder='Enter EMail']"));

		
		WebDriverWait explicit_wait= new WebDriverWait(driver, Duration.ofSeconds(20));	
		explicit_wait.until(ExpectedConditions.visibilityOf(testAutomation_Home_email));
		
        //WebDriverWait wait= new WebDriverWait(driver, 30); old syntax
      //  w.until(ExpectedConditions.visibilityOf(Reviews));

		
		


		Application_utils.JavaScript_HighlightElement(driver, testAutomation_Home_email);
		testAutomation_Home_email.sendKeys("mahesh.more@gmail.com");

		WebElement testAutomation_Home_Phone = driver.findElement(By.xpath("//input[@id='phone']"));

		testAutomation_Home_Phone.sendKeys("99879012334");
		Application_utils.CaptureScreenShot(driver);

		System.out.println("Phone number entered");

		WebElement testAutomation_Home_Address = driver
				.findElement(By.xpath("//label[text()='Address:']/following::textarea"));

		testAutomation_Home_Address.sendKeys("Shegaon--444203");

		Application_utils.CaptureScreenShot(driver);

		// click() ----study

		WebElement testAutomation_Home_Gender_RadioButton = driver.findElement(By.xpath("//input[@id='female']"));

		testAutomation_Home_Gender_RadioButton.click();
		Application_utils.CaptureScreenShot(driver);

		// Handle multi_check box
		String[] days = { "saturday", "monday", "friday" };
		Application_utils.Multi_checkBox_Select(driver, days);

		// Drop down handling

		WebElement testAutomation_Home_Country_Dropdown = driver.findElement(By.xpath("//select[@id='country']"));

		Application_utils.Select_DropDown_By_Value(testAutomation_Home_Country_Dropdown, "australia");

		Application_utils.Select_DropDown_By_Value(testAutomation_Home_Country_Dropdown, "japan");

		System.out.println("Country name selected");

		WebElement testAutomation_Home_Color_Dropdown = driver.findElement(By.xpath("//select[@id='colors']"));

		Application_utils.Select_DropDown_By_Text(testAutomation_Home_Color_Dropdown, "Red");
		Thread.sleep(100);
		Application_utils.Select_DropDown_By_Text(testAutomation_Home_Color_Dropdown, "Blue");
		Thread.sleep(100);
		Application_utils.Select_DropDown_By_Text(testAutomation_Home_Color_Dropdown, "Green");
		Thread.sleep(100);

		Application_utils.deSelect_DropDown_By_Text(testAutomation_Home_Color_Dropdown, "Red");

		// handle first calendar

		String formatted_Future_Date_after_3Days = Application_utils.get_calender_Date("MM/dd/yyyy", 2);

		WebElement testAutomation_Home_Date_Picker1 = driver.findElement(By.xpath("//*[@id='datepicker']"));

		testAutomation_Home_Date_Picker1.sendKeys(formatted_Future_Date_after_3Days);

		WebElement testAutomation_Home_Pagination_Table = driver
				.findElement(By.xpath("//*[text()='Pagination Web Table']"));

		Application_utils.JavaScript_ScrollIntoView(driver, testAutomation_Home_Pagination_Table);

		WebElement testAutomation_Home_Pagination_Table_Page3 = driver
				.findElement(By.xpath("//*[@id=\"pagination\"]/li/a[text()='4']"));

		testAutomation_Home_Pagination_Table_Page3.click();

		// Application_utils.JavaScript_Click(driver,testAutomation_Home_Pagination_Table_Page3);

		Application_utils.JavaScript_HighlightElement(driver, testAutomation_Home_Pagination_Table_Page3);

		Application_utils.CaptureScreenShot(driver);

		// ----------------------------------date picker 2--------------------------

		WebElement Date_Picker2 = driver.findElement(By.xpath("//*[@id='txtDate']"));
		Date_Picker2.click();

		WebElement Date_Picker2_Month_Selection = driver.findElement(By.xpath("//select[@aria-label='Select month']"));

		String Month = "Feb";
		Application_utils.Select_DropDown_By_Text(Date_Picker2_Month_Selection, Month);

		String Day = "28";

		WebElement Date_Picker2_Day_Selection = driver
				.findElement(By.xpath("//select[@aria-label='Select month']/option[contains(text(),'" + Month
						+ "')]/following::td//a[text()='" + Day + "']"));

		Date_Picker2_Day_Selection.click();

		Application_utils.CaptureScreenShot(driver);

		Thread.sleep(3000);

		WebElement testAutomation_Home_Drag_SRC_element = driver.findElement(By.id("draggable"));
		WebElement testAutomation_Home_Drag_target_element = driver.findElement(By.id("droppable"));

		Actions a = new Actions(driver);
		
		

		// drag and drop--using actions class

		a.dragAndDrop(testAutomation_Home_Drag_SRC_element, testAutomation_Home_Drag_target_element).perform();
		Application_utils.CaptureScreenShot(driver);

		// dropbtn
		WebElement testAutomation_Home_PointMe_button = driver.findElement(By.className("dropbtn"));

		// Mouse-Hover--using actions class

		a.moveToElement(testAutomation_Home_PointMe_button).perform();

		Thread.sleep(1000);

		System.out.println("Hi");
		// testAutomation_Home_PointMe_button.click();

		WebElement testAutomation_Home_Mobile_option = driver.findElement(By.xpath("//a[text()='Mobiles']"));

		testAutomation_Home_Mobile_option.click();

		// Wikipedia1_wikipedia-search-input
		WebElement testAutomation_Home_WikiInput_field = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));

		a.sendKeys(testAutomation_Home_WikiInput_field, "ABCD").perform();

		a.sendKeys(Keys.ENTER).perform();

		Thread.sleep(500);

		a.sendKeys(Keys.F12).perform();

		// Use Robot class
		
		
		WebElement testAutomation_Home_ChooseFile_Button = driver.findElement(By.xpath("//*[@id='singleFileInput']"));

		Application_utils.JavaScript_ScrollIntoView(driver, testAutomation_Home_ChooseFile_Button);
		
		//testAutomation_Home_ChooseFile_Button.click();
		Application_utils.JavaScript_HighlightElement(driver, testAutomation_Home_ChooseFile_Button);
	//	Application_utils.JavaScript_Click(driver, testAutomation_Home_ChooseFile_Button);
		
		Robot robot=new Robot();
		
        // Type file path: "selenum_architecture"
		
		
		//Downloads ----first type then Enter
		
		//selenum_architecture ----second type then Enetr
		
		//Enter
		
//        String filePath = "selenum_architecture";
//        for (char c : filePath.toCharArray()) {
//            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
//            
//            System.out.println("Key code == "+keyCode+"for "+c);
//
//            if (KeyEvent.CHAR_UNDEFINED == keyCode) {
//            	
//                throw new RuntimeException("Key code not found for character '" + c + "'");
//            }
//            
//            if(keyCode==523) {
//            	 robot.keyPress(KeyEvent.VK_SHIFT);
//                 robot.keyPress(KeyEvent.VK_MINUS);
//                 robot.keyRelease(KeyEvent.VK_MINUS);
//                 robot.keyRelease(KeyEvent.VK_SHIFT);
//            }
//            
//            else {
//
//            robot.keyPress(keyCode);
//            robot.keyRelease(keyCode);
//            robot.delay(100); // small delay between keystrokes
//            }
//            
//        }
//		
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);

        
		
		WebElement testAutomation_Home_SimpleAlert_btn = driver.findElement(By.xpath("//*[@id='alertBtn']"));
   
		testAutomation_Home_SimpleAlert_btn.click();
		
		driver.switchTo().alert().accept();
		
		System.out.println("We have successfully accepted alert popup");
		
		
		
		//.//*[@id="promptBtn"]
		WebElement testAutomation_Home_Popup_btn = driver.findElement(By.xpath(".//*[@id='promptBtn']"));

		testAutomation_Home_Popup_btn.click();
		
		driver.switchTo().alert().dismiss();
		
		
		System.out.println("We have successfully dismiss alert popup");
		
		
		testAutomation_Home_Popup_btn.click();
		
		Thread.sleep(3000);
		
		
		driver.switchTo().alert().sendKeys("XYX");
		
		driver.switchTo().alert().accept();


//		WebElement testAutomation_Home_Chose_file_button = driver.findElement(By.id("singleFileInput"));
//		
//		Application_utils.JavaScript_ScrollIntoView(driver, testAutomation_Home_Chose_file_button);
//		
//		Thread.sleep(500);       
//
//		//testAutomation_Home_Chose_file_button.click();
//		Application_utils.JavaScript_Click(driver, testAutomation_Home_Chose_file_button);
//		
//		Thread.sleep(2000);       

//		js.executeScript("arguments[0].scrollIntoView(true);", testAutomation_Home_Date_Picker3_Start_date);
//		
//		Thread.sleep(2000);
//		js.executeScript("document.getElementById('start-date').value='03/06/2026'");
//		js.executeScript("document.getElementById('end-date').value='03/10/2026'");
		
		
		//Window handling
		
		WebElement testAutomation_Home_NewTab = driver.findElement(By.xpath("//*[text()='New Tab']"));
		
		//testAutomation_Home_NewTab.click();
		
		Application_utils.elementClick(driver,testAutomation_Home_NewTab);
		
		
		
		WebElement testAutomation_Home_Popup_window = driver.findElement(By.xpath("//*[@id='PopUp']"));

		
		
		Thread.sleep(1000);
		
		Set<String> My_windows = driver.getWindowHandles();
		
		int i=0;
		String main_win = null;
		
		for(String e:My_windows) {
			
			if(i==0) {
				 main_win = e;

			}
			
			if(i==1) {
				
				System.out.println("My second window ID is "+e);
				
				driver.switchTo().window(e);
				
				WebElement testAutomation_SDET_ISTQB = driver.findElement(By.xpath("//*[text()='ISTQB']"));
				
				String My_expected_aString = testAutomation_SDET_ISTQB.getText();
				
				System.out.println(My_expected_aString);
				
				driver.close();
				
			}
			
			
			i++;
		}
		
		
		
//		for(String e:My_windows) {
//			
//			
//			
//			int j=0;
//			if(j==0) {
//				
//				System.out.println("My second window ID is "+e);
//				
//				driver.switchTo().window(e);
//				
//			    Thread.sleep(3000);
//
//			    testAutomation_Home_Popup_window.click();
//			    
//			    Thread.sleep(1000);
//
//				Set<String> My_windows_new = driver.getWindowHandles();
//				
//				//driver.close();
//
//			}
//			
//			break;
//		
//		}
		driver.switchTo().window(main_win);
		
		
		
		
		FluentWait<WebElement> wait=new FluentWait(driver);
		
		wait.withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement rs = wait.until(driver ->testAutomation_Home_Popup_window);
		
		*/
		
		WebElement Tr = driver.findElement(By.xpath("//table[@id='productTable']//tr"));
		
		Application_utils.JavaScript_ScrollIntoView(driver, Tr);
		
		
		
		
		List<WebElement> Pagination_list = driver.findElements(By.xpath("//*[@id='pagination']/li"));

		int Table_size = Pagination_list.size();
		
		System.out.println("My Table_size is "+Table_size);
		  int k=0;

		for(WebElement e1:Pagination_list) {
			
			List<WebElement> newTr = driver.findElements(By.xpath("//table[@id='productTable']//tr"));

		for(WebElement e:newTr) {

		String ele = e.getText();
		
		System.out.println(" "+ele);
		
		}
		
	    k++;

		   if(k>0) {
		   Pagination_list.get(k).click();
		   Thread.sleep(1000);
		   System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		   
		  }
		

	 }
	}
	}


