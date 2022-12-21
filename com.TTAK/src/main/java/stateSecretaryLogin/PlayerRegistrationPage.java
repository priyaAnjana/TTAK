package stateSecretaryLogin;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class PlayerRegistrationPage {

	WebDriver driver;
	GeneralUtilities gl= new GeneralUtilities();


	ExcelReadClass erc = new ExcelReadClass();
	ExplicitWait ew = new ExplicitWait();

	// to mention base class and page class driver are same
	public PlayerRegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='fa arrow'])[2]") // Process menu locator
	WebElement process;


	@FindBy(xpath="//a[text()='Player Registration']") //Player registration menu locator
	WebElement playerRegistration;

	@FindBy(xpath= "//iframe[@id='framecontent']")
	WebElement iframe;

	@FindBy(xpath="//input[@id='txtfirstname']")// first name field locator
	WebElement firstName;

	@FindBy(id="txtlastname") // lastname textfield locator
	WebElement lastName;

	@FindBy(xpath="//span[@id='select2-ddlgender-container']")// gender dropdown locator
	WebElement genderDropDown;

	@FindBy(xpath="//input[@class='select2-search__field']")// gender dropdown text field locator
	WebElement genderDropDownTextField;

	@FindBy(id="txtdob")// date of birth date picker locator
	WebElement dateOfBirthDatePicker;

	@FindBy(id="txtFatherName")// father name field locator
	WebElement fatherName;

	@FindBy(id="txtMotherName")// mother name field locator
	WebElement motherName;

	@FindBy(xpath="//span[@id='select2-ddlStatus-container']")// status drop down locator
	WebElement statusDropDown;

	@FindBy(xpath="//input[@class='select2-search__field']")// status drop down text field locator
	WebElement statusTextField;

	@FindBy(id="playerimgid")// palyer image locator
	WebElement playerImage;

	@FindBy(id="2_personal")// personal tab locator
	WebElement personalTab;

	@FindBy(xpath="//span[@id='select2-ddlBloodGroup-container']")// blood group drop down locator
	WebElement bloodGroupDropDown;

	@FindBy(xpath="//input[@Class='select2-search__field']")// blood group drop down text field locator
	WebElement bloodGroupTextFieldDropDown;

	@FindBy(id="txtTTFIid")// ttfi id locator
	WebElement ttfiId;

	@FindBy(id="txtaddress")// address locator
	WebElement residenceAddress;

	@FindBy(id="txtcontactno1")// contact number 1 locator
	WebElement contactNumber1;

	@FindBy(id="txtcontactno2")// 2 contact number locator
	WebElement contactNUmber2;

	@FindBy(id="txtemailid")// email id field locator
	WebElement emailId;

	@FindBy(id="txtaadharno")// adhar number field locator
	WebElement adharNumber;

	@FindBy(xpath="//span[@id='select2-ddldistrict-container']")// district drop down field locator
	WebElement district;

	@FindBy(xpath="//input[@class='select2-search__field']")// district drop down text field locator
	WebElement districtTextFieldDropDown;

	@FindBy(id="txtbirthplace")// place of birth field locator
	WebElement placeOfBirth;

	@FindBy(xpath="//span[@id='select2-ddlclub-container']")// club 1 locator
	WebElement club1;

	@FindBy(xpath="//input[@class='select2-search__field']")// club1 text field locator
	WebElement club1TextField;

	@FindBy(xpath="//span[@id='select2-ddlclub2-container']")// club 2 locator
	WebElement club2;

	@FindBy(xpath="//input[@class='select2-search__field']")// club2 text field locator
	WebElement club2TextField;

	@FindBy(id="txtIName")// institution field locator
	WebElement institutionName;

	@FindBy(id="txtIAddress")// institution address field locator
	WebElement institutionAddress;

	@FindBy(id="txtICourse")// course field locator
	WebElement course;

	@FindBy(id="txtPassportNo")// passport number field locator
	WebElement passportNumber;

	@FindBy(id="txtIssueDate")// passport date of issue icon date picker locator
	WebElement passportDateOfIssue;

	@FindBy(xpath="(//th[@class='datepicker-switch'])[1]")//passport month and year date picker locator
	WebElement PassportIssuemonthAndYear;

	@FindBy(xpath="(//th[@class='prev'])[1]")// passport issue date date picker back button
	WebElement  passportIssueDateBackButton;

	@FindBy(xpath="(//i[@class='fa fa-calendar'])[4]")// passport valid up to data valid up to icon locator
	WebElement passportDateValiUpTo;	

	@FindBy(xpath="(//th[@class='next'])[1]")// passport valid up to date picker next button locator
	WebElement passportValidUpToNextButton;

	@FindBy(id="txtIPlace")// place of issue field locator
	WebElement placeOfIssue;

	@FindBy(id="3_documents")// document tab locator
	WebElement documentsTab;

	@FindBy(xpath="(//span[@class='select2-selection__arrow'])[8]") // documents type drop down locator
	WebElement documentsTypeDropdown;

	@FindBy(xpath="//input[@class='select2-search__field']")// documents text field locator
	WebElement documentsTypeDropDownTextField;

	@FindBy(xpath="//span[@class='btn btn-success fileinput-button']")// document file upload locator
	WebElement fileUpload;

	@FindBy(id="docfileupload")// file upload button locator
	WebElement uploadButton;

	@FindBy(xpath = "(//a[@class='btn btn-default'])[1]")// save button locator
	WebElement saveButton;

	@FindBy(xpath="//button[text()='Offline ']")// offline button locator
	WebElement offlineButton;

	@FindBy(xpath="//div[@class='sweet-alert showSweetAlert visible']")//successful alert locator
	WebElement alertPresent;

	@FindBy(xpath="//div[@class='sa-button-container']//button[@class='confirm']")// alert ok button locator
	WebElement alertOkButton;

	@FindBy(xpath="//p[text()='Player details added successfully']")// successfully registered alert text locator
	WebElement successfullyRegister;

	@FindBy(id="btnPlayerList")// player list button locator
	WebElement playerListButton;

	@FindBy(id="player_full_name")// player name search field locator
	WebElement playerNameSearchField;

	@FindBy(xpath="//table[@id='tblplayerlists']/tbody/tr[2]/td[13]")// player edit details edit button locator
	WebElement editButton;

	@FindBy(xpath="//table[@id='tbldocsgrid']/tbody/tr[2]/td[4]")//documents delete button locator
	WebElement documentsDeleteButton;

	@FindBy(xpath="//div[@class='sa-button-container']//button[@class='confirm']")// documents delete yes button locator
	WebElement documentDeleteYesButton;

	@FindBy(xpath="//p[text()='Player details updated successfully']")// player details successfully updated alert
	WebElement successfullyUpdated;

	@FindBy(xpath="//table[@id='tblplayerlists']/tbody/tr[2]/td[14]") //updated player delete button located
	WebElement playerPriyadeleteButton;

	@FindBy(xpath="//p[text()='Successfully Deleted']")// Successfully deleted alert text locater
	WebElement successfullyDeletedAlertText;

	public void clickOnProcessElement() // method to click process menu
	{
		gl.clickElement(process);
	}

	public void clickOnPlayerRegistration() // method to click player registration
	{

		gl.clickElement(playerRegistration);

	}
	public void iframe()// method to switch to iframe
	{
		driver.switchTo().frame(iframe);
	}

	public void clickOnFirstName() // method to click on first name field
	{

		gl.clickElement(firstName);
	}

	public void enterFirstName(String name) // method to enter first name
	{
		gl.typeText(firstName, name);
	}

	public void enterLastName(String name) // method to enter last name
	{
		gl.typeText(lastName, name);
	}
