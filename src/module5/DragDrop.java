package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		
		driver.get("http://jqueryui.com/droppable/");
		
		/*
		 * Initialize 3 WebElements and 
		 * drag Element from A location to B Location using Actions Class
		 */

		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(iFrame);
		
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Source, Target).perform();
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
