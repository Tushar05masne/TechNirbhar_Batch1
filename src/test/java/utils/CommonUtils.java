package utils;

import org.openqa.selenium.WebElement;

public class CommonUtils {
	
	public static void type(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

}

