package homePage;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class ClubSelfRegistration 

{
	WebDriver driver;
	GeneralUtilities gl= new GeneralUtilities();


	ExcelReadClass erc = new ExcelReadClass();
	ExplicitWait ew = new ExplicitWait();

	public ClubSelfRegistration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='clubReg']")
	WebElement clubRegistration;
	
	@FindBy(id = "ddlclubType")
	WebElement typeOfClub;
	
	@FindBy(id = "txtclubname")
	WebElement clubName;
	
	@FindBy(id = "ddldistrict")
	WebElement district;
	
	@FindBy(id = "txtauthPerson")
	WebElement authorizedPerson;
	
	@FindBy(id = "txtaddress")
	WebElement address;
	
	@FindBy(id = "txtemail")
	WebElement emailId;
	
	@FindBy(xpath = "//*[@id=\"txtphoneno\"]")
	WebElement phNum;
	
	@FindBy(xpath = "//input[@id='customFile']")
	WebElement uploadDocument;
	
	@FindBy(id = "playerimg")
	WebElement playerImage;
	
	@FindBy(id = "btnSave")
	WebElement registerButton;
	
	@FindBy(xpath = "//h2[text()='Club Registration']")
	WebElement clubRegistrationText;
	
	
	
	
	public String readData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readStringData(r, c);
	}
	public String readIntegerData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readIntegerData(r, c);
	}
	
	public void clickOnClubRegistration()
	{
		gl.clickElement(clubRegistration);
	}
	
	public void clickOnTypeOfClub()
	{
		gl.clickElement(typeOfClub);
	}
	
	public void selectValueFromTypeOfClubDropDown(String value)
	{
		gl.selectClass(typeOfClub, value);
	}
	
	public void enterClubName(String name)
	{
		gl.typeText(clubName, name);
	}
	
	public void clickOnDistrict()
	{
		gl.clickElement(district);
	}
	
	public void selectValueFromDistrictDropDown(String dis)
	{
		gl.selectClass(district, dis);
	}
	
	public void enterAuthorizedPerson(String name)
	{
		gl.typeText(authorizedPerson, name);
	}
	
	public void enterAddress(String add)
	{
		gl.typeText(address, add);
	}
	
	public void enterEmailId(String id)
	{
		gl.typeText(emailId, id);
	}
	
	public void scrollIntoPhnum()
	{
		gl.javaScriptEecutorForSrolling(driver, phNum);	
	}
	
	public void enterPhoneNum(String no)
	{
		gl.typeText(phNum, no);
	}
	
	public void clickOnUploadDocuments()
	{
		gl.javaScriptExecutorForClick(driver, uploadDocument);
	}
	
	public void uploadDocument(String path) throws AWTException
	{
		gl.robortCalssForFileUploading(path);
	}
	
	public void clickOnPlayerImage()
	{
		gl.actionClassToClikEnter(driver, playerImage);
	}
	
	public void uploadPlayerImage(String path) throws AWTException
	{
		gl.robortCalssForFileUploading(path);
	}
	
	public void clickOnRegisterButton()
	{
		gl.javaScriptExecutorForClick(driver, registerButton);
	}
	
	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}
	
	public boolean isDisplayedClubRegistrationText()
	{
		return gl.isDisplayedMethod(clubRegistrationText);
	}
	
	public String getUrl()
	{
		return gl.getUrl(driver);
	}
	
	
}
