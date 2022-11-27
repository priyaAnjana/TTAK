package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.StateSecretaryLoginPage;
import utility.ExcelWriteClass;

public class ExecuteLoginPageTestClass extends BaseClas {
	
	StateSecretaryLoginPage ssl;
	ExcelWriteClass ewc = new ExcelWriteClass();
// method to verifyLoginPageIsVisibleWhileLaunchingTheApplication
	
	@Test
	public void verifyLoginPageIsVisibleWhileLaunchingTheApplication() throws IOException
	{
		ssl = new StateSecretaryLoginPage(driver);
		
		String expetedUrl = ssl.readData(6, 4);// read application url from excel sheet
		String actualUrl = ssl.getcurrentUrl();
		
		// verifiation actual url and expected are same or not
		
		Assert.assertEquals(actualUrl,expetedUrl);
	}
	// method to verifybLogin with Valid UserName And Valid Password
	@Test
	public void verifyLoginwithValidUserNameAndValidPassword() throws IOException 
	{


		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();

		ssl.enterUserName(ssl.readData(8, 5)); // read username from excel
		ssl.enterPassword(ssl.readData(9, 5));// read password from excel
		ssl.clickOnLoginButton();
		ssl.waitAdmin();
		String expectedUser = "ADMIN";
		String atualUser = ssl.getActualUser();
		Assert.assertEquals(atualUser, expectedUser);
		ewc.writeExcel(12, 7);
	}
	
	
       // using data provider to check unsuccessful login
	@Test(dataProvider = "DataProvider",dataProviderClass = DataProviderClass.class)
	public void verifyUnsuccessfulLogin(String userName, String Password)
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.enterUserName(userName);
		ssl.enterPassword(Password);
		ssl.clickOnLoginButton();
		// check whether the alert msg displayed or not
		boolean actualAlertMsg = ssl.alertMsg(); 
		Assert.assertTrue(actualAlertMsg);

	}

}


