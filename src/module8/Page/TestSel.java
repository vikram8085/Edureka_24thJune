package module8.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSel {

public static WebDriver driver;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");	
		
		SeleniumHomePageObjects homepage = new SeleniumHomePageObjects(driver);
		
		homepage.GoToDonwload();
		
		homepage.GoToHomePage();
		
		homepage.GoToProjectPage();
		
		
	}

}
