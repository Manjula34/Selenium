package com.testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {
	public static WebDriver driver = null;
	
	 @BeforeMethod
	  public void AppSetUp() {
		 System.out.println("beforeMethod : Application setup");
		 if(driver == null) {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			}
			
	  }
	 @Test
	 public void SigninLinkedin() {		 
		 System.out.println("Signin Linkedin");
		 
		    driver.navigate().to("https://www.linkedin.com/login/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("manjula@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("juhd4484");
			
			driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).submit();
			
	 }

	  @AfterMethod
	  public void CloseApp() throws IOException, InterruptedException {
		  Thread.sleep(2000);
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File("C:\\Users\\itsdi\\Downloads\\selenium\\screenshot.png"));
		  System.out.println("afterMethod : Close App");
		  driver.quit();
		  driver=null;
	  }

}
