package usercreation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import homepagetest.HomepageTestBase;
import pages.NewUserPage;
import pages.UserPage;

public class NewUserCreation extends UserpageTestBase{

	
	
	@Test
	public void createUser() throws InterruptedException
	{
		
		NewUserPage nup = new NewUserPage(driver);
		
				
				nup.enterFullname("Blue");
								
				nup.enterEmpID();
								
				nup.enterUsername("AB");
								
				nup.enterNewPswd();
								
				nup.ConfirmPassword();
								
				nup.enterEmail();
				nup.Locale("English (United States)");
				nup.LanguageSelect();
				nup.enterPhone();
				nup.enterMobile();
				nup.enterSkype();
//				JavascriptExecutor executor = (JavascriptExecutor)driver;
//				executor.executeScript("arguments[0].click();", up.choose);
				Thread.sleep(2000);
			    nup.ClickChoose();
				
				nup.uploadProfileImg("C:\\Users\\athir\\Desktop\\Selenium\\flower.PNG");
				
				nup.selectUserType("Staff");
				nup.SelectDesignation("Manager");
				
				nup.CreateUser();
				
	}
}
