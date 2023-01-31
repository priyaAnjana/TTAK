package clubExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import clubLogin.ClubLoginPage;
import clubLogin.TournamentEntryPage;
import utility.ExcelWriteClass;

public class TournamentEntryPageExecuteTestClass extends BaseClas

{
	ExcelWriteClass ewc =new ExcelWriteClass();

	ClubLoginPage clp;

	TournamentEntryPage tep;

	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException
	{
		setUp();
	}

	//State Level
	// To check whether the  Club  can enroll a player in the singles  state level tournaments or not

	@Test(priority = 1)
	public void toVerifyClubCanDoStateLevelSinglesTournamentsEnrolment () throws Exception 
	{
		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();

		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.iframe();
		tep.clickOnStateLevel();
		tep.clickOnTournament(tep.readData(265, 5));
		tep.threadSleep();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(359, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(360, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(361, 5));
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
			System.out.println(ewc.setCellData("Pass", 359, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 359, 7));
		}

		tep.clickOnPopUpOkButton();	
		tep.clickOnLogOutButton();

	}

	//State Level
	// To check whether the Club can enroll a player(partner within the club) in the doubles  state level tournaments or not

	@Test(priority =2)

	public void toVerifyClubCanDoStateLevelDoublesTournamentsPartnerWithinTheClubEnrolment() throws Exception 
	{

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.iframe();
		tep.clickOnStateLevel();
		tep.clickOnTournament(tep.readData(265, 5));
		tep.threadSleep();
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(365, 5));
		tep.clickEnterOnGender();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(366, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(367, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(368, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnDheekshithaMemberId();
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 365, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 365, 7));
		}

