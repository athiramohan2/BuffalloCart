package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Screenshot;

public class LoginPage {
	
public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy (name="user_name")
public WebElement username;

@FindBy (name = "password")
public WebElement pswd;

@FindBy (xpath = "//button[text()='Sign in ']")
public WebElement signInButton;




public void enterUsername(String uname) {
	username.sendKeys(uname);
	
}

public void enterPassword(String pwd) {
	pswd.sendKeys(pwd);	
}


public void clickSignIn() {
	signInButton.click();
	
}


}
