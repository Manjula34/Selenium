package com.testng;

import org.testng.annotations.Test;

public class PriortityTestCase {
	 @Test(priority =2)
	  public void testcase1() {
		  System.out.println("Testcase1");
	  }
	  @Test(priority =3,invocationCount =3,invocationTimeOut =5)
	  public void testcase2() {
		  System.out.println("Testcase2");
	  }
	  @Test(priority =1)
	  public void testcase3() {
		  System.out.println("TestCase3");
	  }

}
