package clubExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import clubLogin.ClubLoginPage;
import clubLogin.PlayerApprovalPage;
import utility.ExcelWriteClass;

public class PlayerApprovalPageExecuteTestClass extends BaseClas {

	ExcelWriteClass ewc =new ExcelWriteClass();
	ClubLoginPage clp;
	PlayerApprovalPage  pal;
	
	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		setUp();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

	@Test(priority =1)
	public void verifyWithClickOnMoreInfoButton() throws Exception 
	{
		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		pal = new PlayerApprovalPage(driver); 
		pal.threadSleep();
		pal.clickOnManage();
		pal.clickOnPlayerApproval();
		pal.iframe();
		pal.enterPlayerNameInToSearchField(clp.readData(13, 5));
		pal.clickOnMoreinfoButton();
		pal.threadSleep();
		boolean playerRegistrationText = pal.isDisplayedPlayerRegistration();
		Assert.assertTrue(playerRegistrationText);
		
		if(playerRegistrationText)
		{
			System.out.println(ewc.setCellData("Pass", 45, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 45, 7));
		}
	}
	
	@Test(priority =2)
	public void verifyWithSelfRegisteredPlayerApproval() throws Exception 
	{
		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		Thread.sleep(5000);
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		pal = new PlayerApprovalPage(driver); 
		pal.threadSleep();
		pal.clickOnManage();
		pal.clickOnPlayerApproval();
		pal.iframe();
//		pal.threadSleep();
		pal.enterPlayerNameInToSearchField(clp.readData(13, 5));
		pal.clickOnCheckBox();
		pal.clickOnApproveButton();
		pal.switchToAlertPopUp();
		pal.threadSleep();
		pal.clickOnAlertYesButton();
		boolean alertPopup = pal.appovedSuccessFulPopUpMsg();
		
		

		Assert.assertTrue(alertPopup);
		
		if(alertPopup)
		{
			System.out.println(ewc.setCellData("Pass", 46, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 46, 7));
		}
		pal.clickOnPopUpOkButton();
	}
}


