package module9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

	public FormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "ts_first_name")
	WebElement Fname;
	
	@FindBy(name = "ts_last_name")
	WebElement Lname;
	
	@FindBy(name = "ts_address")
	WebElement Add;
	
	
	public void FormFill(String fName, String lName, String add) throws Exception {
		Fname.clear();
		Fname.sendKeys(fName);
		
		Lname.clear();
		Lname.sendKeys(lName);
		
		Add.clear();
		Add.sendKeys(add);
		
		Thread.sleep(3000);
	}
}
