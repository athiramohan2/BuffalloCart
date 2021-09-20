package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.StringOperations;

public class FileManagerPage {
	public FileManagerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//a[@title= 'File Manager']")
	public WebElement filemanager;
	
	@FindBy(xpath = "//div[@title= 'New folder']")
	public WebElement newfolder;
	
	public void clickfilemanager()
	{
		filemanager.click();
	}
	
	public void createNewFolder()
	{
		newfolder.click();
		
	}
	
}