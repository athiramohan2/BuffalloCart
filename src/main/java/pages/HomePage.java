package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.JSExecuter;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()='demo']")
	public WebElement demotext;
	
	@FindBy (xpath = "//a[@href=\"https://erp.buffalocart.com/admin/user/user_list\"]")
	public WebElement user;

	
	@FindBy (xpath = "//a[@href = 'https://erp.buffalocart.com/admin/calendar']")
	public WebElement calender;
	
	@FindBy(xpath = "//h3[text()='Expense Report']")
	public WebElement expense;
	
	
	public  String getdemotext() {
		
		return demotext.getText();
		
	}

	
	public void scrolltoElement(WebDriver driver)
	{
		JSExecuter.scrolltoElement(driver, expense);
		JSExecuter.ClickElement(driver, expense);
	}
	
	
	

}
