package com.projectautomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {
	public void Task(WebDriver Driver) {
		try {
			Driver.findElement(By.xpath("//div/a[@href='./tasks;jsessionid=1D490725B2EAA033710C19F15E9563CE']")).click();
			Driver.findElement(By.xpath("//div/input[@placeholder=\"Task Name\"]")).sendKeys("taskone");
			Select assigned  = new Select(Driver.findElement(By.xpath("//div/select[@name='owner']")));
			assigned.selectByVisibleText("Lovely K");
			Select status  = new Select(Driver.findElement(By.xpath("//div/select[@name='status']")));
			status.selectByVisibleText("In Progress");
			Select category  = new Select(Driver.findElement(By.xpath("//div/select[@name='category']")));
			category.selectByVisibleText("To Do");
			Driver.findElement(By.xpath("//div/span[@class='input-group-addon btn btn-default']")).click();
			Driver.findElement(By.xpath("//div/textarea[@name='details']")).sendKeys("taskone");
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}

	public boolean verifyTask(WebDriver driver) {
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			return true;
		}
		return false;
			
	}
}
