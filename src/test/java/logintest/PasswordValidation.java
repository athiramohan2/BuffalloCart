package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class PasswordValidation extends LoginTestBase{
	
	@Test

	public void password()
	{
	
		LoginPage lp = new LoginPage(driver);
		lp.pswd.isDisplayed();
		Assert.assertTrue(lp.pswd.isDisplayed());
	}
	@AfterMethod
	public void quitdriver()
	{
		driver.quit();
	}

}
