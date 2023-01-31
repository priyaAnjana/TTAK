package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.StateSecretaryLoginPage;
import stateSecretaryLogin.TournamentApprovalPage;
import utility.ExcelWriteClass;

public class TournamentApprovalPageExecuteTestClass extends BaseClas

{

	StateSecretaryLoginPage ssl;

	TournamentApprovalPage  tap;

	ExcelWriteClass ewc =new ExcelWriteClass();

	@BeforeMethod

	public void beforeMethod() throws IOException
	{
		setUp();
	}

	// To Check whether the State Secretary can approve a player who is enroll by a club into a Singles National Level tournament. 
	@Test
	public void toVerfyStateScretaryCanDoSinglesNationalLevelTournamentApprovalThatEnrollByClub() throws Exception 
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberId(tap.readData(428, 5));
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
			System.out.println(ewc.setCellData("Pass", 428, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 428, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	// To Check whether the State Secretary can approve a player who is enroll by a club into a Doubles National Level tournament(Partner within the club). 
	@Test
	public void toVerfyStateScretaryCanDoDoublesNationalLevelPartnerWithinTheClubTournamentApprovalThatEnrollByClub() throws Exception 
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);

		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.threadSleep();
		tap.enterMemberId(tap.readData(435, 5));
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
			System.out.println(ewc.setCellData("Pass", 435, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 435, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	// To Check whether the State Secretary can approve a player who is enroll by a club into a Doubles National Level tournament(Partner outside the club). 
	@Test
	public void toVerfyStateScretaryCanDoDoublesNationalLevelPartnerOutsideTheClubTournamentApprovalThatEnrollByClub() throws Exception 
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);

		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.threadSleep();
		tap.enterMemberId(tap.readData(442, 5));
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
			System.out.println(ewc.setCellData("Pass", 442, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 442, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}
	// To Check whether the State Secretary can approve a player who is enroll by a club into a Doubles National Level tournament(Partner outside the kerala). 
	@Test
	public void toVerfyStateScretaryCanDoDoublesNationalLevelPartnerOutsideKeralaTournamentApprovalThatEnrollByClub() throws Exception 
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);

		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.threadSleep();
		tap.enterMemberId(tap.readData(451, 5));
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
			System.out.println(ewc.setCellData("Pass", 451, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 451, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}


	// To Check whether the State Secretary can approve a player who is enroll by a club into a Mixed Doubles National Level tournament(Partner within the club). 
	@Test
	public void toVerfyStateScretaryCanDoWithinClubMixedDoublesNationalLevelTournamentApprovalThatEnrollByClub() throws Exception 
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberId(tap.readData(458, 5));
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
			System.out.println(ewc.setCellData("Pass", 458, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 458, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	// To Check whether the State Secretary can approve a player who is enroll by a club into a Mixed Doubles National Level tournament(Partner outside the club). 
	@Test
	public void toVerfyStateScretaryCanDoOutSideClubMixedDoublesNationalLevelTournamentApprovalThatEnrollByClub() throws Exception 
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberId(tap.readData(464, 5));
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
			System.out.println(ewc.setCellData("Pass", 464, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 464, 7));
		}
		tap.clickOnPopUpOkButton();
		tap.clickOnLogOutButton();

	}

	// To Check whether the State Secretary can approve a player who is enroll by a club into a Mixed Doubles National Level tournament(Partner outside the kerala). 
	@Test
	public void toVerfyStateScretaryCanDoOutSideKeralaMixedDoublesNationalLevelTournamentApprovalThatEnrollByClub() throws Exception 
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.threadSleep();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();

		tap = new TournamentApprovalPage(driver);
		tap.threadSleep();
		tap.clickOnProcessElement();
		tap.clickOnTournamentApproval();
		tap.iframe();
		tap.enterMemberId(tap.readData(472, 5));
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
			System.out.println(ewc.setCellData("Pass", 472, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 472, 7));
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
