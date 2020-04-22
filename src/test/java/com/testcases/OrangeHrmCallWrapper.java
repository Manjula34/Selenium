package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHrmCallWrapper extends OrangeHrmWrapper{
	
	@BeforeMethod
	public void Orangelogin() throws InterruptedException {
		
		LaunchApp("https://opensource-demo.orangehrmlive.com/");
		EnterById("txtUsername", "Admin");
		EnterById("txtPassword", "admin123");
		clickbyXpath("//input[@id='btnLogin']");
		Thread.sleep(1000);
		clickbyXpath("//b[contains(text(),'Admin')]");
		
		
	}
	
	
	@Test(priority=1)
	public void AdminSearch() {
		
		EnterById("searchSystemUser_userName", "Sarah");
		SelectDropDown("//select[@id='searchSystemUser_userType']","ESS");
		EnterById("searchSystemUser_employeeName_empName", "tomy");		
		SelectDropDown("//select[@id='searchSystemUser_status']","Enabled");
		clickbyXpath("//input[@id='searchBtn']");
		
	}
	
	@Test(priority=2)
	public void AddUser() throws InterruptedException  {
		clickbyXpath("//input[@id='btnAdd']");
		Thread.sleep(1000);
		SelectDropDown("//select[@id='systemUser_userType']","ESS");
		EnterById("systemUser_employeeName_empName","Johny Doe");
		EnterById("systemUser_userName", "John");
		SelectDropDown("//select[@id='systemUser_status']", "Enabled");
		EnterById("systemUser_password", "abcdef123");
		EnterById("systemUser_confirmPassword", "abc123!@");
		clickbyXpath("//input[@id='btnSave']");
		
		
	}
	 @AfterMethod()
	 public void teardown() throws IOException, InterruptedException {
		 Thread.sleep(2000);
		 TakeScreenShot("C:\\Users\\itsdi\\Downloads\\Files\\OrangeAdmin.png");
		 closeapp();
		 
	 }
	
	
	

}
