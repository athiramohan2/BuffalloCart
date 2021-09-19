package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void takeScreenshot(WebDriver driver, String filename)
	{
		
		Date date = new Date();
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(filename);
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
//screenshot robotclass actions class