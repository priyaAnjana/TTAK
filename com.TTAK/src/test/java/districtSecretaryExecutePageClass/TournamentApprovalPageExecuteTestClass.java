package districtSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import districtSecretaryLogin.DistrictSecretaryLoginPage;
import districtSecretaryLogin.TournamentApprovalPage;
import utility.ExcelWriteClass;

public class TournamentApprovalPageExecuteTestClass extends BaseClas

{
	ExcelWriteClass ewc =new ExcelWriteClass();

	DistrictSecretaryLoginPage dsl;

	TournamentApprovalPage tap;

	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		setUp();
	}
	// State Level
	// To Check whether the District Secretary can approve a player who is enroll by a club into a Singles State Level tournament. 
	@Test
	public void toVerifySingelsStateLevelTournamentApprovalThatEnrollByAClub() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberIdIntoSearhField(tap.readData(363, 5));
		tap.clickEnterOnMemberIdIntoSearhField();
		tap.clickOnCheckBox();
		tap.clickOnSaveButton();
		tap.switchToAlertPopUp();
		tap.threadSleep();
		tap.clickOnAlertYesButton();
		tap.threadSleep();

		boolean popUp = tap.isDisplayTournamentApprovalSuccessPopUp();
		Assert.assertTrue(popUp);

		if(popUp)
		{
			System.out.println(ewc.setCellData("Pass", 363, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 363, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}
	// state level
	// To Check whether the District Secretary can approve a player who is enroll by a club into a Doubles State Level tournament(within the club). 
	@Test
	public void toVerifyWithinTheClubDoublesStateLevelTournamentApprovalThatEnrollByAClub() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberIdIntoSearhField(tap.readData(370, 5));
		tap.clickEnterOnMemberIdIntoSearhField();
		tap.threadSleep();
		tap.clickOnCheckBox();
		tap.clickOnSaveButton();
		tap.switchToAlertPopUp();
		tap.threadSleep();
		tap.clickOnAlertYesButton();
		tap.threadSleep();

		boolean popUp = tap.isDisplayTournamentApprovalSuccessPopUp();
		Assert.assertTrue(popUp);

		if(popUp)
		{
			System.out.println(ewc.setCellData("Pass", 370, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 370, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	// state level
	// To Check whether the District Secretary can approve a player who is enroll by a club into a Doubles State Level tournament(outside the club). 
	@Test
	public void toVerifyPartnerOutsideDoublesClubStateLevelApprovalThatEnrollByAClub() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberIdIntoSearhField(tap.readData(377, 5));
		tap.clickEnterOnMemberIdIntoSearhField();
		tap.threadSleep();
		tap.clickOnCheckBox();
		tap.clickOnSaveButton();
		tap.switchToAlertPopUp();
		tap.threadSleep();
		tap.clickOnAlertYesButton();
		tap.threadSleep();

		boolean popUp = tap.isDisplayTournamentApprovalSuccessPopUp();
		Assert.assertTrue(popUp);

		if(popUp)
		{
			System.out.println(ewc.setCellData("Pass", 377, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 377, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}


	//State Level

	// To Check whether the District Secretary can approve a player who is enroll by a club into a Mixed Doubles State Level tournament(within the club). 
	@Test
	public void toVerifywithinTheClubMixedDoublesStateLevelTournamentApprovalThatEnrollByAClub() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberIdIntoSearhField(tap.readData(384, 5));
		tap.clickEnterOnMemberIdIntoSearhField();
		tap.threadSleep();
		tap.clickOnCheckBox();
		tap.clickOnSaveButton();
		tap.switchToAlertPopUp();
		tap.threadSleep();
		tap.clickOnAlertYesButton();
		tap.threadSleep();

		boolean popUp = tap.isDisplayTournamentApprovalSuccessPopUp();
		Assert.assertTrue(popUp);

		if(popUp)
		{
			System.out.println(ewc.setCellData("Pass", 384, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 384, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	//State Level

	// To Check whether the District Secretary can approve a player who is enroll by a club into a Mixed Doubles State Level tournament(outside the club). 
	@Test
	public void toVerifyOutSideTheClubMixedDoublesStateLevelTournamentApprovalThatEnrollByAClub() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberIdIntoSearhField(tap.readData(390, 5));
		tap.clickEnterOnMemberIdIntoSearhField();
		tap.threadSleep();
		tap.clickOnCheckBox();
		tap.clickOnSaveButton();
		tap.switchToAlertPopUp();
		tap.threadSleep();
		tap.clickOnAlertYesButton();
		tap.threadSleep();

		boolean popUp = tap.isDisplayTournamentApprovalSuccessPopUp();
		Assert.assertTrue(popUp);

		if(popUp)
		{
			System.out.println(ewc.setCellData("Pass", 390, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 390, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	// District Level
	// To Check whether the District Secretary can approve a player who is enroll by a club into a Singles District Level tournament. 
	@Test
	public void toVerifySingelsDistrictLevelTournamentApprovalThatEnrollByAClub() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberIdIntoSearhField(tap.readData(396, 5));
		tap.clickEnterOnMemberIdIntoSearhField();
		tap.clickOnCheckBox();
		tap.clickOnSaveButton();
		tap.switchToAlertPopUp();
		tap.threadSleep();
		tap.clickOnAlertYesButton();
		tap.threadSleep();

		boolean popUp = tap.isDisplayTournamentApprovalSuccessPopUp();
		Assert.assertTrue(popUp);

		if(popUp)
		{
			System.out.println(ewc.setCellData("Pass", 396, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 396, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	// District Level
	// To Check whether the District Secretary can approve a player who is enroll by a club into a Doubles District Level tournament(partner within the club). 
	@Test
	public void toVerifyPartnerwithinTheClubDoublesDistrictLevelTournamentApprovalThatEnrollByAClub() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberIdIntoSearhField(tap.readData(403, 5));
		tap.clickEnterOnMemberIdIntoSearhField();
		tap.clickOnCheckBox();
		tap.clickOnSaveButton();
		tap.switchToAlertPopUp();
		tap.threadSleep();
		tap.clickOnAlertYesButton();
		tap.threadSleep();

		boolean popUp = tap.isDisplayTournamentApprovalSuccessPopUp();
		Assert.assertTrue(popUp);

		if(popUp)
		{
			System.out.println(ewc.setCellData("Pass", 403, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 403, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	// District Level
	// To Check whether the District Secretary can approve a player who is enroll by a club into a Doubles District Level tournament(partner outside the club). 
	@Test
	public void toVerifyPartnerOutsideTheClubDoublesDistrictLevelTournamentApprovalThatEnrollByAClub() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.threadSleep();
		tap.iframe();
		tap.enterMemberIdIntoSearhField(tap.readData(410, 5));
		tap.clickEnterOnMemberIdIntoSearhField();
		tap.clickOnCheckBox();
		tap.clickOnSaveButton();
		tap.switchToAlertPopUp();
		tap.threadSleep();
		tap.clickOnAlertYesButton();
		tap.threadSleep();

		boolean popUp = tap.isDisplayTournamentApprovalSuccessPopUp();
		Assert.assertTrue(popUp);

		if(popUp)
		{
			System.out.println(ewc.setCellData("Pass", 410, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 410, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	// District Level
	// To Check whether the District Secretary can approve a player who is enroll by a club into a Mixed Doubles District Level tournament(partner within the club). 
	@Test
	public void toVerifyPartnerwithinTheClubMixedDoublesDistrictLevelTournamentApprovalThatEnrollByAClub() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberIdIntoSearhField(tap.readData(416, 5));
		tap.clickEnterOnMemberIdIntoSearhField();
		tap.clickOnCheckBox();
		tap.clickOnSaveButton();
		tap.switchToAlertPopUp();
		tap.threadSleep();
		tap.clickOnAlertYesButton();
		tap.threadSleep();

		boolean popUp = tap.isDisplayTournamentApprovalSuccessPopUp();
		Assert.assertTrue(popUp);

		if(popUp)
		{
			System.out.println(ewc.setCellData("Pass", 416, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 416, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	// District Level
	// To Check whether the District Secretary can approve a player who is enroll by a club into a Mixed Doubles District Level tournament(partner outside the club). 
	@Test
	public void toVerifyPartnerOutsideTheClubMixedDoublesDistrictLevelTournamentApprovalThatEnrollByAClub() throws Exception 

	{
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberIdIntoSearhField(tap.readData(422, 5));
		tap.clickEnterOnMemberIdIntoSearhField();
		tap.clickOnCheckBox();
		tap.clickOnSaveButton();
		tap.switchToAlertPopUp();
		tap.threadSleep();
		tap.clickOnAlertYesButton();
		tap.threadSleep();

		boolean popUp = tap.isDisplayTournamentApprovalSuccessPopUp();
		Assert.assertTrue(popUp);

		if(popUp)
		{
			System.out.println(ewc.setCellData("Pass", 422, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 422, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
}
