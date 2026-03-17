package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
		driver.manage().window().maximize();
		
		int totalRows =	driver.findElements(By.xpath("//table[@id='example' and @class='table table-striped table-bordered dataTable no-footer']//tr")).size();
		System.out.println("Total rows: "+totalRows);
	}

}