// method to click on gender drop down
	public void clickOnGenderDropDown()
	{
		gl.clickElement(genderDropDown);
	}

	public void enterGender(String value)
	{
		gl.typeText(genderDropDownTextField, value);
	}

	public void clickEnterOnGenderDropDown()
	{
		gl.clikEnterkeys(genderDropDownTextField);
	}

	// method to click date of birth date picker
	public void clickOnDateOfBirth()
	{
		gl.clickElement(dateOfBirthDatePicker);
	}

	// method to enter date of birth
	public void enterDateOfBirthdate(String date)
	{
		gl.javascriptExecutorForDatePicker(driver, dateOfBirthDatePicker,date );
	}

	// method to enter father name
	public void enterFatherName(String name)
	{
		gl.typeText(fatherName, name);
	}

	// method to enter mother name
	public void enterMotherName(String name)
	{
		gl.typeText(motherName, name);
	}

	// method to scroll window up to status drop down
	public void scrollToStatusDropDown()
	{
		gl.javaScriptEecutorForSrolling(driver, statusDropDown);
	}

	// method to click on status drop down
	public void clickOnStatusDropDown() 
	{
		gl.clickElement(statusDropDown);
	}
	// method to enter status
	public void enterStatus(String status)
	{
		gl.typeText(statusTextField, status);
	}
	// method to click enter keys 
	public void clickEnterOnStatus()
	{
		gl.clikEnterkeys(statusTextField);
	}

	// method to click on player image
	public void clickOnPlayerImage()
	{
		gl.clickElement(playerImage);
	}

	// method to upload player image
	public void uploadPlayerImage(String image) throws AWTException
	{
		gl.robortCalssForFileUploading(image);
	}

	// method click on personal tab

	public void clickOnPersonalTab()
	{
		gl.clickElement(personalTab);
	}

	// method to click blood group status drop down
	public void clickOnBloodGroupStatusDropDown()
	{
		gl.clickElement(bloodGroupDropDown);
	}

	// method to enter blood group
	public void enterbloodGroup(String blood)
	{
		gl.typeText(bloodGroupTextFieldDropDown, blood);
	}

	// method to click enter button
	public void clickEnterOnBloodGroup()
	{
		gl.clikEnterkeys(bloodGroupTextFieldDropDown);
	}
	// method to enter ttfi id 

	public void enterttfiId(String id)
	{
		gl.typeText(ttfiId, id);
	}
	// method to enter residence address

	public void enterResidenceAddress(String address)
	{
		gl.typeText(residenceAddress, address);
	}
	// method to enter contact number 1

	public void enterContactNumber1(String number)
	{
		gl.typeText(contactNumber1, number);
	}
	// method to enter contact number 2

	public void enterContactNumber2(String number)
	{
		gl.typeText(contactNUmber2, number);
	}

	// method to enter email id
	public void enterEmailId(String email)
	{
		gl.typeText(emailId, email);
	}

	// method to enter adhar number

	public void enterAdharNumber(String number)
	{
		gl.typeText(adharNumber, number);
	}
	// method to enter district from dropdown

	public void clickOnDistrictDropDown()
	{
		gl.clickElement(district);
	}

	// method to enter district
	public void enterDistrict(String dis)
	{
		gl.typeText(districtTextFieldDropDown, dis);
	}

	// method to click enter
	public void clickEnterOnDistrict()
	{
		gl.clikEnterkeys(districtTextFieldDropDown);
	}

	// method to enter place of birth

	public void enterPlaceOfBirth(String district) 
	{
		gl.typeText(placeOfBirth, district);
	}

	// method to select club from drop down

	public void clickOnClub1DopDown()
	{
		gl.clickElement(club1);
	}

	public void enterClub1(String club1)
	{
		gl.typeText(club1TextField, club1);
	}
	public void clickEnterOnClub1()
	{
		gl.clikEnterkeys(club1TextField);
	}

	public void clickOnClub2DropDown()
	{
		gl.clickElement(club2);
	}
	public void enterClub2(String club2)
	{
		gl.typeText(club2TextField, club2);
	}
	public void clickEnterOnClub2()
	{
		gl.clikEnterkeys(club2TextField);
	}

	// method to enter institution name

	public void enterInstitutionName(String name)
	{
		gl.typeText(institutionName, name);
	}	
	// method to enter institution address

	public void enterInstitutionAddress(String address)
	{
		gl.typeText(institutionAddress, address);
	}

	// method to enter course

	public void enterCourse(String cource)
	{
		gl.typeText(course, cource);
	}

	// method to enter passport number

	public void enterPassportNumber(String number)
	{
		gl.typeText(passportNumber, number);
	}
	// method to click on passport date of issue date picker icon

	public void clickOnPassportDateOfIssue()
	{
		gl.clickElement(passportDateOfIssue);
	}
	// method to enter passport date of issue
	public void enterPassportDateOfIssue(String date)
	{
		gl.javascriptExecutorForDatePicker(driver, passportDateOfIssue, date);
	}

	// method to click  passport date valid upto date picker icon

	public void clickOnPassportDataValidUpTo()
	{
		gl.clickElement(passportDateValiUpTo);
	}
	// method to enter passport valid up to
	public void enterPaasportDateValidUpto(String date)
	{
		gl.javascriptExecutorForDatePicker(driver, passportDateValiUpTo, date);
	}


	// method to enter place of birth

	public void enterPlaceOfIssue(String place)
	{
		gl.typeText(placeOfIssue, place);
	}
	// method to click on document tab

	public void clickOnDocumentTab()
	{
		gl.clickElement(documentsTab);
	}
	public void clickOnDocumentsTypeDropDown()
	{
		gl.clickElement(documentsTypeDropdown);
	}
	public void enterDocument(String doc)
	{
		gl.typeText(documentsTypeDropDownTextField, doc);
	}
	public void clickEntertoDocumentsType()
	{
		gl.clikEnterkeys(documentsTypeDropDownTextField);
	}

	// method to click on file upload 

	public void clickOnFileUpload()
	{
		gl.clickElement(fileUpload);
	}
	// method to upload documents

	public void uploadFile(String file) throws Exception
	{
		gl.robortCalssForFileUploading(file);
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
	// method to click on offline button

	public void clickOnOfflineButton()
	{
		gl.clickElement(offlineButton);
	}

	// method to switch model pop up
	public void switchToAlertPopUp()
	{
		gl.switchToAlertPopup(driver);
	}
	// method to click on popup ok button
	public void clickOnAlertPopUp()
	{
		gl.javaScriptExecutorForClick(driver, alertOkButton);
	}

	public void waitsForPlayerImage()
	{
		ew.waitVisibilityOfElementLocated(driver, playerImage);
	}

	public boolean isDisplayedSuccessfullyRegister()
	{
		return gl.isDisplayedMethod(successfullyRegister);
	}
	public void clickOnPlayerListButton()
	{
		gl.clickElement(playerListButton);
	}

	public void enterPlayerNameInSearchField(String name)
	{
		gl.typeText(playerNameSearchField, name);
	}


	public void clickEnterKey()
	{
		gl.clikEnterkeys(playerNameSearchField);
	}

	public void ClickOnEditButton()
	{
		gl.clickElement(editButton);
	}
	public void threadSleepWait() throws InterruptedException
	{
		gl.threadSleepWait();
	}
	public void waitsForFrame()
	{
		ew.waitVisibilityOfElementLocated(driver, iframe);
	}
	// method to clear first name
	public void clearFirstName()
	{
		gl.clearFields(firstName);
	}
	public void clearLastName()
	{
		gl.clearFields(lastName);
	}

	public void clearFatherName()
	{
		gl.clearFields(fatherName);
	}
	public void clearMotherName()
	{
		gl.clearFields(motherName);
	}

	public void clearResidenceAddress()
	{
		gl.clearFields(residenceAddress);
	}
	public void clearContactsNo1()
	{
		gl.clearFields(contactNumber1);
	}
	public void clearContactsNo2()
	{
		gl.clearFields(contactNUmber2);
	}
	public void clearEmailId()
	{
		gl.clearFields(emailId);
	}
	public void clearAdharNumber()
	{
		gl.clearFields(adharNumber);
	}
	public void clearPlaceOfBirth()
	{
		gl.clearFields(placeOfBirth);
	}
	public void clearInstitutionName()
	{
		gl.clearFields(institutionName);
	}
	public void clearInstitutionAddress()
	{
		gl.clearFields(institutionAddress);
	}
	public void clearCourse()
	{
		gl.clearFields(course);
	}
	public void clearPassportNumber()
	{
		gl.clearFields(passportNumber);
	}
	public void clearPlaceOfIssue()
	{
		gl.clearFields(placeOfIssue);
	}
	public void deleteDocument()
	{
		gl.clickElement(documentsDeleteButton);
	}
	public void clickOnDocumentDeleteYesButton()
	{
		gl.clickElement(documentDeleteYesButton);
	}
	public void deletePlayerUpdatedPlayer()
	{
		gl.clickElement(playerPriyadeleteButton);
	}

	public boolean issucessfullyUpdatedText()
	{
		return gl.isDisplayedMethod(successfullyUpdated);
	}

	//method to check successfully deleted alert displayed or not
	public boolean isDisplayedsuccessfullyDeletedalertText()
	{
		return gl.isDisplayedMethod(successfullyDeletedAlertText);
	}
}









