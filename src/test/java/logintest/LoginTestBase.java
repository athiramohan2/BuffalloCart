package logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DriverFactory;
import utils.Screenshot;

public class LoginTestBase {
	WebDriver driver;
	
@BeforeMethod
	
	public void openurl()
	{
		driver = DriverFactory.getDriver("chrome");
		DriverFactory.setImplicitWait(10, driver);
		driver.get("https://erp.buffalocart.com/login");
		System.out.println(driver.getCurrentUrl());
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



