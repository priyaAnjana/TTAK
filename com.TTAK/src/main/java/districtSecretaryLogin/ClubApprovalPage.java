package districtSecretaryLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class ClubApprovalPage 

{
	WebDriver driver;

	GeneralUtilities gl= new GeneralUtilities();

	ExcelReadClass erc = new ExcelReadClass();

	ExplicitWait ew = new ExplicitWait();

	public ClubApprovalPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[@class='fa arrow'])[3]")
	WebElement manage;
	
	@FindBy(id = "10715_sub_module_id")
	WebElement clubApproval;
	
	@FindBy(xpath= "//iframe[@id='framecontent']")
	WebElement iframe;
	
	@FindBy(xpath = "//*[@id=\"gs_ClubName\"]")
	WebElement clubNameField;
	
	@FindBy(xpath = "//*[@id=\"jqg_tblclubapprovalgrid_1\"]")
	WebElement checkBox;
	
	@FindBy(xpath = "//*[@id=\"btnSave\"]/i")
	WebElement approveButton;
	
	@FindBy(xpath = "//button[@class='confirm']")
	WebElement yesButton;

	@FindBy(xpath = "//p[text()='Selected club registrations are successfully approved']")
	WebElement approvedSuccessPopUpMsg;

	@FindBy(xpath = "//button[@class='confirm']")
	WebElement popUpOkButton;
	
	@FindBy(xpath = "//a[@class='logout-btn']")
	WebElement logOutButton;
	
	public String readData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readStringData(r, c);
	}	
	
	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}
	
	public void clickOnManage()
	{
		gl.clickElement(manage);
	}
	
	public void clickOnClubApproval()
	{
		gl.clickElement(clubApproval);
	}	
	
	public void iframe()// method to switch to iframe
	{
		driver.switchTo().frame(iframe);
	}
	
	public void enterClubName(String name)
	{
		gl.typeText(clubNameField, name);
	}
	
	public void EnterKeyOnClubNameFied()
	{
		gl.clickEnterkeys(clubNameField);
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
