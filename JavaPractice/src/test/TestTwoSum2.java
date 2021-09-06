package test;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.TwoSum2;

public class TestTwoSum2 {
  @Before
  public void testClass() {
    TwoSum2 twoSum2 = new TwoSum2();
  }

  @Test
  public void testTwoSum3() {
    TwoSum2 test = new TwoSum2();

    int[] nums = {2, 7, 11, 15};

    int target = 9;

    int[] output = {1, 2};

    assertTrue("give back the indexes of the arrays where sum of two meets the target number",
        Arrays.equals(test.twoSum2(nums, target), output));

  }



}
