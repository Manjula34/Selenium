package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(7);
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("20");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2010");
		
		

	}

}
