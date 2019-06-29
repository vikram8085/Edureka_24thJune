package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorValidation {

	public static void main(String[] args) {
		//Open Browser
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.naukri.com/nlogin/login");
		
		driver.findElement(By.id("usernameField")).click();
		
		driver.findElement(By.id("passwordField")).click();
		
		WebElement errmsg = driver.findElement(By.id("usernameField_err"));
		
		boolean ErrorMessage = errmsg.equals("Email ID/Username cannot be left blank");
		
		System.out.println(ErrorMessage);

	}

}
