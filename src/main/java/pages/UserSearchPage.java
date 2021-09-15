package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSearchPage {
	
	public UserSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath = "//input[@aria-controls='DataTables']")
	public WebElement search;
	
	@FindBy(xpath = "//a[@href='https://erp.buffalocart.com/admin/user/user_details/68']")
	public WebElement newlyCreatedUser;
	
	public void userSearch() {
		search.sendKeys("Blue");
		
	}
	
	public void clickNewlyCreatedUser()
	{
		newlyCreatedUser.click();
	}
}
