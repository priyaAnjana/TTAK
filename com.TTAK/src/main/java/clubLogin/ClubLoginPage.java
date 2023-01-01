package clubLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class ClubLoginPage {
	WebDriver driver;

	GeneralUtilities gl= new GeneralUtilities();

	ExcelReadClass erc = new ExcelReadClass();

	ExplicitWait ew = new ExplicitWait();

	public ClubLoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[text()='  Club/Secretary Login ']")  // Secretary Login locator
	WebElement clubLogin;

	@FindBy(xpath="//input[@id='User']") // User name field locator
	WebElement userName;

	@FindBy(id="AdminPassword")  // password field locator
	WebElement passWord;

	@FindBy(id="btnlogin")  // login button locator
	WebElement loginButton;
	
	@FindBy(id = "titleuname1")
	WebElement clubName;
	
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
	public void clickOnClubLogin() // method to click on Secretary Login 
	{
		gl.clickElement(clubLogin);
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
	
	public boolean clubNameIsDisplayed()
	{
		return gl.isDisplayedMethod(clubName);
	}
	
	public boolean alertMsg()  // method to whether the alert message showing or not
	{
		return gl.isDisplayedMethod(alertMsg);
	}
	
	
}
