package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
		
		driver.switchTo().frame("ID_Frame1");
		
		driver.findElement(By.name("ts_first_name")).sendKeys("Vikramaditya");
		
		driver.findElement(By.className("ts_last_name")).sendKeys("Muppaneni");
		
		driver.switchTo().parentFrame();
		
		WebElement frame = driver.findElement(By.id("ID_Frame2"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.name("ts_first_name")).sendKeys("Muppaneni");
		
		driver.findElement(By.name("ts_last_name")).sendKeys("Vikramaditya");
		
		Thread.sleep(6000);
		
		//driver.close();
		
		

	}

}
