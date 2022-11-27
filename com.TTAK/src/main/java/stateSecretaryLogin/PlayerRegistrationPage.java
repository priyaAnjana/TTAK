package stateSecretaryLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	
	public PlayerRegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "(//span[@class='fa arrow'])[2]") // Process menu locator
	WebElement process;
	
	
	@FindBy(id="10001_sub_module_id") //Player registration menu locator
	WebElement playerRegistration;
	
	@FindBy(xpath = "//*[@id='txtfirstname']")// first name field locator
	WebElement firstName;
	
	
	public void clickOnProcessElement() // method to click process menu
	{
		gl.clickElement(process);
	}
	
	
	public void clickOnPlayerRegistration() // method to click player registration
	{
		gl.clickElement(playerRegistration);
	}
	
	public void clickOnFirstName() // method to click on first name field
	{
		gl.clickElement(firstName);
	}
	public void enterFirstName(String name) // method to enter first name
	{
		gl.typeText(firstName, name);
	}
	
	public void elementToBeClickable() // explicit wait to locate first name field
	{
		ew.waitElementToBEClickable(driver, firstName);
	}
	
}
