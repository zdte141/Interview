package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.Majority;

public class TestMajority {
  @Before
  public void testClass() {
    Majority majority = new Majority();
  }

  @Test
  public void testMajoirtyELement() {
    Majority test = new Majority();

    int[] nums = {2, 2, 1, 1, 1, 2, 2};

    int output = 2;

    assertTrue("check if the method given back the majority of integer output",
        test.majorityElement(nums) == output);
  }

}
