package stateSecretaryLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class TournamentTypeMasterPage

{
	WebDriver driver;

	GeneralUtilities gl= new GeneralUtilities();

	ExcelReadClass erc = new ExcelReadClass();

	ExplicitWait ew = new ExplicitWait();

	public TournamentTypeMasterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[@class='fa arrow'])[5]")
	WebElement setUp;
	
	@FindBy(id = "10099_sub_module_id")
	WebElement tournamentTypeMaster;
	
	@FindBy(xpath= "//iframe[@id='framecontent']")
	WebElement iframe;
	
	@FindBy(id = "txttournamenttypename")
	WebElement tournamentTypeName;
	
	@FindBy(xpath = "//i[@class=\"fa fa-save\"]")
	WebElement saveButton;
	
	@FindBy(xpath = "//p[text()=\"Tournament Type inserted successfully\"]")
	WebElement successPopUp;
	
	@FindBy(xpath = "//button[@class=\"confirm\"]")
	WebElement popupOkButton;
	
	@FindBy(xpath = "//*[@id=\"btnTourList\"]")
	WebElement tournamentTypeList;
	
	@FindBy(id = "gs_TournamentTypeName")
	WebElement tournamentsTypeNameTextField;
	
	@FindBy(xpath = "(//*[@id=\"1\"]/i)[1]")
	WebElement editButton;
	
	@FindBy(xpath = "//p[text()=\"Tournament type updated succesfully\"]")
	WebElement updatedSuccessPopUp;
	
	@FindBy(xpath = "(//*[@id=\"1\"]/i)[2]")
	WebElement deleteButton;
	
	@FindBy(xpath = "//button[@class=\"confirm\"]")
	WebElement deletePopUpYesButton;
	
	@FindBy(xpath = "//p[text()=\"Successfully Deleted\"]")
	WebElement deletedPopUp;
	
	
	
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
	
	public void clickOnTournamentTypeMaster()
	{
		gl.clickElement(tournamentTypeMaster);
	}
	
	public void iframe()// method to switch to iframe
	{
		driver.switchTo().frame(iframe);
	}
	
	public void enterTournametTypeName(String name)
	{
		gl.typeText(tournamentTypeName, name);
	}
	
	public void clickOnSaveButton()
	{
		gl.clickElement(saveButton);
	}
	
	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}
	
	public boolean isDisplayedSuccessPopUp()
	{
		return gl.isDisplayedMethod(successPopUp);
	}
	
	public void switchToPopUp()
	{
		gl.switchToAlertPopup(driver);
	}
	
	public void clickOnPopUpOkButton()
	{
		gl.clickElement(popupOkButton);
	}
	
	public void clickOnTournamentTypeList()
	{
		gl.clickElement(tournamentTypeList);
	}
	
	public void enterTournamentTypeIntoField(String name)
	{
		gl.typeText(tournamentsTypeNameTextField, name);
	}
	
	public void clickOnEditButton()
	{
		gl.clickElement(editButton);
	}
	
	public void clearTournamentTypeName()
	{
		gl.clearFields(tournamentTypeName);
	}
	
	public boolean isDisplayUpdatedSuccessPopUp()
	{
		return gl.isDisplayedMethod(updatedSuccessPopUp);
	}
	
	public void clickOnDeleteButton()
	{
		gl.clickElement(deleteButton);
	}
	
	public void clickOnDeletepopUpYesButton()
	{
		gl.clickElement(deletePopUpYesButton);
	}
	
	public boolean isDisplayedDeletedPopUp()
	{
		return gl.isDisplayedMethod(deletedPopUp);
	}
}
