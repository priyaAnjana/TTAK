package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.StateSecretaryLoginPage;
import stateSecretaryLogin.TournamentMasterPage;

public class TournamentMasterExecuteTestClass extends BaseClas {
	
	StateSecretaryLoginPage ssl;
	TournamentMasterPage tmp;
	
  @Test
  public void verifyStateSecretaryCanCreateTournamentsOrNot() throws IOException, InterruptedException 
  {
	  ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.enterUserName(ssl.readData(4, 4));
		ssl.enterPassword(ssl.readData(4, 5));
		ssl.clickOnLoginButton(); 
		
		tmp = new TournamentMasterPage(driver);
		tmp.clickOnSetUp();
		tmp.clickOnTournametMaster();
		tmp.switchToIframe();
		tmp.enterTournamentName(tmp.readData(100, 5));
		tmp.ClickOnTournamentType();
		tmp.enterTournamentsType(tmp.readData(101, 5));
		tmp.clickEnterKeyontournamentTypeTextField();
		tmp.clickOnLevel();
		tmp.enterLevelText(tmp.readData(102, 5));
		tmp.clickEnterKeyOnLevelText();
		tmp.clickOnDistrict();
		tmp.enterDistrict(tmp.readData(103, 5));
		tmp.clickEnterOnDistrictTextField();
		tmp.enterVenueText(tmp.readData(104, 5));
		
		Thread.sleep(5000);
		tmp.clickOnTournamentsStartPeriod();
		tmp.enterTournamentstartPeriod(tmp.readData(105, 5));
//		tmp.clickEnterKeyOnTournamentStartPeriodDatePicker();
		
			
  }
}
