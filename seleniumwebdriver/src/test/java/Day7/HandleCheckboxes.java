package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");		
		driver.manage().window().maximize();
		
		// 1) select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();

		// 2) select all the checkboxes
		List<WebElement> daysCheckboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*
		for(int i=0;i<daysCheckboxes.size();i++) 
		{
			daysCheckboxes.get(i).click();
		}

		for(WebElement dayCheckbox:daysCheckboxes)
		{
			dayCheckbox.click();
		}
		*/
		
		// if we want to select specific checkboxes then we can not use enhanced forloop. we have to go with normal forloop.
			// because enhanced forloop is used for all the elements in the collection. 
		// 3) select specific checkboxes - select last 3 checkboxes
		// starting index = total no. of checkboxes-how many checkboxes want to select
		// starting index = 7-3 = 4
		
//		for(int i=4;i<daysCheckboxes.size();i++)
//		{
//			daysCheckboxes.get(i).click();
//		}
		
		// 4) select first 3 checkboxes		
		/*for(int i=0; i<3;i++) {
			daysCheckboxes.get(i).click();
		}
		*/
		// 5) unselect the selected checkboxes
		
		for(int i=0; i<3;i++) 
		{
			daysCheckboxes.get(i).click();
		}
		
		Thread.sleep(3000);
		for(int i=0;i<daysCheckboxes.size();i++)
		{
			if(daysCheckboxes.get(i).isSelected())
			{
				daysCheckboxes.get(i).click();
			}
		}
		
	}

}
