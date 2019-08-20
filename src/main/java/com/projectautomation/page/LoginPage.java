package com.projectautomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	public void login(WebDriver driver,String username,String password) {
		try {
			driver.findElement(By.xpath("//div/input[@placeholder=\"Username\"]")).sendKeys(username);
			driver.findElement(By.xpath("//div/input[@placeholder=\"Password\"]")).sendKeys(password);
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public boolean verifyLogin(WebDriver driver) {
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			return true;
		}
		return false;
			
	}
		
	
}
