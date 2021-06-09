package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.MathSqrt;

/**
 * Test case for the Math Sqrt without using the implemented function.
 * 
 * @author sanghunlee
 *
 */
public class TestSqrt {

  @Before
  public void testClass() {
    MathSqrt sqrt = new MathSqrt();
  }

  @Test
  public void testSqrt() {
    MathSqrt test = new MathSqrt();
    int input = 4;
    int output = 2;

    assertTrue("test for the Math.sqrt fucntion in algorithm", test.mysqrt(input) == output);
  }

}
