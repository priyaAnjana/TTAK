package districtSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import districtSecretaryLogin.DistrictSecretaryLoginPage;
import utility.ExcelWriteClass;

public class DistrictSecretaryLoginPageExecuteTestClass extends BaseClas 
{
	
	ExcelWriteClass ewc =new ExcelWriteClass();
	
	DistrictSecretaryLoginPage dsl;
	
	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		setUp();
	}
	
	
	
  @Test(priority = 1)
  public void verifywithSuccessfulLogin() throws Exception 
  {
	  dsl = new DistrictSecretaryLoginPage(driver);
	  dsl.clickOnSecretaryLogin();
	  dsl.threadSleepWait();
	  dsl.enterUserName(dsl.readData(108, 4));
	  dsl.enterPassword(dsl.readData(108, 5));
	  dsl.clickOnLoginButton();
	  
	  
	  boolean tvmSec = dsl.tvmSecText();
	  System.out.println(tvmSec);
	  Assert.assertTrue(tvmSec);
	  
	  if (tvmSec)
	  {
		  System.out.println(ewc.setCellData("Pass", 107, 7));
	  }
	  else
	  {
		  System.out.println(ewc.setCellData("Fail", 107, 7)); 
	  }
	 
  }
  
  @Test(priority = 2)
  public void verifywithInvalidUserNameAndValidPassWordfulLogin() throws Exception 
  {

	  dsl = new DistrictSecretaryLoginPage(driver);
	  dsl.clickOnSecretaryLogin();
	  dsl.threadSleepWait();
	  dsl.enterUserName(dsl.readData(109, 4));
	  dsl.enterPassword(dsl.readData(109, 5));
	  dsl.clickOnLoginButton();
	  dsl.threadSleepWait();
	  boolean invlidMsg = dsl.alertMsg();
	  Assert.assertTrue(invlidMsg);
	  
	  if(invlidMsg)
	  {
		  System.out.println(ewc.setCellData("Pass", 109, 7));  
	  }
	  else
	  {
		  System.out.println(ewc.setCellData("Fail", 109, 7));
	  }
	
	  }
  
  @Test(priority = 3)
  public void verifywithValidUserNameAndInValidPassWordfulLogin() throws Exception 
  {

	  dsl = new DistrictSecretaryLoginPage(driver);
	  dsl.clickOnSecretaryLogin();
	  dsl.threadSleepWait();
	  dsl.enterUserName(dsl.readData(110, 4));
	  dsl.enterPassword(dsl.readData(110, 5));
	  dsl.clickOnLoginButton();
	  dsl.threadSleepWait();
	  
	  boolean invlidMsg = dsl.alertMsg();
	  Assert.assertTrue(invlidMsg);
	  
	  if(invlidMsg)
	  {
		  System.out.println(ewc.setCellData("Pass", 110, 7));  
	  }
	  else
	  {
		  System.out.println(ewc.setCellData("Fail", 110, 7));
	  }
	
	  }
  
  @Test(priority = 4)
  public void verifywithInValidUserNameAndInValidPassWordfulLogin() throws Exception 
  {

	  dsl = new DistrictSecretaryLoginPage(driver);
	  dsl.clickOnSecretaryLogin();
	  dsl.threadSleepWait();
	  dsl.enterUserName(dsl.readData(111, 4));
	  dsl.enterPassword(dsl.readData(111, 5));
	  dsl.clickOnLoginButton();
	  dsl.threadSleepWait();
	  
	  boolean invlidMsg = dsl.alertMsg();
	  Assert.assertTrue(invlidMsg);
	  
	  if(invlidMsg)
	  {
		  System.out.println(ewc.setCellData("Pass", 111, 7));  
	  }
	  else
	  {
		  System.out.println(ewc.setCellData("Fail", 111, 7));
	  }
	
	  }
  
  @AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
  
  }

