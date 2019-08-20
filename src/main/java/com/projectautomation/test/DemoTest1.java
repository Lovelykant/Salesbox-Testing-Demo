package com.projectautomation.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.annotations.Test;

import com.projectautomation.feature.LoginFeature;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
public class DemoTest1 {
	
	private WebDriver driver;
		
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver = new ChromeDriver();
			driver.get("https://dev.salesbox.ai/login");  
			String title = driver.getTitle();	
			System.out.println(title);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	@Test
	public void LoginTest() {	
	
	LoginFeature login= new LoginFeature();
//	System.out.println("Username"+ System.getProperty("Username") +"\n"+"Password "+System.getProperty("Password"));
	boolean status=login.testLogin(driver,"lovelykant1209@gmail.com","Lovely@123");
	
	Assert.assertTrue(true==status); 		
	}	
	
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
	}


