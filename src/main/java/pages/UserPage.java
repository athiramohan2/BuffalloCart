package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath = "//a[@href='#new']")
	public WebElement NewUser;
	
	@FindBy(name = "fullname")
	public WebElement fullname;
	
	@FindBy(id = "check_employment_id")
	public WebElement empid;
	
	@FindBy(id = "check_username")
	public WebElement uname;
	
	@FindBy(id = "new_password")
	public WebElement nwpwd;
	
	@FindBy(name = "confirm_password")
	public WebElement confirmpwd;
	
	@FindBy(id = "check_email_addrees")
	public WebElement email;
	
	
}
