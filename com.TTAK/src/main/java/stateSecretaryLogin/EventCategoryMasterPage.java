package stateSecretaryLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class EventCategoryMasterPage 

{

	WebDriver driver;

	GeneralUtilities gl= new GeneralUtilities();

	ExcelReadClass erc = new ExcelReadClass();

	ExplicitWait ew = new ExplicitWait();

	public EventCategoryMasterPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='fa arrow'])[5]")
	WebElement setUp;

	@FindBy(id = "10092_sub_module_id")
	WebElement eventCategoryMaster;

	@FindBy(xpath= "//iframe[@id='framecontent']")
	WebElement iframe;

	@FindBy(id = "chksingle")
	WebElement singleRadioButton;
	
	@FindBy(id = "chkdoubles")
	WebElement doublesRadioButton;
	
	@FindBy(id = "chkmixed")
	WebElement mixedDoubles;

	@FindBy(xpath = "//span[@id=\"select2-ddlgender-container\"]")
	WebElement gender;

	@FindBy(xpath = "//input[@class=\"select2-search__field\"]")
	WebElement genderTextField;

	@FindBy(xpath = "//span[@id=\"select2-ddleventtype-container\"]")
	WebElement eventType;

	@FindBy(xpath = "//input[@class=\"select2-search__field\"]")
	WebElement eventTypeTextField;

	@FindBy(id = "txtcategoryname")
	WebElement eventCategoryName;

	@FindBy(id = "txtsinglescode")
	WebElement eventCategorycode;

	@FindBy(id = "txtminage")
	WebElement minAge;

	@FindBy(id = "txtmaxage")
	WebElement maxAge;

	@FindBy(xpath = "//i[@class=\"fa fa-save\"]")
	WebElement saveButton;
	
	@FindBy(xpath = "//p[text()='Event category added successfully']")
	WebElement successPopUp;
	
	@FindBy(xpath = "//button[@class=\"confirm\"]")
	WebElement popupOkButton;
	
	
	
	
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

	public void clickOnEventCategoryMaster()
	{
		gl.clickElement(eventCategoryMaster);
	}

	public void iframe()// method to switch to iframe
	{
		driver.switchTo().frame(iframe);
	}

	public void clickOnSingleRadioButton()
	{
		gl.clickElement(singleRadioButton);
	}
	
	public void clickOnDoubleRadioButton()
	{
		gl.clickElement(doublesRadioButton);
	}
	
	public void clickOnMixedDoublesRadioButton()
	{
		gl.clickElement(mixedDoubles);
	}

	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();

	}

	public void clickOnGenderDropDown()
	{
		gl.clickElement(gender);
	}

	public void enterGenderInToTextField(String gender)
	{
		gl.typeText(genderTextField, gender);
	}

	public void clickEnterOnGenderDropDown()
	{
		gl.clickEnterkeys(genderTextField);
	}

	public void clickOnEventTypeDropDown()
	{
		gl.clickElement(eventType);
	}	
	
	public void enterEvent(String event)
	{
		gl.typeText(eventTypeTextField, event);
	}
	
	public void clickDownArrow()
	{
		gl.actionClassToClickDownArrow(driver, eventTypeTextField);
	}

	public void clickEnterOnEventTypeDropDown()
	{
		gl.clickEnterkeys(eventTypeTextField);
	}

	public void enterEventCategoryName(String name)
	{
		gl.typeText(eventCategoryName, name);
	}

	public void enterEvenetCategoryCode(String code)
	{
		gl.typeText(eventCategorycode, code);
	}

	public void enterMinimumAge(String age)
	{
		gl.typeText(minAge, age);
	}

	public void enterMaximumAge(String age)
	{
		gl.typeText(maxAge, age);
	}

	public void clickOnSaveButton()
	{
		gl.clickElement(saveButton);
	}
	
	public boolean isDisplayedSuccessPopUp()
	{
		return gl.isDisplayedMethod(successPopUp);
	}
	
	public void clickOnPopUpOkButton()
	{
		gl.clickElement(popupOkButton);
	}
	
	public void switchToPopUp()
	{
		gl.switchToAlertPopup(driver);
	}


}
