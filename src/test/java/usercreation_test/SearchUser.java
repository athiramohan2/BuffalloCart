package usercreation_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.UserPage;
import pages.UserSearchPage;

public class SearchUser extends SearchUserTestBase{

	@Test
	public void searchUser()
	{
		UserSearchPage up = new UserSearchPage(driver);
		up.userSearch();
		up.clickNewlyCreatedUser();
	}
	

}
