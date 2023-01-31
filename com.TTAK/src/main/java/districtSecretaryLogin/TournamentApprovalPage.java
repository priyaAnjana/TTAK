package districtSecretaryLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class TournamentApprovalPage 

{
	WebDriver driver;

	GeneralUtilities gl= new GeneralUtilities();

	ExcelReadClass erc = new ExcelReadClass();

	ExplicitWait ew = new ExplicitWait();

	// to mention base class and page class driver are same
	public TournamentApprovalPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//iframe[@id='framecontent']")
	WebElement iframe;
	
	
	@FindBy(xpath = "(//span[@class='fa arrow'])[2]") // Process menu locator
	WebElement process;
	
	@FindBy(id = "10104_sub_module_id")
	WebElement tournamentApproval;
	
	@FindBy(xpath = "//input[@id='gs_KSBAID']")
	WebElement memberIdSearchField;
	
	@FindBy(xpath = "//table[@id='tbltournamentapprovallist']//tbody//tr[2]//td[1]")
	WebElement checkBox;// xpath of tournament approval table check box 
	
	@FindBy(id = "btnSave")
	WebElement saveButton;
	
	@FindBy(xpath = "//button[@class='confirm']")
	WebElement yesButton;
	
	@FindBy(xpath = "//p[text()='Selected enrollments are successfully approved']")
	WebElement tournamentApproveSucessPopUp;
	
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
	
	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}
	
	public void iframe()// method to switch to iframe
	{
		driver.switchTo().frame(iframe);
	}

	public void clickOnProcessElement() // method to click process menu
	{
		gl.clickElement(process);
	}
	
	public void clickOnTournamentApproval()
	{
		gl.clickElement(tournamentApproval);
	}
	
	public void enterMemberIdIntoSearhField(String id)
	{
		gl.typeText(memberIdSearchField, id);
	}
	
	public void clickEnterOnMemberIdIntoSearhField()
	{
		gl.clickEnterkeys(memberIdSearchField);
	}
	// to click check box on tournament approval page to approve a player into tournament
	public void clickOnCheckBox()
	{
		gl.clickElement(checkBox);
	}
	
	public void clickOnSaveButton()
	{
		gl.clickElement(saveButton);
	}
	
	public void switchToAlertPopUp()
	{
		gl.switchToAlertPopup(driver);
	}
	
	public void clickOnAlertYesButton()
	{
		gl.clickElement(yesButton);
	}
	
	public boolean isDisplayTournamentApprovalSuccessPopUp()
	{
		return gl.isDisplayedMethod(tournamentApproveSucessPopUp);
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
