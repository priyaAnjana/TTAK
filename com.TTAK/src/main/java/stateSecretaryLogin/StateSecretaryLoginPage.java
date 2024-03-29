package stateSecretaryLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;


public class StateSecretaryLoginPage {
	
	WebDriver driver;
	
	GeneralUtilities gl= new GeneralUtilities();
	
	ExcelReadClass erc = new ExcelReadClass();
	
	ExplicitWait ew = new ExplicitWait();

	public StateSecretaryLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//i[text()='  Club/Secretary Login ']")  // Secretary Login locator
	WebElement secretaryLogin;

	@FindBy(xpath="//input[@id='User']") // User name field locator
	WebElement userName;

	@FindBy(id="AdminPassword")  // password field locator
	WebElement passWord;

	@FindBy(id="btnlogin")  // login button locator
	WebElement loginButton;
	
	@FindBy(xpath = "//span[@id='titleuname_desig1']")  // ADMIN text locator
	WebElement actualUser;
	
	@FindBy(id = "adminerror") // invalid login alert msg locator 
	WebElement alertMsg;
	
	@FindBy(id = "ModuleTitle") // dashboard locator
	WebElement dashBoard; 

	public void clickOnSecretaryLogin() // method to click on Secretary Login 
	{
		gl.clickElement(secretaryLogin);
	}

	public void enterUserName(String uName)  // method to enter username
	{
		gl.typeText(userName, uName);
	}

	public void enterPassword(String pass) // method to enter password
	{
		gl.typeText(passWord, pass);
	}
	
	public void clickOnLoginButton() // method to click on login button
	{
		gl.clickElement(loginButton);
	}
	
	public String getcurrentUrl() // method to getcurrent url
	{
		return gl.getUrl(driver);
	}
	
	public String getActualUser() // method to get actualuser text
	{
		return gl.getText(actualUser);
	}
	
	public boolean alertMsg()  // method to whether the alert message showing or not
	{
		return gl.isDisplayedMethod(alertMsg);
	}
	
	public String readData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readStringData(r, c);
	}
	
	public String readIntegerData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readIntegerData(r, c);
	}
	
	public void waitAdmin()// wait for admin text
	{
		ew.waitElementToBEClickable(driver, actualUser);
	}
	
	public String getText() // method to get dashboard text
	{
		return gl.getText(dashBoard);
	}

	public void waitForDashBoardText()// wait for dashboard text
	{
		ew.waitElementToBEClickable(driver, dashBoard);
	}
	
	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}
	
	
}