		tep.clickOnPopUpOkButton();	
		tep.clickOnLogOutButton();

	}

	//State Level
	// To check whether the Club can enroll a player(partner outside the club) in the doubles  state level tournaments or not

	@Test(priority =3)

	public void toVerifyClubCanDoStateLevelDoublesPartnerOutsideClubTournamentsEnrolment() throws Exception 
	{

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.iframe();
		tep.clickOnStateLevel();
		tep.clickOnTournament(tep.readData(265, 5));
		tep.threadSleep();
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(372, 5));
		tep.clickEnterOnGender();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(373, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(374, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.threadSleep();
		tep.clickOnOutSideClubRadioButton();

		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(375, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnKamalaPlayerMemberId();
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 372, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 372, 7));
		}

		tep.clickOnPopUpOkButton();	
		tep.clickOnLogOutButton();
	}



	//State Level
	// To check whether the Club can enroll a player in the Mixed doubles(within the club)  state level tournaments or not

	@Test(priority =4)
	public void toVerifyStateLevelMixedDoublesWithinTheClubTournamentsEnrolment() throws Exception 
	{
		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();
		tep.clickOnStateLevel();
		tep.clickOnTournament(tep.readData(265, 5));
		tep.threadSleep();
		tep.clickOnmixedDoubles();			
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(380, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(381, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(382, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnRaginiPlayer();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 380, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 380, 7));
		}

		tep.clickOnPopUpOkButton();
		tep.clickOnLogOutButton();


	}


	//State Level
	// To check whether the Club can enroll a player in the Mixed doubles(outside the club)  state level tournaments or not

	@Test(priority =5)
	public void toVerifyOutSideClubStateLevelMixedDoublesOutsideClubEnrolment() throws Exception 
	{
		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();
		tep.clickOnStateLevel();
		tep.clickOnTournament(tep.readData(265, 5));
		tep.threadSleep();
		tep.clickOnmixedDoubles();			
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(386, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(387, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.threadSleep();
		tep.clickOnOutSideClubRadioButton();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(388, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnMariyaPlayerMemberId();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 386, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 386, 7));
		}

		tep.clickOnPopUpOkButton();
		tep.clickOnLogOutButton();


	}

	//District Level
	// To check whether the Club can enroll a player in the singles District level tournaments or not

	@Test(priority = 6)
	public void toVerifyClubCanDoDistrictLevelSinglesTournamentsEnrolment() throws Exception 
	{
		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();				
		tep.clickOnDistrictLevel();
		tep.clickOnTournament(tep.readData(282, 5));
		tep.threadSleep();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(392, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(393, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(394, 5));
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
			System.out.println(ewc.setCellData("Pass", 392, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 392, 7));
		}

		tep.clickOnPopUpOkButton();
		tep.clickOnLogOutButton();

	}


	//District Level
	// To check whether the Club can enroll a player in the doubles  district level tournaments or not(partner within the club)

	@Test(priority =7)

	public void toVerifyClubCanDoDistrictLevelDoublesTournamentsPartnerWithinTheClubEnrolment() throws Exception 
	{


		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();				
		tep.clickOnDistrictLevel();
		tep.clickOnTournament(tep.readData(282, 5));
		tep.threadSleep();
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(398, 5));
		tep.clickEnterOnGender();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(399, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(400, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(401, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnDheekshithaMemberId();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 398, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 398, 7));
		}

		tep.clickOnPopUpOkButton();	
		tep.clickOnLogOutButton();

	}

	//District Level
	// To check whether the Club can enroll a player in the doubles  district level tournaments or not(partner outside the club)

	@Test(priority =8)

	public void toVerifyClubCanDoDistrictLevelDoublesTournamentsPartnerOutSideTheClubEnrolment() throws Exception 
	{


		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();				
		tep.clickOnDistrictLevel();
		tep.clickOnTournament(tep.readData(282, 5));
		tep.threadSleep();
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(405, 5));
		tep.clickEnterOnGender();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(406, 5));
		tep.clickEnterOnEvent();
		tep.enterMemberIdIntoSearchField(tep.readData(407, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.threadSleep();
		tep.clickOnOutSideClubRadioButton();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(408, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnKamalaPlayerMemberId();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 398, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 398, 7));
		}

		tep.clickOnPopUpOkButton();	
		tep.clickOnLogOutButton();

	}

	//District Level
	// To check whether the Club can enroll a player in the Mixed doubles  district level tournaments or not(partner within the club)

	@Test(priority =9)

	public void toVerifyClubCanDoMixedDoublesDistrictLevelTournamentpartnerWithinTheClubEnrolment() throws Exception 
	{

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();				
		tep.clickOnDistrictLevel();
		tep.clickOnTournament(tep.readData(282, 5));
		tep.threadSleep();
		tep.clickOnmixedDoubles();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(412, 5));
		tep.clickEnterOnEvent();			
		tep.enterMemberIdIntoSearchField(tep.readData(413, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(414, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnRaginiPlayer();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 412, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 412, 7));
		}

		tep.clickOnPopUpOkButton();
		tep.clickOnLogOutButton();

	}
	//District Level
	// To check whether the Club can enroll a player in the Mixed doubles  district level tournaments or not(partner outside the club)

	@Test(priority =10)

	public void toVerifyClubCanDoMixedDoublesDistrictLevelTournamentpartnerWithinTheClubPartnerOutSideTheClubEnrolment() throws Exception 
	{

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();				
		tep.clickOnDistrictLevel();
		tep.clickOnTournament(tep.readData(282, 5));
		tep.threadSleep();
		tep.clickOnmixedDoubles();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(418, 5));
		tep.clickEnterOnEvent();			
		tep.enterMemberIdIntoSearchField(tep.readData(419, 5));// enter member id of doubles first player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.threadSleep();
		tep.clickOnOutSideClubRadioButton();
		tep.enterMemberIdOfDoublesSecondPlayer(tep.readData(420, 5));// enter member id of doubles Second Player to enroll  into tournament
		tep.clickEnterOnMemberIdSearchFieldOfDoublesPlayer();
		tep.threadSleep();
		tep.clickOnMariyaPlayerMemberId();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 418, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 418, 7));
		}

		tep.clickOnPopUpOkButton();
		tep.clickOnLogOutButton();

	}


	//National Level
	// To check whether the Club can enroll a player in the singles National level tournaments or not

	@Test(priority = 11)
	public void toVerifyClubCanDoNationalLevelSinglesTournamentEnrolment() throws Exception 
	{


		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();									
		tep.clickOnNationalLevel();
		tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(424, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(425, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(426, 5));
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
			System.out.println(ewc.setCellData("Pass", 428, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 428, 7));
		}

		tep.clickOnPopUpOkButton();	
		tep.clickOnLogOutButton();

	}

	//National Level
	// To check whether the Club  can enroll a player in the Doubles National level tournaments or not(Partner within the club)

	@Test(priority = 12)
	public void toVerifyClubCanDoNationalLevelDoublesTournamentsWithinTheClubEnrolment() throws Exception 
	{

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();									
		tep.clickOnNationalLevel();
		tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(430, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(431, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(432, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterTtfiIdIntoPartnerTableSearchField(tep.readData(433, 5));// selecting partner from table
		tep.clickEnterOnTtfiIdPartnerTableSearchField();
		tep.threadSleep();
		tep.clickOnDheekshithaTtfiId();
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 430, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 430, 7));
		}

		tep.clickOnPopUpOkButton();
		tep.clickOnLogOutButton();

	}

	//National Level
	// To check whether the Club  can enroll a player in the Doubles National level tournaments or not(Partner Outside the club)

	@Test(priority = 13)
	public void toVerifyClubCanDoNationalLevelDoublesTournamentsOutSideTheClubEnrolment() throws Exception 
	{

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();									
		tep.clickOnNationalLevel();
		tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(437, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(438, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(439, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.threadSleep();
		tep.clickOnOutSideClubRadioButton();
		tep.enterTtfiIdIntoPartnerTableSearchField(tep.readData(440, 5));// selecting partner from table
		tep.clickEnterOnTtfiIdPartnerTableSearchField();
		tep.threadSleep();
		tep.clickOnKamalaTtfiId();
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 437, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 437, 7));
		}

		tep.clickOnPopUpOkButton();
		tep.clickOnLogOutButton();

	}

	//National Level
	// To check whether the Club  can enroll a player in the Doubles National level tournaments or not(Partner Outside the kerala)

	@Test(priority = 14)
	public void toVerifyClubCanDoNationalLevelDoublesTournamentsOutSideTheKeralaEnrolment() throws Exception 
	{

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();									
		tep.clickOnNationalLevel();
		tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnDoublesRadioButton();
		tep.clickOnGenderDropDown();
		tep.enterGender(tep.readData(444, 5));
		tep.clickEnterOnGender();
		tep.threadSleep();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(445, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(446, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.threadSleep();
		tep.clickOnOutSideKeralaRadioButton();
		tep.enterOutSideKeralaPartnerTtfiId(tep.readData(447, 5));
		tep.enterPartnerName(tep.readData(448, 5));
		tep.selectOutsideKeralaPartnerGender(tep.readData(449, 5));
		tep.clickOnAddPalyerButton();					
		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 437, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 437, 7));
		}

		tep.clickOnPopUpOkButton();
		tep.clickOnLogOutButton();

	}



	//National Level
	// To check whether the Club can enroll a player in the MixedDoubles National level tournaments or not(Partner within the club)

	@Test(priority = 15)
	public void toVerifyClubCanDoNationalLevelMixedDoublesTournamentsWithinTheClubEnrolment() throws Exception 
	{

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();									
		tep.clickOnNationalLevel();
		tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnmixedDoubles();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(454, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(455, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.enterTtfiIdIntoPartnerTableSearchField(tep.readData(456, 5));// selecting partner from table			
		tep.clickEnterOnTtfiIdPartnerTableSearchField();
		tep.threadSleep();
		tep.clickOnRaginiTtfiIdFromPartnerTable();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 454, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 454, 7));
		}

		tep.clickOnPopUpOkButton();	
		tep.clickOnLogOutButton();

	}

	//National Level
	// To check whether the Club can enroll a player in the MixedDoubles National level tournaments or not(Partner outside the club)

	@Test(priority = 16)
	public void toVerifyClubCanDoNationalLevelMixedDoublesTournamentsOutsideTheClubEnrolment() throws Exception 
	{

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();									
		tep.clickOnNationalLevel();
		tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnmixedDoubles();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(460, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(461, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.threadSleep();
		tep.clickOnOutSideClubRadioButton();
		tep.enterTtfiIdIntoPartnerTableSearchField(tep.readData(462, 5));// selecting partner from table			
		tep.clickEnterOnTtfiIdPartnerTableSearchField();
		tep.threadSleep();
		tep.clickOnMariyaTtfiId();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 460, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 460, 7));
		}

		tep.clickOnPopUpOkButton();	
		tep.clickOnLogOutButton();

	}

	//National Level
	// To check whether the Club can enroll a player in the MixedDoubles National level tournaments or not(Partner outside Kerala)

	@Test(priority = 17)
	public void toVerifyClubCanDoNationalLevelMixedDoublesTournamentsOutsideKeralaEnrolment() throws Exception 
	{

		clp = new  ClubLoginPage(driver);
		clp.clickOnClubLogin();
		clp.threadSleep();
		clp.enterUserName(clp.readData(114, 4));
		clp.enterPassword(clp.readData(114, 5));
		clp.clickOnLoginButton();
		tep = new TournamentEntryPage(driver);
		tep.threadSleep();
		tep.clickOnTournamentEntry();
		tep.threadSleep();
		tep.iframe();									
		tep.clickOnNationalLevel();
		tep.clickOnTournament(tep.readData(299, 5));
		tep.threadSleep();
		tep.clickOnmixedDoubles();
		tep.clickOnEventDropDown();
		tep.enterEvent(tep.readData(466, 5));
		tep.clickEnterOnEvent();
		tep.threadSleep();
		tep.enterNationalLevelPlayerListttfiIdSearchField(tep.readData(467, 5));
		tep.clickEnterOnTtfiIdSearchField();
		tep.threadSleep();
		tep.clickOnCheckBox();
		tep.threadSleep();
		tep.clickOnOutSideKeralaRadioButton();
		tep.enterOutSideKeralaPartnerTtfiId(tep.readData(468, 5));
		tep.enterPartnerName(tep.readData(469,5));
		tep.selectOutsideKeralaPartnerGender(tep.readData(470, 5));
		tep.clickOnAddPalyerButton();

		tep.clickOnSaveButton();
		tep.switchToPopup();
		tep.threadSleep();

		boolean alert = tep.isDispalyedEnrollmentSuccessPopUp();

		Assert.assertTrue(alert);

		if(alert)
		{
			System.out.println(ewc.setCellData("Pass", 466, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 466, 7));
		}

		tep.clickOnPopUpOkButton();	
		tep.clickOnLogOutButton();

	}	


	@AfterMethod
	public void afterMethod()

	{
		driver.close();
	}


}
