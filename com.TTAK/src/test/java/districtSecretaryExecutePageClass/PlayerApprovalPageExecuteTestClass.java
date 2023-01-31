package districtSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import districtSecretaryLogin.DistrictSecretaryLoginPage;
import districtSecretaryLogin.PlayerApprovalPage;
import utility.ExcelWriteClass;

public class PlayerApprovalPageExecuteTestClass extends BaseClas

{
	ExcelWriteClass ewc =new ExcelWriteClass();

	DistrictSecretaryLoginPage dsl;

	PlayerApprovalPage pap;

	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		setUp();
	}



	// method to check district secretary can see player details when click on more info button
	@Test(priority = 1)
	public void verifywithMoreInfoButton() throws Exception 
	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton(); 

		pap = new PlayerApprovalPage(driver);
		pap.threadSleep();
		pap.clickOnManage();
		pap.clickOnPlayerApproval();
		pap.iframe();
		pap.threadSleep();
		pap.enterPlayerNameInToSearchField(pap.readData(13, 5));
		pap.clickOnMoreinfoButton();
		pap.threadSleep();

		boolean palyerRegistrationText = pap.isDisplayedPlayerRegistration();
		Assert.assertTrue(palyerRegistrationText);

		if(palyerRegistrationText)
		{
			System.out.println(ewc.setCellData("Pass", 48, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 48, 7)); 
		}
	}

	// method to check district secretary can approve self registered player
	@Test(priority = 2)
	public void verifywithSelfRegistredPlayerApproval() throws Exception 
	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton(); 

		pap = new PlayerApprovalPage(driver);
		pap.threadSleep();
		pap.clickOnManage();
		pap.clickOnPlayerApproval();
		pap.iframe();
		pap.threadSleep();
		pap.enterPlayerNameInToSearchField(pap.readData(13, 5));
		pap.clickOnCheckBox();
		pap.clickOnApproveButton();
		pap.switchToAlertPopUp();
		pap.threadSleep();
		pap.clickOnAlertYesButton();

		boolean sucessAlertMsg = pap.appovedSuccessFulPopUpMsg();
		Assert.assertTrue(sucessAlertMsg);

		if(sucessAlertMsg)
		{
			System.out.println(ewc.setCellData("Pass", 49, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 49, 7)); 
		}
	}

	@Test
	public void verifywithClubRegistredPlayerApproval() throws Exception 
	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton(); 

		pap = new PlayerApprovalPage(driver);
		pap.clickOnManage();
		pap.clickOnPlayerApproval();
		pap.iframe();
		pap.threadSleep();
		pap.enterPlayerNameInToSearchField(pap.readData(120, 5));
		pap.clickOnCheckBox();
		pap.clickOnApproveButton();
		pap.switchToAlertPopUp();
		pap.threadSleep();
		pap.clickOnAlertYesButton();

		boolean sucessAlertMsg = pap.appovedSuccessFulPopUpMsg();
		Assert.assertTrue(sucessAlertMsg);

		if(sucessAlertMsg)
		{
			System.out.println(ewc.setCellData("Pass", 149, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 149, 7)); 
		}

		pap.clickOnPopUpOkButton();

	}

	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
}
