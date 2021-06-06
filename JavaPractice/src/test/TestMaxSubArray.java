package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.MaxSubArray;

public class TestMaxSubArray {
  // test method to check if there is corresponding class.
  @Before
  public void testClass() {
    MaxSubArray maxSubArray = new MaxSubArray();
  }

  /**
   * test case to check the method maxSubArray is working, with expected value result and input
   * value.
   */
  @Test
  public void test() {

    MaxSubArray test = new MaxSubArray();
    int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int result = 6;

    assertTrue("the largest sum of the array is equal to,", test.maxSubArray(input) == result);
  }

}
