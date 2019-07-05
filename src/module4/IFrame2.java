package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {

	public static void main(String[] args) {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.name("ts_first_name")).sendKeys("Vikramaditya");

		driver.findElement(By.name("ts_last_name")).sendKeys("Muppaneni");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(2);

		driver.findElement(By.name("ts_first_name")).sendKeys("Muppaneni");

		driver.findElement(By.name("ts_last_name")).sendKeys("Vikramaditya");
		
		//driver.close();
		
		
		

	}

}
