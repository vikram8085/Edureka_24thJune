package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		//Open Browser
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		
		driver.get("https://www.facebook.com/");
		
		//Locators
				/*
				//ID
				driver.findElement(By.id("u_0_l")).sendKeys("Vikram");
				
				//Name
				driver.findElement(By.name("lastname")).sendKeys("Muppaneni");
				
				//ClassName
				driver.findElement(By.className("inputtext")).sendKeys("Vikram");
				driver.findElement(By.className("inputtext")).sendKeys("Aditya");
				
				//Linktext
				driver.findElement(By.linkText("Forgotten account?")).click();
				
				driver.navigate().back();
				
				//PartialLinktext
				driver.findElement(By.partialLinkText("N a")).click();
				
				
				//Css Locator
				driver.findElement(By.cssSelector("#email")).sendKeys("Vikram");
				*/
				//TagName
				List<WebElement> taglist = driver.findElements(By.tagName("a"));
				
				System.out.println(taglist.size());
						
				
				//Xpath
				

	}

}
