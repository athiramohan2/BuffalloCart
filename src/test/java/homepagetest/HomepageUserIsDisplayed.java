package homepagetest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomepageUserIsDisplayed extends HomepageTestBase{
	
	@Test
	
	public void userIsDisplayed()
	{
		HomePage hp = new HomePage(driver);
		hp.user.isDisplayed();
		AssertJUnit.assertTrue(hp.user.isDisplayed());
	}

}
