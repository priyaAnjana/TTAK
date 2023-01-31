package stateSecretaryExecutePageClass;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.StateSecretaryLoginPage;
import stateSecretaryLogin.TournamentMasterPage;
import utility.ExcelWriteClass;

public class TournamentMasterExecuteTestClass extends BaseClas 
{

	StateSecretaryLoginPage ssl;

	TournamentMasterPage tmp;

	ExcelWriteClass ewc =new ExcelWriteClass();

	String userDir = System.getProperty("user.dir");

	@BeforeMethod

	public void beforeMethod() throws IOException
	{
		setUp();
	}
	
//To  verify state secretary can create state level tournament or not
	
	@Test(priority = 1)
	public void verifyStateSecretaryCanCreateStateTournamentsOrNot() throws Exception 
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.enterUserName(ssl.readData(4, 4));
		ssl.enterPassword(ssl.readData(4, 5));
		ssl.clickOnLoginButton(); 

		tmp = new TournamentMasterPage(driver);

		tmp.threadSleep();
		tmp.clickOnSetUp();
		tmp.clickOnTournametMaster();
		tmp.switchToIframe();
		tmp.enterTournamentName(tmp.readData(265, 5));
		tmp.ClickOnTournamentType();
		tmp.enterTournamentsType(tmp.readData(266, 5));
		tmp.clickEnterKeyontournamentTypeTextField();
		tmp.clickOnLevel();
		tmp.enterLevelText(tmp.readData(267, 5));
		tmp.clickEnterKeyOnLevelText();		
		tmp.enterVenueText(tmp.readData(268, 5));		
		tmp.clickOnTournamentsStartPeriod();
		tmp.selectTournamentStartPeriod(tmp.readData(269, 5));
		tmp.clickOnTournamentsEndPeriod();
		tmp.selectTournamentEndPeriod(tmp.readData(270, 5));
		tmp.clickOnEnrollmentLastDate();
		tmp.selectEnrollmentLastDate(tmp.readData(271, 5));
		tmp.clickOnWithdrawalLastDate();
		tmp.selectWithdrawalLastDate(tmp.readData(272, 5));
		tmp.clickOnOrganizingDistrict();
		tmp.enterOrganizingDistrict(tmp.readData(273, 5));
		tmp.clickEnterOnOrganizingDistrictTextField();
		tmp.clickOnOrganizingClubDropDown();
		tmp.enterOrganizingClub(tmp.readData(274, 5));
		tmp.clickEnterOnOrganizingDistrictTextField();

		tmp.clickOnFileUpload();
		tmp.threadSleep();
		tmp.uploadFile(userDir+tmp.readData(275, 5));
		tmp.clickOnFileUploadButton();
		tmp.switchToAlertPopUp();
		tmp.threadSleep();
		tmp.clickOnPopupOkButton();
		tmp.switchToIframe();	
		tmp.scrollIntoCategoryName();
		tmp.enterCategoryNameInToSearhField(tmp.readData(276, 5));
		tmp.threadSleep();
		tmp.clickOnCheckBox();
		tmp.threadSleep();
		tmp.clickOnTeamSize();
		tmp.enterTeamSize(tmp.readData(277, 5));
		tmp.clickEnterOnTeamSizeField();

		tmp.clearCategoryNameInToSearhField();
		tmp.enterCategoryNameInToSearhField(tmp.readData(278, 5));
		tmp.threadSleep();
		tmp.clickOnCheckBox();
		tmp.threadSleep();
		tmp.clickOnTeamSize();
		tmp.enterTeamSize(tmp.readData(279, 5));
		tmp.clickEnterOnTeamSizeField();
		tmp.clearCategoryNameInToSearhField();
		tmp.enterCategoryNameInToSearhField(tmp.readData(280, 5));
		tmp.threadSleep();
		tmp.clickOnCheckBox();
		tmp.threadSleep();
		tmp.clickOnTeamSize();
		tmp.enterTeamSize(tmp.readData(281, 5));
		tmp.clickEnterOnTeamSizeField();
		tmp.scrollToSaveButton();
		tmp.clickOnSaveButton();
		tmp.switchToAlertPopUp();
		tmp.threadSleep();

