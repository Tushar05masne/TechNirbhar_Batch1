package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://codepen.io/EpsilonDeltaCriterion/pen/jLoPgE");
		driver.manage().window().maximize();
		
		// Switch to frame
		driver.switchTo().frame("result");	// result->id of frame
		
		Actions act = new Actions(driver);
		
		// Drag and Drop
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1' and contains(text(),'Oslo')]"));
		WebElement norway = driver.findElement(By.xpath("//div[@id='box101' and contains(text(),'Norway')]"));
		act.dragAndDrop(oslo, norway).perform();
		
		WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2' and contains(text(),'Stockholm')]"));
		WebElement sweden = driver.findElement(By.xpath("//div[@id='box102' and contains(text(),'Sweden')]"));
		act.dragAndDrop(stockholm, sweden).perform();

		WebElement washington = driver.findElement(By.xpath("//div[@id='box3' and contains(text(),'Washington')]"));
		WebElement unitedstates = driver.findElement(By.xpath("//div[@id='box103' and contains(text(),'United States')]"));
		act.dragAndDrop(washington, unitedstates).perform();

		WebElement copenhagen = driver.findElement(By.xpath("//div[@id='box4' and contains(text(),'Copenhagen')]"));
		WebElement denmark = driver.findElement(By.xpath("//div[@id='box104' and contains(text(),'Denmark')]"));
		act.dragAndDrop(copenhagen, denmark).perform();

		WebElement seoul = driver.findElement(By.xpath("//div[@id='box5' and contains(text(),'Seoul')]"));
		WebElement southkorea = driver.findElement(By.xpath("//div[@id='box105' and contains(text(),'South Korea')]"));
		act.dragAndDrop(seoul, southkorea).perform();

		WebElement rome = driver.findElement(By.xpath("//div[@id='box6' and contains(text(),'Rome')]"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106' and contains(text(),'Italy')]"));
		act.dragAndDrop(rome, italy).perform();

		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7' and contains(text(),'Madrid')]"));
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107' and contains(text(),'Spain')]"));		
		act.dragAndDrop(madrid, spain).perform();

	}

}
