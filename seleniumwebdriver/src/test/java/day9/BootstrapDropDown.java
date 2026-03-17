package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		//Alert myalert =	driver.switchTo().alert();
		//myalert.accept();		// clicks on accept
		driver.findElement(By.xpath("//input[@class='form-control select-input active' and @id='select-input-392927']")).click();
		
		
		
		
	}

}
