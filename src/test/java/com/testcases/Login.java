package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("the title is "+driver.getTitle());
		driver.close();


	}

}
