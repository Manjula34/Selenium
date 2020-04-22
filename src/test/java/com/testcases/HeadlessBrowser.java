package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HeadlessBrowser {

	public static void main(String[] args) {
		 WebDriver driver = new HtmlUnitDriver();
		 driver.get("https://www.google.com/");
		System.out.println("the title is "+driver.getTitle());
		driver.close();

	}

}
