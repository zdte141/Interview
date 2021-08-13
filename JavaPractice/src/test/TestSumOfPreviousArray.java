package test;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.SumOfArray;

/**
 * Test class to check if there is the class SumOfArray.java exist and run the method to check if
 * the actual result is same as expected result.
 * 
 * @author sanghunlee
 *
 */
public class TestSumOfPreviousArray {
  // TDD to check if the SumOfArray is exist in the package to run the TDD.
  @Before
  public void testClass() {
    SumOfArray sumOfArray = new SumOfArray();
  }

  // TDD to check if the method is given out the expected result with input values.
  @Test
  public void testSumOfArray() {
    SumOfArray test = new SumOfArray();

    int[] nums = {1, 2, 3, 4};
    int[] result = {1, 3, 6, 10};

    assertTrue("the new array is given with elements add the previous elements index in the array",
        Arrays.equals(test.sumOfArray(nums), result));

  }

}
