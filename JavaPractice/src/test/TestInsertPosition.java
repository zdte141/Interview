package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.InsertPosition;

public class TestInsertPosition {
  @Before
  public void testClass() {
    InsertPosition insertPosition = new InsertPosition();
  }

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
