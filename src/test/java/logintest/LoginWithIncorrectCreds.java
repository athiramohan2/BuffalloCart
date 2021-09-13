package logintest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginWithIncorrectCreds extends LoginTestBase{
	
	@Test
	public void loginsuccessfull()
	{
		LoginPage lp1 = new LoginPage(driver);
		lp1.enterUsername("admin2");
		
		lp1.enterPassword("1234567");
		
		lp1.clickSignIn();
		
		WebElement validationmsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		validationmsg.isDisplayed();
		Assert.assertTrue(validationmsg.isDisplayed());
		
		//System.out.println(driver.getTitle());
		//Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Codecarrots"));
	}

}
