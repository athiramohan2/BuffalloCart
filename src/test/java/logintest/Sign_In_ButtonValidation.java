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

public class Sign_In_ButtonValidation extends LoginTestBase{
	

	
	
	
	
	@Test

	public void signIn()
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.signInButton.isDisplayed();
		Assert.assertTrue(lp.signInButton.isDisplayed());
	}
	
	
}
