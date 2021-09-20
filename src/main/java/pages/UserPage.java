package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.StringOperations;

public class UserPage {
	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath = "//a[@href='#new']")
	public WebElement NewUser;
	
	

	public void ClickNewUser() {
		NewUser.click();
		
	}
	
	
}
