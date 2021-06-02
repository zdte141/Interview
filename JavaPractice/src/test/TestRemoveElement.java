package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.RemoveElement;

public class TestRemoveElement {
  /**
   * test to check if there is corresponding class exist
   */
  @Before
  public void testClass() {
    RemoveElement removeElement = new RemoveElement();
  }

  /**
   * test to check if the test of remove element is working.
   */
  @Test
  public void test() {
    RemoveElement test = new RemoveElement();
    int[] input = {3, 2, 2, 3};
    int val = 3;

    int output = 2;
    int nums[] = {2, 2};

    assertTrue("check the test case meets the expected value",
        test.romoveElement(input, val) == output);
  }

}
