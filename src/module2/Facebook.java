package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		//Open Browser
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		
		driver.get("https://www.facebook.com/");
		
		//Locators
				//ID
				driver.findElement(By.id("u_0_l")).sendKeys("Vikram");
				
				//Name
				driver.findElement(By.name("lastname")).sendKeys("Muppaneni");
				
				//ClassName
				driver.findElement(By.className("inputtext")).sendKeys("Vikram");
				driver.findElement(By.className("inputtext")).sendKeys("Aditya");
				
				//Linktext
				
				//PartialLinkText
				
				//CSS Locator
				
				//TagName
				
				//Xpath
				

	}

}
