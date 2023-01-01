package districtSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import districtSecretaryLogin.ClubApprovalPage;
import districtSecretaryLogin.DistrictSecretaryLoginPage;
import utility.ExcelWriteClass;

public class ClubApprovalPageExecuteTestClass extends BaseClas
{
	ExcelWriteClass ewc =new ExcelWriteClass();
	DistrictSecretaryLoginPage dsl;
	ClubApprovalPage cap;

	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		setUp();
	}

	@Test
	public void verifyDistrictSecretaryCanApproveClubRegistration() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		cap=new ClubApprovalPage(driver);
		cap.clickOnManage();
		cap.clickOnClubApproval();
		cap.iframe();
		
		cap.clickOnCheckBox();
		cap.clickOnApproveButton();
		cap.threadSleep();
		cap.switchToAlertPopUp();
		cap.clickOnAlertYesButton();
		 boolean sucessfulPopUp = cap.appovedSuccessFulPopUpMsg();
		 Assert.assertTrue(sucessfulPopUp);
		 
		 if(sucessfulPopUp)
		 {
			 System.out.println(ewc.setCellData("Pass", 197, 7));
		 }
		 else
		 {
			 System.out.println(ewc.setCellData("Fail", 197, 7));
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
