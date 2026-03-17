package Day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//JavaScriptExecutor: Interface - which is implemented by RemoteWebDriver class
	// It's an Interface so we can not create an object of it.
	// executeScript() - We can execute JavaScript statements with the help of executeScript() method
	// action methods are executed by the executeScript() method. 
	// .click() - RadioButton,Checkboxes, Buttonclick, .sendKeys()-inputbox, textarea - these 2 methods are action methods. (WebElement methods)
	// When we perform click action, internally it will executes some javascript statements and those statements perform action on the application
	// in some cases, even after clicking on the webelement, it will not perform any task and it will throw an exception - ElementInterceptedException.
	// In that case, without calling the click() method, we directly execute the JavaScript statements in our webdriver using the executeScript() method, 
			//and that code will we interacted to the browser and perform the action on the webelements
	// i.e. executeScript() method is an alternative of the .click() and .sendKeys() method
	// If we get the 'ElementInterceptedException' error even after having the correct code then only we have to use this method. it is an optional. Not mandatory.

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
		//inputName.sendKeys("Mahesh Moreee");
		
		// JavascriptExecutor, WebDriver are different interfaces which are implemented by RemoteWebdriver class.
		// we can not assign an reference variable of the WebDriver interface to the JavascriptExecutor interface. so we have to do typecasting.
	
		// 1. Passing the text into inputbox - alternate to .sendKeys() method
		JavascriptExecutor js = (JavascriptExecutor) driver;		// upcasting - as driver is a reference variable of the ChromeDriver class's object
		js.executeScript("arguments[0].setAttribute('value','Mahesh Moreeee')", inputName);	// 'inputName' - WebElement, will be assigned to arguments[0]		
				// setAttribute('value','Mahesh Moreeee') -> The value of the 'inputName' attribute will be set to the provided value i.e. 'Mahesh Moreeee'
				// here, we have to provide an input/text in the inputbox that's why we used setAttribute() method.
		
		// 2. clicking on element - alternate to click() method
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male' and @name='gender']"));
		js.executeScript("arguments[0].click()",radiobtn); 	// here we are clicking on the button thats why we used .click() method
				
		
	}

}
