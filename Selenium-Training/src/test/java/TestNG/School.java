package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class School {
  @Test
  public void Student() {
	  System.out.println("Student name is Shine");
  }
  
  @Test
  public void Student2() {
	  System.out.println("Student name is Smruthi");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from After method");
  }

}
