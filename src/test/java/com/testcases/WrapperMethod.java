package com.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperMethod {
	public static WebDriver driver;
	
	public void insertapp(String url) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	public void EnterById(String locator,String value) {
		driver.findElement(By.id(locator)).sendKeys(value);
	}
	public void clickbyXpath(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	public void TakeScreenShot(String Path) throws IOException  {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(Path));
		
	}
	
	public void closeapp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}

}
