package Day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// keyDown() -> used for pressing the keyboard key
// keyUp()	-> used for releasing the keyboard key
// Keys	--> Representations of pressable keys that aren't text. eg.- ctrl,tab,alt,backspace,shift,enter etc.
// Keys.CONTROL	-> presses the CONTROL key

// CTRL+SHIFT+A	--> 	act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();

public class KeyboardActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("My name is Mahesh");
		
		// Ctrl+A
		act.keyDown(Keys.CONTROL	).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		// Ctrl+C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//TAB
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		// Ctrl+V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}
