package usercreation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import homepagetest.HomepageTestBase;
import pages.UserPage;

public class NewUserCreation extends UserpageTestBase{

	
	
	@Test
	public void createUser()
	{
		
		UserPage up = new UserPage(driver);
				
				up.fullname.sendKeys("ABCD");
				
				
				up.empid.sendKeys("123456");
				
				
				up.uname.sendKeys("AB");
				
				
				up.nwpwd.sendKeys("password");
				
				
				up.confirmpwd.sendKeys("password");
				
				up.email.click();
				up.email.sendKeys("abcd@gmail.com");
	}
}
