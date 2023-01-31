package districtSecretaryExecutePageClass;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import districtSecretaryLogin.DistrictSecretaryLoginPage;
import districtSecretaryLogin.PlayerRegistrationPage;
import utility.ExcelWriteClass;

public class PlayerRegistrationExecuteTestClass extends BaseClas

{
	ExcelWriteClass ewc =new ExcelWriteClass();
	
	DistrictSecretaryLoginPage dsl;
	
	PlayerRegistrationPage prp;
	
	String userDir = System.getProperty("user.dir");
	
	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		setUp();
	}
	
	
	
  @Test
  public void verifyWithPlayerRegistration() throws Exception 
  {
	  dsl = new DistrictSecretaryLoginPage(driver);
	  dsl.clickOnSecretaryLogin();
	  dsl.threadSleepWait();
	  dsl.enterUserName(dsl.readData(108, 4));
	  dsl.enterPassword(dsl.readData(108, 5));
	  dsl.clickOnLoginButton(); 
	  
	  prp = new PlayerRegistrationPage(driver);
	  prp.threadSleep();
	  prp.clickOnProcessElement(); // click on process menu
		prp.clickOnPlayerRegistration();// click on player registration
		
		prp.iframe();// calling iframe method
		prp.threadSleep(); // waits 
		prp.enterFirstName(prp.readData(154, 5)); // enter first name from excel
		prp.enterLastName(prp.readData(155, 5));//enter last Name
		prp.clickOnGenderDropDown();// click on gender drop down
		prp.enterGender(prp.readData(156, 5));// to enter gender
		prp.clickEnterOnGenderDropDown();// click enter key
		prp.clickOnDateOfBirth();//click on date of birth date
		prp.enterDateOfBirthdate(prp.readData(157, 5));// read date of birth from excel sheet
		prp.enterFatherName(prp.readData(158, 5));// method to enter father name
		prp.enterMotherName(prp.readData(159, 5));
		prp.clickOnPlayerImage();// click on player image
		prp.threadSleep();// waits
		prp.uploadPlayerImage(userDir+prp.readData(160, 5));// method to upload player image
		prp.clickOnPersonalTab();// method to click on personal tab
		prp.clickOnBloodGroupStatusDropDown();// click on blood status DropDown
		prp.enterbloodGroup(prp.readData(162, 5));//enter blood group
		prp.clickEnterOnBloodGroup();// click on enter key
		prp.enterttfiId(prp.readData(163, 5));// method to enter ttfi id
		prp.enterResidenceAddress(prp.readData(164, 5));// method to enter address
		prp.enterContactNumber1(prp.readData(165, 5));// method to enter contact number
		prp.enterContactNumber2(prp.readData(166, 5));// method to enter 2 contact number
		prp.enterEmailId(prp.readData(167, 5));// method to enter email id
		prp.enterAdharNumber(prp.readData(168, 5));// method to enter aadhaar number
		
		prp.enterPlaceOfBirth(prp.readData(169, 5));// method to enter place of birth
		prp.clickOnClub1DopDown();// click on club1 dropdown
		prp.enterClub1(prp.readData(170, 5));// enter club1
		prp.clickEnterOnClub1();// Click on enter key
		prp.clickOnClub2DropDown();//click on club2 dropdown
		prp.enterClub2(prp.readData(171, 5));// enter club 2
		prp.clickEnterOnClub2();// click on enter key
		prp.enterInstitutionName(prp.readData(172, 5));// method to enter institution name
		prp.enterInstitutionAddress(prp.readData(173, 5));// method to enter institution address
		prp.enterCourse(prp.readData(174, 5));// method to enter course
		prp.enterPassportNumber(prp.readData(175, 5));// method to enter passport number
		
		prp.clickOnPassportDateOfIssue();// method to click on  passport issue  date picker icon 
//		prp.threadSleep();
		prp.enterPassportDateOfIssue(prp.readData(176, 5));//method to read passport Date of issue
//		prp.threadSleep();
		prp.clickOnPassportDataValidUpTo();// method to click on passport valid up to date picker icon
		prp.threadSleep();
		prp.enterPaasportDateValidUpto(prp.readData(177, 5));// method to read passport date of valid up to
		prp.enterPlaceOfIssue(prp.readData(178, 5));// method to enter place of passport issue 
		prp.clickOnDocumentTab(); // method to click on documents tab
		prp.clickOnDocumentsTypeDropDown();// click on documents type drop down
		prp.enterDocument(prp.readData(179, 5));//select document
		prp.clickEntertoDocumentsType();// click enter key
		prp.clickOnFileUpload();// method to click file upload icon
		prp.threadSleep();// waits
		prp.uploadFile(userDir+prp.readData(182, 5));// method to upload documents
		prp.clickOnUpload();// method to click on upload file
		prp.clickOnSaveButton();// method to click on save button
		prp.switchToPayMentGateWay();
		prp.enterPhnumberForPayment(prp.readIntegerData(180, 5));
		prp.clickOnProceedButton();
		prp.threadSleep();
		prp.clickOnNetBankingPayMent();
		prp.clickOnSbiBank();
		prp.threadSleep();
		prp.clickOnPayNowButton();
		prp.multipleWindoHandlingForPayment();
		prp.switchToAlertPopUp();
		
		boolean successPopUp = prp.isDisplayedSuccessPopUp();
		
		Assert.assertTrue(successPopUp);
		
		if(successPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 153, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 153, 7));
		}
		
		prp.clickOnPoupOkButton();
  }
  
  
  @AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
}
