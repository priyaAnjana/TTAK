package clubLogin;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class TournamentEntryPage 
{
	WebDriver driver;

	GeneralUtilities gl= new GeneralUtilities();

	ExcelReadClass erc = new ExcelReadClass();

	ExplicitWait ew = new ExplicitWait();

	// to mention base class and page class driver are same
	public TournamentEntryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[@class='nav-label'])[2]") // Process menu locator
	WebElement process;
	
	@FindBy(xpath= "//iframe[@id='framecontent']")
	WebElement iframe;
	
	@FindBy(xpath = "//*[@id=\"10002_sub_module_id\"]")
	WebElement tournamentEntry;
	
	@FindBy(xpath ="//div[@id='state']")
	WebElement stateLevel;	

	@FindBy(xpath = "//div[@id='tournamentList']//a")
	List<WebElement> tournamentList;
	
	
	@FindBy(xpath = "//span[@id='select2-ddlgender-container']")
	WebElement gender;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement genderTextField;
	
	@FindBy(xpath = "//span[@id='select2-ddlplayercategory-container']")
	WebElement eventDropDown;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement eventTextField;
	
	@FindBy(xpath = "//input[@id='player_ref_code']")
	WebElement memberIdSearchField;
	
	@FindBy(xpath = "//*[@id=\"1\"]/td[1]")
	WebElement checkBox; // xpath of player selection check box 
	
	@FindBy(id ="btnSave")
	WebElement saveButton;
	
	@FindBy(xpath ="//p[text()='Tournament enrollment successfully completed']")
	WebElement enrollmentSucessPopup;
	
	@FindBy(xpath = "//button[@class=\"confirm\"]")
	WebElement alertOkButton;
	
	@FindBy(id = "chkdoubles")
	WebElement doublesRadioButton;
	
	@FindBy(xpath = "(//input[@id='player_ref_code'])[2]")
	WebElement memberIdSearchFieldOfDoublesSecondPlayer;
	
	@FindBy(xpath = "//td[text()='KL010606']")
	WebElement memberIDOfDheekshitha;
	
	@FindBy(id ="chkmixed")
	WebElement mixedDoubles;
	
	@FindBy(xpath = "//td[text()='KL010608']")
	WebElement memberIdOfRaginiPlayer;
	
	@FindBy(id = "btnBack")
	WebElement firstBackButton;
	
	@FindBy(xpath = "//div[@id='district']")
	WebElement districtLevel;
	
	@FindBy(xpath = "//div[@id='national']")
	WebElement nationalLevel;
	
	@FindBy(xpath = "//input[@id='player_bai_code']")
	WebElement ttfiIdSearchField;  // xpath of national level player list member id search field 
	
	@FindBy(xpath = "//td[text()='H7689']")
	WebElement dheekshithaTtfiId;// xpath of arpitha player ttfiid
	
	@FindBy(xpath ="(//input[@id='player_bai_code'])[2]")
	WebElement ttfiIdSearchFieldPartnerTable;// xpath of Partner Table ttfiid Search Field
	
	@FindBy(xpath = "//td[text()='M1056']")
	WebElement raginiTtfiId;// Xpath of anasooya ttfiid from partner table to select partner
	
	@FindBy(xpath = "(//input[@id='chkall'])[1]")
	WebElement outsideClubRadioButton; // xpath of out side club radio button to choose the partner
	
	@FindBy(xpath = "//td[text()='KL010651']")
	WebElement kamalaMemberId;// xpath of outside club player member id to select the player
	
	@FindBy(xpath ="//td[text()='KA127']")
	WebElement kamalattfiId;// xpath of outside club player ttfi id to select the player(national level)
	
	@FindBy(xpath = "//td[text()='KL010654']")
	WebElement mariyaMemberId; // xpath of mariya player member id to select out side club partner player
	
	@FindBy(xpath = "//td[text()='M428']")
	WebElement mariyaTtfiId;// xpath of mariya ttfi id for selecting out side club partner from national level
	
	@FindBy(xpath = "(//input[@id='chkall'])[2]")
	WebElement outSideKeralaRadioButton;
	
	@FindBy(id = "txtoutsidebai")
	WebElement partnerTtfiId;   // doubles outside kerala partner ttfi id text field xpath
	
	@FindBy(id = "txtoutsideplayername")// xpath of out side kerala partner name field
	WebElement partnerName;
	
	@FindBy(id = "ddlgenderoutkerala")
	WebElement partnerGender; // xpath of out side kerala partner gender
	
	@FindBy(id = "btnAdd")
	WebElement addPlayerButton; // xpath of partner table add palyer button
	
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
	
	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}
	
	public void clickOnProcessElement() // method to click process menu
	{
		gl.clickElement(process);
	}

	public void iframe()// method to switch to iframe
	{
		driver.switchTo().frame(iframe);
	}
	
	public void clickOnTournamentEntry()
	{
		gl.clickElement(tournamentEntry);
	}
	
	public void clickOnStateLevel()
	{
		gl.clickElement(stateLevel);
	}
	
	// To select tournament from tournament list
	
	public void clickOnTournament(String element)
	{
		for(WebElement ele:tournamentList)
		{
			
			String data = ele.getText();
//			System.out.println(data);
			if(data.contains(element))
			{
				gl.clickElement(ele);
				
				break;
			}
		}		

	}	

	
	public void clickOnGenderDropDown()
	{
		gl.clickElement(gender);
	}
	
	public void enterGender(String gender)
	{
		gl.typeText(genderTextField, gender);
	}
	
	public void clickEnterOnGender()
	{
		gl.clickEnterkeys(genderTextField);
	}
	
	public void clickOnEventDropDown()
	{
		gl.clickElement(eventDropDown);
	}
	
	public void enterEvent(String event)
	{
		gl.typeText(eventTextField, event);
	}
	
	public void clickEnterOnEvent()
	{
		gl.clickEnterkeys(eventTextField);
	}
	
	public void enterMemberIdIntoSearchField(String name)
	{
		gl.typeText(memberIdSearchField, name);
	}
	
	public void clickEnterOnMemberIdSearchField()
	{
		gl.clickEnterkeys(memberIdSearchField);
	}
	
	public void clickOnCheckBox()
	{
		gl.clickElement(checkBox);
	}
	
	public void clickOnSaveButton()
	{
		gl.clickElement(saveButton);
	}
	
	public void switchToPopup()
	{
		gl.switchToAlertPopup(driver);
	}
	
	public boolean isDispalyedEnrollmentSuccessPopUp()
	{
		return gl.isDisplayedMethod(enrollmentSucessPopup);
	}
	
	public void clickOnPopUpOkButton()
	{
		gl.clickElement(alertOkButton);
	}
	
	public void clickOnDoublesRadioButton()
	{
		gl.clickElement(doublesRadioButton);
	}
	
	public void enterMemberIdOfDoublesSecondPlayer(String element)
	{
		gl.typeText(memberIdSearchFieldOfDoublesSecondPlayer, element);
			
	}
	
	public void clickEnterOnMemberIdSearchFieldOfDoublesPlayer()
	{
		gl.clickEnterkeys(memberIdSearchFieldOfDoublesSecondPlayer);
	}
	
	public void clickOnDheekshithaMemberId()
	{
		gl.clickElement(memberIDOfDheekshitha);
	}
	
	public void clickOnmixedDoubles()
	{
		gl.clickElement(mixedDoubles);
	}
	
	public void clickOnRaginiPlayer()
	{
		gl.clickElement(memberIdOfRaginiPlayer);
	}
	
	public void clickOnFirstBackButton()
	{
		gl.clickElement(firstBackButton);
	}
	
	public void clickOnDistrictLevel()
	{
		gl.clickElement(districtLevel);
	}
	
	public void clickOnNationalLevel()
	{
		gl.clickElement(nationalLevel);
	}
	
	public void enterNationalLevelPlayerListttfiIdSearchField(String id)
	{
		gl.typeText(ttfiIdSearchField, id);
	}
	
	public void clickEnterOnTtfiIdSearchField()
	{
		gl.clickEnterkeys(ttfiIdSearchField);
	}
	// to select dheekshitha player from partner table
	public void clickOnDheekshithaTtfiId()
	{
		gl.clickElement(dheekshithaTtfiId);
	}
	
	public void enterTtfiIdIntoPartnerTableSearchField(String id)
	{
		gl.typeText(ttfiIdSearchFieldPartnerTable, id);
	}
	
	public void clickEnterOnTtfiIdPartnerTableSearchField()
	{
		gl.clickEnterkeys(ttfiIdSearchFieldPartnerTable);
	}
	
	public void clickOnRaginiTtfiIdFromPartnerTable()
	{
		gl.clickElement(raginiTtfiId);
	}
	// method to click on out side radio button to choose partner player from partner table. 
	public void clickOnOutSideClubRadioButton()
	{
		gl.clickElement(outsideClubRadioButton);
	}
	
	// method to click on kamala out side the club player from partner table 
	public void clickOnKamalaPlayerMemberId()
	{
		gl.clickElement(kamalaMemberId);
	}
	
	// method to click on kamala out side the club player from partner table (national level)
	public void clickOnKamalaTtfiId()
	{
		gl.clickElement(kamalattfiId);
	}
	
	// method to click on mariya player out side club  player from partner table
	
	public void clickOnMariyaPlayerMemberId()
	{
		gl.clickElement(mariyaMemberId);
	}
	
	// method to click on mariya player out side club  player from partner table(national level)
	
	public void clickOnMariyaTtfiId()
	{
		gl.clickElement(mariyaTtfiId);
	}
	
	public void clickOnOutSideKeralaRadioButton()
	{
		gl.clickElement(outSideKeralaRadioButton);
	}
	
	// method to enter out side kerala partner ttfi id
		public void enterOutSideKeralaPartnerTtfiId(String id)
		{
			gl.typeText(partnerTtfiId, id);
		}
		
		// method to enter out side kerala partner name
		public void enterPartnerName(String name)
		{
			gl.typeText(partnerName, name);
		}
		
		// method to select out side kerala gender
		
		public void selectOutsideKeralaPartnerGender(String gender)
		{
			gl.selectClassByVisibleText(partnerGender, gender);
		}
		
		// method to click on partner player  add player button
		public void clickOnAddPalyerButton()
		{
			gl.clickElement(addPlayerButton);
		}
	
	public void clickOnLogOutButton()
	{
		gl.clickElement(logOutButton);
	}
	

}
