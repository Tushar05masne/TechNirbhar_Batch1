package Day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//	.getLocation() --> get the (x,y) location of the slider
//	.getLocation().getX() --> get the X value of the location
// 	.getLocation.getY() --> get the Y value of the location

// .dragAndDropBy()	--> method to drag and drop the slider


public class SliderDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver); 		// it's a mouse action. so we need to create an object of the Actions class	
		
		// Min slider	
		WebElement min_slider =	driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Default Location of the min slider: "+min_slider.getLocation());			// (59, 246)		
		System.out.println("X axis value of the min slider: "+min_slider.getLocation().getX());		// 59		
		System.out.println("Y axis value of the min slider: "+min_slider.getLocation().getY());		// 246		

		act.dragAndDropBy(min_slider, 100, 246).perform();	// drag/increase the size of the X axis slider by 100 points
															// It is a horizontal slider. so the Y axis value remains same

		System.out.println("Location of the min slider after moving: "+min_slider.getLocation()); 	//(158, 246)
	
		// Max slider
		WebElement max_slider =	driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println("Default Location of the max slider: "+max_slider.getLocation());			// (613, 246)	
		System.out.println("X axis value of the max slider: "+max_slider.getLocation().getX());		// 613	
		System.out.println("Y axis value of the max slider: "+max_slider.getLocation().getY());		// 246	
	
		act.dragAndDropBy(max_slider, -100, 246).perform();		// we need to drag the slider to opposite side/left side. 
																//so we are minimizing the x value. therefore given -100.
		System.out.println("Location of the max slider after moving: "+max_slider.getLocation());		// (513, 246)

	}

}
