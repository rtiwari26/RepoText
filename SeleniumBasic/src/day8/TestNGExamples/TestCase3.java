package day8.TestNGExamples;

import org.testng.annotations.Test;

public class TestCase3 {
  @Test
  public void tc1() {
	  System.out.println("Hi");
  }
  @Test
  public void tc2() {
	  System.out.println("Hello");
  }
  @Test
  public void tc4() {
	  System.out.println("Bye..Bye");
  }
  @Test
  public void tc3() {
	  System.out.println("Ta..Ta");
  }
  
}

/**
 * TestNG class can have multiple @Test method
 * All method are executed according to alphabetical order of method
 */
