package filemanagertest;

import org.testng.annotations.Test;

import pages.FileManagerPage;

public class CreateNewFolder extends FileManagerTestBase{
	@Test
	public void createfolder()
	{
	
	FileManagerPage f = new FileManagerPage(driver);
	f.clickfilemanager();
	
	}

}
