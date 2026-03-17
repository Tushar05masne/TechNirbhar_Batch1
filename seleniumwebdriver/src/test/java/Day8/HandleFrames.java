package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// 4 methods to switchTo() frame
//	1. driver.switchTo().frame(name);
//	2. driver.switchTo().frame(id);
//	3. driver.switchTo().frame(WebElement);	- if we dont have name and id then use this
// 	4. driver.switchTo().frame(index)

//	driver.switchTo().defaultContent()		- switch back from 1 frame to page

//	at the time of inspecting webelements/frames, right click on src option of frame tag-> copy link address-> paste in another browser window
			// it will opens the full frame into the browser. It might be possible That full frame would be 1 webpage
// we can include multiple webpages into single webpage with the help of frame. In 1 frame->1 webpage, in 2nd frame->2nd webpage etc. and
			// by copying link address of that frame and opening into new browser window, we can access it.
		// NOTE - we have to have toooo copy the link address of the iframe/frame onlyyyy. 

public class HandleFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Mahesh");	// if we directly find element and do the operations,
															// it will gives an error as 'NoSuchElementException'. so have to switch to frame 1st and then do the operations	

		// 3) Pass frame as WebElement
		// Frame1
		WebElement frame1 =	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Mahesh");
	
		// we can not switch from 1 frame to another frame. 1stly we have to come out from the frame1 to page and then switch to frame2
	
		driver.switchTo().defaultContent(); // switch from frame1 to webpage	
		
		// Frame2
		WebElement frame2 =	driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);									// again switch from page to webelement
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();		// again switch from frame2 to webpage
		
		// Frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("to Selenium");
		
		// if we have multiple frames embedded in a single frame like 1frame inside other, again that other frame inside another then it is complicated to find xpath
			// for that we can copy innermost iframe's src tag and open it in new window by right click on src option of frame tag-> copy link address-> paste in another browser window
			// and then copy the xpath and find the element which we want to.
		
		// inner iframe - part of frame3
		driver.switchTo().frame(0);		// switching to frame using index
		
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
		
	}

}
