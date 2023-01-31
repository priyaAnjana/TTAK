package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.PlayerRegistrationPage;
import stateSecretaryLogin.StateSecretaryLoginPage;
import stateSecretaryLogin.TournamentTypeMasterPage;
import utility.ExcelWriteClass;

public class TournamentTypeMasterExecuteTestClass extends BaseClas 

{
	StateSecretaryLoginPage ssl;
	ExcelWriteClass ewc =new ExcelWriteClass();
	TournamentTypeMasterPage ttp;

	@BeforeClass
// login
	public void login() throws InterruptedException, IOException
	{
		setUp();
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4));
		ssl.enterPassword(ssl.readData(4, 5));
		ssl.clickOnLoginButton();
		ttp = new TournamentTypeMasterPage(driver);
		ttp.threadSleep();
		ttp.clickOnSetUp();
		ttp.clickOnTournamentTypeMaster();
	}
	// To verify State Secretary Can Create Tournament Type
	@Test(priority = 1)
	public void verifyStateSecretaryCanCreateTournamentType() throws Exception 
	{
		ttp.iframe();
		ttp.enterTournametTypeName(ttp.readData(242,5));
		ttp.threadSleep();
		ttp.clickOnSaveButton();
		ttp.threadSleep();
		ttp.switchToPopUp();
		boolean successPopUp = ttp.isDisplayedSuccessPopUp();
		Assert.assertTrue(successPopUp);

		if(successPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 242, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 242, 7));
		}
		ttp.clickOnPopUpOkButton();
	}
	// To verify State Secretary Can Edit  Tournament Type
	@Test(priority = 2)
	public void verifyStateSecretaryCanEditTournamentTypeName() throws Exception 
	{
		ttp.iframe();
		ttp.threadSleep();
		ttp.clickOnTournamentTypeList();
		ttp.enterTournamentTypeIntoField(ttp.readData(242,5));
		ttp.threadSleep();
		ttp.clickOnEditButton();

		ttp.clearTournamentTypeName();
		ttp.enterTournametTypeName(ttp.readData(243, 5));
		ttp.threadSleep();
		ttp.clickOnSaveButton();
		ttp.threadSleep();
		ttp.switchToPopUp();
		boolean updateSuccessPopUp = ttp.isDisplayUpdatedSuccessPopUp();
		Assert.assertTrue(updateSuccessPopUp);

		if(updateSuccessPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 243, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 243, 7));
		}
		ttp.clickOnPopUpOkButton();
	}
	// To verify State Secretary Can Delete Tournament Type
	@Test(priority = 3)
	public void verifyStateSecretaryCanDeleteTournamentTypeName() throws Exception 
	{
		ttp.iframe();
		ttp.threadSleep();
		ttp.clickOnTournamentTypeList();
		ttp.enterTournamentTypeIntoField(ttp.readData(243,5));
		ttp.threadSleep();
		ttp.clickOnDeleteButton();
		ttp.threadSleep();
		ttp.clickOnDeletepopUpYesButton();
		ttp.threadSleep();
		ttp.switchToPopUp();
		boolean deletedPopUp = ttp.isDisplayedDeletedPopUp();
		Assert.assertTrue(deletedPopUp);

		if(deletedPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 244, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 244, 7));
		}

		ttp.clickOnPopUpOkButton();
	}
	@AfterClass

	public void afterClass()
	{
		driver.close();
	}

}


