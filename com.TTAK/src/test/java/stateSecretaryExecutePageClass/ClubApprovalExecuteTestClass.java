package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import districtSecretaryLogin.ClubApprovalPage;
import districtSecretaryLogin.DistrictSecretaryLoginPage;
import stateSecretaryLogin.StateSecretaryLoginPage;
import utility.ExcelWriteClass;

public class ClubApprovalExecuteTestClass extends BaseClas

{
	ExcelWriteClass ewc =new ExcelWriteClass();
	
	ClubApprovalPage cap;
	
	StateSecretaryLoginPage ssl;

	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		setUp();
	}

	@Test(priority = 1)
	public void verifySelfRegisteredClubApproval() throws Exception 
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();
		
		

		cap=new ClubApprovalPage(driver);
		cap.threadSleep();
		cap.clickOnManage();
		cap.clickOnClubApproval();
		cap.iframe();
		cap.enterClubName(cap.readData(200, 5));
		cap.clickOnCheckBox();
		cap.clickOnApproveButton();
		cap.threadSleep();
		cap.switchToAlertPopUp();
		cap.clickOnAlertYesButton();
		 boolean sucessfulPopUp = cap.appovedSuccessFulPopUpMsg();
		 Assert.assertTrue(sucessfulPopUp);
		 
		 if(sucessfulPopUp)
		 {
			 System.out.println(ewc.setCellData("Pass", 209, 7));
		 }
		 else
		 {
			 System.out.println(ewc.setCellData("Fail", 209, 7));
		 }
		 
		 cap.clickOnPopUpOkButton();
		 cap.clickOnLogOutButton();
		}
	
	

	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
	}

