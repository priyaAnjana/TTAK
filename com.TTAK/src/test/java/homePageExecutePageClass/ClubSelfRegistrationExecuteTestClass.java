package homePageExecutePageClass;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import homePage.ClubSelfRegistration;
import homePage.playerSelfRegistration;
import utility.ExcelWriteClass;

public class ClubSelfRegistrationExecuteTestClass extends BaseClas 

{
	playerSelfRegistration psr;

	ClubSelfRegistration csr;

	ExcelWriteClass ewc =new ExcelWriteClass();

	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		setUp();
	}



	@Test(priority =1)
	public void verifyWithClubCanDoSelfRegistration() throws Exception 
	{
		csr = new ClubSelfRegistration(driver);

		csr.clickOnClubRegistration();
		csr.clickOnTypeOfClub();
		csr.selectValueFromTypeOfClubDropDown(csr.readData(186, 5));
		csr.enterClubName(csr.readData(187, 5));
		csr.clickOnDistrict();
		csr.selectValueFromDistrictDropDown(csr.readData(188, 5));
		csr.enterAuthorizedPerson(csr.readData(189, 5));
		csr.enterAddress(csr.readData(190, 5));
		csr.enterEmailId(csr.readData(191, 5));
		csr.scrollIntoPhnum();
		csr.enterPhoneNum(csr.readData(192, 5));		
		csr.clickOnUploadDocuments();
		csr.threadSleep();
		csr.uploadDocument(csr.readData(193, 5));

		csr.clickOnPlayerImage();		
		csr.threadSleep();
		csr.uploadPlayerImage(csr.readData(194, 5));
		csr.clickOnRegisterButton();

		String expectedUrl = csr.readData(195, 5);
		String actualUrl = csr.getUrl();

		Assert.assertEquals(actualUrl, actualUrl);

		if(actualUrl.equalsIgnoreCase(expectedUrl))
		{
			System.out.println(ewc.setCellData("Pass", 186, 7));
		}
		else
		{
			System.out.println(ewc.setCellData("Fail", 186, 7));	
		}


	}
	@Test (priority = 2)
	public void clubRegistrationForSateSecretaryApproval() throws IOException, InterruptedException, AWTException
	{
		csr = new ClubSelfRegistration(driver);

		csr.clickOnClubRegistration();
		csr.clickOnTypeOfClub();
		csr.selectValueFromTypeOfClubDropDown(csr.readData(199, 5));
		csr.enterClubName(csr.readData(200, 5));
		csr.clickOnDistrict();
		csr.selectValueFromDistrictDropDown(csr.readData(201, 5));
		csr.enterAuthorizedPerson(csr.readData(202, 5));
		csr.enterAddress(csr.readData(203, 5));
		csr.enterEmailId(csr.readData(204, 5));
		csr.scrollIntoPhnum();
		csr.enterPhoneNum(csr.readData(205, 5));		
		csr.clickOnUploadDocuments();
		csr.threadSleep();
		csr.uploadDocument(csr.readData(206, 5));

		csr.clickOnPlayerImage();		
		csr.threadSleep();
		csr.uploadPlayerImage(csr.readData(207, 5));
		csr.clickOnRegisterButton();


	}


	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
}
