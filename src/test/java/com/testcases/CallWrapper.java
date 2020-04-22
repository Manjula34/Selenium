package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class CallWrapper {
	
	
	@Test
	
	public void facebooklogin() throws IOException, InterruptedException {
		WrapperMethod wm = new WrapperMethod();
		wm.insertapp("https://www.facebook.com/");
		wm.EnterById("email", "manjula");
		wm.EnterById("pass", "jbuhuqi");
		wm.clickbyXpath("//input[@id='u_0_b']");
		wm.TakeScreenShot("C:\\Users\\itsdi\\Downloads\\Files\\screenshot.png");
		wm.closeapp();
		
		
		
	}

}
