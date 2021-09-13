package homepagetest;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class TitleValidationInHomepage extends HomepageTestBase{
	
	@Test
	public void validateTitle()
	{
		HomePage lp2 = new HomePage(driver);
		lp2.getdemotext();
		String expected = "demo";
		String actual = lp2.getdemotext();
		Assert.assertEquals(actual, expected);
	}

}
