package districtSecretaryExecutePageClass;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import districtSecretaryLogin.ClubMasterPage;
import districtSecretaryLogin.DistrictSecretaryLoginPage;
import utility.ExcelWriteClass;

public class ClubMasterPageExecuteTestClass extends BaseClas 

{
	ExcelWriteClass ewc =new ExcelWriteClass();
	
	DistrictSecretaryLoginPage dsl;
	
	ClubMasterPage cmp;
	
	String userDir = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException
	{
		setUp();
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		cmp = new ClubMasterPage (driver);
		cmp.clickOnSetUp();
		cmp.clickOnClubMaster();
		cmp.threadSleep();

		
	}

	@Test(priority = 1)
	public void verifyClubRegistration() throws Exception 

	{

		cmp.iframe();
		//cmp.waitElementToBeClickable();
		cmp.threadSleep();
		cmp.clickOnTypeOfClubDropDown();
		cmp.enterTypeOfClub(cmp.readData(211, 5));
		cmp.clickEnterOnTypeOfClubDropDown();
		cmp.enterClubName(cmp.readData(212, 5));
		cmp.enterAuthorizedPerson(cmp.readData(213, 5));
		cmp.enterPhoneNumber(cmp.readData(214, 5));
		cmp.enterEmailId(cmp.readData(215, 5));
		cmp.enterAddress(cmp.readData(216,5));
		cmp.clickOnStatusDropDown();
		cmp.enterStatus(cmp.readData(217, 5));
		cmp.clickEnterOnStatusDropDwon();
		cmp.clickOnImage();
		cmp.threadSleep();
		cmp.uploadImage(userDir+cmp.readData(218, 5));
		cmp.clickOnDocumentsTab();
		cmp.clickOnFileUpload();
		cmp.threadSleep();
		cmp.uploadFile(userDir+cmp.readData(219, 5));
		cmp.clickOnUpload();
		cmp.clickOnSaveButton();
		cmp.switchToAlertPopUp();
		
		boolean successfulPopUp = cmp.isDisplayedSuccessfulPopUp();
		
		Assert.assertTrue(successfulPopUp);
		
		if(successfulPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 211, 7));
		}
		
		else
		{
			System.out.println(ewc.setCellData("Fail", 211, 7));
		}
		cmp.clickOnPoupOkButton();
		


	}
	
	@Test(priority = 2)
	public void verifyEditClubRegistration() throws Exception 

	{

		cmp.iframe();
		cmp.threadSleep();
		cmp.clickOnClubListButton();
		cmp.enterClubNameIntoSearchField(cmp.readData(212, 5));
		cmp.clickOnEditButton();
		cmp.clearClubName();
		cmp.enterClubName(cmp.readData(220, 5));
		cmp.clearPhNum();
		cmp.enterPhoneNumber(cmp.readData(221, 5));
		cmp.clickOnImage();
		cmp.threadSleep();
		cmp.uploadImage(userDir+cmp.readData(222, 5));
		cmp.clickOnDocumentsTab();
		cmp.clickOnDocumentDeleteButton();
		cmp.switchToAlertPopUp();
		cmp.threadSleep();
		cmp.clickDeletePopUpYesButton();
		cmp.clickOnDocDeletedSuccessfulPopUpOkButton();
		cmp.iframe();
		cmp.clickOnFileUpload();
		cmp.threadSleep();
		cmp.uploadFile(userDir+cmp.readData(219, 5));
		cmp.clickOnUpload();
		cmp.clickOnSaveButton();
		cmp.threadSleep();
		cmp.switchToAlertPopUp();
		
		boolean updatedSucessfulPopUp = cmp.isDisplayedSucessfullyUpdatedPopUp();
		Assert.assertTrue(updatedSucessfulPopUp);
		
		if(updatedSucessfulPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 220, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 220, 7));
		}
		
		cmp.clickOnPoupOkButton();
	}
	

	@Test(priority = 3)
	public void verifyDeleteClubRegistration() throws Exception 

	{
		cmp.iframe();
		cmp.threadSleep();
		cmp.clickOnClubListButton();
		cmp.enterClubNameIntoSearchField(cmp.readData(220, 5));	
		cmp.threadSleep();
		cmp.clickOnClubDeleteButton();		
		
		
		cmp.threadSleep();			
		cmp.clickOnClubDeletePopUpYesButton();
		cmp.switchToAlertPopUp();
		
		boolean successfullyDeletedPopUp = cmp.isDisplayedSuccessfullyDeletedPopUp();
		Assert.assertTrue(successfullyDeletedPopUp);
		
		if(successfullyDeletedPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 224, 7));
		}
		
		else
		{
			System.out.println(ewc.setCellData("Fail", 224, 7));
		}
		cmp.clickOnPoupOkButton();
	}
	
	@AfterClass
	public void afterClass()
	{
				driver.close();
	}
}
