package logintest;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginSuccessTest extends LoginTestBase{
	
	@Test
	public void loginsuccessfull()
	{
		LoginPage lp1 = new LoginPage(driver);
		lp1.enterUsername("admin");
		
		lp1.enterPassword("123456");
		
		lp1.clickSignIn();
		
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Codecarrots"));
	}

	
}
