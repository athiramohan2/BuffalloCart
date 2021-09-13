package homepagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;
import utils.DriverFactory;

public class HomepageTestBase {
	
	WebDriver driver;
	
	@BeforeMethod
		
		public void openurl()
		{
			//DriverFactory.getDriver("chrome");
			driver = DriverFactory.getDriver("chrome");
			DriverFactory.setImplicitWait(20, driver);
			driver.get("https://erp.buffalocart.com/login");
			System.out.println(driver.getCurrentUrl());
			
			LoginPage lp1 = new LoginPage(driver);
			lp1.enterUsername("admin");
			
			lp1.enterPassword("123456");
			
			lp1.clickSignIn();
			
			
			}

	@AfterMethod
	public void quitdriver()
	{
		driver.quit();
	}

}
