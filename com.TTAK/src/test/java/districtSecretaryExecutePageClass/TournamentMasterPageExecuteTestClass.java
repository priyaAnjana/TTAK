package districtSecretaryExecutePageClass;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClas;
import districtSecretaryLogin.DistrictSecretaryLoginPage;
import districtSecretaryLogin.TournamentMasterPage;
import utility.ExcelWriteClass;

public class TournamentMasterPageExecuteTestClass extends BaseClas 

{
	ExcelWriteClass ewc =new ExcelWriteClass();

	DistrictSecretaryLoginPage dsl;
	
	TournamentMasterPage tmp;
	
	String userDir = System.getProperty("user.dir");
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException
	{
		setUp();
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl = new DistrictSecretaryLoginPage(driver);
		dsl.clickOnSecretaryLogin();
		dsl.threadSleepWait();
		dsl.enterUserName(dsl.readData(108, 4));
		dsl.enterPassword(dsl.readData(108, 5));
		dsl.clickOnLoginButton();
		
		tmp = new TournamentMasterPage(driver);
		tmp.threadSleep();
		tmp.clickOnSetUp();
		tmp.clickOnTournametMaster();
		
	}
	
  @Test
  public void toVerifyDistrictSecretarycancreateDistrictLevelnewtournamentornot() throws InterruptedException, IOException
  
  {
	  
	  
  }
}
