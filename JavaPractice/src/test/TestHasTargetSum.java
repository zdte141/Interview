package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.HasTargetSum;

public class TestHasTargetSum {
  // TDD for test corresponding class.
  @Before
  public void testClass() {
    HasTargetSum hasTargetSum = new HasTargetSum();
  }

  // test case return in boolean value if there is integer to sum up.
  @Test
  public void testTargetSum() {
    HasTargetSum test = new HasTargetSum();
    int[] input = {10, 15, 3, 7};
    int target = 17;
    assertTrue("check if the sum of the integer in the list add up to target value ",
        test.targetSum(input, target) == true);
  }

}
