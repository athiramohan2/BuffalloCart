package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.StringOperations;

public class TaskPage {
WebDriver driver;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath = "//a[@title='Tasks']")
	public WebElement tasks;
	
	@FindBy(xpath = "//a[text()='New Task']")
	public WebElement newTask;
	
	@FindBy(xpath = "//input[@name='task_name']")
	public WebElement taskname;
	
	@FindBy(xpath = "//select[@id='check_related']")
	public WebElement related;
	
	public void clickOnTasks()
	{
		tasks.click();
	}
	
	public void clickNewTask()
	{
		newTask.click();
	}
	
	public void enterTaskname(String task)
	{
		taskname.sendKeys(task + StringOperations.randomStringGenerate(2));
	}
	
	public void selectRelatedto(String relatedTo1)
	{
		Select relatedTo = new Select(related);
		relatedTo.selectByVisibleText(relatedTo1);
	}	
	
	}

