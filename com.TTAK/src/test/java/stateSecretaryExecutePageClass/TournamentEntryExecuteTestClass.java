package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.PlayerRegistrationPage;
import stateSecretaryLogin.StateSecretaryLoginPage;
import stateSecretaryLogin.TournamentEntryPage;
import utility.ExcelWriteClass;

public class TournamentEntryExecuteTestClass extends BaseClas

{
	StateSecretaryLoginPage ssl;
	TournamentEntryPage tep;
	ExcelWriteClass ewc =new ExcelWriteClass();


	@BeforeClass

	//login
	public void login() throws InterruptedException, IOException
	{
		setUp();

		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4));
		ssl.enterPassword(ssl.readData(4, 5));
		ssl.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnProcessElement(); // click on process menu
		tep.clickOnTournamentEntry();



	}

	//State Level
	// To check whether the state secretary can enroll a player in the singles  state level tournaments or not

	@Test(priority = 1)


	public void toVerifyStateLevelTournamentsSinglesEnrolment() throws Exception 
	{
		tep.iframe();
		tep.clickOnStateLevel();
		tep.clickOnTournament(tep.readData(265, 5));
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(315, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(316, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(317, 5));
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 315, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 315, 7));
		}

		tep.clickOnPopUpOkButton();	


	}

	//State Level
	// To check whether the state secretary can enroll a player in the doubles  state level tournaments or not

	@Test(priority =2)

	public void toVerifyStateLevelTournamentsDoublesEnrolment() throws Exception 
	{




		tep.iframe();
		//				tep.clickOnStateLevel();
		//				tep.clickOnTournament(tep.readData(265, 5));
		tep.threadSleep();
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(318, 5));
		tep.clickEnterOnGender();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(319, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(320, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(321, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnArpithaMemberId();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 318, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 318, 7));
		}

		tep.clickOnPopUpOkButton();		

	}

	//State Level
	// To check whether the state secretary can enroll a player in the Mixed doubles  state level tournaments or not

	@Test(priority =3)
	public void toVerifyStateLevelTournamentsMixedDoublesEnrolment() throws Exception 
	{


		tep.iframe();
		//				tep.clickOnStateLevel();
		//				tep.clickOnTournament(tep.readData(265, 5));
		tep.threadSleep();
		tep.clickOnmixedDoubles();			
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(322, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(323, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(324, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnanasooyaPlayer();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 322, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 322, 7));
		}

		tep.clickOnPopUpOkButton();	


	}

	//District Level
	// To check whether the state secretary can enroll a player in the singles District level tournaments or not

	@Test(priority = 4)
	public void toVerifyDistrictLevelTournamentsSinglesEnrolment() throws Exception 
	{

		tep.iframe();
		tep.clickOnFirstBackButton();
		tep.threadSleep();
		tep.clickOnFirstBackButton();
		tep.threadSleep();			
		tep.clickOnDistrictLevel();
		tep.clickOnTournament(tep.readData(282, 5));
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(326, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(327, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(328, 5));
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 326, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 326, 7));
		}

		tep.clickOnPopUpOkButton();		

	}


	//District Level
	// To check whether the state secretary can enroll a player in the doubles  district level tournaments or not

	@Test(priority =5)

	public void toVerifyDistrictLevelTournamentsDoublesEnrolment() throws Exception 
	{




		tep.iframe();
		//					tep.clickOnDistrictLevel();
		//					tep.clickOnTournament(tep.readData(282, 5));
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(329, 5));
		tep.clickEnterOnGender();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(330, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(331, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(332, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnArpithaMemberId();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 329, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 329, 7));
		}

		tep.clickOnPopUpOkButton();		

	}

	//District Level
	// To check whether the state secretary can enroll a player in the Mixed doubles  district level tournaments or not

	@Test(priority =6)

	public void toVerifyDistrictLevelTournamentsMixedDoublesEnrolment() throws Exception 
	{

		tep.iframe();
		//							tep.clickOnDistrictLevel();
		//							tep.clickOnTournament(tep.readData(282, 5));
		tep.clickOnmixedDoubles();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(333, 5));
		tep.clickEnterOnEvent();
		//					tep.threadSleep();
		tep.enterMemberIdIntoSearchField(tep.readData(334, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(335, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnanasooyaPlayer();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 333, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 333, 7));
		}

		tep.clickOnPopUpOkButton();		

	}


	//National Level
	// To check whether the state secretary can enroll a player in the singles National level tournaments or not

	@Test(priority = 7)
	public void toVerifyNationalLevelTournamentsSinglesEnrolment() throws Exception 
	{

		tep.iframe();
		tep.clickOnFirstBackButton();
		tep.threadSleep();
		tep.clickOnFirstBackButton();
		tep.threadSleep();					
		tep.clickOnNationalLevel();
		tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(337, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(338, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(339, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 337, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 337, 7));
		}

		tep.clickOnPopUpOkButton();		

	}

	//National Level
	// To check whether the state secretary can enroll a player in the Doubles National level tournaments or not and Partner from Kerala

	@Test(priority = 8)
	public void toVerifyNationalLevelTournamentsDoublesEnrolment() throws Exception 
	{

		tep.iframe();

//		tep.clickOnNationalLevel();
//		tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(340, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(341, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(342, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterTtfiIdIntoPartnerTableSearchField(tep.readData(343, 5));// selecting partner from table
		tep.clickEnterOnTtfiIdPartnerTableSearchField();
		tep.threadSleep();
		tep.clickOnarpithaTtfiId();
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 340, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 340, 7));
		}

		tep.clickOnPopUpOkButton();		

	}

	//National Level
	// To check whether the state secretary can enroll a player in the Doubles National level tournaments or not and partner outside kerala

	@Test(priority = 9)
	public void toVerifyNationalLevelTournamentsDoublesPartnerOutsideKeralaEnrolment() throws Exception 
	{

		tep.iframe();
		//		tep.clickOnNationalLevel();
		//		tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(344, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(345, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(346, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.threadSleep();
		tep.clickOnOutsideKeralaRadioButton();
		tep.enterOutSideKeralaPartnerTtfiId(tep.readData(347, 5));
		tep.enterPartnerName(tep.readData(348, 5));
		tep.selectOutsideKeralaPartnerGender(tep.readData(349, 5));
		tep.clickOnAddPalyerButton();		
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 344, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 344, 7));
		}

		tep.clickOnPopUpOkButton();		

	}


	//National Level
	// To check whether the state secretary can enroll a player in the MixedDoubles National level tournaments or not

	@Test(priority = 10)
	public void toVerifyNationalLevelTournamentsMixedDoublesEnrolment() throws Exception 
	{

		tep.iframe();									
		//					tep.clickOnNationalLevel();
		//					tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnmixedDoubles();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(350, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(351, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterTtfiIdIntoPartnerTableSearchField(tep.readData(352, 5));// selecting partner from table			
		tep.clickEnterOnTtfiIdPartnerTableSearchField();
		tep.threadSleep();
		tep.clickOnAnasooyaTtfiIdFromPartnerTabe();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 350, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 350, 7));
		}

		tep.clickOnPopUpOkButton();	


	}

	//National Level
	// To check whether the state secretary can enroll a player in the MixedDoubles National level tournaments or not and partner from outside kerala

	@Test(priority = 11)
	public void toVerifyNationalLevelTournamentsMixedDoublesOutSideKeralaPartnerEnrolment() throws Exception 
	{

		tep.iframe();										
		//						tep.clickOnNationalLevel();
		//						tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnmixedDoubles();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(353, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(354, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.threadSleep();
		tep.clickOnOutsideKeralaRadioButton();
		tep.enterOutSideKeralaPartnerTtfiId(tep.readData(355, 5));
		tep.enterPartnerName(tep.readData(356, 5));			
		tep.selectOutsideKeralaPartnerGender(tep.readData(357, 5));
		tep.clickOnAddPalyerButton();
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 353, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 353, 7));
		}

		tep.clickOnPopUpOkButton();	
		tep.clickOnLogOutButton();
	}


	@AfterClass
	public void afterClass()

	{
		driver.close();
	}



}











