package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// PageFactory - PageFactory is a class provided by Selenium to initialize web elements in POM.
		//It is used to implement POM in a cleaner way using: @FindBy annotation and PageFactory.initElements()
		//Factory class to make Page Objects simpler and easier.
		// It is used to store web elements using @FindBy annotation, Initialize elements automatically and
			// write clean and maintainable automation code

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);	// Without initElements(), this element will be NULL.
	}
}


// PageFactory.initElements(driver,this) - PageFactory initialization
	// Selenium scans the page class, identifies all @FindBy annotated elements, and creates proxy objects for them.
	// For each field, it creates a proxy object. It does NOT immediately find the element.
	// The actual element is located only when it is used, which is called lazy initialization.