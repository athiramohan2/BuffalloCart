package usercreation_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.UserPage;
import pages.UserSearchPage;

public class SearchUser extends SearchUserTestBase{

@Test	
	public void searchandEditUser()
	{
		UserSearchPage up = new UserSearchPage(driver);
		up.userSearch("Blue");
		up.EditUser();
		
	}

@Test
public void searchandDeleteUser()
{
	UserSearchPage up = new UserSearchPage(driver);
	up.userSearch("Blue");
	up.DeleteUser();
}
	

}
