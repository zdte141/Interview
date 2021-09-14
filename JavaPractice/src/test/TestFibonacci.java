package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.Fibonacci;

public class TestFibonacci {
  @Before
  public void testClass() {
    Fibonacci fibonacci = new Fibonacci();
  }

  @Test
  public void testFibonacci() {
    Fibonacci test = new Fibonacci();

    int [] input = {0,1};
    
    int output = 1;
    
    assertTrue("check the fibonacci in iterative way", );
  }

}
