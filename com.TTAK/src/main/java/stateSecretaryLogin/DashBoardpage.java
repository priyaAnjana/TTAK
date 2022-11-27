package stateSecretaryLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExcelWriteClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class DashBoardpage {

	WebDriver driver;  //initializing webdriver

	GeneralUtilities gl= new GeneralUtilities(); //create object of General Utility Class to access all method present in General Utility class 

	ExcelReadClass erc = new ExcelReadClass();  // create object of excel read class
	ExplicitWait ew = new  ExplicitWait();
	ExcelWriteClass ewc= ExcelWriteClass();
	public DashBoardpage(WebDriver driver) // constructor is created to show  base class driver and dashboard page driver are same
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	private ExcelWriteClass ExcelWriteClass() {
		// TODO Auto-generated method stub
		return null;
	}


	@FindBy(id = "ModuleTitle") // dashboard locator
	WebElement dashBoard; 


	public String getText() // method to get dashboard text
	{
		return gl.getText(dashBoard);
	}

	public void waitForDashBoardText()
	{
		ew.waitElementToBEClickable(driver, dashBoard);
	}
	

}
