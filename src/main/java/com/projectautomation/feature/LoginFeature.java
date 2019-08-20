package com.projectautomation.feature;

import org.openqa.selenium.WebDriver;

import com.projectautomation.page.LoginPage;

public class LoginFeature {
	

	
	public boolean testLogin(WebDriver driver,String username,String password)
	{
		LoginPage page= new LoginPage();
		
		page.login(driver,username,password);
		
		return	page.verifyLogin(driver);
	
		
	}
	
}
