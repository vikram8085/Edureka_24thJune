package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		//Open Browser
				System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				
		// Open AUT
				driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");

				WebDriverWait wait = new WebDriverWait(driver, 20);
				
				wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5"))).click();
				
				driver.quit();
						
				wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-6"))).click();
						
				/*
				 * WebElement link5 = driver.findElement(By.linkText("LinkText-5"));
				 * wait.until(ExpectedConditions.elementToBeClickable(link5)).click();
				 */


	}

}
