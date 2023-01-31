package districtSecretaryLogin;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DatePicker;
import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class TournamentMasterPage 

{
	WebDriver driver;

	GeneralUtilities gl= new GeneralUtilities();

	ExcelReadClass erc = new ExcelReadClass();

	ExplicitWait ew = new ExplicitWait();
	DatePicker dp = new DatePicker();

	public TournamentMasterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "(//span[@Class='nav-label'])[4]")
	WebElement setUp;

	@FindBy(id = "10096_sub_module_id")
	WebElement tournamentsMaster;

	@FindBy(xpath= "//iframe[@id='framecontent']")
	WebElement iframe;

	@FindBy(id = "txttourname")
	WebElement tournamentName;

	@FindBy(xpath = "//span[@id='select2-ddltournamenttype-container']")
	WebElement tournamentType;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement tournamentTypeTextField;

	@FindBy(xpath = "(//span[@class='select2-selection__arrow'])[2]")
	WebElement level;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement levelTextField;

	@FindBy(id = "txtvenue")
	WebElement venue;	

	@FindBy(xpath = "//input[@id=\"txtstartdate\"]")
	WebElement tournamentStartPeriod;

	@FindBy(xpath = "(//th[@class='datepicker-switch'])[1]")
	WebElement currentMonthAndYear;

	@FindBy(xpath = "(//th[@class='prev'])[1]")
	WebElement prevButton;

	@FindBy(xpath = "(//th[@class='next'])[1]")
	WebElement nextButton;

	@FindBy(xpath = "//input[@id=\"txtenddate\"]")
	WebElement tournamentEndPeriod;

	@FindBy(xpath = "//input[@id=\"txtenrollenddate\"]")
	WebElement enrollmentLastDate;

	@FindBy(xpath = "//*[@id=\"txtenrollwithdrawenddate\"]")
	WebElement withdrawalLastDate;

	@FindBy(xpath = "//span[@id=\"select2-ddlorganisingdistrict-container\"]")
	WebElement organizingDistrict;

	@FindBy(xpath = "//input[@class=\"select2-search__field\"]")
	WebElement organizingDistrictTextField;

	@FindBy(xpath = "(//span[@class=\"select2-selection__arrow\"])[5]")
	WebElement organizingClubDropDown;

	@FindBy(xpath = "//input[@class=\"select2-search__field\"]")
	WebElement organizingClubDropDownTextField;

//	@FindBy(id = "txtWithoutRankCount")
//	WebElement maxEventPerPlayer;

	@FindBy(xpath = "//span[@class=\"btn btn-success fileinput-button\"]")
	WebElement fileUpload;

	@FindBy(xpath = "//i[@class=\"fa fan fa-upload\"]")
	WebElement fileUploadButton;
	
	@FindBy(xpath = "//button[@class='confirm']")
	WebElement popUpOkButton;

	@FindBy(xpath = "//*[@id=\"gs_CategoryName\"]")
	WebElement categoryNameSearchField;	

	@FindBy(xpath = "//table[@id=\"tbleventcategory\"]//tr[2]//td[1]")
	WebElement checkBox;
	
	@FindBy(xpath = "//table[@id='tbleventcategory']//tr[2]//td[6]")
	WebElement teamSize; 
	
	@FindBy(xpath = "//*[@id=\"1_Team Size\"]")
	WebElement teamSizeField;

	@FindBy(xpath = "//*[@id=\"btnSave\"]")
	WebElement saveButton;

	@FindBy(xpath = "//p[text()=\"Tournament details added successfully\"]")
	WebElement successPopUp;
	
	@FindBy(xpath = "(//span[@class='select2-selection__arrow'])[3]")
	WebElement district;
	
	@FindBy(xpath ="//input[@class='select2-search__field']")
	WebElement districtTextField;
	




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

	public void clickOnTournametMaster()
	{
		gl.clickElement(tournamentsMaster);
	}

	public void switchToIframe()
	{
		gl.iframeHandle(driver, iframe);
	}

	public void enterTournamentName(String name)
	{
		gl.typeText(tournamentName, name);
	}

	public void ClickOnTournamentType()
	{
		gl.clickElement(tournamentType);
	}

	public void enterTournamentsType(String text)
	{
		gl.typeText(tournamentTypeTextField, text);
	}

	public void clickEnterKeyontournamentTypeTextField()
	{
		gl.clickEnterkeys(tournamentTypeTextField);
	}

	public void clickOnLevel()
	{
		gl.clickElement(level);
	}

	public void enterLevelText(String text)
	{
		gl.typeText(levelTextField, text);
	}

	public void clickEnterKeyOnLevelText()
	{
		gl.clickEnterkeys(levelTextField);
	}

	public void enterVenueText(String venueText)
	{
		gl.typeText(venue, venueText);
	}
	
	// to click TournamentStart period
	public void clickOnTournamentsStartPeriod()
	{
		gl.clickElement(tournamentStartPeriod);
	}	

	public void selectTournamentStartPeriod(String targetDate) throws ParseException
	{
		dp.selectDate(driver,targetDate, "dd-MMM-yyyy", currentMonthAndYear, prevButton, nextButton);		

	}

	public void clickOnTournamentsEndPeriod()
	{
		gl.clickElement(tournamentEndPeriod);
	}

	public void selectTournamentEndPeriod(String targetDate) throws ParseException
	{
		dp.selectDate(driver,targetDate, "dd-MMM-yyyy", currentMonthAndYear, prevButton, nextButton);
	}

	public void clickOnEnrollmentLastDate()
	{
		gl.clickElement(enrollmentLastDate);
	}

	public void selectEnrollmentLastDate(String targetDate) throws ParseException
	{
		dp.selectDate(driver,targetDate, "dd-MMM-yyyy", currentMonthAndYear, prevButton, nextButton);
	}

	public void clickOnWithdrawalLastDate()
	{
		
		gl.clickElement(withdrawalLastDate);
	}

	public void selectWithdrawalLastDate(String targetDate) throws ParseException
	{
		dp.selectDate(driver,targetDate, "dd-MMM-yyyy", currentMonthAndYear, prevButton, nextButton);
	}	

	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}

	public void clickOnOrganizingDistrict()
	{
		gl.clickElement(organizingDistrict);
	}

	public void enterOrganizingDistrict(String district)
	{
		gl.typeText(organizingDistrictTextField, district);
	}

	public void clickEnterOnOrganizingDistrictTextField()
	{
		gl.clickEnterkeys(organizingDistrictTextField);
	}

	public void clickOnOrganizingClubDropDown()
	{
		gl.clickElement(organizingClubDropDown);
	}

	public void enterOrganizingClub(String club)
	{
		gl.typeText(organizingClubDropDownTextField, club);
	}

	public void clickEnterOnorganizingClubDropDownTextField()
	{
		gl.clickEnterkeys(organizingClubDropDownTextField);
	}

