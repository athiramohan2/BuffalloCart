package taskstest;

import org.testng.annotations.Test;

import pages.TaskPage;

public class CreateNewTask extends TasksBaseTest{
	
	@Test
	public void createNewTask()
	{
		TaskPage tp = new TaskPage(driver);
		tp.clickNewTask();
		tp.enterTaskname("TASK");
		tp.selectRelatedto("Projects");
	}

}
