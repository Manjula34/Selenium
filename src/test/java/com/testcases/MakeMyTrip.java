package com.testcases;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		
		//Launching browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\itsdi\\Downloads\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("NYC");
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform(); 
		
		driver.findElement(By.xpath("//span[contains(text(),'To')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("PHX");
		Thread.sleep(1000);
		
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
			
		
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[5]/div/p")).click();
		driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[2]//div[3]//div[4]//div[4]//div[1]//p[1]")).click();
		//System.out.println("Clicking Search");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		
		
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox flightTravllers inactiveWidget')]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		
		Robot robot = new Robot();
		System.out.println("About to zoom in");
		for (int i = 0; i < 3; i++) {			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		
		Thread.sleep(5000);
		
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyPress(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(5000);
		driver.close();
	}

}
