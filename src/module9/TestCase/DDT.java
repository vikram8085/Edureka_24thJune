package module9.TestCase;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import module9.Pages.FormPage;

public class DDT {

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int norows;
	int nocols;
	
	
	@BeforeTest
	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
	
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	}
	
	
	@DataProvider
	public Object[][]testDataFeed() throws Exception{
		
		//to import the Excel file and fetch the data bytes from the file and pass it to the script
		FileInputStream fis = new FileInputStream("/selenium_24thjune/src/module9/TestData/TestData.xlsx");
		
		wb = WorkbookFactory.create(fis);
		
		sh = wb.getSheet("Sheet1");
		
		norows = sh.getLastRowNum();
		System.out.println(norows);
		
		nocols = sh.getRow(0).getLastCellNum();
		System.out.println(nocols);
		
		Object[][] formData = new Object[norows][nocols];
		
		for(int row=0; row<norows; row++) 
		{
			for(int col=0; col<nocols; col++) 
			{
				
				//fetch the data from the excel file and capture those bytes of the cell
				formData[row][col] = sh.getRow(row).getCell(col).toString();
				
			}
			
		}
		
		return formData;
	}
	
	@Test(dataProvider = "testDataFeed")
	public void FormFill(String fName, String lName, String add) throws Exception {
		
	FormPage fp = new FormPage(driver);
	fp.FormFill(fName, lName, add);
	
	}
	
	@AfterTest
	public void QuitBrowser() {
		
		driver.quit();
	}
}








