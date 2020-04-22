package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	 @Test
	  public void login() {
		  System.out.println("login -DependsOnMethods");
	  }
	  @Test(dependsOnMethods= {"login"})
	  public void Search() {
		  System.out.println("Search- DependsOnMethods");
		  Assert.assertEquals("anan", "juhdhw");
	  }
	  @Test(dependsOnMethods= {"Search"},alwaysRun= true)
	  public void Logout() {
		  System.out.println("Logout- DependsOnMethods");
	  }

}