//	public void clickEsc()
//	{
//		gl.actionClassToClickEsc(driver);
//	}

//	public void enterMaximumEventPerPlayer(String num)
//	{
//		gl.typeText(maxEventPerPlayer, num);
//	}

	public void clickOnFileUpload()
	{
		gl.clickElement(fileUpload);
	}

	public void uploadFile(String path) throws AWTException
	{
		gl.robotCalssForFileUploading(path);
	}

	public void clickOnFileUploadButton()
	{
		gl.clickElement(fileUploadButton);
	}

	public void switchToAlertPopUp()
	{
		gl.switchToAlertPopup(driver);
	}

	public void clickOnPopupOkButton()
	{
		gl.clickElement(popUpOkButton);
	}

	public void scrollIntoCategoryName()
	{
		gl.javaScriptEecutorForSrolling(driver, categoryNameSearchField);
	}

	public void enterCategoryNameInToSearhField(String name)
	{
		gl.typeText(categoryNameSearchField, name);
	}
	
	public void clickOnTeamSize()
	{
		gl.clickElement(teamSize);
	}
	
	public void enterTeamSize(String size)
	{
		gl.typeText(teamSizeField, size);
	}
	
	public void clickEnterOnTeamSizeField()
	{
		gl.clickEnterkeys(teamSizeField);
	}
	
	public void clearCategoryNameInToSearhField()
	{
		gl.clearFields(categoryNameSearchField);
	}

	public void clickOnCheckBox()
	{
		gl.clickElement(checkBox);
	}

	public void scrollToSaveButton()
	{
		gl.javaScriptEecutorForSrolling(driver, saveButton);
	}	

	public void waitVisibilityOfElement()
	{
		ew.waitVisibilityOfElementLocated(driver, saveButton);
	}

	public boolean isEnableSaveButton()
	{
		return gl.isEnabledMethod(saveButton);

	}

	public void clickOnSaveButton()
	{

		gl.clickEnterkeys(saveButton);

	}

	public boolean isDisplayedSuccessPopUp()
	{
		return gl.isDisplayedMethod(successPopUp);
	}
	
	public void clickOnDistrictDropDown()
	{
		gl.clickElement(district);
	}
	
	public void enterDistrit(String Dis)
	{
		gl.typeText(districtTextField, Dis);
	}
	
	public void clickEnterKeyOnDistrictDropDown()
	{
		gl.clickEnterkeys(districtTextField);
	}
	

}
