package stateSecretaryExecutePageClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.PlayerRegistrationPage;
import stateSecretaryLogin.StateSecretaryLoginPage;
import utility.ExcelWriteClass;
import utility.ExplicitWait;
import utility.ScreenShotClass;

public class PlayerRegistrationExecuteTestClass  extends BaseClas{

	StateSecretaryLoginPage ssl;
	PlayerRegistrationPage prp; // initializing player registration page
	ExcelWriteClass ewc =new ExcelWriteClass();
	ScreenShotClass sh;
	
	@BeforeClass

	public void login() throws InterruptedException, IOException
	{
		setUp();
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		Thread.sleep(2000);
		ssl.enterUserName(ssl.readData(4, 4));
		ssl.enterPassword(ssl.readData(4, 5));
		ssl.clickOnLoginButton();
		prp = new PlayerRegistrationPage(driver);

		prp.clickOnProcessElement(); // click on process menu
		prp.clickOnPlayerRegistration();// click on player registration
		//		prp.waitsForFrame();// waits for i frame
		//		prp.iframe();// calling iframe method
		//		prp.threadSleepWait(); 
	}

	@Test(priority = 1)
	public void verifyWhetherTheSecretaryCanRegisterNewPlayerOrNot() throws Exception {

		//		ssl = new StateSecretaryLoginPage(driver);
		//		ssl.clickOnSecretaryLogin();
		//		Thread.sleep(2000);
		//		ssl.enterUserName(ssl.readData(4, 4));
		//		ssl.enterPassword(ssl.readData(4, 5));
		//		ssl.clickOnLoginButton();

		//		prp = new PlayerRegistrationPage(driver);
		//		prp.clickOnProcessElement(); // click on process menu
		//		prp.clickOnPlayerRegistration();// click on player registration
		prp.waitsForFrame();// waits for i frame
		prp.iframe();// calling iframe method
		prp.threadSleepWait(); // waits 
		prp.enterFirstName(ssl.readData(54, 5)); // enter first name from excel
		prp.enterLastName(ssl.readData(55, 5));//enter last Name
		prp.clickOnGenderDropDown();// click on gender drop down
		prp.enterGender(ssl.readData(56, 5));// to enter gender
		prp.clickEnterOnGenderDropDown();// click enter key
		prp.clickOnDateOfBirth();//click on date of birth date
		prp.enterDateOfBirthdate(ssl.readData(57, 5));// read date of birth from excel sheet
		prp.enterFatherName(ssl.readData(58, 5));// method to enter father name
		prp.enterMotherName(ssl.readData(59, 5));// method to enter mother name
		prp.scrollToStatusDropDown();// method to scroll the window 
		prp.clickOnStatusDropDown();// click on status drop down
		prp.enterStatus(ssl.readData(60, 5)); // enter status
		prp.clickEnterOnStatus();// click on enter key
		prp.clickOnPlayerImage();// click on player image
		prp.threadSleepWait();// waits
		prp.uploadPlayerImage(ssl.readData(61, 5));// method to upload player image
		prp.clickOnPersonalTab();// method to click on personal tab
		prp.clickOnBloodGroupStatusDropDown();// click on blood status DropDown
		prp.enterbloodGroup(ssl.readData(63, 5));//enter blood group
		prp.clickEnterOnBloodGroup();// click on enter key
		prp.enterttfiId(ssl.readData(64, 5));// method to enter ttfi id
		prp.enterResidenceAddress(ssl.readData(65, 5));// method to enter address
		prp.enterContactNumber1(ssl.readIntegerData(66, 5));// method to enter contact number
		prp.enterContactNumber2(ssl.readIntegerData(67, 5));// method to enter 2 contact number
		prp.enterEmailId(ssl.readData(68, 5));// method to enter email id
		prp.enterAdharNumber(ssl.readData(69, 5));// method to enter aadhaar number
		prp.clickOnDistrictDropDown();// click on district drop down
		prp.enterDistrict(ssl.readData(70, 5));// enter district
		prp.clickEnterOnDistrict();// click on enter key
		prp.enterPlaceOfBirth(ssl.readData(71, 5));// method to enter place of birth
		prp.clickOnClub1DopDown();// click on club1 dropdown
		prp.enterClub1(ssl.readData(72, 5));// enter club1
		prp.clickEnterOnClub1();// Click on enter key
		prp.clickOnClub2DropDown();//click on club2 dropdown
		prp.enterClub2(ssl.readData(73, 5));// enter club 2
		prp.clickEnterOnClub2();// click on enter key
		prp.enterInstitutionName(ssl.readData(74, 5));// method to enter institution name
		prp.enterInstitutionAddress(ssl.readData(75, 5));// method to enter institution address
		prp.enterCourse(ssl.readData(76, 5));// method to enter course
		prp.enterPassportNumber(ssl.readData(77, 5));// method to enter passport number
		prp.clickOnPassportDateOfIssue();// method to click on  passport issue  date picker icon 
		prp.enterPassportDateOfIssue(ssl.readData(78, 5));//method to read passport Date of issue
		prp.clickOnPassportDataValidUpTo();// method to click on passport valid up to date picker icon
		prp.enterPaasportDateValidUpto(ssl.readData(79, 5));// method to read passport date of valid up to
		prp.enterPlaceOfIssue(ssl.readData(80, 5));// method to enter place of birth 
		prp.clickOnDocumentTab(); // method to click on documents tab
		prp.clickOnDocumentsTypeDropDown();// click on documents type drop down
		prp.enterDocument(ssl.readData(81, 5));//select document
		prp.clickEntertoDocumentsType();// click enter key
		prp.clickOnFileUpload();// method to click file upload icon
		prp.threadSleepWait();// waits
		prp.uploadFile(ssl.readData(83, 5));// method to upload documents
		prp.clickOnUpload();// method to click on upload file
		prp.clickOnSaveButton();// method to click on save button
		prp.clickOnOfflineButton();// method to click on offline button
		prp.switchToAlertPopUp(); // method to switch to alert pop up
		// store successfully registered text to alert variable
		boolean alert = prp.isDisplayedSuccessfullyRegister();
		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 53, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 53, 7));
		}
		// to check test case pass or fail using assertion 
		Assert.assertTrue(alert);
		prp.clickOnAlertPopUp();// click ok button
	}
	@Test(priority = 2)
	public void verifyWhetherTheSecretaryCanEditSavedPlayer() throws Exception
	{
		//		ssl = new StateSecretaryLoginPage(driver);
		//		ssl.clickOnSecretaryLogin();
		//		Thread.sleep(2000);
		//		ssl.enterUserName(ssl.readData(4, 4));
		//		ssl.enterPassword(ssl.readData(4, 5));
		//		ssl.clickOnLoginButton();

		//		prp = new PlayerRegistrationPage(driver);
		//		prp.clickOnProcessElement(); // click on process menu
		//		prp.clickOnPlayerRegistration();// click on player registration
		prp.threadSleepWait();//wait
		prp.iframe();// calling iframe method
		prp.clickOnPlayerListButton();// click on Player List Icon
		prp.enterPlayerNameInSearchField(ssl.readData(54, 5)); // enter palyer name into search field
		prp.clickEnterKey();// click enter key
		prp.threadSleepWait();//waits
		prp.ClickOnEditButton();// click on edit button
		prp.clearFirstName();// clear first name
		prp.enterFirstName(ssl.readData(85, 5)); // enter first name from excel
		prp.clearLastName();// clear last name
		prp.enterLastName(ssl.readData(86, 5));//enter last Name
		prp.clearFatherName();// clear father name
		prp.enterFatherName(ssl.readData(87, 5));// method to enter father name
		prp.clearMotherName();// clear mother name
		prp.enterMotherName(ssl.readData(88, 5));// method to enter mother name
		prp.clickOnPlayerImage();// click on player image
		prp.threadSleepWait();// waits
		prp.uploadPlayerImage(ssl.readData(89, 5));// method to upload player image
		prp.clickOnPersonalTab();// method to click on personal tab
		prp.clearResidenceAddress();// clear residence address
		prp.enterResidenceAddress(ssl.readData(91, 5));// method to enter address
		prp.clearContactsNo1();// clear contacts number 1
		prp.enterContactNumber1(ssl.readIntegerData(92, 5));// method to enter contact number
		prp.clearContactsNo2();// clear contact number 2
		prp.enterContactNumber2(ssl.readIntegerData(93, 5));// method to enter 2 contact number
		prp.clearEmailId();// clear email id
		prp.enterEmailId(ssl.readData(94, 5));// method to enter email id
		prp.clearAdharNumber();// clear adhar number
		prp.enterAdharNumber(ssl.readData(95, 5));// method to enter adhar number
		prp.clearPlaceOfBirth();// clear place of birth
		prp.enterPlaceOfBirth(ssl.readData(96, 5));// method to enter place of birth
		prp.clearInstitutionName();// clear institution name
		prp.enterInstitutionName(ssl.readData(97, 5));// method to enter institution name
		prp.clearInstitutionAddress();// Clear institution address
		prp.enterInstitutionAddress(ssl.readData(98, 5));// method to enter institution address
		prp.clearCourse();// clear course field
		prp.enterCourse(ssl.readData(99, 5));// method to enter course
		prp.clearPassportNumber();// clear passport number field
		prp.enterPassportNumber(ssl.readData(100, 5));// method to enter passport number
		prp.clearPlaceOfIssue();// clear palce of issue field
		prp.enterPlaceOfIssue(ssl.readData(101, 5));// method to enter place of birth 
		prp.clickOnDocumentTab(); // method to click on documents tab
		prp.deleteDocument();// click on document delete button
		prp.threadSleepWait();//waits
		prp.switchToAlertPopUp();// switch to delete pop up alert
		prp.clickOnDocumentDeleteYesButton();// click yes button
		prp.switchToAlertPopUp();// switch to successfully deleted pop up
		prp.clickOnAlertPopUp();// click alert OK button
		prp.iframe();// switch to iframe
		prp.clickOnDocumentsTypeDropDown();// click on documents type drop down
		prp.enterDocument(ssl.readData(102, 5));// select documents
		prp.clickEntertoDocumentsType();// click enter
		prp.clickOnFileUpload();// method to click file upload icon
		prp.threadSleepWait();//waits
		prp.uploadFile(ssl.readData(104, 5));// method to upload documents
		prp.clickOnUpload();// method to click on upload file
		prp.clickOnSaveButton();// method to click on save button
		prp.switchToAlertPopUp(); // method to switch to alert pop up
		// to store successfully updated alert text into alert variable
		boolean alert = prp.issucessfullyUpdatedText();

		if(alert==true)
		{
			System.out.println(ewc.setCellData("Pass", 84, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 84, 7));
		}
		// to check test case pass or fail using assertion
		Assert.assertTrue(alert);


		prp.clickOnAlertPopUp();// click ok button
	}

	@Test(priority = 3)
	public void verifyWhetherTheSecretaryCanDeleteSavedPlayer() throws Exception
	{
		//		ssl = new StateSecretaryLoginPage(driver);
		//		ssl.clickOnSecretaryLogin();
		//		Thread.sleep(2000);
		//		ssl.enterUserName(ssl.readData(4, 4));
		//		ssl.enterPassword(ssl.readData(4, 5));
		//		ssl.clickOnLoginButton();

		//		prp = new PlayerRegistrationPage(driver);
		//		prp.clickOnProcessElement(); // click on process menu
		//		prp.clickOnPlayerRegistration();// click on player registration
		prp.threadSleepWait();//waits
		prp.iframe();// calling iframe method
		prp.clickOnPlayerListButton();// click on player list icon

		prp.enterPlayerNameInSearchField(ssl.readData(85, 5));// enter player name into search field
		prp.clickEnterKey();// click enter key
		prp.threadSleepWait();//waits
		prp.deletePlayerUpdatedPlayer();// to delete player
		prp.threadSleepWait();//waits
		prp.switchToAlertPopUp();// switch to delete alert pop up
		prp.clickOnDocumentDeleteYesButton();// click on   OK button  
		prp.switchToAlertPopUp();// switch to successfully deleted alert pop up

		// to store successfully deleted alert text in to alert variable
		boolean alert = prp.isDisplayedsuccessfullyDeletedalertText();

		if(alert==true)
		{
			System.out.println(ewc.setCellData("Pass", 105, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 105, 7));
		}
		// to check test case pass or fail using assertion
		Assert.assertTrue(alert);

		prp.clickOnAlertPopUp();// click OK alert pop up
		prp.clickOnLogOutButton();
	}


	@AfterClass
	public void afterMethod()

	{
		driver.close();
	}

}

