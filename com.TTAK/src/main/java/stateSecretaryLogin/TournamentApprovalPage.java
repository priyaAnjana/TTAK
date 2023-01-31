package stateSecretaryLogin;

import java.io.IOException;
import java.util.List;

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
	
//	// handle dynamic approval Table
//	@FindBy(xpath = "//table[@id='tbltournamentapprovallist']//tbody//tr")
//	List<WebElement> totalRow;

	@FindBy(id = "gs_KSBAID")
	WebElement memberId;// locator of member id Search field;
	
	@FindBy(xpath = "(//input[@id='player_bai_code'])[2]")
	WebElement ttfiIdSearchField;// xpath of ttfid Search field;

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

	public void iframe()// method to switch to iframe
	{
		driver.switchTo().frame(iframe);
	}

	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}

	public void clickOnProcessElement() // method to click process menu
	{
		gl.clickElement(process);
	}

	public void clickOnTournamentApproval()
	{
		gl.clickElement(tournamentApproval);
	}
	
	
//	// methods to identify data from approval dynamic table
//	public void getRow()
//	{
//		for(WebElement ele:totalRow)
//		{
//			
//			String data = ele.getText();
//			System.out.println(data);
////			if(data.contains(element))
////			{
////				gl.clickElement(ele);
////				
////				break;
////			}
//		}		

		

	public void enterMemberId(String id)
	{
		gl.typeText(memberId, id);
	}
	
	public void enterttfiIdIntoSearchField(String id)
	{
		gl.typeText(ttfiIdSearchField, id);
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
