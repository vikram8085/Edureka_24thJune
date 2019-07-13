package module8.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module8.Page.GoogleHomePageObjects;
import module8.Page.SeleniumHomePageObjects;

public class GoogleSearchText {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		page.SearchOnGoogle();
		
		page.ClickSel();
		
		SeleniumHomePageObjects page2 = new SeleniumHomePageObjects(driver);
		
		page2.GoToDonwload();
		Thread.sleep(3000);
		page2.GoToProjectPage();
		Thread.sleep(3000);
		page2.GoToHomePage();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
