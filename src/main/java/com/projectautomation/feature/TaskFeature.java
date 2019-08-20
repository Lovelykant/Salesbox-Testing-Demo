package com.projectautomation.feature;

import org.openqa.selenium.WebDriver;

import com.projectautomation.page.TaskPage;

public class TaskFeature {
	public boolean testTask(WebDriver driver)
	{
		TaskPage page= new TaskPage();
		
		page.Task(driver);
		
		return	page.verifyTask(driver);
	
		
	}
		
}
