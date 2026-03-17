package Day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		WebElement uploadFileButtonInput = driver.findElement(By.xpath("//input[@id='filesToUpload']"));
		
		// Single File Upload
/*		uploadFileButtonInput.sendKeys("D:\\myWork\\Testing\\FileUploadTestPract\\Test1.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equalsIgnoreCase("Test1.txt"))
		{
			System.out.println("Test1.txt file uploaded successfully!");
		}
		else {
			System.out.println("File upload failed.");
		}	
*/
		// Multiple Files Upload
		String file1 = "D:\\myWork\\Testing\\FileUploadTestPract\\Test1.txt";
		String file2 = "D:\\myWork\\Testing\\FileUploadTestPract\\Test2.txt";
		String file3 = "D:\\myWork\\Testing\\FileUploadTestPract\\Test3.txt";
		String file4 = "D:\\myWork\\Testing\\FileUploadTestPract\\Test4.txt";

		uploadFileButtonInput.sendKeys(file1+"\n"+file2+"\n"+file3+"\n"+file4);	
		
		// validating number of files uploaded
		int numberOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
		System.out.println("Number of files uploaded are:"+numberOfFilesUploaded);
		
		if(numberOfFilesUploaded==4)
		{
			System.out.println("All files are uploaded successfully!");
		}
		else
		{
			System.out.println("Incorrect files are uploaded. All files uploading failed!");
		}
		
		// Validating file names 
		String fileName1 =	driver.findElement(By.xpath("//ul[@id='fileList']/li[1]")).getText();
		String fileName2 =	driver.findElement(By.xpath("//ul[@id='fileList']/li[2]")).getText();
		String fileName3 =	driver.findElement(By.xpath("//ul[@id='fileList']/li[3]")).getText();
		String fileName4 =	driver.findElement(By.xpath("//ul[@id='fileList']/li[4]")).getText();
		
		if(fileName1.equals("Test1.txt") && fileName2.equals("Test2.txt") 
				&& fileName3.equals("Test3.txt") && fileName4.equals("Test4.txt"))
		{
			System.out.println("File names are matching.");
		}
		else {
			System.out.println("File names are not matching.");
		}

	
	}

}
