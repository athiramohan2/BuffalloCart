package usercreation_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;
import pages.UserSearchPage;
import utils.DriverFactory;

public class SearchUserTestBase {
WebDriver driver;
	
	@BeforeMethod
		
		public void openurl() throws InterruptedException
		{
		
			driver = DriverFactory.getDriver("chrome");
			
			DriverFactory.setImplicitWait(20, driver);
			driver.get("https://erp.buffalocart.com/login");
			System.out.println(driver.getCurrentUrl());
			
			LoginPage lp1 = new LoginPage(driver);
			lp1.enterUsername("admin");
			
			lp1.enterPassword("123456");
			
			lp1.clickSignIn();
			
			HomePage hp = new HomePage(driver);
			Thread.sleep(10000);
			
			hp.user.click();
					
			}

}
