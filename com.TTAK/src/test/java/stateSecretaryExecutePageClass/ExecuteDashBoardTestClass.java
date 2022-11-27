package stateSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import stateSecretaryLogin.DashBoardpage;
import stateSecretaryLogin.StateSecretaryLoginPage;
import utility.ExcelWriteClass;

public class ExecuteDashBoardTestClass extends BaseClas {

	StateSecretaryLoginPage ssl; 
	DashBoardpage db;
	ExcelWriteClass ewc = new ExcelWriteClass();

	@Test
	public void verifyDashBoardPageVisibleOrNot() throws IOException {

		ssl = new StateSecretaryLoginPage(driver);  //  object of StateSecretaryLoginPage to access all method present in that page 
		ssl.clickOnSecretaryLogin(); // click on secretary login 

		ssl.enterUserName(ssl.readData(8, 5)); // read user name from excel sheet
		ssl.enterPassword(ssl.readData(9, 5));// read password from excel sheet
		ssl.clickOnLoginButton(); // click on login button
		db = new DashBoardpage(driver); //  object creation of dash board page to access all method present in dash board page

		// check actual result and expected results are same or not.
		db.waitForDashBoardText();
		String expectedText = "Dashboard";
		String actualText = db.getText();
		Assert.assertEquals(actualText, expectedText);
		ewc.writeExcel(6, 7);
	}
}