		boolean successPopUp = tmp.isDisplayedSuccessPopUp();
		Assert.assertTrue(successPopUp);

		if(successPopUp)
		{
			System.out.println(ewc.setCellData("Pass", 265, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 265, 7));
		}

		tmp.clickOnPopupOkButton();

	}
	
	//To  verify state secretary can create district level tournament or not
	
		@Test(priority = 2)
		public void verifyStateSecretaryCanCreateDistrictTournamentsOrNot() throws Exception 
		{
			ssl = new StateSecretaryLoginPage(driver);
			ssl.clickOnSecretaryLogin();
			ssl.enterUserName(ssl.readData(4, 4));
			ssl.enterPassword(ssl.readData(4, 5));
			ssl.clickOnLoginButton(); 

			tmp = new TournamentMasterPage(driver);

			tmp.threadSleep();
			tmp.clickOnSetUp();
			tmp.clickOnTournametMaster();
			tmp.switchToIframe();
			tmp.enterTournamentName(tmp.readData(282, 5));
			tmp.ClickOnTournamentType();
			tmp.enterTournamentsType(tmp.readData(283, 5));
			tmp.clickEnterKeyontournamentTypeTextField();
			tmp.clickOnLevel();
			tmp.enterLevelText(tmp.readData(284, 5));
			tmp.clickEnterKeyOnLevelText();	
			tmp.clickOnDistrictDropDown();
			tmp.enterDistrit(tmp.readData(285, 5));
			tmp.clickEnterKeyOnDistrictDropDown();
			
			tmp.enterVenueText(tmp.readData(286, 5));		
			tmp.clickOnTournamentsStartPeriod();
			tmp.selectTournamentStartPeriod(tmp.readData(287, 5));
			tmp.clickOnTournamentsEndPeriod();
			tmp.selectTournamentEndPeriod(tmp.readData(288, 5));
			tmp.clickOnEnrollmentLastDate();
			tmp.selectEnrollmentLastDate(tmp.readData(289, 5));
			tmp.clickOnWithdrawalLastDate();
			tmp.selectWithdrawalLastDate(tmp.readData(290, 5));

			tmp.clickOnOrganizingClubDropDown();
			tmp.enterOrganizingClub(tmp.readData(291, 5));
			tmp.clickEnterOnorganizingClubDropDownTextField();

			tmp.clickOnFileUpload();
			tmp.threadSleep();
			tmp.uploadFile(userDir+tmp.readData(292, 5));
			tmp.clickOnFileUploadButton();
			tmp.switchToAlertPopUp();
			tmp.threadSleep();
			tmp.clickOnPopupOkButton();
			tmp.switchToIframe();	
			tmp.scrollIntoCategoryName();
			tmp.enterCategoryNameInToSearhField(tmp.readData(293, 5));
			tmp.threadSleep();
			tmp.clickOnCheckBox();
			tmp.threadSleep();
			tmp.clickOnTeamSize();
			tmp.enterTeamSize(tmp.readData(294, 5));
			tmp.clickEnterOnTeamSizeField();
			tmp.clearCategoryNameInToSearhField();
			tmp.enterCategoryNameInToSearhField(tmp.readData(295, 5));
			tmp.threadSleep();
			tmp.clickOnCheckBox();
			tmp.threadSleep();
			tmp.clickOnTeamSize();
			tmp.enterTeamSize(tmp.readData(296, 5));
			tmp.clickEnterOnTeamSizeField();
			tmp.clearCategoryNameInToSearhField();
			tmp.enterCategoryNameInToSearhField(tmp.readData(297, 5));
			tmp.threadSleep();
			tmp.clickOnCheckBox();	
			tmp.threadSleep();
			tmp.clickOnTeamSize();
			tmp.enterTeamSize(tmp.readData(298, 5));
			tmp.clickEnterOnTeamSizeField();
			tmp.scrollToSaveButton();
			tmp.clickOnSaveButton();
			tmp.switchToAlertPopUp();
			tmp.threadSleep();

			boolean successPopUp = tmp.isDisplayedSuccessPopUp();
			Assert.assertTrue(successPopUp);

			if(successPopUp)
			{
				System.out.println(ewc.setCellData("Pass", 282, 7));
			}
			else
			{
				System.out.println(ewc.setCellData("Fail", 282, 7));
			}

			tmp.clickOnPopupOkButton();

		}
		
		//To  verify state secretary can create National level tournament or not
		
			@Test(priority = 3)
			public void verifyStateSecretaryCanCreateNationalTournamentsOrNot() throws Exception 
			{
				ssl = new StateSecretaryLoginPage(driver);
				ssl.clickOnSecretaryLogin();
				ssl.enterUserName(ssl.readData(4, 4));
				ssl.enterPassword(ssl.readData(4, 5));
				ssl.clickOnLoginButton(); 

				tmp = new TournamentMasterPage(driver);

				tmp.threadSleep();
				tmp.clickOnSetUp();
				tmp.clickOnTournametMaster();
				tmp.switchToIframe();
				tmp.enterTournamentName(tmp.readData(299, 5));
				tmp.ClickOnTournamentType();
				tmp.enterTournamentsType(tmp.readData(300, 5));
				tmp.clickEnterKeyontournamentTypeTextField();
				tmp.clickOnLevel();
				tmp.enterLevelText(tmp.readData(301, 5));
				tmp.clickEnterKeyOnLevelText();	
				
				
				tmp.enterVenueText(tmp.readData(302, 5));		
				tmp.clickOnTournamentsStartPeriod();
				tmp.selectTournamentStartPeriod(tmp.readData(303, 5));
				tmp.clickOnTournamentsEndPeriod();
				tmp.selectTournamentEndPeriod(tmp.readData(304, 5));
				tmp.clickOnEnrollmentLastDate();
				tmp.selectEnrollmentLastDate(tmp.readData(305, 5));
				tmp.clickOnWithdrawalLastDate();
				tmp.selectWithdrawalLastDate(tmp.readData(306, 5));

				

				tmp.clickOnFileUpload();
				tmp.threadSleep();
				tmp.uploadFile(userDir+tmp.readData(307, 5));
				tmp.clickOnFileUploadButton();
				tmp.switchToAlertPopUp();
				tmp.threadSleep();
				tmp.clickOnPopupOkButton();
				tmp.switchToIframe();	
				tmp.scrollIntoCategoryName();
				tmp.enterCategoryNameInToSearhField(tmp.readData(308, 5));
				tmp.threadSleep();
				tmp.clickOnCheckBox();
				tmp.threadSleep();
				tmp.clickOnTeamSize();
				tmp.enterTeamSize(tmp.readData(309, 5));
				tmp.clickEnterOnTeamSizeField();
				tmp.clearCategoryNameInToSearhField();
				tmp.enterCategoryNameInToSearhField(tmp.readData(310, 5));
				tmp.threadSleep();
				tmp.clickOnCheckBox();
				tmp.threadSleep();
				tmp.clickOnTeamSize();
				tmp.enterTeamSize(tmp.readData(311, 5));
				tmp.clickEnterOnTeamSizeField();
				tmp.clearCategoryNameInToSearhField();
				tmp.enterCategoryNameInToSearhField(tmp.readData(312, 5));
				tmp.threadSleep();
				tmp.clickOnCheckBox();
				tmp.threadSleep();
				tmp.clickOnTeamSize();
				tmp.enterTeamSize(tmp.readData(313, 5));
				tmp.clickEnterOnTeamSizeField();
				tmp.scrollToSaveButton();
				tmp.clickOnSaveButton();
				tmp.switchToAlertPopUp();
				tmp.threadSleep();

				boolean successPopUp = tmp.isDisplayedSuccessPopUp();
				Assert.assertTrue(successPopUp);

				if(successPopUp)
				{
					System.out.println(ewc.setCellData("Pass", 299, 7));
				}
				else
				{
					System.out.println(ewc.setCellData("Fail", 299, 7));
				}

				tmp.clickOnPopupOkButton();

			}



	@AfterMethod

	public void afterMethod()	
	{
						  driver.close();
	}
}



