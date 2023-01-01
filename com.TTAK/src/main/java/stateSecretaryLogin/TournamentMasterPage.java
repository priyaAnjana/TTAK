package stateSecretaryLogin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class TournamentMasterPage {
	
WebDriver driver;
	
	GeneralUtilities gl= new GeneralUtilities();
	
	ExcelReadClass erc = new ExcelReadClass();
	
	ExplicitWait ew = new ExplicitWait();

	public TournamentMasterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//span[@class='fa arrow'])[5]")
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
	
	@FindBy(xpath = "(//span[@class='select2-selection__arrow'])[3]")
	WebElement district;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement districtTextField;
	
	@FindBy(id = "txtvenue")
	WebElement venue;
	
	@FindBy(id = "txtstartdate")
	WebElement tournamentStartPeriod;
	
	
	
	
	
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
	
	public void clickOnDistrict()
	{
		gl.clickElement(district);
	}
	
	public void enterDistrict(String district)
	{
		gl.typeText(districtTextField, district);
	}
	
	public void clickEnterOnDistrictTextField()
	{
		gl.clickEnterkeys(districtTextField);
	}
	
	public void enterVenueText(String venueText)
	{
		gl.typeText(venue, venueText);
	}
	
	public void clickOnTournamentsStartPeriod()
	{
		gl.clickElement(tournamentStartPeriod);
	}
	
	public void enterTournamentstartPeriod(String date)
	{
		gl.javascriptExecutorForDatePicker(driver, tournamentStartPeriod, date);
		
	}
	
//	public void clickEnterKeyOnTournamentStartPeriodDatePicker()
//	{
//		gl.clickEnterkeys(tournamentStartPeriod);
//	}
	
}
