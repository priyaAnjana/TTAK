package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClas;

import districtSecretaryLogin.DistrictSecretaryLoginPage;
import stateSecretaryLogin.ClubMasterPage;
import stateSecretaryLogin.StateSecretaryLoginPage;
import utility.ExcelWriteClass;

public class ClubMasterExecuteTestClass extends BaseClas
{
	
	ExcelWriteClass ewc =new ExcelWriteClass();
	
	StateSecretaryLoginPage ssl;
	
	ClubMasterPage cmp;
	
	String userDir = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException
	{
		setUp();
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		cmp = new ClubMasterPage (driver);
		cmp.threadSleep();
		cmp.clickOnSetUp();
		cmp.clickOnClubMaster();
//		cmp.iframe();
		
	}
  @Test(priority = 1)
  public void verifyClubCreation() throws Exception 
  {
	  cmp.iframe();
//		cmp.waitElementToBeClickable();
	  cmp.threadSleep();
		cmp.clickOnTypeOfClubDropDown();
		cmp.enterTypeOfClub(cmp.readData(226, 5));
		cmp.clickEnterOnTypeOfClubDropDown();
		cmp.enterClubName(cmp.readData(227, 5));
		cmp.clickOnDistrictDropDown();
		cmp.enterDistrict(cmp.readData(228, 5));
		cmp.clickEnterOnDistrictDropDown();
		cmp.enterAuthorizedPerson(cmp.readData(229, 5));
		cmp.enterPhoneNumber(cmp.readData(230, 5));
		cmp.enterEmailId(cmp.readData(231, 5));
		cmp.enterAddress(cmp.readData(232,5));
		cmp.clickOnStatusDropDown();
		cmp.enterStatus(cmp.readData(233, 5));
		cmp.clickEnterOnStatusDropDwon();
		cmp.clickOnImage();
		cmp.threadSleep();
		cmp.uploadImage(userDir+cmp.readData(234, 5));
		cmp.clickOnDocumentsTab();
		cmp.clickOnFileUpload();
		cmp.threadSleep();
		cmp.uploadFile(userDir+cmp.readData(235, 5));
		cmp.clickOnUpload();
		cmp.clickOnSaveButton();
		cmp.switchToAlertPopUp();
		
		boolean successfulPopUp = cmp.isDisplayedSuccessfulPopUp();
		
		Assert.assertTrue(successfulPopUp);
		
		if(successfulPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 226, 7));
		}
		
		else
		{
			System.out.println(ewc.setCellData("Fail", 226, 7));
		}
		cmp.clickOnPoupOkButton();
		
  }
  
  @Test(priority = 2)
	public void verifyEditClubRegistration() throws Exception 

	{


		cmp.iframe();
		
		cmp.threadSleep();
		cmp.clickOnClubListButton();
		cmp.enterClubNameIntoSearchField(cmp.readData(227, 5));
		cmp.clickOnEditButton();
		cmp.clearClubName();
		cmp.enterClubName(cmp.readData(236, 5));
		cmp.clearPhNum();
		cmp.enterPhoneNumber(cmp.readData(237, 5));
		cmp.clickOnImage();
		cmp.threadSleep();
		cmp.uploadImage(userDir+cmp.readData(238, 5));
		cmp.clickOnDocumentsTab();
		cmp.clickOnDocumentDeleteButton();
		cmp.switchToAlertPopUp();
		cmp.threadSleep();
		cmp.clickDeletePopUpYesButton();
		cmp.clickOnDocDeletedSuccessfulPopUpOkButton();
		cmp.iframe();
		cmp.clickOnFileUpload();
		cmp.threadSleep();
		cmp.uploadFile(userDir+cmp.readData(239, 5));
		cmp.clickOnUpload();
		cmp.clickOnSaveButton();
		cmp.threadSleep();
		cmp.switchToAlertPopUp();
		
		boolean updatedSucessfulPopUp = cmp.isDisplayedSucessfullyUpdatedPopUp();
		Assert.assertTrue(updatedSucessfulPopUp);
		
		if(updatedSucessfulPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 236, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 236, 7));
		}
		
		cmp.clickOnPoupOkButton();
	}
  
  @Test(priority = 3)
	public void verifyDeleteClubRegistration() throws Exception 

	{
		cmp.iframe();
		cmp.threadSleep();
		cmp.clickOnClubListButton();
		cmp.enterClubNameIntoSearchField(cmp.readData(236, 5));	
		cmp.threadSleep();
		cmp.clickOnClubDeleteButton();		
	
		cmp.threadSleep();		
		cmp.clickDeletePopUpYesButton();
		cmp.switchToAlertPopUp();
		
		boolean successfullyDeletedPopUp = cmp.isDisplayedSuccessfullyDeletedPopUp();
		Assert.assertTrue(successfullyDeletedPopUp);
		
		if(successfullyDeletedPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 240, 7));
		}
		
		else
		{
			System.out.println(ewc.setCellData("Fail", 240, 7));
		}
		
		cmp.clickOnPoupOkButton();
	}
	@AfterClass
	public void afterClass()
	{
				driver.close();
	}
	
}

