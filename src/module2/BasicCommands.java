package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicCommands {

	public static void main(String[] args) {
		
		//Instantiate Browser or Initialize Browser OR Open Browser
		//Chrome
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		//Firefox
		
		System.setProperty("webdriver.gecko.driver","/selenium training/selenium/drivers/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		
		
		//Close & Quit Commands
		
		driver.close();//this will close only the current active window opened within current instance
		
		driver.quit();//this will close all the windows opened within current instance
		
		//Get Commands
		
		driver.get("URL"); // to open the URL of the AUT
		driver.getCurrentUrl();// to take the URL from the Browser and validate
		driver.getTitle();//to fetch the title of the page
		driver.getWindowHandle();//this will give you a alfpanumeric identity of the window
		
		//Navigation Commands
				driver.navigate().back();//to go to the previous page
				driver.navigate().forward();// to move to the next page
				driver.navigate().refresh();// to refresh the current page
				driver.navigate().to("URL");// to open a URL
				
				//Element Handling Cammands
				driver.findElement(By.id("")).sendKeys("Vikram");// to type into a text box
				driver.findElement(By.id("")).click();// to click on an element
				driver.findElement(By.id("")).clear();// to erase the data from a text box
				driver.findElement(By.id("")).getText();// to get the text of that element
			
		
		
		
		
		
	}

}
