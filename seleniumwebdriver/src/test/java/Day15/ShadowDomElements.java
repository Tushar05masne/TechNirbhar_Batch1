package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Shadow DOM -->
	// Shadow-Host --> Shadow-Root --> Shadow-Element
		// We have Shadow-Host -> inside Shadow-Host we have Shadow-Root --> inside Shadow-Root we have Shadow-Element		
	// 1stly we need to get the Shadow-Host then extract the Shadow-Root from Host and then extract the Shadow-Element from the Root		
// we can extract the elements/host/root only with the help of cssSelector.
	// The return type of the .getShadowRoot() method is the SearchContext(Interface - Root of the all the Webdrivers/WebElements)
//We dont get the direct xpath of the shadow element. we need to write a piece of code to get the shadow element. 
	//we have to use the Selector Hub for the code. It will give the code for accessing the Shadow-Elements

// 3 types of shadow-elements -
	// 1) Shadow Element
	// 2) Nested Shadow Element
	// 3) Multi-nested Shadow Element

// Xpath can not handle Shadow DOM elements. Only cssSelector can handle Shadow DOM elements.

public class ShadowDomElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
			
		driver.get("https://dev.automationtesting.in/shadow-dom");
		//driver.get("https://dev.automationtesting.in/");
		driver.manage().window().maximize();
		
		
		//This Element is inside single shadow DOM.	// inspect the element and copy paste the code that is created in selector hub
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();	
		Thread.sleep(1000);
		WebElement shadowElement = shadow.findElement(By.cssSelector("#shadow-element"));
		String txtShadowElement = shadowElement.getText();
		System.out.println(txtShadowElement);

		
		//This Element is inside 2 nested shadow DOM.
		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		WebElement nestedShadowElement = shadow1.findElement(By.cssSelector("#nested-shadow-element"));	
		String txtnestedShadowElement = nestedShadowElement.getText();
		System.out.println(txtnestedShadowElement);
		
		//This Element is inside 3 nested shadow DOM.
		SearchContext shadow01 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow11 = shadow01.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow21 = shadow11.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		WebElement multinestedShadowElement = shadow21.findElement(By.cssSelector("#multi-nested-shadow-element"));
		
		String txtmultinestedShadowElement = multinestedShadowElement.getText();
		System.out.println(txtmultinestedShadowElement);
	}

}
