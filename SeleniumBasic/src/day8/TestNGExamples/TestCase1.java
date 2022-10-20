package day8.TestNGExamples;

import org.testng.annotations.Test;

public class TestCase1 {
  @Test
  public void tc1() {
	  System.out.println("Hello");
  }
}
/**
 *There will be no main() method in TestNG file
 *Execution will be carry out by @Test method
 *Whenever you execute any TestNG program it will give output in 3 ways
     1.java console
     2.TestNG console
     3.TestNG .html report
 *TestNG class can have multiple @Test method
 *All method are executed according to alphabetical order of method
 *All method in TestNG are Non Static in nature
 *Only @Test method are executed
*/