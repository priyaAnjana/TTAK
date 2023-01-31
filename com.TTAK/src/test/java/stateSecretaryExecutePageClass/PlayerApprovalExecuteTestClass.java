package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.PlayerApprovalPage;
import stateSecretaryLogin.StateSecretaryLoginPage;
import utility.ExcelWriteClass;

public class PlayerApprovalExecuteTestClass extends BaseClas {

	StateSecretaryLoginPage ssl;
	
	PlayerApprovalPage pap;
	
	ExcelWriteClass ewc =new ExcelWriteClass();

	@BeforeMethod
	
	public void beforeMethod() throws IOException
	{
		setUp();
	}
	
	

	@Test(priority = 1)
	public void verifyWithSelfRegisterdMoreInfo() throws Exception
	{

		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		pap = new PlayerApprovalPage(driver) ;
		pap.threadSleep();
		pap.clickOnManage();
		pap.clickOnPlayerApproval();
		pap.iframe();
		pap.enterPlayerNameInToSearchField(pap.readData(13, 5));
		pap.threadSleep();
		pap.clickOnMoreINfoButton();
		Thread.sleep(5000);
		boolean playerRegistrationText = pap.isDisplayedPlayerRegistration();
		System.out.println(playerRegistrationText);
		Assert.assertTrue(playerRegistrationText);

		if(playerRegistrationText==true)
		{
			System.out.println(ewc.setCellData("Pass", 51, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 51, 7));
		}
	}

	@Test(priority = 2)
	public void verifyWithSelfRegisterdPlayerApproval() throws Exception
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		pap = new PlayerApprovalPage(driver) ;
		pap.threadSleep();
		pap.clickOnManage();
		pap.clickOnPlayerApproval();
		pap.iframe();
		pap.enterPlayerNameInToSearchField(pap.readData(13, 5));
		pap.threadSleep();
		pap.clickOnCheckBox();
		pap.clickOnApproveButton();
		pap.switchToAlertPopUp();
		pap.threadSleep();
		pap.clickOnAlertYesButton();
		
		boolean successPopUp = pap.appovedSuccessFulPopUpMsg();
		Assert.assertTrue(successPopUp);
		
		if(successPopUp==true)
		{
			System.out.println(ewc.setCellData("Pass", 52, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 52, 7));
		}
		
		pap.clickOnPopUpOkButton();
		
	}

	@Test(priority = 3)
	public void verifyWithClubRegisterdPlayerApproval() throws Exception
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		pap = new PlayerApprovalPage(driver) ;
		pap.threadSleep();
		pap.clickOnManage();
		pap.clickOnPlayerApproval();
		pap.iframe();
		pap.enterPlayerNameInToSearchField(pap.readData(120, 5));
		pap.threadSleep();
		pap.clickOnCheckBox();
		pap.clickOnApproveButton();
		pap.switchToAlertPopUp();
		pap.threadSleep();
		pap.clickOnAlertYesButton();
		
		boolean successPopUp = pap.appovedSuccessFulPopUpMsg();
		Assert.assertTrue(successPopUp);
		
		if(successPopUp==true)
		{
			System.out.println(ewc.setCellData("Pass", 151, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 151, 7));
		}
		
		pap.clickOnPopUpOkButton();
		
	}
	
	@Test(priority = 4)
	public void verifyWithDistrictSecretaryRegisterdPlayerApproval() throws Exception
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		pap = new PlayerApprovalPage(driver) ;
		pap.threadSleep();
		pap.clickOnManage();
		pap.clickOnPlayerApproval();
		pap.iframe();
		pap.enterPlayerNameInToSearchField(pap.readData(154, 5));
		pap.threadSleep();
		pap.clickOnCheckBox();
		pap.clickOnApproveButton();
		pap.switchToAlertPopUp();
		pap.threadSleep();
		pap.clickOnAlertYesButton();
		
		boolean successPopUp = pap.appovedSuccessFulPopUpMsg();
		Assert.assertTrue(successPopUp);
		
		if(successPopUp==true)
		{
			System.out.println(ewc.setCellData("Pass", 184, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 184, 7));
		}
		
		pap.clickOnPopUpOkButton();
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
	
}
