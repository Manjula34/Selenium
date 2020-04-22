package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
  @Test
  public void testcase1() {
	  System.out.println("Testcase1");
  }
  @Test
  public void testcase2() {
	  System.out.println("Testcase2");
  }
  @Test
  public void testcase3() {
	  System.out.println("TestCase3");
  }
  @BeforeMethod
  public void beforeMethod() {
	System.out.println("beforeMethod : Launch App");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod : Close App");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass : Prepare test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass : Clear Test data");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest : Smoke Testing");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest  : Generate reports");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite : Open DB Connection");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite: Close DB Connection");
  }

}
