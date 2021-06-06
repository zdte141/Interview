package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.InsertPosition;

/**
 * Test Class to drive TDD in InsertPosition Class.
 * 
 * @author sanghunlee
 *
 */
public class TestInsertPosition {
  /**
   * Check for the class InsertPosition exist in the class.
   */
  @Before
  public void testClass() {
    InsertPosition insertPosition = new InsertPosition();
  }

  /**
   * method to check TDD, test out the method is working.
   */
  @Test
  public void test() {
    InsertPosition test = new InsertPosition();
    int[] input = {1, 3, 5, 6};
    int target = 5;
    int output = 2;

    assertTrue(
        "check for the targeted targeted integer in the integer array will return the output location",
        test.insertPosition(input, target) == output);
  }

}
