package clubLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class PlayerApprovalPage 
{
	WebDriver driver;
	
	GeneralUtilities gl= new GeneralUtilities();

	ExcelReadClass erc = new ExcelReadClass();
	
	ExplicitWait ew = new ExplicitWait();

	// to mention base class and page class driver are same
	public PlayerApprovalPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='fa arrow'])[2]")
	WebElement manage;

	@FindBy(id = "10004_sub_module_id")
	WebElement playerApproval;

	@FindBy(xpath= "//iframe[@id='framecontent']")
	WebElement iframe;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@FindBy(id = "gs_PlayerName")
	WebElement playerNameSearchField;
	
	@FindBy(xpath = "//*[@id=\"1\"]/i")
	WebElement moreInfoButton;
	
	@FindBy(xpath = "//*[@id=\"PlayerMaster\"]/div/div/div[1]/span")
	WebElement playerRegistrationText;
	
	@FindBy(id = "btnBack")
	WebElement backButton;
	
	@FindBy(xpath = "//*[@id=\"1\"]/td[1]")
	WebElement checkBox;
	
	@FindBy(xpath = "//*[@id=\"btnSave\"]/i")
	WebElement approveButton;

	@FindBy(xpath = "//button[@class='confirm']")
	WebElement yesButton;

	@FindBy(xpath = "//p[text()='MemberId will be generated only after the approval of state secretery ']")
	WebElement approvedSuccessPopUpMsg;

	@FindBy(xpath = "//button[@class='confirm']")
	WebElement popUpOkButton;
	
	@FindBy(xpath = "//a[@class='logout-btn']")
	WebElement logOutButton;
	
	
	public String readData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readStringData(r, c);
	}
	
	public String readIntegerData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readIntegerData(r, c);
	}

	public void clickOnManage()
	{
		gl.clickElement(manage);
	}

	public void clickOnPlayerApproval()
	{
		gl.clickElement(playerApproval);
	}

	public void iframe()// method to switch to iframe
	{
		driver.switchTo().frame(iframe);
	}

	public void enterPlayerNameInToSearchField(String name)
	{
		gl.typeText(playerNameSearchField, name);
	}
	
	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}
	
	public void clickOnMoreinfoButton()
	{
		gl.clickElement(moreInfoButton);
	}
	
	public boolean isDisplayedPlayerRegistration()
	{
		return gl.isDisplayedMethod(playerRegistrationText);
	}
	
	public void clickONBackButton()
	{
		gl.clickElement(backButton);
	}
	
	public void clickOnCheckBox()
	{
		gl.clickElement(checkBox);
	}
	
	public void clickOnApproveButton()
	{
		gl.clickElement(approveButton);
	}

	public void switchToAlertPopUp()
	{
		gl.switchToAlertPopup(driver);
	}

	public void clickOnAlertYesButton()
	{
		gl.clickElement(yesButton);
	}
	
	public boolean appovedSuccessFulPopUpMsg()
	{
		return gl.isDisplayedMethod(approvedSuccessPopUpMsg);
	}
	
	public void clickOnPopUpOkButton()
	{
		gl.clickElement(popUpOkButton);
	}
	
	public void clickOnLogOutButton()
	{
		gl.clickElement(logOutButton);
	}
}
