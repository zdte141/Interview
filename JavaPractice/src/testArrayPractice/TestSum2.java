package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Sum2;

/**
 * TDD to check for the arrays that return the sum of first two elements in the Arrays.
 * 
 * @author sanghunlee
 *
 */
public class TestSum2 {
  // Test run the check the Sum2.java class exist.
  @Before
  public void testClass() {
    Sum2 sum2 = new Sum2();
  }

  // TDD to check for the method sum2 with expected output.
  @Test
  public void testSum2() {
    // construct the class.
    Sum2 test = new Sum2();
    // initialise the nums arrays with input values.
    int[] nums = {1, 2, 3};
    // integer result with expected output.
    int result = 3;
    // TDD to check for the method is correct.
    assertTrue("check sum of first 2 elements in the arrays is correct", test.sum2(nums) == result);
  }

}
