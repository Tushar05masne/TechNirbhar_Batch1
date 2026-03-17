package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Types of DropDown Box-
	//1. Select Dropdown		- selectByVisibleText("text"), selectByValue("value"), selectByIndex(index)
					// getOptions() - return all the elements from the dropdown as a webelement
	//2. Bootstrap Dropdown
	//3. Hidden dropdown


public class SelectDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpdwnCountryElement= driver.findElement(By.xpath("//select[@id='country']")); // Dropdown element on the webpage 
		Select drpCountry = new Select(drpdwnCountryElement);	//from the DropDown element we have to select the country. 
											// So creating object of Select class and providing DropDown element
		
		// now select the options from the dropdown
		//drpCountry.selectByVisibleText("Canada");		// visible text is the text of the options in the dropdown element
		//drpCountry.selectByValue("japan");				// value is the value of the options in the dropdown element
		//drpCountry.selectByIndex(2);			// Index is the index of the option in the dropdown element which is starting from 0
		
		// Capture the options from the dropdown
		List<WebElement> options = drpCountry.getOptions();	// gives the list of options in the dropdown
		System.out.println("Total number of options in dropdown: "+options.size());
		
		// printing options by for loop
//		for(int i=0;i<options.size();i++) {
//			System.out.println(i+". "+options.get(i).getText());
//		}
		
		// by enhanced forloop
		
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
	}

}
