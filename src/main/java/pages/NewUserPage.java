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

import utils.CopyFunction;
import utils.StringOperations;

public class NewUserPage {
	
	public NewUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
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
	
	@FindBy(xpath="//select[@name='locale']")
	public WebElement locality;
	
	@FindBy(xpath="//select[@name='language']")
	public WebElement language;
	
	@FindBy(xpath = "//input[@placeholder='e.g user_placeholder_phone']")
	public WebElement phone;
	
	@FindBy(xpath = "//input[@placeholder='e.g user_placeholder_mobile']")
	public WebElement mobile;
	
	@FindBy(xpath = "//input[@placeholder='e.g user_placeholder_skype']")
	public WebElement skype;
	
	@FindBy(xpath = "//span[@class='fileinput-new']")
	public WebElement choose;
	
	@FindBy(id = "user_type")
	public WebElement userType;
	
	@FindBy (xpath = "//select[@name='designations_id']")
	public WebElement designation;
	
	@FindBy(xpath = "//button[text()='Create User']")
	public WebElement create;

	public void enterFullname(String fname) {
		fullname.sendKeys(fname + StringOperations.randomStringGenerate(3));
		
	}

	public void enterEmpID(String eid) {
		empid.sendKeys(eid + StringOperations.randomIntegerGenertae(4));
		
	}

	public String enterUsername(String usname) {
		
		String s = usname + StringOperations.randomStringGenerate(2);
	uname.sendKeys(s);
	return s;
	
		
	}

	public void enterNewPswd() {
		nwpwd.sendKeys("password");
		
	}

	public void ConfirmPassword() {
		confirmpwd.sendKeys("password");
		
	}

	public void enterEmail(String mail) {
		email.sendKeys(mail + StringOperations.randomStringGenerate(3) + "@gmail.com");
		
	}

		
	public void Locale(String localityName)
	{
		Select localityDropDown=new Select(locality);
		localityDropDown.selectByVisibleText(localityName);
	}
	
	public void LanguageSelect()
	{
		Select langDropDown=new Select(language);
		langDropDown.selectByVisibleText("English");
	}

	public void enterPhone() {
		phone.sendKeys(StringOperations.randomIntegerGenertae(10));
		
	}

	public void enterMobile() {
		mobile.sendKeys(StringOperations.randomIntegerGenertae(10));
		
	}

	public void enterSkype() {
		skype.sendKeys("skype@123");
		
	}

	public void uploadProfileImg(String path) throws InterruptedException {
		
		CopyFunction.copyToClipboard(path);
		try {
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_CONTROL);
		    Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void ClickChoose() {
		choose.click();
		
	}


	public void selectUserType(String userTypeOption) 
	{
		Select userTypeDropDown=new Select(userType);
		userTypeDropDown.selectByVisibleText(userTypeOption);
	}

	public void CreateUser() {
		create.click();
		
	}

	public void SelectDesignation(String designation1) {
		
		Select userTypeDropDown=new Select(designation);
		userTypeDropDown.selectByVisibleText(designation1);
		
	}

//	public void chooseFile() {
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", choose);
//		
//		
//	}
}
