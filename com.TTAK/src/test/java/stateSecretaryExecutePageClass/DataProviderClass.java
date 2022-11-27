package stateSecretaryExecutePageClass;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

// used to check invalid user name and password combination. 
  @DataProvider(name = "DataProvider")
  
  public Object[][] dp() {
	  
    return new Object[][] {
    	
      new Object[] { "admin", "admin" }, // check invalid username and invalid password
      new Object[] { "superadmin", "superadmin@" }, //check valid username and invalid password
      new Object[] {"super","super@##"} // both invalid
    };
  }
}
