package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	//public static WebDriver getDriver(String browsername)
	public static WebDriver getDriver(String browsername)
	{
		
		WebDriver dri;
		
		
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Chrome_Driver\\chromedriver.exe");  
		dri = new ChromeDriver();
		}
		
		else{
			
			System.setProperty("webdriver.edge.driver","C:\\Edge_Driver\\msedgedriver.exe");  
			dri = new ChromeDriver(); //replace else if loop with switch
			
		}
		
//		else{
//			
//			System.setProperty("webdriver.chrome.driver","C:\\Chrome_Driver\\chromedriver.exe");  
//			dri = new ChromeDriver();
//			
//		}
		
		return dri;
		
	}

	
	public static WebDriver setImplicitWait(int seconds, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
