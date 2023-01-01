package clubExecutePageClass;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import clubLogin.ClubLoginPage;
import clubLogin.PlayerRegistrationPage;
import utility.ExcelWriteClass;

public class PlayerRegistrationPageExecuteTestClass extends BaseClas {
	ExcelWriteClass ewc =new ExcelWriteClass();
	ClubLoginPage clp;
	PlayerRegistrationPage prp;
	
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
	
	@Test
	public void verifyClubCanDoPlayerRegistrationOrNot() throws Exception {

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();

		prp = new PlayerRegistrationPage(driver);

		prp.threadSleepWait();
		prp.iframe();
		prp.enterFirstName(prp.readData(120, 5));
		prp.enterLastName(prp.readData(121, 5));
		prp.clickOnGenderDropDown();
		prp.enterGender(prp.readData(122, 5));
		prp.clickEnterOnGenderDropDown();
		prp.clickOnDateOfBirth();
		prp.enterDateOfBirthdate(prp.readData(123, 5));
		prp.enterFatherName(prp.readData(124, 5));
		prp.enterMotherName(prp.readData(125, 5));
		prp.clickOnPlayerImage();
		prp.threadSleepWait();
		prp.uploadPlayerImage(prp.readData(126, 5));
		prp.clickOnPersonalTab();
		prp.clickOnBloodGroupStatusDropDown();
		prp.enterbloodGroup(prp.readData(128, 5));
		prp.clickEnterOnBloodGroup();
		prp.enterttfiId(prp.readIntegerData(129, 5));
		prp.enterResidenceAddress(prp.readData(130, 5));
		prp.enterContactNumber1(prp.readIntegerData(131, 5));
		prp.enterContactNumber2(prp.readIntegerData(132, 5));
		prp.enterEmailId(prp.readData(133, 5));
		prp.enterAdharNumber(prp.readData(134, 5));
		prp.enterPlaceOfBirth(prp.readData(135, 5));
		prp.clickOnClub2DropDown();
		prp.enterClub2(prp.readData(136, 5));
		prp.clickEnterOnClub2();
		prp.enterInstitutionName(prp.readData(137, 5));
		prp.enterInstitutionAddress(prp.readData(138, 5));
		prp.enterCourse(prp.readData(139, 5));
		prp.enterPassportNumber(prp.readData(140, 5));
		prp.clickOnPassportDateOfIssue();
		prp.enterPassportDateOfIssue(prp.readData(141, 5));
		prp.clickOnPassportDataValidUpTo();
		prp.enterPaasportDateValidUpto(prp.readData(142, 5));
		prp.enterPlaceOfIssue(prp.readData(143, 5));
		prp.clickOnDocumentTab();
		prp.clickOnDocumentsTypeDropDown();// click on documents type drop down
		prp.enterDocument(prp.readData(144, 5));//select document
		prp.clickEntertoDocumentsType();// click enter key
		prp.clickOnFileUpload();// method to click file upload icon
		prp.threadSleepWait();// waits
		prp.uploadFile(prp.readData(146, 5));// method to upload documents
		prp.clickOnUpload();// method to click on upload file
		prp.clickOnSaveButton();// method to click on save button
		prp.switchToPayMentGateWay();
		prp.enterPhnumberForPayment(prp.readIntegerData(147, 5));
		prp.clickOnProceedButton();
		prp.threadSleepWait();
		prp.clickOnNetBankingPayMent();
		prp.clickOnSbiBank();
		prp.threadSleepWait();
		prp.clickOnPayNowButton();
		prp.multipleWindoHandlingForPayment();
		boolean succcessPoup = prp.isDisplayedsuccessPopUp();
		Assert.assertTrue(succcessPoup);
		
		if(succcessPoup)
		{
			System.out.println(ewc.setCellData("Pass", 119, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 119, 7));	
		}
		prp.clickOnPoupOkButton();
}
	
}

