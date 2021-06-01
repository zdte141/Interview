package test;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.TwoSum;

public class TestTwoSum {

  @Before
  public void testClass() {
    TwoSum twoSum = new TwoSum();
  }

  @Test
  public void test() throws IllegalArgumentException {

    TwoSum test = new TwoSum();
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = {0, 1};

    assertTrue(
        "check for two sum of number in array meets the target number and return location in array",
        Arrays.equals(test.twoSum(nums, target), result));
  }

}
