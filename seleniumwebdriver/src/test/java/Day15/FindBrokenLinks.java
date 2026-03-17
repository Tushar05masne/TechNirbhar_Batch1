package Day15;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testNg1.orangeHRMTest;

/*
Broken links:
	// The links which don't have any resource in the server those links are called broken links.
	// If we send any request for the resource on the server and that resource is not available/not exist then those are broken links.
	// The status codes which are greater than or equal to 400 are all broken link statuses.
3 things we need to check for broken link:
	1) The link should have 'href' attribute with it's value.	<a href="https://xyz.com"
	2) when we send request to that link, it should return the status code. https://xyz.com --> send to server -> returns status code.
	3) That status code should be >=400 	--> broken link
		 	status code <400 --> not a broken link
*/
public class FindBrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		// Capture all the links from the webpage
		List	<WebElement>	links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
		
		int noOfBrokenLinks = 0;
		
		for(WebElement linkElement:links)
		{
			String hrefAttrValue = linkElement.getAttribute("href");
			
			if(hrefAttrValue==null || hrefAttrValue.isEmpty())
			{
				System.out.println("href attribute value is empty. Not possible to check");
				continue;
			}
			
			try 
			{	
				// hit URL to the server
				URL linkURL = new URL(hrefAttrValue);	// converts href attribute value from String to URL format
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); // opens connection to the server
				conn.connect();		// connect to the server and send request to the server
	
				if(conn.getResponseCode()>=400)
				{
					System.out.println(hrefAttrValue+"====> Broken link");
					noOfBrokenLinks++;
				}
				else {
					System.out.println(hrefAttrValue+"====> Not a broken link");
				}
			}
			catch (Exception e) 
			{
			}
		}
		System.out.println("Number of broken links: "+noOfBrokenLinks);	// 42
	}

}
