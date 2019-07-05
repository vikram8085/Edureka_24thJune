package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PAlert {

	public static void main(String[] args) {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		driver.findElement(By.id("prompt")).click();
		
		Alert pA = driver.switchTo().alert();
		
		pA.sendKeys("Vikramaditya M");
		
		pA.accept();
		

	}

}
