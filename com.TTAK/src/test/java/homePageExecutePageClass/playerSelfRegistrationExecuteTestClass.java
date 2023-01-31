package homePageExecutePageClass;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import baseClass.BaseClas;
import homePage.playerSelfRegistration;
import stateSecretaryLogin.StateSecretaryLoginPage;
import utility.ExcelWriteClass;

public class playerSelfRegistrationExecuteTestClass extends BaseClas{


	playerSelfRegistration psr;
	
	ExcelWriteClass ewc =new ExcelWriteClass();
	
	String userDir = System.getProperty("user.dir");

	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		setUp();
	}
	
	
	@Test(priority = 1 )
	public void verifyWhetherThePlayersuccessfullyDoTheRegistrationorNot() throws Exception 
	{

		psr = new playerSelfRegistration(driver);

		//	  Thread.sleep(5000);
		psr.clickOnPlayers();
		psr.clickOnPlayerRegistration();
		psr.enterFirstName(psr.readData(13, 5));
		psr.enterLastName(psr.readData(14, 5));
		psr.enterFatherName(psr.readData(15, 5));
		psr.enterMotherName(psr.readData(16, 5));
		psr.enterEmailId(psr.readData(17, 5));
		psr.enterDateOfBirth(psr.readData(18, 5));
		psr.enterContactNo1(psr.readData(19, 5));
		psr.enterContactNo2(psr.readData(20, 5));
		psr.enterGender(psr.readData(21, 5));
		psr.enterDistrict(psr.readData(22, 5));
		psr.enterBloodGroup(psr.readData(23, 5));
		psr.enterTtfiId(psr.readData(24, 5));
		psr.enterAddress(psr.readData(25, 5));
		psr.enterAdhaarNum(psr.readData(26, 5));
		psr.enterClub1(psr.readData(27, 5));
		psr.enterPlaceOfBirth(psr.readData(28, 5));
		psr.enterClub2(psr.readData(29, 5));
		psr.enterDocumentsType(psr.readData(30, 5));
		psr.clickOnUploadDocuments();
		psr.threadSleep();
		psr.uploadDocuments(userDir+psr.readData(31, 5));
		psr.enterName(psr.readData(33, 5));
		psr.enterInstitutionAddress(psr.readData(34, 5));
		psr.enterCourse(psr.readData(35, 5));
		psr.enterPasspoertNumber(psr.readData(37, 5));
		psr.enterPassportIssueDate(psr.readData(38, 5));
		psr.enterPassportValidDate(psr.readData(39, 5));
		psr.enterPlaceOfIssue(psr.readData(40, 5));

		psr.clickOnPlayerImage();
		psr.threadSleep();
		psr.uploadPlayerImage(userDir+psr.readData(41, 5));
		psr.threadSleep();
		psr.clickOnRegisterButton();
		psr.swithToPaymentGateWay();
		psr.enterphNumberForPayment(psr.readIntegerData(42, 5));
		psr.clickOnProceedButton();
		psr.threadSleep();
		psr.clickOnNetBankingPayMent();

		psr.clickOnSbiBank();
		psr.threadSleep();
		psr.clickOnPayNowButton();
		psr.multipleWindoHandlingForPayment();

		String expetedUrl = psr.readData(43, 5);
		String actualUrl = psr.getUrlOfPlayerRegistrationPage();
		System.out.println(actualUrl);

		Assert.assertEquals(expetedUrl, actualUrl);

		if(expetedUrl.equalsIgnoreCase(actualUrl))
		{
			System.out.println(ewc.setCellData("Pass", 12, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 12, 7));
		}

	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
}
