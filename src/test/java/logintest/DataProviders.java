package logintest;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider (name = "DP1")
	public Object[][] dataProvider1()
	{
		Object[][] DP =new Object[][] {
			{"admin","123456"},
			{"admin","123456"}
		};
		return DP;
	
	}

}
