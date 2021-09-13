package logintest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pages.LoginPage;

public class LoginWithMultipleUsers extends LoginTestBase{

	@Test(dataProvider = "DP1", dataProviderClass = DataProviders.class)
	public void loginsuccessfull(String username, String pswd)
	{
		LoginPage lp1 = new LoginPage(driver);
		lp1.enterUsername(username);
		
		lp1.enterPassword(pswd);
		
		lp1.clickSignIn();
		
		System.out.println(driver.getTitle());
		AssertJUnit.assertTrue(driver.getTitle().equalsIgnoreCase("Codecarrots"));
	}
	
	
}
