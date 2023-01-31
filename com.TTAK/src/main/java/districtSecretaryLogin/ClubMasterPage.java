package districtSecretaryLogin;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class ClubMasterPage 

{
	WebDriver driver;

	GeneralUtilities gl= new GeneralUtilities();

	ExcelReadClass erc = new ExcelReadClass();

	ExplicitWait ew = new ExplicitWait();

	public ClubMasterPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='fa arrow'])[4]")
	WebElement setUp;

	@FindBy(id = "10112_sub_module_id")
	WebElement clubMaster;

	@FindBy(xpath= "//iframe[@id='framecontent']")
	WebElement iframe;

	@FindBy(xpath = "//span[@id='select2-ddlclubType-container']")
	WebElement typeOfClubDropDown;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement typeOfClubDropDownTextField;

	@FindBy(id = "txtclubname")
	WebElement clubName;

	@FindBy(id = "txtauthPerson")
	WebElement authorizedPerson;

	@FindBy(id = "txtphoneno")
	WebElement phNum;

	@FindBy(id = "txtemail")
	WebElement emailId;

	@FindBy(id = "txtaddress")
	WebElement address;

	@FindBy(xpath = "//span[@id='select2-ddlstatus-container']")
	WebElement statusDropDown;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement statusDropDownTextField;

	@FindBy(xpath = "//input[@id='playerimg']")
	WebElement image;

	@FindBy(id = "3_documents")
	WebElement documentsTab;

	@FindBy(xpath="//span[@class='btn btn-success fileinput-button']")// document file upload locator
	WebElement fileUpload;

	@FindBy(id="docfileupload")// file upload button locator
	WebElement uploadButton;

	@FindBy(id = "btnSave")// save button locator
	WebElement saveButton;

	@FindBy(xpath = "//button[@class='confirm']")
	WebElement popUpOkButton;

	@FindBy(xpath = "//p[text()='Club details added successfully.']")
	WebElement successfulPopUp;

	@FindBy(id="btnClubList")// player list button locator
	WebElement clubListButton;

	@FindBy(id = "gs_club_name")
	WebElement clubNameField;

	@FindBy(xpath = "//*[@id=\"1\"]/i")
	WebElement editButton;

	@FindBy(xpath ="(//*[@id=\"1\"]/i)[2]")
	WebElement docDeleteButton;

	@FindBy(xpath = "//button[@class='confirm']")
	WebElement clickPopUpYesButton;

	@FindBy(xpath = "//button[@class='confirm']")
	WebElement docDeletedSucessfulPopUpOkButton;

	@FindBy(xpath = "//p[text()='Club details updated successfully']")
	WebElement updatedSuccessfulPopUp;

	@FindBy(xpath = "(//*[@id=\"1\"]/i)[2]")
	WebElement clubDeleteButton;

	@FindBy(xpath = "//p[text()='Successfully Deleted']")
	WebElement successfullyDeletedPopUp;
	
	@FindBy(xpath ="//button[@class='confirm']")
	WebElement clubDeletedPopUpYesButton;



	public String readData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readStringData(r, c);
	}
	public String readIntegerData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readIntegerData(r, c);
	}

	public void clickOnSetUp()
	{
		gl.clickElement(setUp);
	}

	public void clickOnClubMaster()
	{
		gl.clickElement(clubMaster);
	}

	public void iframe()// method to switch to iframe
	{
		driver.switchTo().frame(iframe);
	}

	public void clickOnTypeOfClubDropDown()
	{
		gl.clickElement(typeOfClubDropDown);
	}

	public void enterTypeOfClub(String name)
	{
		gl.typeText(typeOfClubDropDownTextField, name);
	}

	public void clickEnterOnTypeOfClubDropDown()
	{
		gl.clickEnterkeys(typeOfClubDropDownTextField);
	}

	public void waitElementToBeClickable()
	{
		ew.waitElementToBEClickable(driver, typeOfClubDropDown);
	}

	public void enterClubName(String name)
	{
		gl.typeText(clubName, name);
	}

	public void enterAuthorizedPerson(String person)
	{
		gl.typeText(authorizedPerson, person);	
	}

	public void enterPhoneNumber(String num)
	{
		gl.typeText(phNum, num);
	}

	public void enterEmailId(String email)
	{
		gl.typeText(emailId, email);
	}

	public void enterAddress(String add)
	{
		gl.typeText(address, add);
	}

	public void clickOnStatusDropDown()
	{
		gl.clickElement(statusDropDown);
	}

	public void enterStatus(String status)
	{
		gl.typeText(statusDropDownTextField, status);
	}

	public void clickEnterOnStatusDropDwon()
	{
		gl.clickEnterkeys(statusDropDownTextField);
	}

	public void clickOnImage()
	{
		gl.javaScriptExecutorForClick(driver, image);
	}

	public void uploadImage(String path) throws AWTException
	{
		gl.robotCalssForFileUploading(path);
	}

	public void clickOnDocumentsTab()
	{
		gl.clickElement(documentsTab);
	}

	// method to click on file upload 

	public void clickOnFileUpload()
	{
		gl.clickElement(fileUpload);
	}
	// method to upload documents

	public void uploadFile(String file) throws Exception
	{
		gl.robotCalssForFileUploading(file);
	}
	// method to click on upload icon

	public void clickOnUpload()
	{
		gl.clickElement(uploadButton);
	}
	// method to click on save button

	public void clickOnSaveButton()
	{
		gl.clickElement(saveButton);
	}

	public void clickOnPoupOkButton()
	{
		gl.clickElement(popUpOkButton);
	}

	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}

	// method to switch model pop up
	public void switchToAlertPopUp()
	{
		gl.switchToAlertPopup(driver);
	}

	public boolean isDisplayedSuccessfulPopUp()
	{
		return gl.isDisplayedMethod(successfulPopUp);
	}

	public void clickOnClubListButton()
	{
		gl.clickElement(clubListButton);
	}

	public void waitOnClubListButton()
	{
		ew.waitElementToBEClickable(driver, clubListButton);
	}

	public void enterClubNameIntoSearchField(String name)
	{
		gl.typeText(clubNameField, name);
	}

	public void clickOnEditButton()
	{
		gl.clickElement(editButton);
	}

	public void clearClubName()
	{
		gl.clearFields(clubName);
	}

	public void clearPhNum()
	{
		gl.clearFields(phNum);
	}

	public void clickOnDocumentDeleteButton()
	{
		gl.clickElement(docDeleteButton);
	}

	public void clickDeletePopUpYesButton()
	{
		gl.clickElement(clickPopUpYesButton);
	}

	public void clickOnDocDeletedSuccessfulPopUpOkButton()
	{
		gl.clickElement(docDeletedSucessfulPopUpOkButton);
	}

	public boolean isDisplayedSucessfullyUpdatedPopUp()
	{
		return gl.isDisplayedMethod(updatedSuccessfulPopUp);
	}

	public void clickOnClubDeleteButton()
	{
		gl.clickElement(clubDeleteButton);
	}
	
	public void clickOnClubDeletePopUpYesButton()
	{
		gl.clickElement(clubDeletedPopUpYesButton);
	}

	public boolean isDisplayedSuccessfullyDeletedPopUp()
	{
		return gl.isDisplayedMethod(successfullyDeletedPopUp);
	}

}
