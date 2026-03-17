package selenium_Study;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilities.Application_utils;
import utilities.Calender_utils;

// taskkill /F /IM chrome.exe /T		--> run command in run window to kill all the chrome browser tasks
	// 	taskkill -> command to terminate a process, 	/F -> forcefully kill
	//	/IM -> image name (process name)
	// chrome.exe -> Chrome browser process,		/T -> kills child processes also.

public class LaunchBrowserAndOperations extends TestBase {
	
	static String browser = "chrome ";

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = TestBase.getDriverName(browser);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));				
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	//------- Handling Inputboxes		
		driver.findElement(By.xpath("//input[@id='name' and @placeholder='Enter Name']")).sendKeys("Mahesh More");
		driver.findElement(By.xpath("//input[@id='email' and @placeholder='Enter EMail']")).sendKeys("mahesh.more@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone'][@placeholder='Enter Phone']")).sendKeys("8955555810");
		driver.findElement(By.xpath("//div/textarea[@id='textarea']")).sendKeys("Near Lakshmi Mandir, Vishrambaug, Sangli. Pin:- 416416.");
	
		//------- Handling RadioButton		
		driver.findElement(By.xpath("//div/div/input[@id='male']")).click();
		Thread.sleep(3000);
		
	//------- Handling Checkboxes		
		WebElement testAutomation_SundayCheckbox = driver.findElement(By.xpath("//input[@id='sunday']"));
		WebElement testAutomation_MondayCheckbox = driver.findElement(By.xpath("//input[@id='monday']"));
		WebElement testAutomation_TuesdayCheckbox = driver.findElement(By.xpath("//input[@id='tuesday']"));
		WebElement testAutomation_WednesdayCheckbox = driver.findElement(By.xpath("//input[@id='wednesday']"));
		WebElement testAutomation_ThursdayCheckbox =	driver.findElement(By.xpath("//input[@id='thursday']"));
		WebElement testAutomation_FridayCheckbox = driver.findElement(By.xpath("//input[@id='friday']"));
		WebElement testAutomation_SaturdayCheckbox =	driver.findElement(By.xpath("//input[@id='saturday']"));
		
		String[] selectDays = {"monday","wednesday","saturday"};
		
		Application_utils.selectCheckboxes(driver, selectDays);	// click on chekbox - select
		
		testAutomation_SundayCheckbox.click();
		testAutomation_FridayCheckbox.click();
		testAutomation_ThursdayCheckbox.click();

		Application_utils.selectCheckboxes(driver, selectDays);	// double click on chekbox - unselect
		
	//------- Handling Dropdown		 
		WebElement testAutomation_SelectCountry_Dropdown =	driver.findElement(By.xpath("//select[@id='country']"));
		Select selectCountry_DropdownObj = new Select(testAutomation_SelectCountry_Dropdown);
		
		selectCountry_DropdownObj.selectByVisibleText("Canada");
		selectCountry_DropdownObj.selectByVisibleText("Germany");
		
		selectCountry_DropdownObj.selectByValue("australia");
		//selectCountry_DropdownObj.selectByIndex(2);
	
		Application_utils.dropDownOptionsList(selectCountry_DropdownObj);
		
	//------- Handling multiselect 
		WebElement multiselectColors = driver.findElement(By.xpath("//select[@id='colors']"));
		Select multiselectColorsObj = new Select(multiselectColors);

		String [] multiselectColorsList = {"Red","Yellow","Green","Red"};
		Application_utils.selectMultipleColors(multiselectColorsObj, multiselectColorsList);	
		
	//------- Handling multiselect Sorted List:	
		WebElement multiselectSortedList	= driver.findElement(By.xpath("//select[@id='animals']"));
		Select multiselectSortedListAnimalObj = new Select(multiselectSortedList);
	
		String[] multiselectAnimalSortedList = {"Cat","Dog","fox","lion","zebra"};

		//multiselectSortedListAnimalObj.selectByValue("fox");
		//multiselectSortedListAnimalObj.selectByIndex(9);		
		Application_utils.selectSortedMultipleAnimals(multiselectSortedListAnimalObj, multiselectAnimalSortedList);
	
	//-------- Handling Date Picker1		
		String futureDateAfter_3Days = Calender_utils.getCalendarDate("MM/dd/yyyy", -5);		
		WebElement testAutomation_Home_DatePicker1 =	driver.findElement(By.xpath("//input[@id='datepicker']"));
		
		testAutomation_Home_DatePicker1.sendKeys(futureDateAfter_3Days);
		testAutomation_Home_DatePicker1.click();		
		Thread.sleep(2000);				
		
	//------- Handling Date Picker2
		WebElement testAutomation_Home_DatePicker2 =	driver.findElement(By.xpath("//input[@name='SelectedDate']"));
		testAutomation_Home_DatePicker2.click();

		WebElement testAutomation_Home_DatePicker2_SelectMonth = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select testAutomation_Home_DatePicker2_SelectMonth_Obj = new Select(testAutomation_Home_DatePicker2_SelectMonth);
		String month = "Jul";
		testAutomation_Home_DatePicker2_SelectMonth_Obj.selectByVisibleText(month);
		
		WebElement testAutomation_Home_DatePicker2_SelectYear = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select testAutomation_Home_DatePicker2_SelectYear_obj = new Select(testAutomation_Home_DatePicker2_SelectYear);
		String year = "2019";
		testAutomation_Home_DatePicker2_SelectYear_obj.selectByVisibleText(year);
		
		String date = "20";
		WebElement testAutomation_Home_DatePicker2_SelectDate = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='"+date+"']"));
		testAutomation_Home_DatePicker2_SelectDate.click();	
		Thread.sleep(1000);
			
	//------- Capturing Screenshot
		Application_utils.captureScreenShot(driver);
		
	//------- Upload Files
			// Upload single file
		WebElement testAutomation_Home_uploadSingleFileInput = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		testAutomation_Home_uploadSingleFileInput.sendKeys("D:\\myWork\\Testing\\FileUploadTestPract\\Test1.txt");
		
		WebElement testAutomation_Home_uploadSingleFileButton = driver.findElement(By.xpath("//button[@type='submit' and text()='Upload Single File']"));
		testAutomation_Home_uploadSingleFileButton.click();
		
			//upload multiple files
		String file1 = "D:\\myWork\\Testing\\FileUploadTestPract\\Test1.txt";
		String file2 = "D:\\myWork\\Testing\\FileUploadTestPract\\Test2.txt";
		String file3 = "D:\\myWork\\Testing\\FileUploadTestPract\\Test3.txt";

		WebElement testAutomation_Home_uploadMultipleFilesInput = driver.findElement(By.xpath("//input[@id='multipleFilesInput']"));
		testAutomation_Home_uploadMultipleFilesInput.sendKeys(file1+"\n"+file2+"\n"+file3);
		
		WebElement testAutomation_Home_uploadMultipleFilesButton = driver.findElement(By.xpath("//button[text()='Upload Multiple Files']"));
		testAutomation_Home_uploadMultipleFilesButton.click();
	
	//------- Static Table--------	
		// total rows
		int totalNumberOfRows =	driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total number of rows are:"+totalNumberOfRows);	// 7
		
		// total columns
		int 	totalNumberOfColumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
		System.out.println("Total number of rows are:"+totalNumberOfColumns);		//4
		
		// read data from all the rows and columns
		System.out.println("Book Name \t"+"Author \t"+"Subject \t"+"Price");
		System.out.println("------------------------------------------------");
		for(int r=2;r<=totalNumberOfRows;r++)
		{
			for(int c=1;c<=totalNumberOfColumns;c++)
			{
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();	
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		System.out.println();	
		
		// Book names whose author is Amit
		System.out.println("The book names whose author is Amit are:");
		int cnt=0;
		for(int r=2;r<=totalNumberOfRows;r++)
		{
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			if(author.equals("Amit"))
			{
				cnt++;
				String booknamesByAuthorAmit = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(booknamesByAuthorAmit);
			}
		}
		System.out.println("Number of books by author Amit are:"+cnt);	//2
		
		// total price of all the books
		int totalPrize=0;
		for(int r=2;r<=totalNumberOfRows;r++)
		{
			String bookPrize = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			totalPrize+=Integer.parseInt(bookPrize);
		}
		System.out.println("Total prize of all the books is:"+totalPrize);	//7100
		
	//------- New tab----	
		WebElement testAutomation_Home_NewTabButton = driver.findElement(By.xpath("//button[text()='New Tab']"));
		testAutomation_Home_NewTabButton.click();
		
		List<String> windowIds = new ArrayList<String>(driver.getWindowHandles());	// gives window Ids of both the windows
																	// everytime we run the code, it will give different window id's
		System.out.println(windowIds);	// [D582DDD0D5DA8B26271B8A23036E3C8A, A17CA96EC7AF152A90D735A1D5DC096A]
		Thread.sleep(3000);
		driver.switchTo().window(windowIds.get(0));	// switch back to main page
		Thread.sleep(3000);
		driver.switchTo().window(windowIds.get(1));	// switch back to new tab page
		Thread.sleep(3000);
		driver.switchTo().window(windowIds.get(0));	// switch back to main page
		Thread.sleep(3000);	
			
	//------- Tabs - Handling Search box and Search Text
		WebElement testAutomation_Home_WikipediaInputField =	driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		testAutomation_Home_WikipediaInputField.sendKeys("Selenium");
		WebElement testAutomation_Home_WikipediaSearchButton = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		testAutomation_Home_WikipediaSearchButton.click();

		WebElement testAutomation_Home_WikipediaThirdSearchResult = driver.findElement(By.xpath("//form[@class='wikipedia-search-form']/following-sibling::div[2]//div[3]/a[text()='Selenium (software)']"));
		testAutomation_Home_WikipediaThirdSearchResult.click();
		Thread.sleep(3000);
		driver.switchTo().window(windowIds.get(0));
		
		List<WebElement> seleniumSearchList = driver.findElements(By.xpath("//form[@class='wikipedia-search-form']/following-sibling::div[2]//div"));	//it will shows the results of selenium
		System.out.println(seleniumSearchList.size());	//5
	
		WebElement testAutomation_Home_WikipediaSearchResultMoreLink = driver.findElement(By.xpath("//form[@class='wikipedia-search-form']/following-sibling::nobr//a[text()='More »']"));
		testAutomation_Home_WikipediaSearchResultMoreLink.click();
		Thread.sleep(3000);
		driver.switchTo().window(windowIds.get(0));
	
	//------- Dynamic Button
		WebElement testAutomation_Home_DynamicButton = driver.findElement(By.xpath("//button[@onclick='toggleButton(this)']"));
		testAutomation_Home_DynamicButton.click();
		Thread.sleep(5000);
		testAutomation_Home_DynamicButton.click();
		Thread.sleep(5000);
		testAutomation_Home_DynamicButton.click();
		Thread.sleep(5000);
		testAutomation_Home_DynamicButton.click();	
	
	//------- Handling scrolldown with scroller, webelement border,background color	
		WebElement testAutomation_Home_PaginationTable	= driver.findElement(By.xpath("//h2[contains(text(),'Pagination Web Table')]"));
		
		Application_utils.javaScript_ScrollIntoView(driver, testAutomation_Home_PaginationTable);
		
		WebElement testAutomation_Home_PaginationTable_Page3 = driver.findElement(By.xpath("//div[@class='table-container']/ul/li/a[text()='3']"));
		Application_utils.javaScript_Click(driver, testAutomation_Home_PaginationTable_Page3);
		Thread.sleep(2000);

		WebElement testAutomation_Home_PaginationTable_Page4 = driver.findElement(By.xpath("//div[@class='table-container']/ul/li/a[text()='4']"));
		Application_utils.javaScript_HighlightElement(driver, testAutomation_Home_PaginationTable_Page4);
		
	//------- Capturing Screenshot
		Application_utils.captureScreenShot(driver);
		
	//------- Alerts -> Alert class properties ------		
		WebElement testAutomation_Home_SimpleAlertButton = driver.findElement(By.xpath("//button[@id='alertBtn']"));
		testAutomation_Home_SimpleAlertButton.click();
		Thread.sleep(4000);
		Alert simpleAlert =	driver.switchTo().alert();		// switching to alert window
		System.out.println("Simple alert text: "+simpleAlert.getText()); 	// get the text on the alert window
		simpleAlert.accept();
		
		WebElement testAutomation_Home_ConfirmationAlertButton = 	driver.findElement(By.xpath("//button[@id='confirmBtn']"));
		testAutomation_Home_ConfirmationAlertButton.click();
		Thread.sleep(4000);
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("Confirm alert text: "+confirmAlert.getText());
		confirmAlert.accept();
		//confirmAlert.dismiss();
		
		WebElement testAutomation_Home_PromptAlertButton	= driver.findElement(By.xpath("//button[@id='promptBtn']"));
		testAutomation_Home_PromptAlertButton.click();
		Thread.sleep(4000);
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("Prompt alert text: "+promptAlert.getText());
		
		promptAlert.sendKeys("Mahesh More!!!");
		promptAlert.accept();
		//promptAlert.dismiss();
	
	//------- Mouse Actions -> Actions class properties ------
	//------- Double click on button		
		WebElement testAutomation_Home_DoubleClick_Field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement testAutomation_Home_DoubleClick_Field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		testAutomation_Home_DoubleClick_Field1.clear();
		testAutomation_Home_DoubleClick_Field1.sendKeys("Selenium professional.");
		Thread.sleep(3000);

		WebElement testAutomation_Home_DoubleClick_CopyTextButton = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(testAutomation_Home_DoubleClick_CopyTextButton).build().perform();
		
		// validation of field1 and field2 text
		if(testAutomation_Home_DoubleClick_Field1.getText().equals(testAutomation_Home_DoubleClick_Field2.getText()))
		{
			System.out.println("Same text in both boxes!!");
		}
		else {
			System.out.println("Different text in both boxes!!");
		}
		
		Thread.sleep(3000);
		
		// Mouse Hover 
		WebElement testAutomation_Home_MouseHoverButton = driver.findElement(By.xpath("//button[@class='dropbtn' and text()='Point Me']"));
		act.moveToElement(testAutomation_Home_MouseHoverButton).build().perform();
		Thread.sleep(3000);
		
		// Drag and Drop	
		WebElement testAutomation_Home_DragElement =	driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement testAutomation_Home_DropRegion = driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(testAutomation_Home_DragElement, testAutomation_Home_DropRegion).build().perform();
				
		// Slider
		WebElement testAutomation_Home_SliderMinPoint = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Default location of minimum slider point:"+testAutomation_Home_SliderMinPoint.getLocation());		// (974, 2024)
		System.out.println("X axis value of minimum slider point:"+testAutomation_Home_SliderMinPoint.getLocation().getX());
		System.out.println("Y axis value of minimum slider point:"+testAutomation_Home_SliderMinPoint.getLocation().getY());
		
		//act.dragAndDropBy(testAutomation_Home_SliderMinPoint, 100, 2024).perform();
		System.out.println("Location of minimum slider after drag:"+testAutomation_Home_SliderMinPoint.getLocation());
		
		WebElement testAutomation_Home_SliderMaxPoint = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		System.out.println("Default location of maximum slider point:"+testAutomation_Home_SliderMaxPoint.getLocation());		//(1104, 2024)
		System.out.println("X axis value of maximum slider point:"+testAutomation_Home_SliderMaxPoint.getLocation().getX());
		System.out.println("Y axis value of maximum slider point:"+testAutomation_Home_SliderMaxPoint.getLocation().getY());
		
		//act.dragAndDropBy(testAutomation_Home_SliderMaxPoint, -100, 2024).perform();
		System.out.println("Location of maximum slider after drag:"+testAutomation_Home_SliderMaxPoint.getLocation());
	
	//------- SVG elements
		WebElement testAutomation_Home_SVGImage_Circle = driver.findElement(By.xpath("//div[@class='svg-container']//*[name()='svg'][1]"));
		WebElement testAutomation_Home_SVGImage_Circle1 = driver.findElement(By.xpath("//div[@class='svg-container']//*[local-name()='circle']"));		
						// inside svg, the other tag is present - circle - that is why //*[local-name()='circle']	

		WebElement testAutomation_Home_SVGImage_Rectangle = driver.findElement(By.xpath("//div[@class='svg-container']//*[name()='svg'][2]"));
		WebElement testAutomation_Home_SVGImage_Rectangle1 =driver.findElement(By.xpath("//div[@class='svg-container']//*[local-name()='rect']"));

		WebElement testAutomation_Home_SVGImage_Triangle = driver.findElement(By.xpath("//div[@class='svg-container']//*[name()='svg'][3]"));
		WebElement testAutomation_Home_SVGImage_Triangle1 = driver.findElement(By.xpath("//div[@class='svg-container']//*[local-name()='polygon']"));	
		
	//------- Labels and links		
		String testAutomation_Home_MobileLabel = driver.findElement(By.xpath("//div[@id='mobiles']/h4")).getText();
		System.out.println(testAutomation_Home_MobileLabel);		// Mobile Labels
		
		String testAutomation_Home_SamsungLabel = driver.findElement(By.xpath("//div[@id='mobiles']/label[@id='samsung']")).getText();
		System.out.println(testAutomation_Home_SamsungLabel);	// Samsung	
		
		WebElement testAutomation_Home_RealMeLabel = driver.findElement(By.xpath("//div[@id='mobiles']/label[text()='Real Me']"));
		System.out.println(testAutomation_Home_RealMeLabel.getText());	// Real Me
				
		WebElement testAutomation_Home_LaptopLinksApple = driver.findElement(By.xpath("//a[@id='apple']"));
		testAutomation_Home_LaptopLinksApple.click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		WebElement testAutomation_Home_LaptopLinksLenovo = driver.findElement(By.xpath("//a[@class='link' and @id='lenovo']"));
		testAutomation_Home_LaptopLinksLenovo.click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		WebElement testAutomation_Home_LaptopLinksDell = driver.findElement(By.xpath("//a[@class='link' and text()='Dell']"));
		testAutomation_Home_LaptopLinksDell.click();
		Thread.sleep(5000);
		driver.navigate().back();
			
	//------- Scrolling Dropdown		
		WebElement testAutomation_Home_ScrollingDropdownInputBox = driver.findElement(By.xpath("//input[@id='comboBox']"));
		testAutomation_Home_ScrollingDropdownInputBox.click();
		
		List<WebElement> testAutomation_Home_ScrollingDropdownListCount	= driver.findElements(By.xpath("//div[@id='dropdown']/div"));
		System.out.println("Number of items in Scrolling Dropdown are:"+testAutomation_Home_ScrollingDropdownListCount.size());
	
		for(WebElement item:testAutomation_Home_ScrollingDropdownListCount)
		{
			System.out.println(item.getText());		// text of items in dropdown
		}
		testAutomation_Home_ScrollingDropdownListCount.get(2).click();	// it will selects 'Item 3' which is 3rd in list because list starts from 0.
				
	//------- Broken Links
		List<WebElement> testAutomation_Home_allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on Home page:"+testAutomation_Home_allLinks.size());	//33
	
		Application_utils.findBrokenLinksAndCount(testAutomation_Home_allLinks);
								
	//------- Shadow DOM-------	
		// inside single shadow DOM
		SearchContext testAutomation_Home_shadowRoot = driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();	// shadow_host-> id of a host
		Thread.sleep(1000);
		WebElement testAutomation_Home_shadowElement = testAutomation_Home_shadowRoot.findElement(By.cssSelector("#shadow_content"));	 // shadow_content -> id of a shadow element
		Thread.sleep(1000);
		String testAutomation_Home_txtshadowElement	= testAutomation_Home_shadowElement.getText();		// text label
		System.out.println(testAutomation_Home_txtshadowElement);
		
		SearchContext testAutomation_Home_shadowRoot01 =	driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();
		Thread.sleep(1000);
		WebElement testAutomation_Home_shadowElementBlogLink = testAutomation_Home_shadowRoot01.findElement(By.cssSelector("a[href='https://www.pavantestingtools.com/']"));
		Thread.sleep(1000);
		//testAutomation_Home_shadowElementBlogLink.click();	// org.openqa.selenium.JavascriptException:
		
		SearchContext testAutomation_Home_shadowRoot0 = driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();
		Thread.sleep(1000);	
		WebElement testAutomation_Home_shadowElementInputBox =	testAutomation_Home_shadowRoot0.findElement(By.cssSelector("input[type='text']"));
		Thread.sleep(1000);
		testAutomation_Home_shadowElementInputBox.sendKeys("Mahesh Moreee");		// input box
		
		WebElement testAutomation_Home_shadowElementCheckBox = testAutomation_Home_shadowRoot0.findElement(By.cssSelector("input[type='checkbox']"));
		Thread.sleep(1000);
		testAutomation_Home_shadowElementCheckBox.click();			// checkbox
		
		WebElement testAutomation_Home_shadowElementFileUploadButton = testAutomation_Home_shadowRoot0.findElement(By.cssSelector("input[type='file']"));
		Thread.sleep(1000);
		testAutomation_Home_shadowElementFileUploadButton.sendKeys("D:\\myWork\\Testing\\FileUploadTestPract\\Test1.txt");	// file upload button
	
		// inside nested shadow DOM
		SearchContext testAutomation_Home_shadowRoot1 = driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext testAutomation_Home_shadowRoot2 = testAutomation_Home_shadowRoot1.findElement(By.cssSelector("#nested_shadow_host")).getShadowRoot();
		Thread.sleep(1000);		
		WebElement testAutomation_Home_shadowElement1 = testAutomation_Home_shadowRoot2.findElement(By.cssSelector("#nested_shadow_content"));
		Thread.sleep(1000);
		String testAutomation_Home_txtshadowElement1 = testAutomation_Home_shadowElement1.getText();
		System.out.println(testAutomation_Home_txtshadowElement1);
		
		WebElement testAutomation_Home_YoutubeLink =	driver.findElement(By.xpath("//a[text()='Youtube']"));
		testAutomation_Home_YoutubeLink.click();
		driver.navigate().back();
		Thread.sleep(2000);
						
	//------- Form---
		WebElement testAutomation_Home_Form_Section1Text = driver.findElement(By.xpath("//div/h4[text()='Section 1']"));
		System.out.println(testAutomation_Home_Form_Section1Text.getText());
		WebElement testAutomation_Home_Form_Para1 = driver.findElement(By.xpath("//div/p[@id='para1' and text()='This is a paragraph in Section 1.']"));
		System.out.println(testAutomation_Home_Form_Para1.getText());
		WebElement testAutomation_Home_Form_TextBox1 = driver.findElement(By.xpath("//div/input[@name='input1']"));
		testAutomation_Home_Form_TextBox1.sendKeys("Selenium Rocksss!!");
		WebElement testAutomation_Home_Form_SubmitButton1 = driver.findElement(By.xpath("//div/button[@id='btn1']"));
		testAutomation_Home_Form_SubmitButton1.click();
		Thread.sleep(3000);
		
		WebElement testAutomation_Home_Form_Section2Text = driver.findElement(By.xpath("//div/h4[text()='Section 2']"));
		System.out.println(testAutomation_Home_Form_Section2Text.getText());	
		WebElement testAutomation_Home_Form_Para2 = driver.findElement(By.xpath("//div/p[@id='para2' and text()='This is a paragraph in Section 2.']"));
		System.out.println(testAutomation_Home_Form_Para2.getText());
		WebElement testAutomation_Home_Form_TextBox2 = driver.findElement(By.xpath("//div/input[@name='input2']"));
		testAutomation_Home_Form_TextBox2.sendKeys("Java is an easy language!!");
		WebElement testAutomation_Home_Form_SubmitButton2 = driver.findElement(By.xpath("//div/button[@id='btn2']"));
		testAutomation_Home_Form_SubmitButton2.click();
		Thread.sleep(3000);

		WebElement testAutomation_Home_Form_Section3Text = driver.findElement(By.xpath("//div/h4[text()='Section 3']"));
		System.out.println(testAutomation_Home_Form_Section3Text.getText());	
		WebElement testAutomation_Home_Form_Para3 = driver.findElement(By.xpath("//div/p[@id='para3' and text()='This is a paragraph in Section 3.']"));
		System.out.println(testAutomation_Home_Form_Para3.getText());
		WebElement testAutomation_Home_Form_TextBox3 = driver.findElement(By.xpath("//div/input[@name='input3']"));
		testAutomation_Home_Form_TextBox3.sendKeys("TestNG and Maven are part of the Testing!");
		WebElement testAutomation_Home_Form_SubmitButton3 = driver.findElement(By.xpath("//div/button[@id='btn3']"));
		testAutomation_Home_Form_SubmitButton3.click();
		Thread.sleep(3000);
		
	//------- Footer links
		WebElement testAutomation_Home_FooterLinks_Home = driver.findElement(By.xpath("//h2[text()='Footer Links']/../div//a[text()='Home']"));
		testAutomation_Home_FooterLinks_Home.click();
		Thread.sleep(3000);
		
		WebElement testAutomation_Home_FooterLinks_HiddenElementsAndAjax = driver.findElement(By.xpath("//h2[text()='Footer Links']/../div//a[text()='Hidden Elements & AJAX']"));
		testAutomation_Home_FooterLinks_HiddenElementsAndAjax.click();
		Thread.sleep(3000);

		WebElement testAutomation_Home_FooterLinks_Download_Files = driver.findElement(By.xpath("//h2[text()='Footer Links']/../div//a[text()='Download Files']"));
		testAutomation_Home_FooterLinks_Download_Files.click();	
		Thread.sleep(3000);

		driver.switchTo().window(windowIds.get(0));	// switch back to main page
		Thread.sleep(3000);	
		driver.quit();
	}
}
