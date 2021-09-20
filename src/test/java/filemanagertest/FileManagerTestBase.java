package filemanagertest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;
import utils.DriverFactory;

public class FileManagerTestBase {
	
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
			
		}
}
