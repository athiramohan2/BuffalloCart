package taskstest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;
import pages.LoginPage;
import pages.TaskPage;
import pages.UserPage;
import utils.DriverFactory;
import utils.Screenshot;

public class TasksBaseTest {
	WebDriver driver;

	@BeforeMethod
	
	public void openurl() throws InterruptedException
	{
	
		driver = DriverFactory.getDriver("chrome");
		
		DriverFactory.setImplicitWait(20, driver);
		driver.get("https://erp.buffalocart.com/login");
		System.out.println(driver.getCurrentUrl());
		
		LoginPage lp1 = new LoginPage(driver);
		lp1.enterUsername("admin");
		
		lp1.enterPassword("123456");
		
		lp1.clickSignIn();
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(10000);
		
		TaskPage tp = new TaskPage(driver);
		tp.clickOnTasks();
		
		
		}

@AfterMethod
public void tearDown(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		Screenshot.takeScreenshot(driver, result.getTestName());
	}
driver.quit();
}

}
