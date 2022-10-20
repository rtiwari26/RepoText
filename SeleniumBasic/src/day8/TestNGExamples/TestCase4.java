package day8.TestNGExamples;

import org.testng.annotations.Test;

public class TestCase4 {
	  @Test
	  public void tc1() {
		  tc3();
		  System.out.println("Hi");
	  }
	  @Test
	  public void tc2() {
		  tc4();
		  System.out.println("Hello");
	  }
	  
	  public void tc4() {
		  System.out.println("Bye..Bye");
	  }
	  
	  public void tc3() {
		  System.out.println("Ta..Ta");
	  }

}
