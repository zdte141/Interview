package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.MaxEnd3;

/**
 * TestMaxEnd3.java class to run the TDD of method maxEnd3.
 * 
 * @author sanghunlee
 *
 */
public class TestMaxEnd3 {
  // TDD to test to class MaxEnd3.java exist.
  @Before
  public void testClass() {
    MaxEnd3 maxEnd3 = new MaxEnd3();
  }

  // TDD to run the maxEnd3 method and compare the result to justify it is working properly.
  @Test
  public void testMaxEnd3() {
    // constructor test to initialise the MaxEnd3.java class.
    MaxEnd3 test = new MaxEnd3();
    // integer arrays nums to initialise the input array.
    int[] nums = {1, 2, 3};
    // Integer array result to compare with the result of maxEnd3 method.
    int[] result = {3, 3, 3};
    // TDD to run the method and compare method with expected result.
    assertTrue("check if the method give out the result of the 3 maximum number in the array",
        Arrays.equals(test.maxEnd3(nums), result));
  }

}
