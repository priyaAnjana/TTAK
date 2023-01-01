package stateSecretaryExecutePageClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import stateSecretaryLogin.StateSecretaryLoginPage;
import utility.ExcelWriteClass;



public class LoginPageExecuteTestClass extends BaseClas {

	StateSecretaryLoginPage ssl;
	ExcelWriteClass ewc =new ExcelWriteClass();

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

	// method to verifyLoginPageIsVisibleWhileLaunchingTheApplication

	//	@Test(priority = 1)
	//	public void verifyLoginPageIsVisibleWhileLaunchingTheApplication() throws Exception
	//	{
	//		ssl = new StateSecretaryLoginPage(driver);
	//
	//		String expetedUrl = ssl.readData(3, 5);// read application url from excel sheet
	//		String actualUrl = ssl.getcurrentUrl();
	//
	//		
	//
	//		// verify actual and expected value and write test result into excel
	//		if(actualUrl.equalsIgnoreCase(expetedUrl))
	//		{
	//			System.out.println(ewc.setCellData("Pass", 3, 7));
	//		}
	//			else
	//			{
	//				System.out.println(ewc.setCellData("Fail", 3, 7));
	//			}
	//		// verifiation actual url and expected are same or not
	//		Assert.assertEquals(actualUrl,expetedUrl);
	//	}


	// method to verifybLogin with Valid UserName And Valid Password
	@Test(priority = 1)
	public void verifyLoginwithValidUserNameAndValidPassword() throws Exception 
	{


		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.waitsForUserName();
		ssl.enterUserName(ssl.readData(4, 4)); // read username from excel
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel
		ssl.clickOnLoginButton();
		ssl.waitAdmin();
		String expectedUser =ssl.readData(5, 5);
		String atualUser = ssl.getActualUser();
		// verify the status of test using if condition
		if(expectedUser.equalsIgnoreCase(atualUser))
		{
			System.out.println(ewc.setCellData("Pass", 3, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 3, 7));
		}
		// verify status of condition using assertion
		Assert.assertEquals(atualUser, expectedUser);

	}

	// using data provider to check unsuccessful login
	@Test(priority = 2)

	public void verifyLoginWithInvalidUsernameAndValidPassword() throws Exception
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.waitsForUserName();
		ssl.enterUserName(ssl.readData(7, 4));
		ssl.enterPassword(ssl.readData(7, 5));
		ssl.clickOnLoginButton();
		// to store alert msg into actualAlertMsg variable
		boolean actualAlertMsg = ssl.alertMsg(); 

		if(actualAlertMsg==true)
		{
			System.out.println(ewc.setCellData("Pass", 7, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 7, 7));
		}
		// to check test case pass or fail using assertion
		Assert.assertTrue(actualAlertMsg);


	}
	@Test(priority = 3)

	public void verifyLoginwithValidUsernameandInvalidPassword() throws Exception
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.waitsForUserName();
		ssl.enterUserName(ssl.readData(8, 4));
		ssl.enterPassword(ssl.readData(8, 5));
		ssl.clickOnLoginButton();
		// to store alert msg into actualAlertMsg variable
		boolean actualAlertMsg = ssl.alertMsg(); 
		if(actualAlertMsg==true)
		{
			System.out.println(ewc.setCellData("Pass", 8, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 8, 7));
		}
		// to check test case pass or fail using assertion
		Assert.assertTrue(actualAlertMsg);


	}
	@Test(priority = 4)

	public void verifyLoginwithInValidUsernameandInvalidPassword() throws Exception
	{
		ssl = new StateSecretaryLoginPage(driver);
		ssl.clickOnSecretaryLogin();
		ssl.waitsForUserName();
		ssl.enterUserName(ssl.readData(9, 4));
		ssl.enterPassword(ssl.readData(9, 5));
		ssl.clickOnLoginButton();
		// to store alert msg into actualAlertMsg variable
		boolean actualAlertMsg = ssl.alertMsg();
		if(actualAlertMsg==true)
		{
			System.out.println(ewc.setCellData("Pass", 9, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 9, 7));
		}
		// to check test case pass or fail using assertion
		Assert.assertTrue(actualAlertMsg);


	}
	@Test(priority = 5)

	public void verifyDashBoardPageVisibleOrNot() throws Exception {

		ssl = new StateSecretaryLoginPage(driver);  //  object of StateSecretaryLoginPage to access all method present in that page 
		ssl.clickOnSecretaryLogin(); // click on secretary login 

		ssl.enterUserName(ssl.readData(4, 4)); // read user name from excel sheet
		ssl.enterPassword(ssl.readData(4, 5));// read password from excel sheet
		ssl.clickOnLoginButton(); // click on login button
		ssl.waitForDashBoardText();// waits
		// to store expected text into expectedText variable and read from excel sheet
		String expectedText = ssl.readData(10, 5);
		// to store actual text into actualText and read method from ssl page
		String actualText = ssl.getText();

		if(expectedText.equalsIgnoreCase(actualText))
		{
			System.out.println(ewc.setCellData("Pass", 10, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 10, 7));
		}
		// to check test case pass or fail using assertion
		Assert.assertEquals(actualText, expectedText);

	}
}




