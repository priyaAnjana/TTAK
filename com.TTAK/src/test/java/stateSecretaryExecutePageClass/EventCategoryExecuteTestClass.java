package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.EventCategoryMasterPage;
import stateSecretaryLogin.StateSecretaryLoginPage;
import utility.ExcelWriteClass;

public class EventCategoryExecuteTestClass extends BaseClas

{
	ExcelWriteClass ewc =new ExcelWriteClass();
	
	StateSecretaryLoginPage ssl;
	
	EventCategoryMasterPage ecmp;
	
	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		setUp();
	}
  @Test(priority = 1)
  public void verifyStateSecretaryCanCreateSinglesEvent() throws Exception 
  {
	  ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();
		
		ecmp = new EventCategoryMasterPage(driver);
		ecmp.clickOnSetUp();
		ecmp.clickOnEventCategoryMaster();
		ecmp.iframe();
		ecmp.threadSleep();		
		ecmp.clickOnSingleRadioButton();
		ecmp.clickOnGenderDropDown();
		ecmp.enterGenderInToTextField(ecmp.readData(246, 5));
		ecmp.clickEnterOnGenderDropDown();
		ecmp.clickOnEventTypeDropDown();
		ecmp.enterEvent(ecmp.readData(247, 5));
		ecmp.clickDownArrow();
		ecmp.clickEnterOnEventTypeDropDown();
		ecmp.enterEventCategoryName(ecmp.readData(248, 5));
		ecmp.enterEvenetCategoryCode(ecmp.readData(249, 5));
		ecmp.enterMinimumAge(ecmp.readData(250, 5));
		ecmp.enterMaximumAge(ecmp.readData(251, 5));
		ecmp.clickOnSaveButton();
		ecmp.threadSleep();
		ecmp.switchToPopUp();
		boolean successPopUp = ecmp.isDisplayedSuccessPopUp();
		Assert.assertTrue(successPopUp);
		
		if(successPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 246, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 246, 7));
		}
		
		ecmp.clickOnPopUpOkButton();
		
	  
  }
  
  @Test(priority = 2)
  public void verifyStateSecretaryCanCreateDoublesEvent() throws Exception 
  {
	  ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();
		
		ecmp = new EventCategoryMasterPage(driver);
		ecmp.threadSleep();
		ecmp.clickOnSetUp();
		ecmp.clickOnEventCategoryMaster();
		ecmp.iframe();
		ecmp.threadSleep();		
		ecmp.clickOnDoubleRadioButton();
		ecmp.clickOnGenderDropDown();
		ecmp.enterGenderInToTextField(ecmp.readData(252, 5));
		ecmp.clickEnterOnGenderDropDown();
		ecmp.clickOnEventTypeDropDown();
		ecmp.enterEvent(ecmp.readData(253, 5));
		ecmp.clickDownArrow();
		ecmp.clickEnterOnEventTypeDropDown();
		ecmp.enterEventCategoryName(ecmp.readData(254, 5));
		ecmp.enterEvenetCategoryCode(ecmp.readData(255, 5));
		ecmp.enterMinimumAge(ecmp.readData(256, 5));
		ecmp.enterMaximumAge(ecmp.readData(257, 5));
		ecmp.clickOnSaveButton();
		ecmp.threadSleep();
		ecmp.switchToPopUp();
		boolean successPopUp = ecmp.isDisplayedSuccessPopUp();
		Assert.assertTrue(successPopUp);
		
		if(successPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 252, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 252, 7));
		}
		
		ecmp.clickOnPopUpOkButton();
		
	  
  }
  
  @Test(priority = 3)
  public void verifyStateSecretaryCanCreateMixedDoublesEvent() throws Exception 
  {
	  ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();
		
		ecmp = new EventCategoryMasterPage(driver);
		ecmp.threadSleep();
		ecmp.clickOnSetUp();
		ecmp.clickOnEventCategoryMaster();
		ecmp.iframe();
		ecmp.threadSleep();		
		ecmp.clickOnMixedDoublesRadioButton();
		

		
		ecmp.clickOnEventTypeDropDown();
		ecmp.enterEvent(ecmp.readData(259, 5));
		ecmp.clickDownArrow();
		ecmp.clickEnterOnEventTypeDropDown();
		ecmp.enterEventCategoryName(ecmp.readData(260, 5));
		ecmp.enterEvenetCategoryCode(ecmp.readData(261, 5));
		ecmp.enterMinimumAge(ecmp.readData(262, 5));
		ecmp.enterMaximumAge(ecmp.readData(263, 5));
		ecmp.clickOnSaveButton();
		ecmp.threadSleep();
		ecmp.switchToPopUp();
		boolean successPopUp = ecmp.isDisplayedSuccessPopUp();
		Assert.assertTrue(successPopUp);
		
		if(successPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 258, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 258, 7));
		}
		
		ecmp.clickOnPopUpOkButton();
		
	  
  }
  
  @AfterMethod
	public void afterMethod()
	{
				driver.close();
	}
}
