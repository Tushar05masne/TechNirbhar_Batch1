package Day5;

// Synchronization problem and its solutions:
// When we run the program for more web elements and some web elements take more time to load 
	//and our program gets run in that time for those elements 
	// it will throw an exception - NoSuchElementException - it is called synchronization problem

//1) NoSuchElementException - If element it not present on the page at the time running the program - synchronization problem
//2) ElementNotFoundException - Locator is incorrect
// wait commands:
	// 1) Implicit wait	2) Explicit wait


// sleep() : easy to use. but if the time is not sufficient then get the exception. 
			//If the time is more and we get o/p in less time then also it will wait for that time gets completed.
			// After the completion of that time only, the next instruction will be executed. reduces the performance.
			// even if it is easy to use, we are mostly not use Thread.sleep() method



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommnad {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
	}

}
