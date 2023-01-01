package clubExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import clubLogin.ClubLoginPage;
import utility.ExcelWriteClass;

public class ClubLoginPageExecuteTestClass extends BaseClas {
	
	ExcelWriteClass ewc =new ExcelWriteClass();
	
	ClubLoginPage clp;
	
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
	
  @Test
  public void verifySuccessulLogin() throws Exception 
  {
	 clp = new  ClubLoginPage(driver);
	 clp.clickOnClubLogin();
	 clp.enterUserName(clp.readData(114, 4));
	 clp.enterPassword(clp.readData(114, 5));
	 clp.clickOnLoginButton();
	 
	 boolean clubName = clp.clubNameIsDisplayed();
	 Assert.assertTrue(clubName);
	 
	 if(clubName)
	 {
		 System.out.println(ewc.setCellData("Pass", 113, 7));
	 }
	 else
	 {
		 System.out.println(ewc.setCellData("Fail", 113, 7));
	 }
  }
  
  @Test
  public void verifywithInvaliUserNameAndValidPassword() throws Exception 
  {
	 clp = new  ClubLoginPage(driver);
	 clp.clickOnClubLogin();
	 clp.enterUserName(clp.readData(115, 4));
	 clp.enterPassword(clp.readData(115, 5));
	 clp.clickOnLoginButton();
	 
	boolean invalidMsg = clp.alertMsg();
	Assert.assertTrue(invalidMsg);
	 
	 if(invalidMsg)
	 {
		 System.out.println(ewc.setCellData("Pass", 115, 7));
	 }
	 else
	 {
		 System.out.println(ewc.setCellData("Fail", 115, 7));
	 }
  }
  
  @Test
  public void verifywithvaliUserNameAndInValidPassword() throws Exception 
  {
	 clp = new  ClubLoginPage(driver);
	 clp.clickOnClubLogin();
	 clp.enterUserName(clp.readData(116, 4));
	 clp.enterPassword(clp.readData(116, 5));
	 clp.clickOnLoginButton();
	 
	boolean invalidMsg = clp.alertMsg();
	Assert.assertTrue(invalidMsg);
	 
	 if(invalidMsg)
	 {
		 System.out.println(ewc.setCellData("Pass", 116, 7));
	 }
	 else
	 {
		 System.out.println(ewc.setCellData("Fail", 116, 7));
	 }
  }
  
  @Test
  public void verifywithInvaliUserNameAndInValidPassword() throws Exception 
  {
	 clp = new  ClubLoginPage(driver);
	 clp.clickOnClubLogin();
	 clp.enterUserName(clp.readData(117, 4));
	 clp.enterPassword(clp.readData(117, 5));
	 clp.clickOnLoginButton();
	 
	boolean invalidMsg = clp.alertMsg();
	Assert.assertTrue(invalidMsg);
	 
	 if(invalidMsg)
	 {
		 System.out.println(ewc.setCellData("Pass", 117, 7));
	 }
	 else
	 {
		 System.out.println(ewc.setCellData("Fail", 117, 7));
	 }
  }
  
}
