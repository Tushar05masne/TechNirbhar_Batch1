package Day10;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) Find total number of rows
		int totalRows =	driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();	// multiple tables
		System.out.println("Total rows: "+totalRows);
		
		int totalrows = driver.findElements(By.tagName("tr")).size();	 // By.tagName - if single table then only use
		System.out.println("Total rows by tagName: "+totalrows);
			
		//2) total number of columns
		int totalCols = driver.findElements(By.xpath(" //table[@name='BookTable']//th")).size();	// multiple tables
		System.out.println("Total columns: "+totalCols);
		
		int totalcols = driver.findElements(By.tagName("th")).size(); // By.tagName - if single table then only use
		System.out.println("Total cols by tagName: "+totalcols);
		
		//3) Print Data in 5th row and 3rd column
		WebElement subName =	driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[3]"));
		System.out.println("Data in 5th row and 3rd column is: "+subName.getText());
		
		//4) read data from all the rows and columns	
		System.out.println("Book Name \t"+"Author \t"+"Subject \t"+"Price");		// we have 'th' tag for 1st row/header. so need to print seperately
		for(int r=2;r<=totalRows;r++) {		// r=2 because 1st row is the heading 'th' tag and row have 'tr' tag
			for(int c=1;c<=totalCols;c++) {
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		//5) Print book name whose author is Mukesh			
		for(int r=2;r<=totalRows;r++) 
		{	
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		
			if(author.equals("Mukesh")) 
			{
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();	
				System.out.println(bookName+"\t"+author);
			}
		}
		
		// 6) Find total price of all the books
		int total = 0;
		
		for(int r=2;r<=totalRows;r++)
		{
			String bookPrice = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total+= Integer.parseInt(bookPrice);
		}
		System.out.println("The total price of all the books is: "+total);	// 7100
	}

}
