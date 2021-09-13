package homepagetest;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.HomePage;

@Test
public class MouseActions extends HomepageTestBase{
	
	public void mouseactions()
	{
		HomePage hp = new HomePage(driver);
		hp.calender.isDisplayed();
		
		Actions act = new Actions(driver);
		act.moveToElement(hp.calender);
		
		act.doubleClick(hp.calender);
		act.clickAndHold(hp.calender);
	}

}
