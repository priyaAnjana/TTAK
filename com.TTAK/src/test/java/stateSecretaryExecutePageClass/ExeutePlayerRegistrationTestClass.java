package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.PlayerRegistrationPage;
import stateSecretaryLogin.StateSecretaryLoginPage;

public class ExeutePlayerRegistrationTestClass  extends BaseClas{
	StateSecretaryLoginPage ssl;
	PlayerRegistrationPage prp; // initializing player registration page
  @Test
  public void verifyWhetherTheSecretaryCanRegisterNewPlayerOrNot() throws IOException {
	  
	  ssl = new StateSecretaryLoginPage(driver);
	  ssl.clickOnSecretaryLogin();
	  ssl.enterUserName(ssl.readData(8, 5));
	  ssl.enterPassword(ssl.readData(9, 5));
	  ssl.clickOnLoginButton();
	  
	  prp = new PlayerRegistrationPage(driver);
	  prp.clickOnProcessElement(); // click on process menu
	  prp.clickOnPlayerRegistration();// click on player registration
	  prp.elementToBeClickable(); // implicit wait
	  prp.clickOnFirstName();// click on first name text field
	  
	  prp.enterFirstName(ssl.readData(13, 5)); // enter first name from excel
	  
	  
  }
}
