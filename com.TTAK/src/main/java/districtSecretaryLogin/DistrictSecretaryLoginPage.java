package districtSecretaryLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class DistrictSecretaryLoginPage 

{

	WebDriver driver;

	GeneralUtilities gl= new GeneralUtilities();

	ExcelReadClass erc = new ExcelReadClass();

	ExplicitWait ew = new ExplicitWait();

	public DistrictSecretaryLoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[text()='  Club/Secretary Login ']")  // Secretary Login locator
	WebElement districtLogin;

	@FindBy(xpath="//input[@id='User']") // User name field locator
	WebElement userName;

	@FindBy(id="AdminPassword")  // password field locator
	WebElement passWord;

	@FindBy(id="btnlogin")  // login button locator
	WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"titleuname1\"]")
	WebElement tvmSecText;
	
	@FindBy(id = "adminerror") // invalid login alert msg locator 
	WebElement alertMsg;
	
	
	public String readData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readStringData(r, c);
	}
	
	public String readIntegerData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readIntegerData(r, c);
	}
	
	public void clickOnSecretaryLogin() // method to click on Secretary Login 
	{
		gl.clickElement(districtLogin);
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
	
	public boolean tvmSecText()
	{
		return gl.isDisplayedMethod(tvmSecText);
	}
	
	public void explicitWaitForTvmSecText()
	{
		ew.waitVisibilityOfElementLocated(driver, tvmSecText);
	}
	
	public void threadSleepWait() throws InterruptedException
	{
		gl.threadSleepWait();
	}
	
	public boolean alertMsg()  // method to whether the alert message showing or not
	{
		return gl.isDisplayedMethod(alertMsg);
	}

}
