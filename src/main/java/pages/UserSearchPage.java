package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserSearchPage {
	
	WebDriver driver;
	
	public UserSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath = "//input[@aria-controls='DataTables']")
	public WebElement search;
	
	@FindBy(xpath = "//table[@id='DataTables']/tbody/tr/td[3]")
	public WebElement userDisplayed;
	
	
	@FindBy(xpath = "//a[@href='https://erp.buffalocart.com/admin/user/user_details/98\']")
	public WebElement newlyCreatedUser;
	
	public String userSearch(String UserName) {
		
		search.sendKeys(UserName);
		String userName = userDisplayed.getText();
		return userName;
		
		
	}
	
	public void clickNewlyCreatedUser()
	{
		newlyCreatedUser.click();
	}
}
