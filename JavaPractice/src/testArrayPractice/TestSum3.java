package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Sum3;

public class TestSum3 {
  // TDD to check for the correct class exist for Sum3.java.
  @Before
  public void testClass() {
    Sum3 sum3 = new Sum3();
  }

  // TDD to check for the sum3 method, result of method must equal to the output value.
  @Test
  public void testSum3() {
    Sum3 test = new Sum3();
    int[] input = {1, 2, 3};
    int output = 6;
    assertTrue("check for all 3 integer in the array sums up to become the output",
        test.sum3(input) == output);
  }

  // TDD to check for the sum3 method, result of method must equal to the output value.
  @Test
  public void testSumAgain() {
    Sum3 test = new Sum3();
    int[] input = {5, 11, 2};
    int output = 18;

    assertTrue("check for all 3 integer in the array sums up to become the output",
        test.sum3(input) == output);
  }

}
