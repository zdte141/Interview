package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.HasTargetSumPair;

public class TestHasTargetSumPair {

  @Before
  public void testClass() {
    HasTargetSumPair hasTargetSumPair = new HasTargetSumPair();
  }


  @Test
  public void testHasTargetSumPair() {

    HasTargetSumPair test = new HasTargetSumPair();

    int[] list = {10, 15, 3, 7};
    int target = 17;

    assertTrue("if the two integer number sum matches the target number",
        test.hasTargetSumPair(list, target) == true);
  }
}
