package homepagetest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomepageDemoIsdisplayed extends HomepageTestBase{
	
	@Test
	public void demoIsDisplayed()
	
	{
		
		HomePage hp2 = new HomePage(driver);
		hp2.getdemotext();
		System.out.println("demo text");
		String expected = "demo";
		String actual = hp2.getdemotext();
		Assert.assertEquals(actual, expected);
		
		
		hp2.scrolltoElement(driver);
		System.out.println("text");
		

		
	}
	

}
