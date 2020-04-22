package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownByVisibleElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.wellsfargo.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Get Started')]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		//driver.quit();

	}

}
